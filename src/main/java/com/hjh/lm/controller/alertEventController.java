package com.hjh.lm.controller;

import com.hjh.lm.domain.AlertEvent;
import com.hjh.lm.service.AlertEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/alertEvent")
public class alertEventController {

    @Autowired
    private AlertEventService alertEventService;

    @RequestMapping(value = "/getRecords", method = RequestMethod.GET)
    @ResponseBody
    public List<AlertEvent> getAllAlertRecords(String liftId, Integer alertReason, Integer state, Integer process) {
        return alertEventService.getAllAlertRecords(liftId, alertReason, state, process);
    }
}
