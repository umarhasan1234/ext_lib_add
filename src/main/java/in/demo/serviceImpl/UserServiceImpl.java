package in.demo.serviceImpl;

import java.util.List;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.demo.entity.VptUser;
import in.demo.repository.UserRepository;
import in.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired(required = true)
	private UserRepository userRepo;

	@Override
	public void saveUser(VptUser user) {
		userRepo.save(user);
	}

	@Override
	public List<VptUser> gerUser() {
		return userRepo.findAll();
	}

	@Override
	public void udpateUser(long id, VptUser user) {
		VptUser user1 = userRepo.findById(id).orElseThrow(() -> new EntityNotFoundException("Id doesnot exist"));

		user1.setName(user.getName());
		user1.setEmail(user.getEmail());
		user1.setMobile(user.getMobile());
		user1.setPosition(user.getPosition());

		userRepo.save(user1);
	}

}
