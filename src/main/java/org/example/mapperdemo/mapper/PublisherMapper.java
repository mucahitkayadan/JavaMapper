package org.example.mapperdemo.mapper;

import org.example.mapperdemo.dto.request.PublisherRequestDTO;
import org.example.mapperdemo.dto.response.PublisherResponseDTO;
import org.example.mapperdemo.model.Publisher;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface PublisherMapper {
    Publisher publisherRequestDTOToPublisher(PublisherRequestDTO publisherRequestDTO);
    PublisherResponseDTO publisherToPublisherResponseDTO(Publisher publisher);
} 