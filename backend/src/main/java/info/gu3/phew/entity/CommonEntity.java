package info.gu3.phew.entity;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Version;

@MappedSuperclass
public abstract class CommonEntity {

  @Version
  public Integer version;

  @PrePersist
  protected void PrePersist() {
  }
}
