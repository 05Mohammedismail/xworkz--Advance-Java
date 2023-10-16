package com.xworkz.dto;

public class CountryDTO {

	private Integer id;
	private String name;
	private PresidentDTO president;
	private String continent;

	public CountryDTO() {
	}
	
	public CountryDTO(Integer id, String name, PresidentDTO president, String continent) {
		this.id = id;
		this.name = name;
		this.president = president;
		this.continent = continent;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public PresidentDTO getPresident() {
		return president;
	}

	public String getContinent() {
		return continent;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPresident(PresidentDTO president) {
		this.president = president;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "countryId=" + id + ", countryName=" + name + ", president=" + president + ", continentName=" + continent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((president == null) ? 0 : president.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (continent == null) {
			if (other.continent != null)
				return false;
		} else if (!continent.equals(other.continent))
			return false;
		if (president == null) {
			if (other.president != null)
				return false;
		} else if (!president.equals(other.president))
			return false;
		return true;
	}

	
	
}
