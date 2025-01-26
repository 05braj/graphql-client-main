package com.example.graphql.client.service;

import com.example.graphql.client.client.InventoryClient;
import com.example.graphql.client.dto.Item;
import com.example.graphql.client.dto.ItemRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    private InventoryClient inventoryClient;

    public List<Item> viewProducts() {
        return inventoryClient.viewProducts();
    }

    public List<Item> viewProductsByCategory(String category) {
        return inventoryClient.viewProductsByCategory(category);
    }

    public Item receiveNewShipment(ItemRequestDTO itemRequest) {
        return inventoryClient.receiveNewShipment(itemRequest);
    }

    public Item createStock(ItemRequestDTO itemRequest) {
        return inventoryClient.createNewStock(itemRequest);
    }

    public String deleteStock(int id) {
        return inventoryClient.deleteStock(id);
    }
}
