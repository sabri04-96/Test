package Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@SuppressWarnings("serial")
@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@CreatedDate
	@Column(name = "creationDate", nullable = false)
	private Date creationDate;

	@Column(name = "lastupdateDate", nullable = false)
	@LastModifiedDate
	private Date lastUpdateDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getcreationDate() {
		return creationDate;
	}

	public void setcreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return lastUpdateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.lastUpdateDate = updateDate;
	}

	@Override
	public String toString() {
		return "AbstractEntity [id=" + id + ", creationDate=" + creationDate + ", updateDate=" + lastUpdateDate + "]";
	}

	

}
