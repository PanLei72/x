package com.panlei.x.framework.service.ifc;

public interface ITransactionLogService {

    public void logInfo(String source, String trxName, String content);


    public void logWarning(String source, String trxName, String content);

    public void logError(String source, String trxName, String content);

    public void logDebug(String source, String trxName, String content);
}
