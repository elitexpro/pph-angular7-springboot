package com.productlist.productlist.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @NonNull
    private Long productId;

    @NonNull
    private String productName;

    private String productCode;

    private String releaseDate;

    private String description;

    private Double price;

    private int starRating;

    private String imageUrl;
}
