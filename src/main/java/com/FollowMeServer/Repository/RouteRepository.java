package com.FollowMeServer.Repository;

import com.FollowMeServer.Entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface fuwr die Routenverwaltung
 */
@Repository
public interface RouteRepository extends JpaRepository <Route, Integer> {
}
