package service.Impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import dao.UserDao;
import entity.User;
import entity.User;
import service.UserService;
import utils.ReturnInfo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	public List<User> getWhere(String where) {
		return dao.getWhere(where);
	}
	public List<User> getAll() {
		return dao.getAll();
	}
	
	public User getByid(int id) {
		return dao.getByid(id);
	}

	public Integer insert(User t) {
		return dao.insert(t);
	}
	public Integer update(User t) {
		return dao.update(t);
	}

	public int delete(int id) {
		return dao.delete(id);
	}
	public User login(User u) {
		return dao.login(u);
	}

	}
