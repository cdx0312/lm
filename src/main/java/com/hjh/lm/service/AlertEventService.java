package com.hjh.lm.service;

import com.hjh.lm.domain.AlertEvent;

import java.util.List;

public interface AlertEventService {
    /**
     * 根据电梯编号，报警内容，报警状态和处理状态来查询报警记录
     * @param liftId 电梯编号
     * @param alertReason 报警原因
     * @param state 报警状态
     * @param process 处理状态
     * @return 报警事件列表
     */
    List<AlertEvent> getAllAlertRecords(String liftId, Integer alertReason, Integer state, Integer process);

    void save(AlertEvent alertEvent);

}
