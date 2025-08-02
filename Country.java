package org.jsp.onetoone_uni.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Country {
	
	@Id
	private int count_id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Capital captial;

	public int getCount_id() {
		return count_id;
	}

	public void setCount_id(int count_id) {
		this.count_id = count_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Capital getCaptial() {
		return captial;
	}

	public void setCaptial(Capital captial) {
		this.captial = captial;
	}

	@Override
	public String toString() {
		return "Country [count_id=" + count_id + ", name=" + name + ", captial=" + captial + "]";
	}
	
	
	
	
}
