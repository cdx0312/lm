package com.hjh.lm.service.Impl;

import com.hjh.lm.dao.FixRecordRepository;
import com.hjh.lm.dao.MaintainRecordRepository;
import com.hjh.lm.domain.FixRecord;
import com.hjh.lm.domain.MaintainRecord;
import com.hjh.lm.service.FixRecordService;
import com.hjh.lm.service.MaintainRecordService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MaintainRecordServiceImpl implements MaintainRecordService {

    // 使用构造器注入repo
    private final MaintainRecordRepository maintainRecordRepository;

    @Autowired
    public MaintainRecordServiceImpl(MaintainRecordRepository maintainRecordRepository) {
        this.maintainRecordRepository = maintainRecordRepository;
    }

    /**
     * 保存保养记录到数据库
     * @param maintainRecord 维修记录实例
     */
    @Override
    public void save(MaintainRecord maintainRecord) {
        maintainRecordRepository.save(maintainRecord);
    }

    /**
     * 根据电梯编号，查询该电梯的保养记录
     * @param liftId 电梯编号
     * @return 保养记录列表
     */
    @Override
    public List<MaintainRecord> getMaintainRecordsByLiftId(String liftId) {
        if (StringUtils.isNotBlank(liftId))
            return maintainRecordRepository.findAllByLiftId(liftId);
        else
            return maintainRecordRepository.findAll();
    }
}
