package org.jsp.onetoone_uni.controller;

import org.jsp.onetoone_uni.dao.Country_Capital_Dao;
import org.jsp.onetoone_uni.dto.Capital;
import org.jsp.onetoone_uni.dto.Country;

public class Country_Capital_Controller {

	public static void main(String[] args) {
		
		Capital capital = new Capital();
		capital.setCapitalId(1003);
		capital.setCapitalName("Tokyo");
		
		Country country = new Country();
		country.setCount_id(102);
		country.setName("Russia");
		country.setCaptial(capital);
		
		Country_Capital_Dao dao = new Country_Capital_Dao();
		
		//dao.saveCountry(country);
	//	dao.saveCapital(capital);
		
		//dao.updateCountry(country);
	//	dao.updateCapital(capital);
		
		//dao.findCountryById(101);
	//	dao.findCapitalById(1001);
		
		//dao.deleteCountryById(101);
	//	dao.deleteCapitalById(1002);
		
		dao.fetchAllCapital();
		//dao.fetchAllCountry();
		
	}

}
