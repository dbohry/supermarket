package com.lhamacorp.supermarket.controllers;

import com.lhamacorp.supermarket.entities.SupermarketList;
import com.lhamacorp.supermarket.services.SupermarketListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lists")
public class ListController {

    @Autowired
    private SupermarketListService service;

    @GetMapping
    public ResponseEntity<List<SupermarketList>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupermarketList> getById(@PathVariable("id") Long id) {
        return ResponseEntity.ok().body(service.getById(id));
    }

    public ResponseEntity<SupermarketList> save(@RequestBody SupermarketList list) {
        return ResponseEntity.ok().body(service.save(list));
    }

}
