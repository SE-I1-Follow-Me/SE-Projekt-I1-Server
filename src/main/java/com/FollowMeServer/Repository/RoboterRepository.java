package com.FollowMeServer.Repository;

import com.FollowMeServer.Entity.Roboter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface fuer die Roboterverwaltung
 */
@Repository
public interface RoboterRepository extends JpaRepository <Roboter, Integer> {
}
