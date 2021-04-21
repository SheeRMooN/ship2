package com.example.ship.repository;

import com.example.ship.model.Ship;
import com.example.ship.model.ShipId;
import com.example.ship.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipRepo extends JpaRepository<Ship, ShipId> {
    @Override
    List<Ship> findAll();

    Ship findShipByShipIdName(String name);
    Ship findShipByShipIdCommand(String command);

    List<Ship> findByStatus(Status status);
    String jpql = "select a from Article a where a.category = com.baeldung.jpa.enums.Category.SPORT";
}
