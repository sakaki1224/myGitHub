package service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dao.TypeDao;
import entity.Type;
import service.TypeService;

@Service
public class ServiceImpl implements TypeService {

	@Autowired
	TypeDao dao;
	
	public List<Type> getWhere(String where) {
		return dao.getWhere(where);
	}

	public Integer insert(Type t) {
		return dao.insert(t);
	}

	public Type getByid(int id) {
		return dao.getByid(id);
	}

	public Integer update(Type t) {
		return dao.update(t);
	}

	public int delete(int id) {
		return dao.delete(id);
	}





	
	}
