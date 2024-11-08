package org.example.mapperdemo.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.mapperdemo.dto.request.AddressRequestDTO;
import org.example.mapperdemo.dto.response.AddressResponseDTO;
import org.example.mapperdemo.mapper.AddressMapper;
import org.example.mapperdemo.model.Address;
import org.example.mapperdemo.repository.AddressRepository;
import org.example.mapperdemo.service.AddressService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressMapper addressMapper;
    private final AddressRepository addressRepository;

    @Override
    public AddressResponseDTO createAddress(AddressRequestDTO addressRequestDTO) {
        Address address = addressMapper.addressRequestDTOToAddress(addressRequestDTO);
        Address savedAddress = addressRepository.save(address);
        return addressMapper.addressToAddressResponseDTO(savedAddress);
    }

    @Override
    public AddressResponseDTO getAddressById(Long id) {
        Address address = addressRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Address not found"));
        return addressMapper.addressToAddressResponseDTO(address);
    }

    @Override
    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public AddressResponseDTO updateAddress(Long id, AddressRequestDTO addressRequestDTO) {
        Address existingAddress = addressRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Address not found"));
        
        Address updatedAddress = addressMapper.addressRequestDTOToAddress(addressRequestDTO);
        updatedAddress.setId(id);
        
        Address savedAddress = addressRepository.save(updatedAddress);
        return addressMapper.addressToAddressResponseDTO(savedAddress);
    }
} 