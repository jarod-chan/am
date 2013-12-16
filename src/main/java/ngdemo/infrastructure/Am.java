package ngdemo.infrastructure;

import ngdemo.repositories.contract.DummyRepository;
import ngdemo.repositories.impl.mock.DummyMockRepositoryImpl;
import ngdemo.service.contract.DummyService;
import ngdemo.service.contract.UserService;
import ngdemo.service.impl.DummyServiceImpl;
import ngdemo.service.impl.UserServiceImpl;

import com.google.inject.AbstractModule;

public class Am extends AbstractModule {
    @Override
    protected void configure() {
        bind(DummyRepository.class).to(DummyMockRepositoryImpl.class);
        bind(DummyService.class).to(DummyServiceImpl.class);

        bind(UserService.class).to(UserServiceImpl.class);
    }
}
