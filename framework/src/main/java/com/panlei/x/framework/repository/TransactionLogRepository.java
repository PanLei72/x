package com.panlei.x.framework.repository;

import com.panlei.x.framework.entity.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionLogRepository extends JpaRepository<TransactionLog, Integer> {
}
