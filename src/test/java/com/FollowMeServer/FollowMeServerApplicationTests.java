package com.FollowMeServer;

import com.FollowMeServer.Controller.DAO;
import com.FollowMeServer.Entity.Roboter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class FollowMeServerApplicationTests {

	@Autowired
	private DAO roboterdao;

	@Test
	void getRobotList() {
		List<Roboter> roboter = roboterdao.getAllRoboter();
		System.out.println(roboter);
	}
}
