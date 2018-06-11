package com.hjh.lm.controller;

import com.hjh.lm.domain.AlertEvent;
import com.hjh.lm.domain.FixRecord;
import com.hjh.lm.service.FixRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

/**
 * Controller，处理报警事件相关的web请求
 */
@Controller
public class FixRecordController {

    // 注入报警事件Service,采用构造器注入
    private final FixRecordService fixRecordService;

    @Autowired
    public FixRecordController(FixRecordService fixRecordService) {
        this.fixRecordService = fixRecordService;
    }

    @ResponseBody
    @RequestMapping(value = "/repairRecord", method = RequestMethod.POST)
    public void saveFixRecord(@Param("fixRecord") FixRecord fixRecord){
        fixRecordService.save(fixRecord);
    }

    @RequestMapping(value = "/repairRecord", method = RequestMethod.GET)
    @ResponseBody
    public List<FixRecord> getFixRecordsByLiftId(String liftId){
        return fixRecordService.getFixRecordsByLiftId(liftId);
    }
}
