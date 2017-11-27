package com.salary.pojo;

import java.util.Date;

public class Leave {
    private Date leaveStartTime;

    private Date leaveEndTime;

    private String leaveCause;

    private String studentName;

    private String teacherName;

    private Integer classId;

    private String leaveFlag;

    public Date getLeaveStartTime() {
        return leaveStartTime;
    }

    public void setLeaveStartTime(Date leaveStartTime) {
        this.leaveStartTime = leaveStartTime;
    }

    public Date getLeaveEndTime() {
        return leaveEndTime;
    }

    public void setLeaveEndTime(Date leaveEndTime) {
        this.leaveEndTime = leaveEndTime;
    }

    public String getLeaveCause() {
        return leaveCause;
    }

    public void setLeaveCause(String leaveCause) {
        this.leaveCause = leaveCause == null ? null : leaveCause.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getLeaveFlag() {
        return leaveFlag;
    }

    public void setLeaveFlag(String leaveFlag) {
        this.leaveFlag = leaveFlag == null ? null : leaveFlag.trim();
    }
}