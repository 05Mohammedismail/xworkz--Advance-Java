package com.xworkz.jpa.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.jpa.dto.ChocolateDTO;

@Component
public class ChocolateRepoImpl implements ChocolateRepo {

	public EntityManagerFactory getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("chocolate-connection");
		return emf;
	}

	@Override
	public boolean save(ChocolateDTO dto) {
		EntityManagerFactory emf = getEntityManager();
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			em.persist(dto);
			et.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			et.rollback();
		} finally {
			emf.close();
			em.close();
		}

		return false;
	}

	@Override
	public ChocolateDTO findById(int id) {
		EntityManagerFactory emf = getEntityManager();
		EntityManager em = emf.createEntityManager();

		try {
			ChocolateDTO dto = em.find(ChocolateDTO.class, id);
			return dto;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			emf.close();
			em.close();
		}
		return null;

	}

	@Override
	public List<ChocolateDTO> readAll() {
		EntityManagerFactory emf = getEntityManager();
		EntityManager em = emf.createEntityManager();
		TypedQuery<ChocolateDTO> query = em.createQuery("SELECT dto FROM ChocolateDTO dto ORDER BY dto.id", ChocolateDTO.class);
		List<ChocolateDTO> list = query.getResultList();
		return list;
	}

	@Override
	public ChocolateDTO findByName(String name, Model model) {
		EntityManagerFactory emf = getEntityManager();
		EntityManager em = emf.createEntityManager();

		TypedQuery<ChocolateDTO> query = em.createNamedQuery("findByName", ChocolateDTO.class);
		query.setParameter("nm", name);
		try {
			ChocolateDTO dto = query.getSingleResult();
			return dto;
		} catch (NoResultException e) {
			e.printStackTrace();
		} finally {
			emf.close();
			em.close();
		}
		return null;
	}

	@Override
	public boolean updatePriceByName(int price, String name) {
		EntityManagerFactory emf = getEntityManager();
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		Query query = em.createNamedQuery("updatePrice");
		query.setParameter("pr", price);
		query.setParameter("nm", name);
		int updated = query.executeUpdate();
		et.commit();
		emf.close();
		em.close();

		if (updated > 0) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean deleteById(int id, Model model) {
		EntityManagerFactory emf = getEntityManager();
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		Query query = em.createNamedQuery("delete");
		query.setParameter("i", id);
		int delete = query.executeUpdate();
		et.commit();
		emf.close();
		em.close();

		if (delete > 0) {
			return true;
		}
		return false;
	}
}
