package com.projctend.pfe.Dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TeamDto {
	private String name;

	private String email;

	private String description;

}
