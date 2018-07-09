package com.lhamacorp.supermarket.services;

import com.lhamacorp.supermarket.entities.SupermarketList;
import com.lhamacorp.supermarket.repositories.SupermarketListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupermarketListService {

    @Autowired
    private SupermarketListRepository repo;

    public List<SupermarketList> getAll() {
        return repo.findAll();
    }

    public SupermarketList getById(Long id) {
        return repo.findById(id);
    }

    public SupermarketList save(SupermarketList list) {
        return repo.save(list);
    }

}
