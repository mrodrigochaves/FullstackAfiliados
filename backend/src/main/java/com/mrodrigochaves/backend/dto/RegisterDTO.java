package com.mrodrigochaves.backend.dto;

import com.mrodrigochaves.backend.model.UsersRole;

public record RegisterDTO(String login, String password, UsersRole role) {
}