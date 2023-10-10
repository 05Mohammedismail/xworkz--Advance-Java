package com.xworkz.movie.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.movie.Enum.LangType;
import com.xworkz.movie.dto.MovieDTO;

public class MovieRunner {

	public static void main(String[] args) {

		MovieDTO dto1 = new MovieDTO(1, "KGF", LangType.KANNADA, "Vijay Kiragandur", "Prashanth Neel", 80);
		MovieDTO dto2 = new MovieDTO(2, "Baahubali: The Beginning", LangType.TELUGU, "Arka Media Works",
				"S. S. Rajamouli", 159);
		MovieDTO dto3 = new MovieDTO(3, "Dangal", LangType.HINDI, "Aamir Khan Productions", "Nitesh Tiwari", 161);
		MovieDTO dto4 = new MovieDTO(4, "The Shawshank Redemption", LangType.ENGLISH, "Castle Rock Entertainment",
				"Frank Darabont", 142);
		MovieDTO dto5 = new MovieDTO(5, "Rangasthalam", LangType.TELUGU, "Mythri Movie Makers", "Sukumar", 174);
		MovieDTO dto6 = new MovieDTO(6, "3 Idiots", LangType.HINDI, "Vinod Chopra Films", "Rajkumar Hirani", 170);
		MovieDTO dto7 = new MovieDTO(7, "Avatar", LangType.ENGLISH, "20th Century Fox", "James Cameron", 162);
		MovieDTO dto8 = new MovieDTO(8, "Bhagam Bhag", LangType.HINDI, "T-Series", "Priyadarshan", 160);
		MovieDTO dto9 = new MovieDTO(9, "Arjun Reddy", LangType.TELUGU, "Bhadrakali Pictures", "Sandeep Reddy Vanga",
				187);
		MovieDTO dto10 = new MovieDTO(10, "Inception", LangType.ENGLISH, "Syncopy", "Christopher Nolan", 148);

		Collection<MovieDTO> movies = new HashSet<MovieDTO>();
		movies.add(dto1);
		movies.add(dto2);
		movies.add(dto3);
		movies.add(dto4);
		movies.add(dto5);
		movies.add(dto6);
		movies.add(dto7);
		movies.add(dto8);
		movies.add(dto9);
		movies.add(dto10);

		Collection<MovieDTO> forLang = new ArrayList<>();
		Collection<MovieDTO> forProducer = new ArrayList<>();
		Collection<MovieDTO> forDirector = new ArrayList<>();
		Collection<MovieDTO> forBudget = new ArrayList<>();

		byLanguage(movies, forLang, LangType.HINDI);

		byProducerName(movies, forProducer, "Vijay Kiragandur");

		byDirectorName(movies, forDirector, "ismail");

		System.out.println("Budget > 100");
		movies.forEach((ref) -> {
			if (ref.getBudget() > 100) {
				forBudget.add(ref);
			}
		});

		System.out.println(forBudget + "\n");

		System.out.println("Remove movie whose budget < 100");
		Iterator<MovieDTO> it = movies.iterator();

		while (it.hasNext()) {
			MovieDTO ele = it.next();
			if (ele.getBudget() < 100) {
				it.remove();
			}
		}

}

	
	
	
	public static void byLanguage(Collection<MovieDTO> movies, Collection<MovieDTO> forLang, LangType type) {
		movies.forEach((ref) -> {
			if (ref.getLang().equals(type)) {
				forLang.add(ref);
			}

		});
		if (forLang.size() != 0) {
			System.out.println("By Lang " + type + "\n");
			System.out.println(forLang + "\n");
		} else {
			System.out.println("By Lang " + type);
			System.err.println("Movie not found \n");
		}

	}

	public static void byDirectorName(Collection<MovieDTO> movies, Collection<MovieDTO> forDirector, String name) {
		movies.forEach((ref) -> {
			if (ref.getDirecterName().equalsIgnoreCase(name)) {
				forDirector.add(ref);
			}
		});
		if (forDirector.size() != 0) {
			System.out.println("By Director " + name + "\n");
			System.out.println(forDirector + "\n");
		} else {
			System.out.println("By Director " + name);
			System.err.println("Movie not found \n");
		}
	}

	public static void byProducerName(Collection<MovieDTO> movies, Collection<MovieDTO> forProducer, String name) {
		movies.forEach((ref) -> {
			if (ref.getProducerName().equalsIgnoreCase(name)) {
				forProducer.add(ref);
			}
		});

		if (forProducer.size() != 0) {
			System.out.println("By Producer " + name + "\n");
			System.out.println(forProducer + "\n");
		} else {
			System.out.println("By Producer " + name);
			System.err.println("Movie not found \n");
		}
	}
}
