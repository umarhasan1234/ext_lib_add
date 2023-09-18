package in.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.demo.entity.VptUser;


public interface UserService {
	
	public void saveUser(VptUser user);

	public List<VptUser> gerUser();

	public void udpateUser(long id, VptUser user);

}
