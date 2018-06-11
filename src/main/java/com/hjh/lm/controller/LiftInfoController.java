package com.hjh.lm.controller;

import com.hjh.lm.domain.LiftInfo;
import com.hjh.lm.domain.MaintainRecord;
import com.hjh.lm.service.LiftInfoService;
import com.hjh.lm.vo.LiftInfoVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Controller，处理报警事件相关的web请求
 */
@Controller
public class LiftInfoController {

    // 注入电梯设备信息Service,采用构造器注入
    private LiftInfoService liftInfoService;

    public LiftInfoController(LiftInfoService liftInfoService) {
        this.liftInfoService = liftInfoService;
    }


    /**
     * 存储前端传送的数据设备信息数据，字段会自动装载进入liftInfo中
     * @param liftInfo 接收前端传送的设备信息数据的实体
     */
    @ResponseBody
    @RequestMapping(value = "/liftinfo", method = RequestMethod.POST)
    @CrossOrigin
    public void saveLiftInfo(LiftInfo liftInfo){
        liftInfoService.save(liftInfo);
    }

    /**
     * 根据查询条件，从数据库中获取设备数据记录列表
     * @param liftInfoVo 查询条件
     * @return 电梯设备信息，如果查询条件均为空，则返回全部设备记录
     */
    @RequestMapping(value = "/liftinfo", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin // 解决跨域
    public List<LiftInfo> getLiftInfoByLiftInfoVo(LiftInfoVo liftInfoVo){
        return liftInfoService.getAllLiftInfos(liftInfoVo);
    }
}
