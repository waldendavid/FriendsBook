package pl.karol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pl.karol.model.Friend;
import pl.karol.service.FriendService;

@SpringBootApplication
public class FriendsBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendsBookApplication.class, args);
//		FriendService friendService = new FriendService();
//		Friend friend = new Friend();
//		friend.setEmail("LOL@lol.pl");
//		friend.setFirstName("kaka");
//		friend.setLastName("Mongo");
//		System.out.println(friend.getEmail() + friend.getFirstName() + friend.getLastName());
//		friendService.create(friend);
	}

}
