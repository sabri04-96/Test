package com.projctend.pfe.Entities;

import java.util.Date;

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
public class Request extends AbstractEntity {

	@Column
	private String description;
	
	
	@Column
	private Date dateRequest;
	
	@Column
	private Status status;
	
}