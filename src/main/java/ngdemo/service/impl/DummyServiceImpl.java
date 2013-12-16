package ngdemo.service.impl;

import ngdemo.domain.User;
import ngdemo.repositories.contract.DummyRepository;
import ngdemo.service.contract.DummyService;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class DummyServiceImpl implements DummyService {

    private final DummyRepository dummyRepository;

    @Inject
    public DummyServiceImpl(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    @Override
    public User getDefaultUser() {
        Object defaultUser = this.dummyRepository.getDefaultUser();
        return this.dummyRepository.getDefaultUser();
    }

}
