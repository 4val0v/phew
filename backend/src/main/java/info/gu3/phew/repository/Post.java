package info.gu3.phew.repository;

import info.gu3.phew.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Post extends JpaRepository<PostEntity, Long> {
}
