package app.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query (value = "select * from users where email = :email", nativeQuery = true)
    Optional<User> findByEmail(String email);
}
