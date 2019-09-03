package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;
import service.UserService;

@Controller
@RequestMapping("User")
public class UserController {
	@Autowired
	UserService service;
	@RequestMapping("login")
	public String login(User u, String code, ModelMap m, HttpSession s) {
//		String num=s.getAttribute ("number").toString() ;
//		if(!num.equalsIgnoreCase(code)) {
//		return
//		"redirect:/login.html";
//		}
		User user=service.login(u);
		if(user!=null) {
		s.setMaxInactiveInterval(10) ;
		s.setAttribute("user", user) ;
		return "redirect:/index.jsp";
		}else {
		return " redirect:/login.htm1";
		}

}
	@RequestMapping("outlogin")
	public String login(HttpSession s, HttpServletRequest req) {
	s.removeAttribute("user");
	return "redirect:../login.html";
	}

}
