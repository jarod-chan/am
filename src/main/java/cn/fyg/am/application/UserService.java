package cn.fyg.am.application;

import java.util.List;

import cn.fyg.am.domain.model.user.User;



public interface UserService {

	List<User> getAllUsers();
	
	User create(User user);

	User find(String key);
	
	User update(User user);
	
	void remove(String key);
	
	
	
	
	User save(User user);
	
	User findUser(String userId);

	




	int getNumberOfUsers();

	

}
