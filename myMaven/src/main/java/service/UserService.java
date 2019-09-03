package service;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import entity.User;


public interface UserService {
	
	public User login(User u) ;
	
	public List<User> getWhere(String where) ;
	
	public List<User> getAll() ;
	
	public User getByid(int id) ;
	
	public Integer insert(User t) ;

	public Integer update(User t) ;

	public int delete(int id) ;
}
