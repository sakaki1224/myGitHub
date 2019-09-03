package service;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import entity.Type;
import utils.ReturnInfo;

public interface TypeService {
	
	public ReturnInfo getWhere(String where) ;
	
	public ReturnInfo getAll() ;
	
	public Type getByid(int id) ;
	
	public Integer insert(Type t) ;

	public Integer update(Type t) ;

	public int delete(int id) ;
}
