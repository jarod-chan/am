package am.infrastructure;


import am.service.contract.UserService;
import am.service.impl.UserServiceImpl;

import com.google.inject.AbstractModule;

public class Am extends AbstractModule {
    @Override
    protected void configure() {
        bind(UserService.class).to(UserServiceImpl.class);
    }
}
