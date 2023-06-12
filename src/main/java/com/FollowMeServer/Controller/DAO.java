package com.FollowMeServer.Controller;

import com.FollowMeServer.Entity.Roboter;
import com.FollowMeServer.Entity.Route;
import com.FollowMeServer.Repository.RoboterRepository;
import com.FollowMeServer.Repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DAO {

    @Autowired
    private RoboterRepository roboterRepository;

    @Autowired
    private RouteRepository routeRepository;

    public List<Roboter> getAllRoboter(){
        return roboterRepository.findAll();
    }

    public void saveRoboter(Roboter r) {roboterRepository.save(r); }

    public List<Route> getAllRoute() { return  routeRepository.findAll(); }

    public  void saveRoute(Route r) {routeRepository.save(r); }
    
    public Roboter findRoboterById(Integer id) {
        Optional<Roboter> optionalRoboter = roboterRepository.findById(id);
        return optionalRoboter.orElse(null);
    }

}
