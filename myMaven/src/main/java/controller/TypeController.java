package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

@PostMapping("Type")
public @ResponseBody ReturnInfo index(String name,ModelMap m) {
	String where="";
	if(name!=null&&name.length()>0) where=" where name like '%"+name+"%'";
	return  service.getWhere(where);
	
}

//@RequestMapping("delete")
//public String delete(int id,ModelMap m) {
//	service.delete(id);
//	return index("",m);
//}
//@RequestMapping("add")
//public String add(ModelMap m) {
//	return "Type/edit";
//}
//@RequestMapping("edit")
//public String edit(int id,ModelMap m) {
//	m.put("info", service.getByid(id));
//	return add(m);
//}
//@RequestMapping("insert")
//public String insert(Type t,ModelMap m) {
//	service.insert(t);
//	return index("",m);
//}
//@RequestMapping("update")
//public String update(Type t,ModelMap m) {
//	service.update(t);
//	return index("",m);
//}
}

