package com.salary.pojo;

public class Teachercourse {
    private Integer teachercourseId;

    private Integer teacherId;

    private Integer courseId;

    private String teachercourseYear;

    private Integer teachercourseTerm;

    public Integer getTeachercourseId() {
        return teachercourseId;
    }

    public void setTeachercourseId(Integer teachercourseId) {
        this.teachercourseId = teachercourseId;
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
}