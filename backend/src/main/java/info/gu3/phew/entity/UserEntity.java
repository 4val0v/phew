package info.gu3.phew.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.util.UUID;

@Entity(name = "USER")
public class UserEntity extends CommonEntity {
//  public class UserEntity extends CommonEntity implements UserDetails {

  @Id
  public String userId;

  @Column(nullable = false)
  public String name;

  @Email
  public String email;

  @Column(nullable = false)
  public String password;

  protected UserEntity() {
  }

  public UserEntity(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  @Override
  protected void prePersist() {
    super.prePersist();
    userId = UUID.randomUUID().toString();
  }

//  @Override
//  public Collection<? extends GrantedAuthority> getAuthorities() {
//    return Collections.emptyList();
//  }
//
//  @Override
//  public String getPassword() {
//    return this.password;
//  }
//
//  @Override
//  public String getUsername() {
//    return this.name;
//  }
//
//  @Override
//  public boolean isAccountNonExpired() {
//    return true;
//  }
//
//  @Override
//  public boolean isAccountNonLocked() {
//    return true;
//  }
//
//  @Override
//  public boolean isCredentialsNonExpired() {
//    return true;
//  }
//
//  @Override
//  public boolean isEnabled() {
//    return true;
//  }
}
