package com.salary.pojo;

import java.util.Date;

public class Callnames {
    private Integer adminId;

    private Integer teacherId;

    private Integer courseId;

    private Integer classId;

    private Integer studentId;

    private String studentNo;

    private String studentName;

    private String teachercourseYear;

    private Integer teachercourseTerm;

    private String studentSex;

    private Date salaryDate;

    private Integer salaryTime;

    private String salaryData;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo == null ? null : studentNo.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public String getTeachercourseYear() {
        return teachercourseYear;
    }

    public void setTeachercourseYear(String teachercourseYear) {
        this.teachercourseYear = teachercourseYear == null ? null : teachercourseYear.trim();
    }

    public Integer getTeachercourseTerm() {
        return teachercourseTerm;
    }

    public void setTeachercourseTerm(Integer teachercourseTerm) {
        this.teachercourseTerm = teachercourseTerm;
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