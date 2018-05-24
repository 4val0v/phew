package info.gu3.phew.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity(name = "POST")
public class PostEntity extends CommonEntity {

  @Id
  public String postId;

  public String content;

  @OneToOne
  public UserEntity user;
  
  protected PostEntity() {
  }

  public PostEntity(String content, UserEntity user) {
    this.content = content;
    this.user = user;
  }

  @Override
  protected void prePersist() {
    super.prePersist();
    postId = UUID.randomUUID().toString();
  }
}
