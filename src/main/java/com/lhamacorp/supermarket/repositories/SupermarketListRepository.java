package com.lhamacorp.supermarket.repositories;

import com.lhamacorp.supermarket.entities.SupermarketList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SupermarketListRepository extends MongoRepository<SupermarketList, String> {

    Optional<SupermarketList> findById(String id);

}
