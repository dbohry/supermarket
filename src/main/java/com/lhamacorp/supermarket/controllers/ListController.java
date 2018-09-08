package com.lhamacorp.supermarket.controllers;

import com.lhamacorp.supermarket.entities.SupermarketList;
import com.lhamacorp.supermarket.services.SupermarketListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lists")
public class ListController {

    private final SupermarketListService service;

    @Autowired
    public ListController(SupermarketListService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SupermarketList>> getAll() {
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SupermarketList> getById(@PathVariable("id") String id) {
        return ResponseEntity.ok().body(service.getById(id));
    }

    @PostMapping
    public ResponseEntity<SupermarketList> save(@RequestBody SupermarketList list) {
        return ResponseEntity.ok().body(service.save(list));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SupermarketList> update(@PathVariable("id") String id,
                                                  @RequestBody SupermarketList list) {
        return ResponseEntity.ok().body(service.update(id, list));
    }

}
