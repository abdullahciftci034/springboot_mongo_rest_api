package com.SpringMongo.MongoRestApi.Controller;


import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringMongo.MongoRestApi.Document.User;
import com.SpringMongo.MongoRestApi.Repostory.UserRepostory;

@RequestMapping("/user")
@RestController
public class UserController {
	
	
	@Autowired
	private UserRepostory userRepostory;
	/*@PostConstruct
	public void save(){
		userRepostory.save(new User("abdullah"));
	}
	*/
	@GetMapping("/")
	public String index() {
		return "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<h2>HTML Forms</h2>\r\n"
				+ "\r\n"
				+ "<form action=\"/user/saveuser\" methot=\"GET\">\r\n"
				+ "  <input type=\"text\"  name=\"name\">\r\n"
				+ "  <input type=\"submit\" value=\"Submit\">\r\n"
				+ "</form> \r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "";
	}
	
	@GetMapping("/getbyId")
	public Optional<User> GetById(String id) {
		return userRepostory.findById(id);
	}
	@GetMapping("/saveuser")
	public User saveUser(User user) {
		user.setId(userRepostory.findAll().size()+1);
		return userRepostory.save(user);
	}
	@GetMapping("/userlist")
	public List<User> userlist() {
		return userRepostory.findAll();
	}
}
