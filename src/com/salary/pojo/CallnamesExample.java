package com.salary.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallnamesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CallnamesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherIdEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andTeacherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacherId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNull() {
            addCriterion("student_NO is null");
            return (Criteria) this;
        }

        public Criteria andStudentNoIsNotNull() {
            addCriterion("student_NO is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNoEqualTo(String value) {
            addCriterion("student_NO =", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotEqualTo(String value) {
            addCriterion("student_NO <>", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThan(String value) {
            addCriterion("student_NO >", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoGreaterThanOrEqualTo(String value) {
            addCriterion("student_NO >=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThan(String value) {
            addCriterion("student_NO <", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLessThanOrEqualTo(String value) {
            addCriterion("student_NO <=", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoLike(String value) {
            addCriterion("student_NO like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotLike(String value) {
            addCriterion("student_NO not like", value, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoIn(List<String> values) {
            addCriterion("student_NO in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotIn(List<String> values) {
            addCriterion("student_NO not in", values, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoBetween(String value1, String value2) {
            addCriterion("student_NO between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNoNotBetween(String value1, String value2) {
            addCriterion("student_NO not between", value1, value2, "studentNo");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentNameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNameEqualTo(String value) {
            addCriterion("student_name =", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThan(String value) {
            addCriterion("student_name >", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThan(String value) {
            addCriterion("student_name <", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameLike(String value) {
            addCriterion("student_name like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotLike(String value) {
            addCriterion("student_name not like", value, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameIn(List<String> values) {
            addCriterion("student_name in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andStudentNameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "studentName");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearIsNull() {
            addCriterion("teacherCourse_year is null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearIsNotNull() {
            addCriterion("teacherCourse_year is not null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearEqualTo(String value) {
            addCriterion("teacherCourse_year =", value, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearNotEqualTo(String value) {
            addCriterion("teacherCourse_year <>", value, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearGreaterThan(String value) {
            addCriterion("teacherCourse_year >", value, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearGreaterThanOrEqualTo(String value) {
            addCriterion("teacherCourse_year >=", value, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearLessThan(String value) {
            addCriterion("teacherCourse_year <", value, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearLessThanOrEqualTo(String value) {
            addCriterion("teacherCourse_year <=", value, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearLike(String value) {
            addCriterion("teacherCourse_year like", value, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearNotLike(String value) {
            addCriterion("teacherCourse_year not like", value, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearIn(List<String> values) {
            addCriterion("teacherCourse_year in", values, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearNotIn(List<String> values) {
            addCriterion("teacherCourse_year not in", values, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearBetween(String value1, String value2) {
            addCriterion("teacherCourse_year between", value1, value2, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseYearNotBetween(String value1, String value2) {
            addCriterion("teacherCourse_year not between", value1, value2, "teachercourseYear");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermIsNull() {
            addCriterion("teacherCourse_term is null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermIsNotNull() {
            addCriterion("teacherCourse_term is not null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermEqualTo(Integer value) {
            addCriterion("teacherCourse_term =", value, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermNotEqualTo(Integer value) {
            addCriterion("teacherCourse_term <>", value, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermGreaterThan(Integer value) {
            addCriterion("teacherCourse_term >", value, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherCourse_term >=", value, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermLessThan(Integer value) {
            addCriterion("teacherCourse_term <", value, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermLessThanOrEqualTo(Integer value) {
            addCriterion("teacherCourse_term <=", value, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermIn(List<Integer> values) {
            addCriterion("teacherCourse_term in", values, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermNotIn(List<Integer> values) {
            addCriterion("teacherCourse_term not in", values, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermBetween(Integer value1, Integer value2) {
            addCriterion("teacherCourse_term between", value1, value2, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andTeachercourseTermNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherCourse_term not between", value1, value2, "teachercourseTerm");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudentSexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudentSexEqualTo(String value) {
            addCriterion("student_sex =", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotEqualTo(String value) {
            addCriterion("student_sex <>", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThan(String value) {
            addCriterion("student_sex >", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexGreaterThanOrEqualTo(String value) {
            addCriterion("student_sex >=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThan(String value) {
            addCriterion("student_sex <", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLessThanOrEqualTo(String value) {
            addCriterion("student_sex <=", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexLike(String value) {
            addCriterion("student_sex like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotLike(String value) {
            addCriterion("student_sex not like", value, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexIn(List<String> values) {
            addCriterion("student_sex in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotIn(List<String> values) {
            addCriterion("student_sex not in", values, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexBetween(String value1, String value2) {
            addCriterion("student_sex between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andStudentSexNotBetween(String value1, String value2) {
            addCriterion("student_sex not between", value1, value2, "studentSex");
            return (Criteria) this;
        }

        public Criteria andSalaryDateIsNull() {
            addCriterion("salary_date is null");
            return (Criteria) this;
        }

        public Criteria andSalaryDateIsNotNull() {
            addCriterion("salary_date is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryDateEqualTo(Date value) {
            addCriterion("salary_date =", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotEqualTo(Date value) {
            addCriterion("salary_date <>", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateGreaterThan(Date value) {
            addCriterion("salary_date >", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("salary_date >=", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateLessThan(Date value) {
            addCriterion("salary_date <", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateLessThanOrEqualTo(Date value) {
            addCriterion("salary_date <=", value, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateIn(List<Date> values) {
            addCriterion("salary_date in", values, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotIn(List<Date> values) {
            addCriterion("salary_date not in", values, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateBetween(Date value1, Date value2) {
            addCriterion("salary_date between", value1, value2, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryDateNotBetween(Date value1, Date value2) {
            addCriterion("salary_date not between", value1, value2, "salaryDate");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeIsNull() {
            addCriterion("salary_time is null");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeIsNotNull() {
            addCriterion("salary_time is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeEqualTo(Integer value) {
            addCriterion("salary_time =", value, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeNotEqualTo(Integer value) {
            addCriterion("salary_time <>", value, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeGreaterThan(Integer value) {
            addCriterion("salary_time >", value, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary_time >=", value, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeLessThan(Integer value) {
            addCriterion("salary_time <", value, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeLessThanOrEqualTo(Integer value) {
            addCriterion("salary_time <=", value, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeIn(List<Integer> values) {
            addCriterion("salary_time in", values, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeNotIn(List<Integer> values) {
            addCriterion("salary_time not in", values, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeBetween(Integer value1, Integer value2) {
            addCriterion("salary_time between", value1, value2, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("salary_time not between", value1, value2, "salaryTime");
            return (Criteria) this;
        }

        public Criteria andSalaryDataIsNull() {
            addCriterion("salary_data is null");
            return (Criteria) this;
        }

        public Criteria andSalaryDataIsNotNull() {
            addCriterion("salary_data is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryDataEqualTo(String value) {
            addCriterion("salary_data =", value, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataNotEqualTo(String value) {
            addCriterion("salary_data <>", value, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataGreaterThan(String value) {
            addCriterion("salary_data >", value, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataGreaterThanOrEqualTo(String value) {
            addCriterion("salary_data >=", value, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataLessThan(String value) {
            addCriterion("salary_data <", value, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataLessThanOrEqualTo(String value) {
            addCriterion("salary_data <=", value, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataLike(String value) {
            addCriterion("salary_data like", value, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataNotLike(String value) {
            addCriterion("salary_data not like", value, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataIn(List<String> values) {
            addCriterion("salary_data in", values, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataNotIn(List<String> values) {
            addCriterion("salary_data not in", values, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataBetween(String value1, String value2) {
            addCriterion("salary_data between", value1, value2, "salaryData");
            return (Criteria) this;
        }

        public Criteria andSalaryDataNotBetween(String value1, String value2) {
            addCriterion("salary_data not between", value1, value2, "salaryData");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}