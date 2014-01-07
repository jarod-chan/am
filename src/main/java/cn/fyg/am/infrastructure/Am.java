package cn.fyg.am.infrastructure;



import cn.fyg.am.application.UserService;
import cn.fyg.am.application.impl.UserServiceImpl;
import cn.fyg.am.infrastructure.encrypt.Encipher;
import cn.fyg.am.infrastructure.encrypt.impl.EncipherImpl;

import com.google.inject.AbstractModule;

public class Am extends AbstractModule {
    @Override
    protected void configure() {
        bind(UserService.class).to(UserServiceImpl.class);
        bind(Encipher.class).to(EncipherImpl.class);
    }
}
