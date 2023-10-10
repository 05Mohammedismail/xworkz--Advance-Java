package com.xworkz.player.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import com.xworkz.player.Enum.SportType;
import com.xworkz.player.dto.PlayerDTO;

public class PlayerRunner {

	public static void main(String[] args) {

		PlayerDTO dto1 = new PlayerDTO(1, "M.S Dhoni", 42, "Indian", SportType.CRICKET);
		PlayerDTO dto2 = new PlayerDTO(2, "Virat Kohli", 33, "Indian", SportType.CRICKET);
		PlayerDTO dto3 = new PlayerDTO(3, "Lionel Messi", 34, "Argentinian", SportType.SOCCER);
		PlayerDTO dto4 = new PlayerDTO(4, "Serena Williams", 39, "American", SportType.TENNIS);
		PlayerDTO dto5 = new PlayerDTO(5, "Usain Bolt", 35, "Jamaican", SportType.ATHLETICS);
		PlayerDTO dto6 = new PlayerDTO(6, "Michael Phelps", 36, "American", SportType.SWIMMING);
		PlayerDTO dto7 = new PlayerDTO(7, "Rafael Nadal", 35, "Spanish", SportType.TENNIS);
		PlayerDTO dto8 = new PlayerDTO(8, "Simone Biles", 24, "American", SportType.GYMNASTICS);
		PlayerDTO dto9 = new PlayerDTO(9, "Roger Federer", 40, "Swiss", SportType.TENNIS);
		PlayerDTO dto10 = new PlayerDTO(10, "LeBron James", 36, "American", SportType.BASKET_BALL);

		Collection<PlayerDTO> players = new HashSet<PlayerDTO>();
		players.add(dto1);
		players.add(dto2);
		players.add(dto3);
		players.add(dto4);
		players.add(dto5);
		players.add(dto6);
		players.add(dto7);
		players.add(dto8);
		players.add(dto9);
		players.add(dto10);

		Collection<PlayerDTO> byCountry = new ArrayList<PlayerDTO>();
		Collection<PlayerDTO> bySport = new ArrayList<PlayerDTO>();
		Collection<PlayerDTO> byAgeAbove30 = new ArrayList<PlayerDTO>();
		Collection<PlayerDTO> byAgeAbove40 = new ArrayList<PlayerDTO>();

		getPlayersByCountry(players, byCountry, "india");

		getPlayersBySport(players, bySport, SportType.CRICKET);

		System.out.println("By age Above 30");
		players.forEach((ref) -> {
			if (ref.getAge() > 30 && ref.getAge() < 40) {
				byAgeAbove30.add(ref);
			}
		});

		System.out.println(byAgeAbove30 + "\n");

		System.out.println("By age Above 40");
		players.forEach((ref) -> {
			if (ref.getAge() > 40) {
				byAgeAbove40.add(ref);
			}
		});

		System.out.println(byAgeAbove40 + "\n");
	}

	public static void getPlayersByCountry(Collection<PlayerDTO> players, Collection<PlayerDTO> byCountry,
			String country) {
		players.forEach((ref) -> {
			if (ref.getCountryName().equalsIgnoreCase(country)) {
				byCountry.add(ref);
			}
		});

		if (byCountry.size() != 0) {
			System.out.println("Players by Nationality " + country);
			System.out.println(byCountry + "\n");
		} else {
			System.out.println("Players by Nationality " + country);
			System.err.println("Not Found \n");
		}
	}

	public static void getPlayersBySport(Collection<PlayerDTO> players, Collection<PlayerDTO> bySport, SportType type) {
		players.forEach((ref) -> {
			if (ref.getSport().equals(SportType.CRICKET)) {
				bySport.add(ref);
			}
		});

		if (bySport.size() != 0) {
			System.out.println("Players by Sport " + type);
			System.out.println(bySport + "\n");
		} else {
			System.out.println("Players by Sport " + type);
			System.err.println("Not Found \n");
		}

	}
}
