package com.xworkz.dto;

import java.time.LocalDate;

public class PresidentDTO {

	private Integer id;
	private String name;
	private LocalDate serviceStart;
	private LocalDate serviceEnd;
	
	public PresidentDTO() {
	}
	
	public PresidentDTO(Integer id, String name, LocalDate serviceStart, LocalDate serviceEnd) {
		this.id = id;
		this.name = name;
		this.serviceStart = serviceStart;
		this.serviceEnd = serviceEnd;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getserviceStart() {
		return serviceStart;
	}

	public LocalDate getserviceEnd() {
		return serviceEnd;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setserviceStart(LocalDate serviceStart) {
		this.serviceStart = serviceStart;
	}

	public void setserviceEnd(LocalDate serviceEnd) {
		this.serviceEnd = serviceEnd;
	}

	@Override
	public String toString() {
		return "id=" + id + ", presidentName=" + name + ", serviceStart=" + serviceStart + ", serviceEnd="
				+ serviceEnd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serviceEnd == null) ? 0 : serviceEnd.hashCode());
		result = prime * result + ((serviceStart == null) ? 0 : serviceStart.hashCode());
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
		PresidentDTO other = (PresidentDTO) obj;
		if (serviceEnd == null) {
			if (other.serviceEnd != null)
				return false;
		} else if (!serviceEnd.equals(other.serviceEnd))
			return false;
		if (serviceStart == null) {
			if (other.serviceStart != null)
				return false;
		} else if (!serviceStart.equals(other.serviceStart))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}
