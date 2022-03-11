package com.projctend.pfe.Entities;

import java.sql.Date;

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
@Table(name = "Person")
public class Person extends AbstractEntity {

	@Column
	private String nameString;

	public Person(int id, Date creationDate, Date updateDate, String nameString) {
		this.nameString = nameString;
	}
	
	
	
	
}
