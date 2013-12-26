package am.service.contract;

import java.util.List;

import am.domain.User;


public interface UserService {

	User findUser(String userId);

	List<User> getAllUsers();

	User createNewUser(User user);

	User getById(int id);
	
	User update(User user);

	void remove(int id);


	

	

	int getNumberOfUsers();

}
