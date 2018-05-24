package info.gu3.phew.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Version;
import java.time.Instant;

@MappedSuperclass
public abstract class CommonEntity {

  @Version
  public Integer version;

  @Column(nullable = false)
  public Long createdAt;

  @Column(nullable = false)
  public Long updatedAt;

  @PrePersist
  protected void prePersist() {
    createdAt = Instant.now().getEpochSecond();
    updatedAt = Instant.now().getEpochSecond();
  }

  @PreUpdate
  protected void perUpdate() {
    updatedAt = Instant.now().getEpochSecond();
  }
}
