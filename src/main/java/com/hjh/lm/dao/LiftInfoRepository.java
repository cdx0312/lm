package com.hjh.lm.dao;

import com.hjh.lm.domain.LiftInfo;
import com.hjh.lm.domain.MaintainRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * 电梯信息Repo
 */
public interface LiftInfoRepository extends JpaRepository<LiftInfo, Long>, JpaSpecificationExecutor<LiftInfo> {
}
