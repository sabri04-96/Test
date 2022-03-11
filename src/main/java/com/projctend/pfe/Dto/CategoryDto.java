package com.projctend.pfe.Dto;



import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDto {
	
	private String name;
	
	
	private String description;
}
