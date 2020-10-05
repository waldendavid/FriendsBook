package pl.karol.dao;

public interface Dao<T> {

	public void save(T t);
	public T read(Integer id);
	public void update(T t);
	public void delete(Integer id);
	
}
