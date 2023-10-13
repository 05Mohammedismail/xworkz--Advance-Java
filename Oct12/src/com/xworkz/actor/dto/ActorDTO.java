package com.xworkz.actor.dto;

public class ActorDTO implements Comparable<ActorDTO> {

	private Integer id;
	private String name;
	private String langSpeak;
	private String gender;
	private String countryName;

	public ActorDTO() {
	}

	public ActorDTO(Integer id, String name, String langSpeak, String gender, String countryName) {
		this.id = id;
		this.name = name;
		this.langSpeak = langSpeak;
		this.gender = gender;
		this.countryName = countryName;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLangSpeak() {
		return langSpeak;
	}

	public String getGender() {
		return gender;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLangSpeak(String langSpeak) {
		this.langSpeak = langSpeak;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((langSpeak == null) ? 0 : langSpeak.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActorDTO other = (ActorDTO) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (langSpeak == null) {
			if (other.langSpeak != null)
				return false;
		} else if (!langSpeak.equals(other.langSpeak))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", langSpeak=" + langSpeak + ", gender=" + gender + ", countryName="
				+ countryName;
	}

	@Override
	public int compareTo(ActorDTO dto) {
		ActorDTO temp = this;
		return temp.getLangSpeak().compareTo(dto.getLangSpeak());
	}

}
