package pl.karol.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.karol.model.Friend;

public interface FriendRepository extends JpaRepository<Friend, Integer>{

	
	
}
