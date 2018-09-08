package com.lhamacorp.supermarket.services;

import com.lhamacorp.supermarket.entities.SupermarketList;
import com.lhamacorp.supermarket.repositories.SupermarketListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.xml.ws.http.HTTPException;
import java.util.List;
import java.util.Optional;

@Service
public class SupermarketListService {

    private final SupermarketListRepository repo;

    @Autowired
    public SupermarketListService(SupermarketListRepository repo) {
        this.repo = repo;
    }

    public List<SupermarketList> getAll() {
        return repo.findAll();
    }

    public SupermarketList getById(String id) {
        return repo.findById(id).orElseThrow(() -> new HTTPException(HttpStatus.NOT_FOUND.value()));
    }

    public SupermarketList save(SupermarketList list) {
        return repo.save(list);
    }

    public SupermarketList update(String id, SupermarketList list) {
        repo.findById(id).orElseThrow(() -> new HTTPException(HttpStatus.NOT_FOUND.value()));
        return repo.save(list);
    }

}
