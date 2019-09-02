package service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import entity.Type;

public interface TypeService {
	
	public List<Type> getWhere(String where) ;
	
	public Integer insert(Type t) ;
	
	public Type getByid(int id) ;

	public Integer update(Type t) ;

	public int delete(int id) ;
}
