package com.xworkz.runner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.dto.CountryDTO;
import com.xworkz.dto.PresidentDTO;
import com.xworkz.dto.WarDTO;

public class WarRunner {

	public static void main(String[] args) {

		// World War - 1
		// president DTO
		PresidentDTO president1 = new PresidentDTO(1, "Paul von Hindenburg", LocalDate.of(1925, 5, 12),
				LocalDate.of(1934, 8, 2));
		PresidentDTO president2 = new PresidentDTO(2, "Ismet Inonu", LocalDate.of(1938, 11, 11),
				LocalDate.of(1950, 5, 22));
		// country DTO
		CountryDTO countryDTO1 = new CountryDTO(1, "Germany", president1, "Europe");
		CountryDTO countryDTO2 = new CountryDTO(2, "Austria", president2, "Europe");

		// Collection of countries involved in WW1
		Collection<CountryDTO> countryCollection1 = new HashSet<CountryDTO>();
		countryCollection1.add(countryDTO1);
		countryCollection1.add(countryDTO2);

		// war DTO
		WarDTO dto1 = new WarDTO(1, LocalDate.of(1914, 7, 28), LocalDate.of(1918, 11, 11), countryCollection1);

		// World War - 2
		// president DTO
		PresidentDTO president3 = new PresidentDTO(1, "Benito Mussolini", LocalDate.of(1922, 10, 31),
				LocalDate.of(1943, 7, 25));
		PresidentDTO president4 = new PresidentDTO(2, "Hirohito", LocalDate.of(1926, 12, 25),
				LocalDate.of(1950, 5, 22));

		// Country DTO
		CountryDTO countryDTO3 = new CountryDTO(1, "Italy", president3, "Europe");
		CountryDTO countryDTO4 = new CountryDTO(2, "Japan", president4, "Asia");

		// Collection of countries involved in WW2
		Collection<CountryDTO> countryCollection2 = new HashSet<CountryDTO>();
		countryCollection2.add(countryDTO3);
		countryCollection2.add(countryDTO4);

		// war DTO
		WarDTO dto2 = new WarDTO(2, LocalDate.of(1939, 9, 1), LocalDate.of(1945, 9, 2), countryCollection2);

		// War DTO collection
		Collection<WarDTO> wars = new HashSet<WarDTO>();
		wars.add(dto1);
		wars.add(dto2);

		presidentByCountry(wars, "Germany");

		presidents(wars);

		countries(wars);

		detailsByWarDate(wars, LocalDate.of(1939, 9, 1), LocalDate.of(1945, 9, 2));

		detailsByContinent(wars, "Asia");

	}

	public static void presidentByCountry(Collection<WarDTO> wars, String countryName) {

		List<String> presidents = wars.stream().flatMap(war -> war.getCountry().stream())
				.filter(country -> country.getName().equals(countryName))
				.map(president -> president.getPresident().getName()).collect(Collectors.toList());

		presidents.forEach(ref -> System.out.println("The president of " + countryName + " is " + ref));
		System.out.println();
	}

	public static void presidents(Collection<WarDTO> wars) {
		List<String> presidents = wars.stream()
				.flatMap(war -> war.getCountry().stream().map(country -> country.getPresident().getName()))
				.collect(Collectors.toList());

		System.out.println("All Presidents saved are ");
		presidents.forEach(ref -> System.out.println(ref));
		System.out.println();
	}

	public static void countries(Collection<WarDTO> wars) {

		List<String> countries = wars.stream().flatMap(m -> m.getCountry().stream().map(mu -> mu.getName()))
				.collect(Collectors.toList());

		System.out.println("All Countries saved are ");
		countries.forEach(ref -> System.out.println(ref));
		System.out.println();
	}

	public static void detailsByWarDate(Collection<WarDTO> wars, LocalDate startDate, LocalDate endDate) {
		Set<WarDTO> allData = wars.stream()
				.filter(war -> war.getStartDate().equals(startDate) && war.getEndDate().equals(endDate))
				.collect(Collectors.toSet());

		System.out.println("War details between " + startDate + " and " + endDate + " are ");
		allData.forEach(ref -> System.out.println(ref));
		System.out.println();

	}

	public static void detailsByContinent(Collection<WarDTO> wars, String continentName) {
		List<WarDTO> allData = wars.stream().filter(
				war -> war.getCountry().stream().anyMatch(continent -> continent.getContinent().equals(continentName)))
				.collect(Collectors.toList());

		System.out.println("War details by Continent " + continentName + " are ");
		allData.forEach(ref -> System.out.println(ref));
		System.out.println();

	}

}
