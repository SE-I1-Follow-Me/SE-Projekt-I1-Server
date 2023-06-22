package com.FollowMeServer.Entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;


/**
 * Klasse um die Liste der Koordinaten bereitzustellen, wird in der Klasse Route verwendet
 */
@Embeddable
public class Coordinates {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;
    public String longitude;

    public String latitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
