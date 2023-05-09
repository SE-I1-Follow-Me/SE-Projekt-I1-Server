package com.FollowMeServer.Controller;

import com.FollowMeServer.Entity.Roboter;
import com.FollowMeServer.Entity.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private DAO dAO;
    /* public void save(Roboter roboter){
        DAO.save(roboter);
    }

    // public void delete(Roboter roboter){
        roboterRepository.delete(roboter);
    }
    */
    @GetMapping("/roboter/getAll")
    public List<Roboter> getRobotList(){
        return dAO.getAllRoboter();
    }

    @PostMapping("/roboter/save")
    public void saveRoboter(@RequestBody Roboter ro){dAO.saveRoboter(ro); }

    @GetMapping("/route/getAll")
    public List<Route> getRouteList(){
        return dAO.getAllRoute();
    }

    @PostMapping("/route/save")
    public void saveRoute(@RequestBody Route rou){dAO.saveRoute(rou); }
}
