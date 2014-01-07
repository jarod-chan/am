package cn.fyg.am.web.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import cn.fyg.am.application.UserService;
import cn.fyg.am.domain.model.user.User;
import cn.fyg.am.infrastructure.encrypt.Encipher;
import cn.fyg.am.infrastructure.encrypt.Encrypted;

import com.google.inject.Inject;

@Path("/users")
public class UserRestService {

	private final UserService userService;
	
	private final Encipher encipher;

	@Inject
	private UserRestService(UserService userService,Encipher encipher) {
		this.userService = userService;
		this.encipher=encipher;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getAllUsersInJSON() {
		return userService.getAllUsers();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User create(User user) {
		String password = user.getPassword();
		Encrypted encrypt = this.encipher.encrypt(password);
		user.setSalt(encrypt.getSalt());
		user.setPassword(encrypt.getEncrypeted());
		return userService.create(user);
	}
	
	@GET
	@Path("{key}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUserById(@PathParam("key")String key) {
		return userService.find(key);
	}

	@PUT
	@Path("{key}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User update(User user) {
		return userService.update(user);
	}

	@DELETE
	@Path("{key}")
	@Produces(MediaType.APPLICATION_JSON)
	public void remove(@PathParam("key")String key) {
		userService.remove(key);
	}
	
	
	
//	@GET
//	@Consumes(MediaType.APPLICATION_JSON)
//	public User create() {
//		return userService.create();
//	}
//
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public User save(User user) {
//		return userService.createNewUser(user);
//	}

	
	
	
	
	
	



	

}
