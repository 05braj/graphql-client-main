package com.example.graphql.client.controller;

import com.example.graphql.client.dto.Item;
import com.example.graphql.client.dto.ItemRequestDTO;
import com.example.graphql.client.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/products")
    public List<Item> viewProducts() {
        return catalogService.viewProducts();
    }

    @GetMapping("/products/category")
    public List<Item> viewProductsByCategory(@RequestParam String category) {
        return catalogService.viewProductsByCategory(category);
    }

    @PostMapping("/shipment")
    public Item receiveNewShipment(@RequestBody ItemRequestDTO itemRequest) {
        return catalogService.receiveNewShipment(itemRequest);
    }

    @PostMapping("/createStock")
    public Item createStock(@RequestBody ItemRequestDTO itemRequest) {
        return catalogService.createStock(itemRequest);
    }

    @DeleteMapping("/deleteStock")
    public String deleteStock(@RequestParam int id) {
        return catalogService.deleteStock(id);
    }
}
