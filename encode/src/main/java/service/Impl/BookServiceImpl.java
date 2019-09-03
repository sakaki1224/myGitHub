package service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.BookDao;
import entity.Book;
import service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao dao;
	
	public List<Book> getWhere(String where) {
		return dao.getWhere(where);
	}
	public List<Book> getAll() {
		return dao.getAll();
	}
	
	public Book getByid(int id) {
		return dao.getByid(id);
	}

	public Integer insert(Book t) {
		return dao.insert(t);
	}
	public Integer update(Book t) {
		return dao.update(t);
	}

	public int delete(int id) {
		return dao.delete(id);
	}
	
	}
