package com.salary.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacherNoIsNull() {
            addCriterion("teacher_NO is null");
            return (Criteria) this;
        }

        public Criteria andTeacherNoIsNotNull() {
            addCriterion("teacher_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherNoEqualTo(String value) {
            addCriterion("teacher_NO =", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotEqualTo(String value) {
            addCriterion("teacher_NO <>", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoGreaterThan(String value) {
            addCriterion("teacher_NO >", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_NO >=", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLessThan(String value) {
            addCriterion("teacher_NO <", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLessThanOrEqualTo(String value) {
            addCriterion("teacher_NO <=", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoLike(String value) {
            addCriterion("teacher_NO like", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotLike(String value) {
            addCriterion("teacher_NO not like", value, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoIn(List<String> values) {
            addCriterion("teacher_NO in", values, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotIn(List<String> values) {
            addCriterion("teacher_NO not in", values, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoBetween(String value1, String value2) {
            addCriterion("teacher_NO between", value1, value2, "teacherNo");
            return (Criteria) this;
        }

        public Criteria andTeacherNoNotBetween(String value1, String value2) {
            addCriterion("teacher_NO not between", value1, value2, "teacherNo");
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

        public Criteria andTeacherSexIsNull() {
            addCriterion("teacher_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIsNotNull() {
            addCriterion("teacher_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherSexEqualTo(String value) {
            addCriterion("teacher_sex =", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotEqualTo(String value) {
            addCriterion("teacher_sex <>", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThan(String value) {
            addCriterion("teacher_sex >", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_sex >=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThan(String value) {
            addCriterion("teacher_sex <", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLessThanOrEqualTo(String value) {
            addCriterion("teacher_sex <=", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexLike(String value) {
            addCriterion("teacher_sex like", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotLike(String value) {
            addCriterion("teacher_sex not like", value, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexIn(List<String> values) {
            addCriterion("teacher_sex in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotIn(List<String> values) {
            addCriterion("teacher_sex not in", values, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexBetween(String value1, String value2) {
            addCriterion("teacher_sex between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherSexNotBetween(String value1, String value2) {
            addCriterion("teacher_sex not between", value1, value2, "teacherSex");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeIsNull() {
            addCriterion("teacher_office is null");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeIsNotNull() {
            addCriterion("teacher_office is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeEqualTo(String value) {
            addCriterion("teacher_office =", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeNotEqualTo(String value) {
            addCriterion("teacher_office <>", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeGreaterThan(String value) {
            addCriterion("teacher_office >", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_office >=", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeLessThan(String value) {
            addCriterion("teacher_office <", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeLessThanOrEqualTo(String value) {
            addCriterion("teacher_office <=", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeLike(String value) {
            addCriterion("teacher_office like", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeNotLike(String value) {
            addCriterion("teacher_office not like", value, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeIn(List<String> values) {
            addCriterion("teacher_office in", values, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeNotIn(List<String> values) {
            addCriterion("teacher_office not in", values, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeBetween(String value1, String value2) {
            addCriterion("teacher_office between", value1, value2, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherOfficeNotBetween(String value1, String value2) {
            addCriterion("teacher_office not between", value1, value2, "teacherOffice");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNull() {
            addCriterion("teacher_phone is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIsNotNull() {
            addCriterion("teacher_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneEqualTo(String value) {
            addCriterion("teacher_phone =", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotEqualTo(String value) {
            addCriterion("teacher_phone <>", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThan(String value) {
            addCriterion("teacher_phone >", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_phone >=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThan(String value) {
            addCriterion("teacher_phone <", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLessThanOrEqualTo(String value) {
            addCriterion("teacher_phone <=", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneLike(String value) {
            addCriterion("teacher_phone like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotLike(String value) {
            addCriterion("teacher_phone not like", value, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneIn(List<String> values) {
            addCriterion("teacher_phone in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotIn(List<String> values) {
            addCriterion("teacher_phone not in", values, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneBetween(String value1, String value2) {
            addCriterion("teacher_phone between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherPhoneNotBetween(String value1, String value2) {
            addCriterion("teacher_phone not between", value1, value2, "teacherPhone");
            return (Criteria) this;
        }

        public Criteria andTeacherQqIsNull() {
            addCriterion("teacher_qq is null");
            return (Criteria) this;
        }

        public Criteria andTeacherQqIsNotNull() {
            addCriterion("teacher_qq is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherQqEqualTo(String value) {
            addCriterion("teacher_qq =", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotEqualTo(String value) {
            addCriterion("teacher_qq <>", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqGreaterThan(String value) {
            addCriterion("teacher_qq >", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_qq >=", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqLessThan(String value) {
            addCriterion("teacher_qq <", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqLessThanOrEqualTo(String value) {
            addCriterion("teacher_qq <=", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqLike(String value) {
            addCriterion("teacher_qq like", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotLike(String value) {
            addCriterion("teacher_qq not like", value, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqIn(List<String> values) {
            addCriterion("teacher_qq in", values, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotIn(List<String> values) {
            addCriterion("teacher_qq not in", values, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqBetween(String value1, String value2) {
            addCriterion("teacher_qq between", value1, value2, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherQqNotBetween(String value1, String value2) {
            addCriterion("teacher_qq not between", value1, value2, "teacherQq");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNull() {
            addCriterion("teacher_email is null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIsNotNull() {
            addCriterion("teacher_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailEqualTo(String value) {
            addCriterion("teacher_email =", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotEqualTo(String value) {
            addCriterion("teacher_email <>", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThan(String value) {
            addCriterion("teacher_email >", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_email >=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThan(String value) {
            addCriterion("teacher_email <", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLessThanOrEqualTo(String value) {
            addCriterion("teacher_email <=", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailLike(String value) {
            addCriterion("teacher_email like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotLike(String value) {
            addCriterion("teacher_email not like", value, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailIn(List<String> values) {
            addCriterion("teacher_email in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotIn(List<String> values) {
            addCriterion("teacher_email not in", values, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailBetween(String value1, String value2) {
            addCriterion("teacher_email between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherEmailNotBetween(String value1, String value2) {
            addCriterion("teacher_email not between", value1, value2, "teacherEmail");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNull() {
            addCriterion("teacher_password is null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIsNotNull() {
            addCriterion("teacher_password is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordEqualTo(String value) {
            addCriterion("teacher_password =", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotEqualTo(String value) {
            addCriterion("teacher_password <>", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThan(String value) {
            addCriterion("teacher_password >", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_password >=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThan(String value) {
            addCriterion("teacher_password <", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLessThanOrEqualTo(String value) {
            addCriterion("teacher_password <=", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordLike(String value) {
            addCriterion("teacher_password like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotLike(String value) {
            addCriterion("teacher_password not like", value, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordIn(List<String> values) {
            addCriterion("teacher_password in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotIn(List<String> values) {
            addCriterion("teacher_password not in", values, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordBetween(String value1, String value2) {
            addCriterion("teacher_password between", value1, value2, "teacherPassword");
            return (Criteria) this;
        }

        public Criteria andTeacherPasswordNotBetween(String value1, String value2) {
            addCriterion("teacher_password not between", value1, value2, "teacherPassword");
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