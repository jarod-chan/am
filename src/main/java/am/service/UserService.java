package am.service;

import java.util.List;

import am.domain.model.user.User;


public interface UserService {

	List<User> getAllUsers();
	
	User create(User user);

	
	
	
	
	
	
	User save(User user);
	
	
	
	
	User findUser(String userId);



	User getById(int id);
	
	User update(User user);

	void remove(int id);

	int getNumberOfUsers();

	

}
