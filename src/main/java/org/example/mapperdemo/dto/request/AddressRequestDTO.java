package org.example.mapperdemo.dto.request;

public record AddressRequestDTO(
    String street,
    String city,
    String state,
    String zipCode,
    String country
) {} 