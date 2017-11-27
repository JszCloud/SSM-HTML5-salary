package com.salary.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andLeaveStartTimeIsNull() {
            addCriterion("leave_start_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeIsNotNull() {
            addCriterion("leave_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("leave_start_time =", value, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("leave_start_time <>", value, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("leave_start_time >", value, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_start_time >=", value, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("leave_start_time <", value, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("leave_start_time <=", value, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("leave_start_time in", values, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("leave_start_time not in", values, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_start_time between", value1, value2, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("leave_start_time not between", value1, value2, "leaveStartTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeIsNull() {
            addCriterion("\"leave _end_time\" is null");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeIsNotNull() {
            addCriterion("\"leave _end_time\" is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("\"leave _end_time\" =", value, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("\"leave _end_time\" <>", value, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("\"leave _end_time\" >", value, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"leave _end_time\" >=", value, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("\"leave _end_time\" <", value, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("\"leave _end_time\" <=", value, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("\"leave _end_time\" in", values, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("\"leave _end_time\" not in", values, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"leave _end_time\" between", value1, value2, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("\"leave _end_time\" not between", value1, value2, "leaveEndTime");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseIsNull() {
            addCriterion("leave_cause is null");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseIsNotNull() {
            addCriterion("leave_cause is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseEqualTo(String value) {
            addCriterion("leave_cause =", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseNotEqualTo(String value) {
            addCriterion("leave_cause <>", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseGreaterThan(String value) {
            addCriterion("leave_cause >", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseGreaterThanOrEqualTo(String value) {
            addCriterion("leave_cause >=", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseLessThan(String value) {
            addCriterion("leave_cause <", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseLessThanOrEqualTo(String value) {
            addCriterion("leave_cause <=", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseLike(String value) {
            addCriterion("leave_cause like", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseNotLike(String value) {
            addCriterion("leave_cause not like", value, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseIn(List<String> values) {
            addCriterion("leave_cause in", values, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseNotIn(List<String> values) {
            addCriterion("leave_cause not in", values, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseBetween(String value1, String value2) {
            addCriterion("leave_cause between", value1, value2, "leaveCause");
            return (Criteria) this;
        }

        public Criteria andLeaveCauseNotBetween(String value1, String value2) {
            addCriterion("leave_cause not between", value1, value2, "leaveCause");
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

        public Criteria andTeacherNameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameLike(String value) {
            addCriterion("teacher_name like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacherName");
            return (Criteria) this;
        }

        public Criteria andTeacherNameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacherName");
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

        public Criteria andLeaveFlagIsNull() {
            addCriterion("\"leave _flag\" is null");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagIsNotNull() {
            addCriterion("\"leave _flag\" is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagEqualTo(String value) {
            addCriterion("\"leave _flag\" =", value, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagNotEqualTo(String value) {
            addCriterion("\"leave _flag\" <>", value, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagGreaterThan(String value) {
            addCriterion("\"leave _flag\" >", value, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagGreaterThanOrEqualTo(String value) {
            addCriterion("\"leave _flag\" >=", value, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagLessThan(String value) {
            addCriterion("\"leave _flag\" <", value, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagLessThanOrEqualTo(String value) {
            addCriterion("\"leave _flag\" <=", value, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagLike(String value) {
            addCriterion("\"leave _flag\" like", value, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagNotLike(String value) {
            addCriterion("\"leave _flag\" not like", value, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagIn(List<String> values) {
            addCriterion("\"leave _flag\" in", values, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagNotIn(List<String> values) {
            addCriterion("\"leave _flag\" not in", values, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagBetween(String value1, String value2) {
            addCriterion("\"leave _flag\" between", value1, value2, "leaveFlag");
            return (Criteria) this;
        }

        public Criteria andLeaveFlagNotBetween(String value1, String value2) {
            addCriterion("\"leave _flag\" not between", value1, value2, "leaveFlag");
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