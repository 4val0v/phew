package info.gu3.phew.service;

import info.gu3.phew.entity.PostEntity;
import info.gu3.phew.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PostService {

  @Autowired
  PostRepository repository;

  public PostEntity save(PostEntity entity) {
    return repository.save(entity);
  }
}
