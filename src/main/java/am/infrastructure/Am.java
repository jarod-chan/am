package am.infrastructure;


import am.infrastructure.encrypt.Encipher;
import am.infrastructure.encrypt.impl.EncipherImpl;
import am.service.UserService;
import am.service.impl.UserServiceImpl;

import com.google.inject.AbstractModule;

public class Am extends AbstractModule {
    @Override
    protected void configure() {
        bind(UserService.class).to(UserServiceImpl.class);
        bind(Encipher.class).to(EncipherImpl.class);
    }
}
