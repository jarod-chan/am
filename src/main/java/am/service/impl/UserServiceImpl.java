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
	public User findUser(String userId) {
		 return this.userMapper.getUser(userId);
	}

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
	public User getById(int id) {
		return this.userMapper.getUserById(id);
	}



	@Override
	public User update(User user) {
		this.userMapper.updateUser(user);
		return user;
	}

	@Override
	public void remove(int id) {
		this.userMapper.deleteUser(id);
		
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


}
