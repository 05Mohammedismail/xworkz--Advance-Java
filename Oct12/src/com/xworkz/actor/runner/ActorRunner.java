package com.xworkz.actor.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.actor.dto.ActorDTO;

public class ActorRunner {

	public static void main(String[] args) {

		ActorDTO dto1 = new ActorDTO(1, "Shah Rukh Khan", "Hindi", "male", "India");
		ActorDTO dto2 = new ActorDTO(2, "Tom Cruise", "English", "male", "USA");
		ActorDTO dto3 = new ActorDTO(3, "Radhika Pandith", "Kannada", "female", "India");
		ActorDTO dto4 = new ActorDTO(4, "Jackie Chan", "Chinese", "male", "China");
		ActorDTO dto5 = new ActorDTO(5, "Priyanka Chopra", "Hindi", "female", "India");
		ActorDTO dto6 = new ActorDTO(6, "Leonardo DiCaprio", "English", "male", "USA");
		ActorDTO dto7 = new ActorDTO(7, "Punith Rajkumar", "Kannada", "male", "India");
		ActorDTO dto8 = new ActorDTO(8, "Amitabh Bachchan", "Hindi", "male", "India");
		ActorDTO dto9 = new ActorDTO(9, "Scarlett Johansson", "English", "female", "USA");
		ActorDTO dto10 = new ActorDTO(10, "Bruce Lee", "Chinese", "male", "China");

		Collection<ActorDTO> actors = new HashSet<ActorDTO>();
		actors.add(dto1);
		actors.add(dto2);
		actors.add(dto3);
		actors.add(dto4);
		actors.add(dto5);
		actors.add(dto6);
		actors.add(dto7);
		actors.add(dto8);
		actors.add(dto9);
		actors.add(dto10);

		System.out.println("**Actor Names in Desc order**");
		List<ActorDTO> names = actors.stream().sorted((n1, n2) -> n2.getName().compareTo(n1.getName()))
				.collect(Collectors.toList());
		names.forEach(ref -> System.out.println(ref.getName()));
		System.out.println();

		System.out.println("**Country Names in Desc order**");
		Set<String> setStore = actors.stream().map(ele -> ele.getCountryName().toUpperCase())
				.collect(Collectors.toSet());
		List<String> countries = setStore.stream().sorted().collect(Collectors.toList());
		countries.forEach(ref -> System.out.println(ref));
		System.out.println();

		System.out.println("**Id in Asc order**");
		List<Integer> id = actors.stream().map(ele -> ele.getId()).sorted().collect(Collectors.toList());
		id.forEach(ref -> System.out.println(ref));
		System.out.println();

		System.out.println("**All actors by asc of LangKnown**");
		List<ActorDTO> ascList = actors.stream().sorted().collect(Collectors.toList());
		ascList.forEach(ref -> System.out.println(ref));
		System.out.println();

		System.out.println("**All actors by desc of LangKnown**");
		List<ActorDTO> descList = actors.stream().sorted((l1, l2) -> l2.compareTo(l1)).collect(Collectors.toList());
		descList.forEach(ref -> System.out.println(ref));
		System.out.println();

		System.out.println("**Filter by male**");
		actors.stream().filter(ref -> ref.getGender().equals("male")).sorted().forEach(ref -> System.out.println(ref));
		System.out.println();

		System.out.println("**Filter by female**");
		actors.stream().filter(ref -> ref.getGender().equals("female")).sorted()
				.forEach(ref -> System.out.println(ref));
		System.out.println();

		System.out.println("**Filter by Id > 5**");
		List<ActorDTO> acts = actors.stream().filter(i -> i.getId() > 5)
				.sorted((s1, s2) -> s1.getId().compareTo(s2.getId())).collect(Collectors.toList());
		acts.forEach(ref -> System.out.println(ref));
		System.out.println();

		System.out.println("**Count by country**");

		Set<String> countryCount = actors.stream().filter(c -> c.getCountryName() != null).map(c -> c.getCountryName())
				.collect(Collectors.toSet());
		System.out.println("Country Saved are " + countryCount.size());
	}
}
