package com.salary.pojo;

import java.util.Date;

public class Salaryview {
    private Integer classId;

    private String className;

    private Integer courseId;

    private String courseNo;

    private String courseName;

    private String studentName;

    private String studentSex;

    private Date salaryDate;

    private Integer salaryTime;

    private String salaryData;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo == null ? null : courseNo.trim();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex == null ? null : studentSex.trim();
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    public Integer getSalaryTime() {
        return salaryTime;
    }

    public void setSalaryTime(Integer salaryTime) {
        this.salaryTime = salaryTime;
    }

    public String getSalaryData() {
        return salaryData;
    }

    public void setSalaryData(String salaryData) {
        this.salaryData = salaryData == null ? null : salaryData.trim();
    }
}