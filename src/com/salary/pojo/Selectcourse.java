package com.salary.pojo;

public class Selectcourse {
    private Integer selectcourseId;

    private Integer classId;

    private Integer courseId;

    private String selectcourseYear;

    private Integer selectcourseTerm;

    public Integer getSelectcourseId() {
        return selectcourseId;
    }

    public void setSelectcourseId(Integer selectcourseId) {
        this.selectcourseId = selectcourseId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getSelectcourseYear() {
        return selectcourseYear;
    }

    public void setSelectcourseYear(String selectcourseYear) {
        this.selectcourseYear = selectcourseYear == null ? null : selectcourseYear.trim();
    }

    public Integer getSelectcourseTerm() {
        return selectcourseTerm;
    }

    public void setSelectcourseTerm(Integer selectcourseTerm) {
        this.selectcourseTerm = selectcourseTerm;
    }
}