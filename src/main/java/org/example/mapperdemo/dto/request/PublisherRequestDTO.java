package org.example.mapperdemo.dto.request;

public record PublisherRequestDTO(
    String name,
    String email,
    String phone,
    AddressRequestDTO address
) {} 