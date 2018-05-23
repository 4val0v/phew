package info.gu3.phew.controller;

import info.gu3.phew.entity.UserEntity;
import info.gu3.phew.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserRepository repository;

  @GetMapping
  public void create() {

    UserEntity entity = new UserEntity("aaa", "bbb@bbb.com", "ccc");
    repository.save(entity);
  }
}
