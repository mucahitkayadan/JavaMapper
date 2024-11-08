package org.example.mapperdemo;

import lombok.RequiredArgsConstructor;
import org.example.mapperdemo.dto.request.AddressRequestDTO;
import org.example.mapperdemo.dto.request.PublisherRequestDTO;
import org.example.mapperdemo.mapper.AddressMapper;
import org.example.mapperdemo.mapper.PublisherMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class MapperDemoApplication {
    private final AddressMapper addressMapper;
    private final PublisherMapper publisherMapper;

    public static void main(String[] args) {
        SpringApplication.run(MapperDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return args -> {
            AddressRequestDTO addressRequestDTO = new AddressRequestDTO("123 Main St", "City1", "IA", "12345", "US");
            PublisherRequestDTO publisherRequestDTO = new PublisherRequestDTO("Publisher", "email", "phone", addressRequestDTO);
            System.out.println(addressMapper.addressRequestDTOToAddress(addressRequestDTO));
            System.out.println(publisherMapper.publisherRequestDTOToPublisher(publisherRequestDTO));
        };
    }
}
