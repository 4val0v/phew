package info.gu3.phew.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "POST")
public class PostEntity {

  @Id
  public Long id;

  public String text;

  public int createdAt;
}
