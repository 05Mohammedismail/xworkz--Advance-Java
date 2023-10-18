package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.Enum.casechange.CaseChange;

public class NameAndNumberRunner {

	public static void main(String[] args) {

		Map<String, Long> data = new HashMap<String, Long>();

		data.put("Raj Varma", 9901503945L);
		data.put("Gaurav", 9876543210L);
		data.put("Isha Sharma", 8765432107L);
		data.put("Aaradhya", 7654321098L);
		data.put("Arjun Singh", 6543210980L);
		data.put("Saniya Khan", 5432109870L);
		data.put("Aanya", 4321098765L);
		data.put("Kabir Singh", 3210987655L);
		data.put("Suraj", 2109876548L);
		data.put("Manoj", 1098765437L);

		namesGreaterThanLength(data, 8);

		namesLesserThanLength(data, 6);

		getNumberStartingWith(data, 8);

		getNumberEndingWith(data, 7);

		namesCaseChange(data, CaseChange.LOWER);
	}

	public static void namesGreaterThanLength(Map<String, Long> data, int len) {
		Set<String> keys = data.keySet();
		List<String> charsGreaterThanTen = keys.stream().filter(k -> k.length() > len).collect(Collectors.toList());
		System.out.println("Name having length greater than " + len + " is ");
		charsGreaterThanTen.forEach(ref -> System.out.println(ref));
		System.out.println();

	}

	public static void namesLesserThanLength(Map<String, Long> data, int len) {
		Set<String> keys = data.keySet();
		List<String> charsGreaterThanTen = keys.stream().filter(k -> k.length() < len).collect(Collectors.toList());
		System.out.println("Name having length Lesser than " + len + " is ");
		charsGreaterThanTen.forEach(ref -> System.out.println(ref));
		System.out.println();

	}

	public static void namesCaseChange(Map<String, Long> data, CaseChange caseChange) {
		Set<String> keys = data.keySet();
		List<String> namesCaseChange = keys.stream().map(k -> {
			if (caseChange.equals(CaseChange.UPPER)) {
				return k.toUpperCase();
			} else {
				return k.toLowerCase();
			}
		}).collect(Collectors.toList());
		System.out.println("Changed case of names to " + caseChange);
		namesCaseChange.forEach(ref -> System.out.println(ref));
		System.out.println();

	}

	public static void getNumberStartingWith(Map<String, Long> data, Integer number) {
		Collection<Long> values = data.values();
		List<Long> numbers = values.stream().filter(v -> v.toString().startsWith(number.toString()))
				.collect(Collectors.toList());
		System.out.println("Mobile Numbers Starting with " + number + " are ");
		numbers.forEach(ref -> System.out.println(ref));
		if (numbers.size() < 1) {
			System.err.println("None");
		}
		System.out.println();

	}

	public static void getNumberEndingWith(Map<String, Long> data, int number) {
		Collection<Long> values = data.values();
		List<Long> numbers = values.stream().filter(v -> String.valueOf(v).endsWith(String.valueOf(number)))
				.collect(Collectors.toList());
		System.out.println("Mobile Numbers Ending with " + number + " are ");
		numbers.forEach(ref -> System.out.println(ref));
		if (numbers.size() < 1) {
			System.err.println("None");
		}
		System.out.println();

	}

}
