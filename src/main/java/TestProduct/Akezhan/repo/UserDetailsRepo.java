package TestProduct.Akezhan.repo;

import TestProduct.Akezhan.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
