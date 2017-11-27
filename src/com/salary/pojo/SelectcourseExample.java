package com.salary.pojo;

import java.util.ArrayList;
import java.util.List;

public class SelectcourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SelectcourseExample() {
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

        public Criteria andSelectcourseIdIsNull() {
            addCriterion("selectCourse_id is null");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdIsNotNull() {
            addCriterion("selectCourse_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdEqualTo(Integer value) {
            addCriterion("selectCourse_id =", value, "selectcourseId");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdNotEqualTo(Integer value) {
            addCriterion("selectCourse_id <>", value, "selectcourseId");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdGreaterThan(Integer value) {
            addCriterion("selectCourse_id >", value, "selectcourseId");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("selectCourse_id >=", value, "selectcourseId");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdLessThan(Integer value) {
            addCriterion("selectCourse_id <", value, "selectcourseId");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("selectCourse_id <=", value, "selectcourseId");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdIn(List<Integer> values) {
            addCriterion("selectCourse_id in", values, "selectcourseId");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdNotIn(List<Integer> values) {
            addCriterion("selectCourse_id not in", values, "selectcourseId");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdBetween(Integer value1, Integer value2) {
            addCriterion("selectCourse_id between", value1, value2, "selectcourseId");
            return (Criteria) this;
        }

        public Criteria andSelectcourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("selectCourse_id not between", value1, value2, "selectcourseId");
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

        public Criteria andSelectcourseYearIsNull() {
            addCriterion("selectCourse_year is null");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearIsNotNull() {
            addCriterion("selectCourse_year is not null");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearEqualTo(String value) {
            addCriterion("selectCourse_year =", value, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearNotEqualTo(String value) {
            addCriterion("selectCourse_year <>", value, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearGreaterThan(String value) {
            addCriterion("selectCourse_year >", value, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearGreaterThanOrEqualTo(String value) {
            addCriterion("selectCourse_year >=", value, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearLessThan(String value) {
            addCriterion("selectCourse_year <", value, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearLessThanOrEqualTo(String value) {
            addCriterion("selectCourse_year <=", value, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearLike(String value) {
            addCriterion("selectCourse_year like", value, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearNotLike(String value) {
            addCriterion("selectCourse_year not like", value, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearIn(List<String> values) {
            addCriterion("selectCourse_year in", values, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearNotIn(List<String> values) {
            addCriterion("selectCourse_year not in", values, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearBetween(String value1, String value2) {
            addCriterion("selectCourse_year between", value1, value2, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseYearNotBetween(String value1, String value2) {
            addCriterion("selectCourse_year not between", value1, value2, "selectcourseYear");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermIsNull() {
            addCriterion("selectCourse_term is null");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermIsNotNull() {
            addCriterion("selectCourse_term is not null");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermEqualTo(Integer value) {
            addCriterion("selectCourse_term =", value, "selectcourseTerm");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermNotEqualTo(Integer value) {
            addCriterion("selectCourse_term <>", value, "selectcourseTerm");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermGreaterThan(Integer value) {
            addCriterion("selectCourse_term >", value, "selectcourseTerm");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("selectCourse_term >=", value, "selectcourseTerm");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermLessThan(Integer value) {
            addCriterion("selectCourse_term <", value, "selectcourseTerm");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermLessThanOrEqualTo(Integer value) {
            addCriterion("selectCourse_term <=", value, "selectcourseTerm");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermIn(List<Integer> values) {
            addCriterion("selectCourse_term in", values, "selectcourseTerm");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermNotIn(List<Integer> values) {
            addCriterion("selectCourse_term not in", values, "selectcourseTerm");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermBetween(Integer value1, Integer value2) {
            addCriterion("selectCourse_term between", value1, value2, "selectcourseTerm");
            return (Criteria) this;
        }

        public Criteria andSelectcourseTermNotBetween(Integer value1, Integer value2) {
            addCriterion("selectCourse_term not between", value1, value2, "selectcourseTerm");
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