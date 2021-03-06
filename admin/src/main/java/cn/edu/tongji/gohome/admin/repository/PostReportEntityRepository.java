package cn.edu.tongji.gohome.admin.repository;

import cn.edu.tongji.gohome.admin.model.PostReportEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.HashMap;

public interface PostReportEntityRepository extends JpaRepository<PostReportEntity, Long>, JpaSpecificationExecutor<PostReportEntity> {
    @Query("select p from PostReportEntity p where p.isDealt=0")
    Page<PostReportEntity> findAllBy(Pageable pageable);

    @Query("select p from PostReportEntity p where p.reportCustomerId = ?1 and p.beReportedCustomerId = ?2")
    PostReportEntity findOneBy(Long reporterId, Long customerId);

    @Transactional
    @Modifying
    PostReportEntity saveAndFlush(PostReportEntity entity);
}