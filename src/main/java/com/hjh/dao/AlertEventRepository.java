package com.hjh.dao;

import com.hjh.domain.AlertEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface AlertEventRepository extends JpaRepository<AlertEvent, Long>, JpaSpecificationExecutor<AlertEvent> {

}
