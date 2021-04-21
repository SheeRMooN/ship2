package com.example.ship.controller;

import com.example.ship.model.Ship;
import com.example.ship.model.Status;
import com.example.ship.service.ShipService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/ship")
public class ShipController {
    ShipService service;

    @GetMapping("/all")
    public List<Ship> getAll(){
    return service.getAll();
    }

    @GetMapping("/nameid/{name}")
    public Ship getNameId(String name){
        return service.getNameId(name);
    }
    @GetMapping("/enum/{status}")
    public List<Ship> getEnum(@PathVariable Status status){
        return service.getEnum(status);
    }
    @PostMapping("/post")
    public Ship create(@RequestBody Ship ship){
        return service.createEnum(ship);
    }
}
