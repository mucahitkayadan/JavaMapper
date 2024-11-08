package org.example.mapperdemo.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.mapperdemo.dto.request.PublisherRequestDTO;
import org.example.mapperdemo.dto.response.PublisherResponseDTO;
import org.example.mapperdemo.mapper.PublisherMapper;
import org.example.mapperdemo.model.Publisher;
import org.example.mapperdemo.repository.PublisherRepository;
import org.example.mapperdemo.service.PublisherService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {
    private final PublisherMapper publisherMapper;
    private final PublisherRepository publisherRepository;

    @Override
    public PublisherResponseDTO createPublisher(PublisherRequestDTO publisherRequestDTO) {
        Publisher publisher = publisherMapper.publisherRequestDTOToPublisher(publisherRequestDTO);
        Publisher savedPublisher = publisherRepository.save(publisher);
        return publisherMapper.publisherToPublisherResponseDTO(savedPublisher);
    }

    @Override
    public PublisherResponseDTO getPublisherById(Long id) {
        Publisher publisher = publisherRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Publisher not found"));
        return publisherMapper.publisherToPublisherResponseDTO(publisher);
    }

    @Override
    public void deletePublisher(Long id) {
        publisherRepository.deleteById(id);
    }

    @Override
    public PublisherResponseDTO updatePublisher(Long id, PublisherRequestDTO publisherRequestDTO) {
        Publisher existingPublisher = publisherRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Publisher not found"));
        
        Publisher updatedPublisher = publisherMapper.publisherRequestDTOToPublisher(publisherRequestDTO);
        updatedPublisher.setId(id);
        
        Publisher savedPublisher = publisherRepository.save(updatedPublisher);
        return publisherMapper.publisherToPublisherResponseDTO(savedPublisher);
    }
} 