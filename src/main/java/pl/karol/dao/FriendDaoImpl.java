package pl.karol.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import pl.karol.model.Friend;

@Repository
public class FriendDaoImpl implements Dao<Friend> {

	private EntityManagerFactory entityManagerFactory;

	@Override
	public void create(Friend t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(t);

		entityTransaction.commit();
		entityManager.close();

	}

	@Override
	public Friend read(Integer id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Friend friend = entityManager.find(Friend.class, id);
		entityManager.close();

		return friend;
	}

	@Override
	public void update(Friend t) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(t);

		entityTransaction.commit();
		entityManager.close();

	}

	@Override
	public void delete(Integer id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Friend friend = entityManager.find(Friend.class, id);
		
		entityManager.remove(friend);
		
		entityTransaction.commit();
		entityManager.close();
	}

}
