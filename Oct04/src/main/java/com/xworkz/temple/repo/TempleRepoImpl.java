package com.xworkz.temple.repo;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import com.xworkz.temple.dto.TempleDTO;

public class TempleRepoImpl implements TempleRepo {

	private Collection<TempleDTO> group = new HashSet<TempleDTO>();

	@Override
	public void save(TempleDTO dto) {
		boolean saved = this.group.add(dto);
		if (saved) {
			System.out.println("Saved in Repo");
		} else {
			System.err.println("Not saved in Repo");
		}

	}

	@Override
	public int total() {
		return this.group.size();
	}

	@Override
	public Collection<TempleDTO> getAll() {
		return this.group;
	}

}
