package pl.karol.dao;

public interface Dao<T> {

	public void create(T t);
	public T read(Integer id);
	public void update(T t);
	public void delete(Integer id);
	
}
