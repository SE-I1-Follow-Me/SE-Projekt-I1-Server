package com.FollowMeServer.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;



/**
 * Klasse die das Entity Route beschreibt
 */
@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public Integer drivenBy;

    public String name;

    @ElementCollection
    public List<Coordinates> coordinates = new ArrayList<Coordinates>();

    public Integer getId() { return id; }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDrivenBy() {
        return drivenBy;
    }

    public void setDrivenBy(Integer drivenBy) {
        this.drivenBy = drivenBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Coordinates> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<Coordinates> coordinates) {
        this.coordinates = coordinates;
    }
}
