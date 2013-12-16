package ngdemo.service.contract;

import java.util.List;

import ngdemo.domain.User;

public interface UserService2 {

	User findUser(String userId);

	List<User> getAllUsers();

	User createNewUser(User user);

	User getById(int id);
	
	User update(User user);

	void remove(int id);


	

	

	int getNumberOfUsers();

}
