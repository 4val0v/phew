package info.gu3.phew.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import java.util.UUID;

@Entity(name = "USER")
public class UserEntity extends CommonEntity {

  protected UserEntity() {
  }

  public  UserEntity(String name, String email, String password) {
    this.name = name;
    this.email = email;
    this.password = password;
  }

  @Id
  public String id;

  @Column(nullable = false)
  public String name;

  @Email
  public String email;

  @Column(nullable = false)
  public String password;

  @Override
  protected void PrePersist() {
    super.PrePersist();
    id = UUID.randomUUID().toString();
  }
}
