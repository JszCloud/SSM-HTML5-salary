package com.salary.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeachercourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachercourseExample() {
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

        public Criteria andTeachercourseIdIsNull() {
            addCriterion("teacherCourse_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdIsNotNull() {
            addCriterion("teacherCourse_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdEqualTo(Integer value) {
            addCriterion("teacherCourse_id =", value, "teachercourseId");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdNotEqualTo(Integer value) {
            addCriterion("teacherCourse_id <>", value, "teachercourseId");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdGreaterThan(Integer value) {
            addCriterion("teacherCourse_id >", value, "teachercourseId");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherCourse_id >=", value, "teachercourseId");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdLessThan(Integer value) {
            addCriterion("teacherCourse_id <", value, "teachercourseId");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("teacherCourse_id <=", value, "teachercourseId");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdIn(List<Integer> values) {
            addCriterion("teacherCourse_id in", values, "teachercourseId");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdNotIn(List<Integer> values) {
            addCriterion("teacherCourse_id not in", values, "teachercourseId");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdBetween(Integer value1, Integer value2) {
            addCriterion("teacherCourse_id between", value1, value2, "teachercourseId");
            return (Criteria) this;
        }

        public Criteria andTeachercourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherCourse_id not between", value1, value2, "teachercourseId");
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