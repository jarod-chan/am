package ngdemo.service.contract.service2;

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

}
