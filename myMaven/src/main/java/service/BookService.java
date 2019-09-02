package service;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import entity.Book;

public interface BookService {
	
	public List<Book> getWhere(String where) ;
	
	public List<Book> getAll() ;
	
	public Book getByid(int id) ;
	
	public Integer insert(Book t) ;

	public Integer update(Book t) ;

	public int delete(int id) ;
}
