package ngdemo.web.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ngdemo.domain.User;
import ngdemo.service.contract.UserService2;

import com.google.inject.Inject;

@Path("/users2")
public class UserRestService2 {
	
	private final UserService2 userService;

	@Inject
	private UserRestService2(UserService2 userService) {
		this.userService = userService;
	}
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser() {
        return userService.findUser("1");
    }

}
