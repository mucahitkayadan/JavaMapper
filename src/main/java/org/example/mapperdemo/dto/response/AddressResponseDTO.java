package org.example.mapperdemo.dto.response;

public record AddressResponseDTO(
    Long id,
    String street,
    String city,
    String state,
    String zipCode,
    String country
) {} 