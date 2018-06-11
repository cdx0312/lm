package com.hjh.lm.controller;

import com.hjh.lm.domain.AlertEvent;
import com.hjh.lm.service.AlertEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 报警事件Controller，处理报警事件相关的web请求
 */
@Controller
@RequestMapping("/alertEvent")
public class alertEventController {

    // 注入报警事件Service,采用构造器注入
    private final AlertEventService alertEventService;

    @Autowired
    public alertEventController(AlertEventService alertEventService) {
        this.alertEventService = alertEventService;
    }

    /**
     * 根据查询条件，获取满足条件的所有报警事件
     * @param liftId 电梯ID
     * @param alertReason 报警原因
     * @param alertState 报警状态
     * @param process 报警事件处理进程
     * @return 返回JSON数据
     */
    @RequestMapping(value = "/getRecords", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<AlertEvent> getAllAlertRecords(String liftId, Integer alertReason, Integer alertState, Integer process) {
        return alertEventService.getAllAlertRecords(liftId, alertReason, alertState, process);
    }
}
