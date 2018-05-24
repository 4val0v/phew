package info.gu3.phew.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.util.UUID;

@Entity(name = "USER")
public class UserEntity extends CommonEntity {

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
}
