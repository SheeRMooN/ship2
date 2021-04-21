package com.example.ship.service;

import com.example.ship.model.Ship;
import com.example.ship.model.Status;
import com.example.ship.repository.ShipRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShipService {
    ShipRepo repo;

    public List<Ship> getAll(){
        return repo.findAll();
    }
    public Ship getNameId(String name){
        return repo.findShipByShipIdName(name);
    }
    public List<Ship> getEnum(Status status){
        return repo.findByStatus(status);
    }
    public Ship createEnum(Ship ship){
        return repo.save(ship);
    }
}
