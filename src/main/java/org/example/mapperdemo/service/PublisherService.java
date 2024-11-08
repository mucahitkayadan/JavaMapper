package org.example.mapperdemo.service;

import org.example.mapperdemo.dto.request.PublisherRequestDTO;
import org.example.mapperdemo.dto.response.PublisherResponseDTO;

public interface PublisherService {
    PublisherResponseDTO createPublisher(PublisherRequestDTO publisherRequestDTO);
    PublisherResponseDTO getPublisherById(Long id);
    void deletePublisher(Long id);
    PublisherResponseDTO updatePublisher(Long id, PublisherRequestDTO publisherRequestDTO);
} 