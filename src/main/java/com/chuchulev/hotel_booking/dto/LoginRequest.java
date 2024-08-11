package com.chuchulev.hotel_booking.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank(message = "Email is require")
    private String email;

    @NotBlank(message = "Password is required")
    private String password;
}
