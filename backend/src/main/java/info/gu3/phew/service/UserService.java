package info.gu3.phew.service;

import info.gu3.phew.entity.UserEntity;
import info.gu3.phew.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService implements UserDetailsService {

  @Autowired
  UserRepository repository;

  public List<UserEntity> findAll() {
    return repository.findAll();
  }

  public Optional<UserEntity> findById(String id) {
    return repository.findById(id);
  }

  public Optional<UserEntity> findByName(String name) {
    return repository.findByName(name);
  }

  public UserEntity save(UserEntity entity) {
    return repository.save(entity);
  }

  public void deleteById(String id) {
    repository.deleteById(id);
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserEntity userEntity = this.findByName(username).orElse(null);
    User user = new User(userEntity.name, userEntity.password, AuthorityUtils.createAuthorityList("ROLE_ADMIN"));
    return user;
  }
}
