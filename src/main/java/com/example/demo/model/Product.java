package com.example.demo.model;

import org.springframework.data.annotation.Id; //import untuk MongoDB
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document(collection = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    private String id;

    private String name;

    private String description;

    private Double price;

    private Integer stock;
}

// Untuk MongoDB