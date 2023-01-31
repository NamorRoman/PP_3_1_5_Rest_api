package ru.katalearning.preproject.restApp.repositories;

import ru.katalearning.preproject.restApp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
