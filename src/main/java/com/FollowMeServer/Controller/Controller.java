package com.FollowMeServer.Controller;

import com.FollowMeServer.Entity.Roboter;
import com.FollowMeServer.Entity.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;


import java.util.List;


/**
 * Klasse um die verschiedenen GET, POST und PACh Methoden bereit zu stellen
 */
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

    /**
     * GET Methode fuer die Roboter Objekte
     * @return eine Liste von den aktuellen Robotern
     */
    @GetMapping("/roboter/getAll")
    public List<Roboter> getRobotList(){
        return dAO.getAllRoboter();
    }

    /**
     * POST Methode, um ein Roboter Objekt abzuspeichern
     * @param ro zu speicherndes Roboter Objekt
     */
    @PostMapping("/roboter/save")
    public void saveRoboter(@RequestBody Roboter ro){dAO.saveRoboter(ro); }

    /**
     * PATCH Methode um den isFollowing Status zu aktualisieren
     * @param id ID, des zu aktualisierenden Roboters
     * @param isFollowing zu aktualisierender isFollowing Wert
     */
    @PatchMapping("/roboter/update/{id}")
    public void updateIsFollowing(@PathVariable("id") Integer id, @RequestParam("isFollowing") boolean isFollowing) {
        Roboter robot = dAO.findRoboterById(id);
        if (robot != null) {
            robot.setFollowing(isFollowing);
            dAO.saveRoboter(robot);
        }
    }

    /**
     * DELETE Methode, um ein Roboter Objekt zu löschen
     * @param id die ID des zu löschenden Roboters
     */
    @DeleteMapping("/roboter/delete/{id}")
    public void deleteRoboter(@PathVariable ("id") Integer id) {
        dAO.deleteRoboter(id);
    }

    /**
     * GET Methode fuer die Routen
     * @return Liste der aktuellen Routen
     */
    @GetMapping("/route/getAll")
      public List<Route> getRouteList(){
        return dAO.getAllRoute();
    }

    /**
     * POST Methode fuer eine zu speichernde Route
     * @param rou das zu speichernde Routen Objekt
     */
    @PostMapping("/route/save")
    public void saveRoute(@RequestBody Route rou){dAO.saveRoute(rou); }
}
