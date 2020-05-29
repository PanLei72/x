package com.panlei.x.framework.service.impl;

import com.panlei.x.framework.constants.LogLevel;
import com.panlei.x.framework.entity.TransactionLog;
import com.panlei.x.framework.repository.TransactionLogRepository;
import com.panlei.x.framework.service.ifc.ITransactionLogService;
import com.panlei.x.framework.utils.SecurityContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class TransactionLogService implements ITransactionLogService {

    Logger logger = LoggerFactory.getLogger(TransactionLogService.class);

    @Autowired
    private TransactionLogRepository transactionLogRepository;

    @Override
    public void logInfo(String source, String trxName, String content) {

        logger.info(source, trxName, content);

        if (logger.isInfoEnabled()) {
            TransactionLog transactionLog = new TransactionLog();
            transactionLog.setSource(source);
            transactionLog.setTrxName(trxName);
            transactionLog.setContent(content);
            transactionLog.setEventTime(new Date());
            transactionLog.setLevel(LogLevel.INFO.toString());
            transactionLog.setUser(SecurityContextUtil.getUsername());
            transactionLog.setHost(SecurityContextUtil.getIp());

            transactionLogRepository.save(transactionLog);
        }

    }

    @Override
    public void logWarning(String source, String trxName, String content) {
        logger.warn(source, trxName, content);

        if (logger.isWarnEnabled()) {

            TransactionLog transactionLog = new TransactionLog();
            transactionLog.setSource(source);
            transactionLog.setTrxName(trxName);
            transactionLog.setContent(content);
            transactionLog.setEventTime(new Date());
            transactionLog.setLevel(LogLevel.WARNING.toString());
            transactionLog.setUser(SecurityContextUtil.getUsername());
            transactionLog.setHost(SecurityContextUtil.getIp());

            transactionLogRepository.save(transactionLog);
        }
    }

    @Override
    public void logError(String source, String trxName, String content) {

        logger.error(source, trxName, content);

        if (logger.isErrorEnabled()) {
            TransactionLog transactionLog = new TransactionLog();
            transactionLog.setSource(source);
            transactionLog.setTrxName(trxName);
            transactionLog.setContent(content);
            transactionLog.setEventTime(new Date());
            transactionLog.setLevel(LogLevel.ERROR.toString());
            transactionLog.setUser(SecurityContextUtil.getUsername());
            transactionLog.setHost(SecurityContextUtil.getIp());

            transactionLogRepository.save(transactionLog);
        }
    }

    @Override
    public void logDebug(String source, String trxName, String content) {
        logger.debug(source, trxName, content);

        if (logger.isDebugEnabled()) {
            TransactionLog transactionLog = new TransactionLog();
            transactionLog.setSource(source);
            transactionLog.setTrxName(trxName);
            transactionLog.setContent(content);
            transactionLog.setEventTime(new Date());
            transactionLog.setLevel(LogLevel.DEBUG.toString());
            transactionLog.setUser(SecurityContextUtil.getUsername());
            transactionLog.setHost(SecurityContextUtil.getIp());

            transactionLogRepository.save(transactionLog);
        }
    }
}
