package alik.gym_app.repo;

import alik.gym_app.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);

    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
}
