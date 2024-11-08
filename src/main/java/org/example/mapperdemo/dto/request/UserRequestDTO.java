package org.example.mapperdemo.dto.request;

import org.springframework.stereotype.Service;

public record UserRequestDTO(String userName, String password, String email) {
}
