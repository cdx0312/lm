package com.hjh.dao;

import com.hjh.domain.AlertEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertEventRepository extends JpaRepository<AlertEvent, Long>{
    /**
     * 根据电梯编号，报警内容，报警状态和处理状态来查询报警记录
     * @param liftId 电梯编号
     * @param alertReason 报警原因
     * @param state 报警状态
     * @param process 处理状态
     * @return 报警事件列表
     */
    List<AlertEvent> findAllByLiftIdAndAlertReasonAndStateAndProcess(String liftId, Integer alertReason, Integer state, Integer process);
}
