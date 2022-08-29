package com.wipro.bean;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapKeyColumn;

@Entity
public class Continent {
	
	@Id
	private String cname;
	
	@ElementCollection
	@MapKeyColumn(name="Country")
	@Column(name="capital")
	@CollectionTable(name="Country_Details")
	private Map<String, String> countries;

	public Continent() {
		super();
	}

	public Continent(String cname, Map<String, String> countries) {
		super();
		this.cname = cname;
		this.countries = countries;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Map<String, String> getCountries() {
		return countries;
	}

	public void setCountries(Map<String, String> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		String out = "Continent [Name: " +this.cname+ ",\tCountries: [";
		
		for(String country : this.countries.keySet()) {
			out += "Country [Name: " +country+
					"\tCapital: " +this.countries.get(country)+ "]";
		}
		out += "]]";
		return out;
	}
	
	

}
