package br.com.datadomus.modules.residents.usecases.login;

import br.com.datadomus.modules.residents.usecases.login.dtos.LoginRequestDTO;
import br.com.datadomus.modules.residents.usecases.login.dtos.LoginResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> execute(@Valid @RequestBody LoginRequestDTO request) {

        return ResponseEntity.ok(loginService.execute(request));


    }
}
