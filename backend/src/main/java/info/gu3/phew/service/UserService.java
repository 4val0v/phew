package info.gu3.phew.service;

import info.gu3.phew.entity.UserEntity;
import info.gu3.phew.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {

  @Autowired
  UserRepository repository;

  public List<UserEntity> findAll() {
    return repository.findAll();
  }

  public Optional<UserEntity> findById(String id) {
    return repository.findById(id);
  }

  public UserEntity save(UserEntity entity) {
    return repository.save(entity);
  }

  public void deleteById(String id) {
    repository.deleteById(id);
  }
}
