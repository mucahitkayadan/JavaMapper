package org.example.mapperdemo.service;

import org.example.mapperdemo.dto.request.AddressRequestDTO;
import org.example.mapperdemo.dto.response.AddressResponseDTO;

public interface AddressService {
    AddressResponseDTO createAddress(AddressRequestDTO addressRequestDTO);
    AddressResponseDTO getAddressById(Long id);
    void deleteAddress(Long id);
    AddressResponseDTO updateAddress(Long id, AddressRequestDTO addressRequestDTO);
} 