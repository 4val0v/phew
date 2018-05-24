package info.gu3.phew;

import info.gu3.phew.entity.PostEntity;
import info.gu3.phew.entity.UserEntity;
import info.gu3.phew.service.PostService;
import info.gu3.phew.service.UserService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Initializer implements InitializingBean {

  @Autowired
  UserService userService;
  @Autowired
  PostService postService;

  @Override
  public void afterPropertiesSet() throws Exception {
    UserEntity userEntity = new UserEntity(
      "admin",
      "example@email.com",
      "admin"
    );

    userService.save(userEntity);

    PostEntity postEntity = new PostEntity(
      "first post!!",
      userEntity
    );

    postService.save(postEntity);

  }
}
