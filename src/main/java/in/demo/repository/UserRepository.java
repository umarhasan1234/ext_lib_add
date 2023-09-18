package in.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.demo.entity.VptUser;

@Repository
public interface UserRepository extends JpaRepository<VptUser, Long> {

}
