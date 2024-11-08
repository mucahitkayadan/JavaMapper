package org.example.mapperdemo.dto.response;

public record PublisherResponseDTO(
    Long id,
    String name,
    String email,
    String phone,
    AddressResponseDTO address
) {} 