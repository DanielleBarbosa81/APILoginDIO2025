package desafio_DIO_login.controller;

import desafio_DIO_login.models.Login;
import desafio_DIO_login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

 @Autowired
    public LoginService loginService;

 @PostMapping("/login")
    public String login (@RequestBody Login login ){
     return loginService.verificarLogin(login.getNome(), login.getSenha());
 }



}
