package com.nastiadanchenko.renderFarmTask.repositories;

import com.nastiadanchenko.renderFarmTask.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
