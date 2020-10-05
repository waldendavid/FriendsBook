package pl.karol.dao;

import pl.karol.model.Friend;

public interface FriendDao {

	public void save(Friend friend);
	public Friend read(Integer id);
	public void update(Friend friend);
	public void delete(Integer id);
	
}
