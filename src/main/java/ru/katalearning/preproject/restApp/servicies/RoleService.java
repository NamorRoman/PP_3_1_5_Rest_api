package ru.katalearning.preproject.restApp.servicies;

import ru.katalearning.preproject.restApp.models.Role;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public interface RoleService {

    public List<Role> findAll();

    public void save(Role role);

    public void delete(Role role);

    public void update(Role role);

    public Role getByID(Long id);
}
