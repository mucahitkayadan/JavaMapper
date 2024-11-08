package org.example.mapperdemo.repository;

import org.example.mapperdemo.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    // You can add custom query methods here if needed
    // For example:
    // Optional<Publisher> findByEmail(String email);
    // List<Publisher> findByNameContainingIgnoreCase(String name);
} 