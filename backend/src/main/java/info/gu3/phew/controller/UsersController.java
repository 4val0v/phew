package info.gu3.phew.controller;

import info.gu3.phew.entity.UserEntity;
import info.gu3.phew.request.UserRequestBody;
import info.gu3.phew.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

  @Autowired
  UserService service;

  @GetMapping
  public List<UserEntity> findAll() {
    return service.findAll();
  }

  @PostMapping
  public UserEntity create(
    @RequestBody UserRequestBody requestBody) {

    UserEntity entity = new UserEntity(
      requestBody.name,
      requestBody.email,
      requestBody.password);
    return service.save(entity);
  }

  @PutMapping("/{userId}")
  public UserEntity create(
    @NotBlank @Valid @PathVariable("userId") String userId,
    @RequestBody UserRequestBody requestBody) throws Exception {

    UserEntity entity = service.findById(userId).orElseThrow(Exception::new);
    entity.name = requestBody.name;
    entity.email = requestBody.email;
    entity.password = requestBody.password;
    return service.save(entity);
  }
}
