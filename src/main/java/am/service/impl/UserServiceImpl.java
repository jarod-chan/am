package am.service.impl;

import java.util.List;

import am.domain.model.user.User;
import am.repositories.UserMapper;
import am.service.UserService;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class UserServiceImpl implements UserService {

    @Inject
    private UserMapper userMapper;



	@Override
	public List<User> getAllUsers() {
		return this.userMapper.getAllUser();
	}
	
	@Override
	public User create(User user) {
		this.userMapper.insertUser(user);
		return user;
	}
	
	
	@Override
	public User find(String key) {
		return this.userMapper.find(key);
	}
	
	@Override
	public User update(User user) {
		this.userMapper.updateUser(user);
		return user;
	}

	@Override
	public void remove(String key) {
		this.userMapper.deleteUser(key);
		
	}









	@Override
	public int getNumberOfUsers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}



}
