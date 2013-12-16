package ngdemo.service.contract.service2;

import java.util.List;

import ngdemo.domain.User;
import ngdemo.service.contract.UserService2;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class UserServiceImpl implements UserService2 {

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
	public User createNewUser(User user) {
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

}
