package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.demo.entity.VptUser;
import in.demo.service.UserService;

@RestController
@RequestMapping("/vpt/user")
public class UserController<Umar> {
	
	@Autowired
	private UserService userService;
	 
	@PostMapping("/save")
	public ResponseEntity<String> saveData(@RequestBody VptUser user){
		userService.saveUser(user);
		return new ResponseEntity<>("save successfull",HttpStatus.OK);
	}
	
	@GetMapping("/get")
	public List<VptUser> getData(){
		return userService.gerUser();
	}
	
	@PutMapping("/update/{id}")
	public String updateData(@PathVariable long id,@RequestBody VptUser user) {
		userService.udpateUser(id,user);
		return "update successfull";
	}
	
	
	

}
