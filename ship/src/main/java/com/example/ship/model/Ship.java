package com.example.ship.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
//@IdClass(ShipId.class)
public class Ship {

    @EmbeddedId
    @AttributeOverrides(value = {
            @AttributeOverride( name = "name", column = @Column(name = "ship_name_id")),
            @AttributeOverride( name = "command", column = @Column(name = "ship_command_id"))
    })
    private ShipId shipId;

    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    private String title;

}
