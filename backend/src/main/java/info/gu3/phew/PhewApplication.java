package info.gu3.phew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class PhewApplication {

  public static void main(String[] args) {
    SpringApplication.run(PhewApplication.class, args);
  }

  @GetMapping("/user")
  public Principal user(Principal user) {
    return user;
  }

  @Bean
  public Initializer initializer() {
    return new Initializer();
  }
}
