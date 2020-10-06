package pl.karol.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.karol.model.Friend;

@Repository
public class FriendDaoImpl implements Dao<Friend> {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void create(Friend t) {
		entityManager.persist(t);
		
	}

	@Override
	@Transactional
	public Friend read(Integer id) {
		Friend friend = entityManager.find(Friend.class, id);
		return friend;
	}

	@Override
	@Transactional
	public void update(Friend t) {
		Friend friend = entityManager.find(Friend.class, t.getId());
		//TODO if != null, set fn ln em
		
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		Friend friend = entityManager.find(Friend.class, id);
		entityManager.remove(friend);
	}
	
	
	
}
