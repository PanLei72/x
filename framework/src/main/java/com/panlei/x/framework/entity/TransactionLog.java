package com.panlei.x.framework.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "transaction_log", schema = "x_framework")
public class TransactionLog {
    private int id;
    private String level;
    private String source;
    private String trxName;
    private String content;
    private Date eventTime;
    private String user;
    private String host;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Basic
    @Column(name = "trx_name")
    public String getTrxName() {
        return trxName;
    }

    public void setTrxName(String trxName) {
        this.trxName = trxName;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "event_time")
    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    @Basic
    @Column(name = "user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Basic
    @Column(name = "host")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionLog that = (TransactionLog) o;
        return id == that.id &&
                Objects.equals(level, that.level) &&
                Objects.equals(source, that.source) &&
                Objects.equals(trxName, that.trxName) &&
                Objects.equals(content, that.content) &&
                Objects.equals(eventTime, that.eventTime) &&
                Objects.equals(user, that.user) &&
                Objects.equals(host, that.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, level, source, trxName, content, eventTime, user, host);
    }
}
