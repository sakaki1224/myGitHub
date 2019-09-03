package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Type;
import service.TypeService;
import utils.ReturnInfo;

@Controller
public class TypeController {
@Autowired
TypeService service;

@GetMapping("Type/{id}")
public @ResponseBody Type edit(@PathVariable("id") int id,ModelMap m) {
	 return service.getByid(id);
}
@RequestMapping("Type")
public @ResponseBody ReturnInfo index(String name,Integer page,Integer limit,ModelMap m) {
	String where="";
	if(name!=null&&name.length()>0) where=" where name like '%"+name+"%'";
	return  service.getWhere(where,page,limit);
}


@RequestMapping("add")
public @ResponseBody String add(ModelMap m) {
	return "Type/edit";
}

@DeleteMapping("id")
public @ResponseBody ReturnInfo delete(@PathVariable("id") int id,ModelMap m) {
	service.delete(id);
	return new ReturnInfo();
}
@PostMapping("Type/{id}")
public @ResponseBody ReturnInfo insert(Type t,ModelMap m) {
	service.insert(t);
	return new ReturnInfo();
}
@PutMapping("Type/{id}")
public @ResponseBody ReturnInfo update(Type t,ModelMap m) {
	service.update(t);
	return new ReturnInfo();
}
}

