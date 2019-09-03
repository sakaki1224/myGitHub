package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Book;
import entity.Book;
import service.BookService;
import service.TypeService;
import service.BookService;
import utils.ReturnInfo;

@Controller
public class BookController {
@Autowired
BookService service;

@Autowired
TypeService tservice;

@GetMapping("Book/{id}")
public @ResponseBody Book edit(@PathVariable("id") int id,ModelMap m) {
	 return service.getByid(id);
}
@GetMapping(value="Book")
public @ResponseBody ReturnInfo index(String name,Integer page,Integer limit,ModelMap m) {
	String where="";
	if(name!=null&&name.length()>0) where=" where book.name like '%"+name+"%'";
	return  service.getWhere(where,page,limit);
}

@GetMapping(value="Book/sexs")
public @ResponseBody String[] getsexs() {
	return Book.sexs;
}


@RequestMapping("add")
public @ResponseBody String add(ModelMap m) {
	return "Book/edit";
}

@DeleteMapping("id")
public @ResponseBody ReturnInfo delete(@PathVariable("id") int id,ModelMap m) {
	service.delete(id);
	return new ReturnInfo();
}
@PostMapping("Book")
public @ResponseBody ReturnInfo insert(Book t,ModelMap m) {
	service.insert(t);
	return new ReturnInfo();
}
@PutMapping("Book/{id}")
public @ResponseBody ReturnInfo update(Book t,ModelMap m) {
	service.update(t);
	return new ReturnInfo();
}
}

