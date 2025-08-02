package org.jsp.onetoone_uni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Capital {
	@Id
	private int capitalId;
	private String capitalName;
	public int getCapitalId() {
		return capitalId;
	}
	public void setCapitalId(int capitalId) {
		this.capitalId = capitalId;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}
	@Override
	public String toString() {
		return "Capital [capitalId=" + capitalId + ", capitalName=" + capitalName + "]";
	}
	
	
	
	
	

}
