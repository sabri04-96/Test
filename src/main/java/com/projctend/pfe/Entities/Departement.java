package com.projctend.pfe.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Departement extends AbstractEntity {

	@Column
	private String name;
	
	
	@Column
	private String adress;



	
	
	
}
