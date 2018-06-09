package com.hjh.service.Impl;

import com.hjh.dao.AlertEventRepository;
import com.hjh.domain.AlertEvent;
import com.hjh.service.AlertEventService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AlertEventServiceImpl implements AlertEventService {

    @Autowired
    private AlertEventRepository alertEventRepository;

    /**
     * 根据电梯编号，报警内容，报警状态和处理状态来查询报警记录
     * @param liftId 电梯编号
     * @param alertReason 报警原因
     * @param state 报警状态
     * @param process 处理状态
     * @return 报警事件列表
     */
    public List<AlertEvent> getAllAlertRecords(String liftId, Integer alertReason, Integer state, Integer process) {
        List<AlertEvent> alertEventList = alertEventRepository.findAll(new Specification<AlertEvent>() {
            @Override
            public Predicate toPredicate(Root<AlertEvent> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<>();
                if (StringUtils.isNoneBlank(liftId)){
                    list.add(criteriaBuilder.equal(root.get("liftId").as(String.class), liftId));
                }
                if (alertReason != null){
                    list.add(criteriaBuilder.equal(root.get("alertReason").as(Integer.class), alertReason));
                }
                if (state != null){
                    list.add(criteriaBuilder.equal(root.get("state").as(Integer.class), state));
                }
                if (process != null){
                    list.add(criteriaBuilder.equal(root.get("process").as(Integer.class), process));
                }

                Predicate[] p = new Predicate[list.size()];

                return criteriaBuilder.and(list.toArray(p));
            }
        });

        return alertEventList;
    }


}
