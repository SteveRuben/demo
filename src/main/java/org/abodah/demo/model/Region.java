package org.abodah.demo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.hateoas.RepresentationModel;

@Entity
public class Region extends RepresentationModel<Region> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private String code;
	private String name;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "departement" ,cascade = CascadeType.ALL)
	private Set<Department> departement = new HashSet<>(0);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Department> getDepartement() {
		return departement;
	}

	public void setDepartement(Set<Department> departement) {
		this.departement = departement;
	}

}
