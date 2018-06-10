package info.gu3.phew.repository;

import info.gu3.phew.entity.PostEntity;
import info.gu3.phew.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, String> {

  List<PostEntity> findByUser(UserEntity userEntity);
}
