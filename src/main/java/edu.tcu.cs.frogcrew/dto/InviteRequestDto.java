package edu.tcu.cs.frogcrew.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record InviteRequestDto (
        List<String> emails
) {}