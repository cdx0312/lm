package com.hjh.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * 维修记录
 */
@Entity
public class FixRecord {
    @Id
    @GeneratedValue
    private Long fixRecordId;
    // 电梯编号
    private String liftId;
    // 报修时间
    private Date reportTime;
    // 故障原因
    private String crashReason;
    // 故障现象
    private String crashApperance;
    // 维修内容
    private String fixContent;
    // 是否更换零件
    private Boolean isReplance;
    // 维修时间
    private Date fixDate;
    // 维修结果
    private String fixResult;

    public Long getFixRecordId() {
        return fixRecordId;
    }

    public void setFixRecordId(Long fixRecordId) {
        this.fixRecordId = fixRecordId;
    }

    public String getLiftId() {
        return liftId;
    }

    public void setLiftId(String liftId) {
        this.liftId = liftId;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getCrashReason() {
        return crashReason;
    }

    public void setCrashReason(String crashReason) {
        this.crashReason = crashReason;
    }

    public String getCrashApperance() {
        return crashApperance;
    }

    public void setCrashApperance(String crashApperance) {
        this.crashApperance = crashApperance;
    }

    public String getFixContent() {
        return fixContent;
    }

    public void setFixContent(String fixContent) {
        this.fixContent = fixContent;
    }

    public Boolean getReplance() {
        return isReplance;
    }

    public void setReplance(Boolean replance) {
        isReplance = replance;
    }

    public Date getFixDate() {
        return fixDate;
    }

    public void setFixDate(Date fixDate) {
        this.fixDate = fixDate;
    }

    public String getFixResult() {
        return fixResult;
    }

    public void setFixResult(String fixResult) {
        this.fixResult = fixResult;
    }
}
