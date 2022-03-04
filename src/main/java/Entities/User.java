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
public class User extends AbstractEntity {

	@Column
	private String nameString;

	public User(int id, Date creationDate, Date updateDate, String nameString) {
		super(id, creationDate, updateDate);
		this.nameString = nameString;
	}
	
	
	
	
}
