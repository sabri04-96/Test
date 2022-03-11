package com.projctend.pfe.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Credentials")
public class Credentials extends AbstractEntity {

	@Column
	private String username;
	
	
	@Column
	private String password;
	
	@Column
	private UserRole role;
	



	
	
	
}