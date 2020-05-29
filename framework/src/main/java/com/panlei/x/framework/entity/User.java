package com.panlei.x.framework.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;
import java.util.Objects;

@Entity
public class User {


    private int id;
    private String username;
    private String nickname;
    private String password;
    private String email;
    private String mobile;
    private String phone;
    private String sex;
    private String photoPath;
    private String sign;
    private String userType;
    private BigInteger pwdSecurityLevel;
    private Date pwdUpdateDate;
    private String pwdUpdateRecord;
    private String pwdQuestion;
    private String pwdQuestionAnswer;
    private String pwdQuestion2;
    private String pwdQuestionAnswer2;
    private String pwdQuestion3;
    private String pwdQuestionAnswer3;
    private Date pwdQuestUpdateDate;
    private String lastLoginIp;
    private Date lastLoginDate;
    private Date freezeDate;
    private String freezeCause;
    private String status;
    private String createUser;
    private Date createDate;
    private String updateUser;
    private Date updateDate;
    private String remarks;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "photo_path")
    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    @Basic
    @Column(name = "sign")
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Basic
    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "pwd_security_level")
    public BigInteger getPwdSecurityLevel() {
        return pwdSecurityLevel;
    }

    public void setPwdSecurityLevel(BigInteger pwdSecurityLevel) {
        this.pwdSecurityLevel = pwdSecurityLevel;
    }

    @Basic
    @Column(name = "pwd_update_date")
    public Date getPwdUpdateDate() {
        return pwdUpdateDate;
    }

    public void setPwdUpdateDate(Date pwdUpdateDate) {
        this.pwdUpdateDate = pwdUpdateDate;
    }

    @Basic
    @Column(name = "pwd_update_record")
    public String getPwdUpdateRecord() {
        return pwdUpdateRecord;
    }

    public void setPwdUpdateRecord(String pwdUpdateRecord) {
        this.pwdUpdateRecord = pwdUpdateRecord;
    }

    @Basic
    @Column(name = "pwd_question")
    public String getPwdQuestion() {
        return pwdQuestion;
    }

    public void setPwdQuestion(String pwdQuestion) {
        this.pwdQuestion = pwdQuestion;
    }

    @Basic
    @Column(name = "pwd_question_answer")
    public String getPwdQuestionAnswer() {
        return pwdQuestionAnswer;
    }

    public void setPwdQuestionAnswer(String pwdQuestionAnswer) {
        this.pwdQuestionAnswer = pwdQuestionAnswer;
    }

    @Basic
    @Column(name = "pwd_question_2")
    public String getPwdQuestion2() {
        return pwdQuestion2;
    }

    public void setPwdQuestion2(String pwdQuestion2) {
        this.pwdQuestion2 = pwdQuestion2;
    }

    @Basic
    @Column(name = "pwd_question_answer_2")
    public String getPwdQuestionAnswer2() {
        return pwdQuestionAnswer2;
    }

    public void setPwdQuestionAnswer2(String pwdQuestionAnswer2) {
        this.pwdQuestionAnswer2 = pwdQuestionAnswer2;
    }

    @Basic
    @Column(name = "pwd_question_3")
    public String getPwdQuestion3() {
        return pwdQuestion3;
    }

    public void setPwdQuestion3(String pwdQuestion3) {
        this.pwdQuestion3 = pwdQuestion3;
    }

    @Basic
    @Column(name = "pwd_question_answer_3")
    public String getPwdQuestionAnswer3() {
        return pwdQuestionAnswer3;
    }

    public void setPwdQuestionAnswer3(String pwdQuestionAnswer3) {
        this.pwdQuestionAnswer3 = pwdQuestionAnswer3;
    }

    @Basic
    @Column(name = "pwd_quest_update_date")
    public Date getPwdQuestUpdateDate() {
        return pwdQuestUpdateDate;
    }

    public void setPwdQuestUpdateDate(Date pwdQuestUpdateDate) {
        this.pwdQuestUpdateDate = pwdQuestUpdateDate;
    }

    @Basic
    @Column(name = "last_login_ip")
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    @Basic
    @Column(name = "last_login_date")
    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    @Basic
    @Column(name = "freeze_date")
    public Date getFreezeDate() {
        return freezeDate;
    }

    public void setFreezeDate(Date freezeDate) {
        this.freezeDate = freezeDate;
    }

    @Basic
    @Column(name = "freeze_cause")
    public String getFreezeCause() {
        return freezeCause;
    }

    public void setFreezeCause(String freezeCause) {
        this.freezeCause = freezeCause;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_user")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "update_user")
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Basic
    @Column(name = "update_date")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(username, user.username) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(password, user.password) &&
                Objects.equals(email, user.email) &&
                Objects.equals(mobile, user.mobile) &&
                Objects.equals(phone, user.phone) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(photoPath, user.photoPath) &&
                Objects.equals(sign, user.sign) &&
                Objects.equals(userType, user.userType) &&
                Objects.equals(pwdSecurityLevel, user.pwdSecurityLevel) &&
                Objects.equals(pwdUpdateDate, user.pwdUpdateDate) &&
                Objects.equals(pwdUpdateRecord, user.pwdUpdateRecord) &&
                Objects.equals(pwdQuestion, user.pwdQuestion) &&
                Objects.equals(pwdQuestionAnswer, user.pwdQuestionAnswer) &&
                Objects.equals(pwdQuestion2, user.pwdQuestion2) &&
                Objects.equals(pwdQuestionAnswer2, user.pwdQuestionAnswer2) &&
                Objects.equals(pwdQuestion3, user.pwdQuestion3) &&
                Objects.equals(pwdQuestionAnswer3, user.pwdQuestionAnswer3) &&
                Objects.equals(pwdQuestUpdateDate, user.pwdQuestUpdateDate) &&
                Objects.equals(lastLoginIp, user.lastLoginIp) &&
                Objects.equals(lastLoginDate, user.lastLoginDate) &&
                Objects.equals(freezeDate, user.freezeDate) &&
                Objects.equals(freezeCause, user.freezeCause) &&
                Objects.equals(status, user.status) &&
                Objects.equals(createUser, user.createUser) &&
                Objects.equals(createDate, user.createDate) &&
                Objects.equals(updateUser, user.updateUser) &&
                Objects.equals(updateDate, user.updateDate) &&
                Objects.equals(remarks, user.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, nickname, password, email, mobile, phone, sex, photoPath, sign, userType, pwdSecurityLevel, pwdUpdateDate, pwdUpdateRecord, pwdQuestion, pwdQuestionAnswer, pwdQuestion2, pwdQuestionAnswer2, pwdQuestion3, pwdQuestionAnswer3, pwdQuestUpdateDate, lastLoginIp, lastLoginDate, freezeDate, freezeCause, status, createUser, createDate, updateUser, updateDate, remarks);
    }
}
