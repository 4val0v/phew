package info.gu3.phew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PhewApplication {

  public static void main(String[] args) {
    SpringApplication.run(PhewApplication.class, args);
  }

  @Bean
  public Initializer initializer() {
    return new Initializer();
  }
}
