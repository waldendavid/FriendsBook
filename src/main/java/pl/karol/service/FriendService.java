package pl.karol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.karol.dao.Dao;
import pl.karol.model.Friend;

@Service
public class FriendService {
	
	@Autowired
	private Dao<Friend> friendDao;
}
