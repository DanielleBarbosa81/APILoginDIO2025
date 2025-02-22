package desafio_DIO_login.service;

import desafio_DIO_login.models.Login;
import desafio_DIO_login.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import  java.util.Optional;



@Service
public class LoginService {

    @Autowired
    LoginRepository loginRepository;

    public String verificarLogin(String nome, String senha) {
        Optional<Login> login = loginRepository.findByNome(nome);

        if(login.isPresent() && login.get().getSenha().equals(senha)) {
            return "Login bem-sucedido!";
        }else
            return "Falha na autenticacao!";

    }
}
