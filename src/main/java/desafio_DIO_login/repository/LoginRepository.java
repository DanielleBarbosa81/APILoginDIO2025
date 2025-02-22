package desafio_DIO_login.repository;

import desafio_DIO_login.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginRepository extends JpaRepository<Login, String> {
    Optional<Login> findByNome(String nome);
}
