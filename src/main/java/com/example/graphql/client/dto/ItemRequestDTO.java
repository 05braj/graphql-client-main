package com.example.graphql.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemRequestDTO {

    private int id;
    private int qty;
    private String name;
    private String category;
    private Float price;
    private Integer stock;
}
