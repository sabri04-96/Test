package com.projctend.pfe.Dto;

import java.util.Date;

import com.projctend.pfe.Entities.Status;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RequestDto {
	private String description;

	private Date dateRequest;

	private Status status;
}
