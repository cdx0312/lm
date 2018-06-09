package com.hjh.controller;

import com.hjh.domain.AlertEvent;
import com.hjh.service.AlertEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping(name = "/alertEvent")
@Controller
public class alertEventController {

    @Autowired
    private AlertEventService alertEventService;

    @RequestMapping("/getRecords")
    public List<AlertEvent> getAllAlertRecords(String liftId, Integer alertReason, Integer state, Integer process) {
        return alertEventService.getAllAlertRecords(liftId, alertReason, state, process);
    }
}
