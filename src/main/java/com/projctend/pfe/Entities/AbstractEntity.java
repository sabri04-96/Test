package com.projctend.pfe.Entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@SuppressWarnings("serial")
@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private int id;

	@CreatedDate
	@Column(name = "creationDate", nullable = false)
	@JsonIgnore
	private Instant creationDate;

	@Column(name = "lastupdateDate", nullable = false)
	@LastModifiedDate
	@JsonIgnore
	private Instant lastUpdateDate;

}
