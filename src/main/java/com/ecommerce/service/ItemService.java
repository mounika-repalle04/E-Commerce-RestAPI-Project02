package com.ecommerce.service;

import com.ecommerce.model.Item;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private long counter = 1;

    public Item addItem(Item item) {
        item.setId(counter++);
        items.add(item);
        return item;
    }

    public Optional<Item> getItemById(Long id) {
        return items.stream()
                .filter(i -> i.getId().equals(id))
                .findFirst();
    }
}
