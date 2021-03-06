package pl.karol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.karol.dao.Dao;
import pl.karol.model.Friend;

@Service
public class FriendService {

	private Dao<Friend> friendDao;
	
	@Autowired
	public FriendService(Dao<Friend> friendDao) {
		this.friendDao = friendDao;
	}

	public void create(Friend friend) {
		friendDao.create(friend);
	}

	public Friend read(Integer id) {
		return friendDao.read(id);
	}

	public void update(Friend friend) {
		friendDao.update(friend);
	}

	public void delete(Integer id) {
		friendDao.delete(id);
	}
}
