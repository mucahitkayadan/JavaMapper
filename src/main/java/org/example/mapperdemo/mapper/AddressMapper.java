package org.example.mapperdemo.mapper;

import org.example.mapperdemo.dto.request.AddressRequestDTO;
import org.example.mapperdemo.dto.response.AddressResponseDTO;
import org.example.mapperdemo.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {
    Address addressRequestDTOToAddress(AddressRequestDTO addressRequestDTO);
    AddressResponseDTO addressToAddressResponseDTO(Address address);
} 