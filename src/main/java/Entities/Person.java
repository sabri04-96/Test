package Entities;

import java.sql.Date;

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
public class Person extends AbstractEntity {

	@Column
	private String nameString;

	public Person(int id, Date creationDate, Date updateDate, String nameString) {
		this.nameString = nameString;
	}
	
	
	
	
}
