package com.xworkz.map.dtorunner;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.xworkz.Enum.passporttype.PassPortType;
import com.xworkz.dto.passport.PassPortDTO;
import com.xworkz.dto.person.PersonDTO;

public class PersonAndPassportRunner {

	public static void main(String[] args) {

		// Person DTO
		PersonDTO personDTO1 = new PersonDTO(1, "Sachin", "sachin10@gmail.com", 8397265197l);
		PersonDTO personDTO2 = new PersonDTO(2, "Abhishek", "abhi7@gmail.com", 8966265107l);
		PersonDTO personDTO3 = new PersonDTO(3, "Anush", "anush8@gmail.com", 9872699289l);
		PersonDTO personDTO4 = new PersonDTO(4, "Suhas", "suhas123@gmail.com", 9393725190l);
		PersonDTO personDTO5 = new PersonDTO(5, "Harshith", "harshithg21@gmail.com", 6423432427l);
		PersonDTO personDTO6 = new PersonDTO(6, "Rohan Sharma", "rohan.sharma@example.com", 9876543210L);
		PersonDTO personDTO7 = new PersonDTO(7, "Neha Gupta", "neha.gupta@example.com", 8765432109L);
		PersonDTO personDTO8 = new PersonDTO(8, "Kavita Singh", "kavita.singh@example.com", 7654321098L);
		PersonDTO personDTO9 = new PersonDTO(9, "Rajiv Verma", "rajiv.verma@example.com", 6543210987L);
		PersonDTO personDTO10 = new PersonDTO(10, "Shreya Patel", "shreya.patel@example.com", 5432109876L);

		// PassPort DTO
		PassPortDTO passPortDTO1 = new PassPortDTO(1, "A1234567", LocalDate.of(2014, 3, 21), "India",
				LocalDate.of(2024, 3, 21), PassPortType.DOMESTIC);
		PassPortDTO passPortDTO2 = new PassPortDTO(2, "B7890123", LocalDate.of(2012, 4, 1), "England",
				LocalDate.of(2022, 4, 1), PassPortType.INTERNATIONAL);
		PassPortDTO passPortDTO3 = new PassPortDTO(3, "C3456789", LocalDate.of(2016, 11, 11), "India",
				LocalDate.of(2026, 11, 11), PassPortType.DOMESTIC);
		PassPortDTO passPortDTO4 = new PassPortDTO(4, "D9012345", LocalDate.of(2004, 1, 14), "Turkey",
				LocalDate.of(2014, 3, 14), PassPortType.INTERNATIONAL);
		PassPortDTO passPortDTO5 = new PassPortDTO(5, "E6789012", LocalDate.of(2022, 2, 15), "USA",
				LocalDate.of(2032, 3, 15), PassPortType.INTERNATIONAL);
		PassPortDTO passPortDTO6 = new PassPortDTO(6, "B9876543", LocalDate.of(2015, 5, 12), "India",
				LocalDate.of(2025, 5, 12), PassPortType.INTERNATIONAL);
		PassPortDTO passPortDTO7 = new PassPortDTO(7, "C8765432", LocalDate.of(2016, 7, 5), "India",
				LocalDate.of(2026, 7, 5), PassPortType.DOMESTIC);

		PassPortDTO passPortDTO8 = new PassPortDTO(8, "D7654321", LocalDate.of(2017, 8, 18), "India",
				LocalDate.of(2027, 8, 18), PassPortType.INTERNATIONAL);

		PassPortDTO passPortDTO9 = new PassPortDTO(9, "E6543210", LocalDate.of(2018, 10, 30), "India",
				LocalDate.of(2028, 10, 30), PassPortType.DOMESTIC);

		PassPortDTO passPortDTO10 = new PassPortDTO(10, "F5432109", LocalDate.of(2019, 12, 7), "India",
				LocalDate.of(2029, 12, 7), PassPortType.INTERNATIONAL);

		// Mapping
		Map<PersonDTO, PassPortDTO> data = new HashMap<PersonDTO, PassPortDTO>();

		data.put(personDTO1, passPortDTO1);
		data.put(personDTO2, passPortDTO2);
		data.put(personDTO3, passPortDTO3);
		data.put(personDTO4, passPortDTO4);
		data.put(personDTO5, passPortDTO5);
		data.put(personDTO6, passPortDTO6);
		data.put(personDTO7, passPortDTO7);
		data.put(personDTO8, passPortDTO8);
		data.put(personDTO9, passPortDTO9);
		data.put(personDTO10, passPortDTO10);

		allPersonDtos(data);

		allPassPortDtos(data);

		byPassPortType(data, PassPortType.INTERNATIONAL);

		nonExpiredPassPorts(data);

		expiredPassPorts(data);

		getPersonByName(data, "Anush");

		getPassPortByNumber(data, "C3456789");
	}

	static void allPersonDtos(Map<PersonDTO, PassPortDTO> data) {
		List<PersonDTO> dtos = data.keySet().stream().sorted((i1, i2) -> i1.getId().compareTo(i2.getId()))
				.collect(Collectors.toList());
		System.out.println("Person DTO's are ");
		dtos.forEach(System.out::println); // forEach(ref -> sys(ref));
		System.out.println();
	}

	static void allPassPortDtos(Map<PersonDTO, PassPortDTO> data) {
		List<PassPortDTO> dtos = data.values().stream().sorted((i1, i2) -> i1.getId().compareTo(i2.getId()))
				.collect(Collectors.toList());
		System.out.println("PassPort DTO's are ");
		dtos.forEach(System.out::println);
		System.out.println();
	}

	static void byPassPortType(Map<PersonDTO, PassPortDTO> data, PassPortType passPortType) {
		List<PassPortDTO> type = data.values().stream().sorted((i1, i2) -> i1.getId().compareTo(i2.getId()))
				.filter(pass -> pass.getPassPortType().equals(passPortType)).collect(Collectors.toList());
		System.out.println("PassPorts by type : " + passPortType);
		type.forEach(ref -> System.out.println(ref));
		System.out.println();
	}

	static void nonExpiredPassPorts(Map<PersonDTO, PassPortDTO> data) {
		List<PassPortDTO> expired = data.values().stream().sorted((i1, i2) -> i1.getId().compareTo(i2.getId()))
				.filter(d -> d.getExpiryDate().isAfter(LocalDate.now())).collect(Collectors.toList());
		System.out.println("Passports issued before today :" + LocalDate.now() + " and not expired are");
		expired.forEach(ref -> System.out.println(ref));
		System.out.println();
	}

	static void expiredPassPorts(Map<PersonDTO, PassPortDTO> data) {
		List<PassPortDTO> expired = data.values().stream().sorted((i1, i2) -> i1.getId().compareTo(i2.getId()))
				.filter(d -> d.getIssuedDate().isBefore(LocalDate.now()) && d.getExpiryDate().isBefore(LocalDate.now()))
				.collect(Collectors.toList());
		System.out.println("Expired Pass ports");
		expired.forEach(ref -> System.out.println(ref));
		System.out.println();
	}

	static void getPersonByName(Map<PersonDTO, PassPortDTO> data, String name) {
		System.out.println("Person Info by name " + name + " is ");
		try {
			PersonDTO personDto = data.keySet().stream().sorted((i1, i2) -> i1.getId().compareTo(i2.getId()))
					.filter(person -> person.getName().equals(name)).findFirst().get();
			System.out.println(personDto);

		} catch (Exception e) {
			System.err.println("None");
		}
		System.out.println();
	}

	static void getPassPortByNumber(Map<PersonDTO, PassPortDTO> data, String number) {
		System.out.println("PassPort Info by number " + number + " is ");
		try {
			PassPortDTO passPortDTO = data.values().stream().filter(person -> person.getPassportNumber().equals(number))
					.findFirst().get();
			System.out.println(passPortDTO);
			

		} catch (Exception e) {
			System.err.println("None");
		}
		
	}

}
