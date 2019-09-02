package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.Book_Dao;
import model.Book;
import service.Book_Service;

@Service
public class Book_Service_Impl implements Book_Service {
	@Autowired
	Book_Dao dao;

	public List<Book> select(String txt) {
		// TODO Auto-generated method stub
		return dao.select(txt);
	}

	public void insert(Book t) {
		// TODO Auto-generated method stub
		dao.insert(t);
	}

	public void update(Book t) {
		dao.update(t);

	}

	public void delete(int id) {
		dao.delete(id);

	}

	public Book selectById(int id) {
		// TODO Auto-generated method stub
		return dao.selectById(id);
	}

	public List<Book> select() {
		// TODO Auto-generated method stub
		return null;
	}

}
