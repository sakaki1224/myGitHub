package service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TypeDao;
import entity.Type;
import service.TypeService;
import utils.ReturnInfo;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	TypeDao dao;
	
	public List<Type> getWhere(String where,String limit) {
		return dao.getWhere(where, limit);
	}
	public List<Type> getAll() {
		return dao.getAll();
	}
	
	public Type getByid(int id) {
		return dao.getByid(id);
	}

	public Integer insert(Type t) {
		return dao.insert(t);
	}
	public Integer update(Type t) {
		return dao.update(t);
	}

	public int delete(int id) {
		return dao.delete(id);
	}
	public ReturnInfo getWhere(String where, Integer page, Integer limit) {
		// TODO Auto-generated method stub
		return null;
	}






	
	}
