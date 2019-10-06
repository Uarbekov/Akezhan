package TestProduct.Akezhan.repo;


import TestProduct.Akezhan.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
