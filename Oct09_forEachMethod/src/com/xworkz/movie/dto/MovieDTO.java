package com.xworkz.movie.dto;

import java.io.Serializable;

import com.xworkz.movie.Enum.LangType;

public class MovieDTO implements Serializable{
	private int idNum;
	private String name;
	private LangType lang;
	private String producerName;
	private String directerName;
	private double budget;
	
	public MovieDTO() {
	}

	public MovieDTO(int idNum, String name, LangType lang, String producerName, String directerName, double budget) {
		this.idNum = idNum;
		this.name = name;
		this.lang = lang;
		this.producerName = producerName;
		this.directerName = directerName;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "idNum=" + idNum + ", name=" + name + ", lang=" + lang + ", producerName=" + producerName
				+ ", directerName=" + directerName + ", budget=" + budget + "\n";
	}

	public int getIdNum() {
		return idNum;
	}

	public String getName() {
		return name;
	}

	public LangType getLang() {
		return lang;
	}

	public String getProducerName() {
		return producerName;
	}

	public String getDirecterName() {
		return directerName;
	}

	public double getBudget() {
		return budget;
	}

	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLang(LangType lang) {
		this.lang = lang;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public void setDirecterName(String directerName) {
		this.directerName = directerName;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idNum;
		result = prime * result + ((lang == null) ? 0 : lang.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		MovieDTO other = (MovieDTO) obj;
		if (idNum != other.idNum)
			return false;
		if (lang != other.lang)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
