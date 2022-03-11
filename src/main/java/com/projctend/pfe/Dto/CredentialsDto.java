package com.projctend.pfe.Dto;

import com.projctend.pfe.Entities.UserRole;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CredentialsDto {
	private String username;

	private String password;

	private UserRole role;
}
