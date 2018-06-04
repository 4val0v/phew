package info.gu3.phew.controller;

import info.gu3.phew.entity.PostEntity;
import info.gu3.phew.request.PostRequestBody;
import info.gu3.phew.service.PostService;
import info.gu3.phew.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {

  @Autowired
  PostService service;
  @Autowired
  UserService userService;

  @GetMapping
  public List<PostEntity> findAll(Principal principal) {
    System.out.println(principal.getName());
    return service.findAll();
  }

  @PostMapping
  public PostEntity create(
    @RequestBody PostRequestBody requestBody) throws Exception {

    PostEntity entity = new PostEntity(
      requestBody.content,
      userService.findById(requestBody.userId).orElseThrow(Exception::new)
    );
    return service.save(entity);
  }
}
