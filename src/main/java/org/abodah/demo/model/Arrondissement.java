package org.abodah.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BQ_ARRONDISSEMENT")
public class Arrondissement {

	@Id
	@GeneratedValue
	private Long id;
	private String code;
	private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "arrondissement")
	private Set<User> users = new HashSet<>(0);
	
	@ManyToOne(fetch = FetchType.LAZY)
	Department departement;

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
