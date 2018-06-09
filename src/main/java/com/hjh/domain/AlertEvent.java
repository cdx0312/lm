package com.hjh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 报警事件处理记录实体
 * */
@Entity
public class AlertEvent {
    // 报警编号
    @Id
    @GeneratedValue
    private Long id;
    // 收到报警时间
    private Date startTime;
    // 报警电梯的编号
    private String liftId;
    // 报警原因 ：1--轿厢报警按钮，2--非平层停梯，3--轿厢困人，4--轿厢冲顶，5--轿厢蹲底，6--开门走梯，7--安全回路故障，8--其他
    private Integer alertReason;
    // 报警事件状态 1--正在发生，2--已取消，3--误报警
    private Integer state;
    // 报警事件处理进程 1--未处理，2--已处理，3--处理中
    private Integer process;
    // 报警事件处理人
    private String processor;
    // 报警事件结束时间
    private Date endTime;
    // 报警方式 页面，短信
    // private Integer alertway;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getLiftId() {
        return liftId;
    }

    public void setLiftId(String liftId) {
        this.liftId = liftId;
    }

    public Integer getAlertReason() {
        return alertReason;
    }

    public void setAlertReason(Integer alertReason) {
        this.alertReason = alertReason;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
