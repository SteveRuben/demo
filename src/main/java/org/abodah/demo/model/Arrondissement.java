package org.abodah.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Arrondissement {

	@Id
	@GeneratedValue
	private Long id;
	private String code;
	private String name;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "personnes")
	private Set<User> users = new HashSet<>(0);

	public Arrondissement() {
		super();
	}

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

	
}
