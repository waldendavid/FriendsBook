package pl.karol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.karol.model.Friend;
import pl.karol.service.FriendService;

@SpringBootApplication
public class FriendsBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendsBookApplication.class, args);
		

	}

}
