package com.projctend.pfe.Dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ServiceDto {
	private String name;

	private String description;

	private Date duration;
}
