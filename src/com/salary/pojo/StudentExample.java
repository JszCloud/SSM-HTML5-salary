package com.salary.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentRoomIsNull() {
            addCriterion("student_room is null");
            return (Criteria) this;
        }

        public Criteria andStudentRoomIsNotNull() {
            addCriterion("student_room is not null");
            return (Criteria) this;
        }

        public Criteria andStudentRoomEqualTo(String value) {
            addCriterion("student_room =", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomNotEqualTo(String value) {
            addCriterion("student_room <>", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomGreaterThan(String value) {
            addCriterion("student_room >", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomGreaterThanOrEqualTo(String value) {
            addCriterion("student_room >=", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomLessThan(String value) {
            addCriterion("student_room <", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomLessThanOrEqualTo(String value) {
            addCriterion("student_room <=", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomLike(String value) {
            addCriterion("student_room like", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomNotLike(String value) {
            addCriterion("student_room not like", value, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomIn(List<String> values) {
            addCriterion("student_room in", values, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomNotIn(List<String> values) {
            addCriterion("student_room not in", values, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomBetween(String value1, String value2) {
            addCriterion("student_room between", value1, value2, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentRoomNotBetween(String value1, String value2) {
            addCriterion("student_room not between", value1, value2, "studentRoom");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNull() {
            addCriterion("student_phone is null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIsNotNull() {
            addCriterion("student_phone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneEqualTo(String value) {
            addCriterion("student_phone =", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotEqualTo(String value) {
            addCriterion("student_phone <>", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThan(String value) {
            addCriterion("student_phone >", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_phone >=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThan(String value) {
            addCriterion("student_phone <", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLessThanOrEqualTo(String value) {
            addCriterion("student_phone <=", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneLike(String value) {
            addCriterion("student_phone like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotLike(String value) {
            addCriterion("student_phone not like", value, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneIn(List<String> values) {
            addCriterion("student_phone in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotIn(List<String> values) {
            addCriterion("student_phone not in", values, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneBetween(String value1, String value2) {
            addCriterion("student_phone between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentPhoneNotBetween(String value1, String value2) {
            addCriterion("student_phone not between", value1, value2, "studentPhone");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNull() {
            addCriterion("student_qq is null");
            return (Criteria) this;
        }

        public Criteria andStudentQqIsNotNull() {
            addCriterion("student_qq is not null");
            return (Criteria) this;
        }

        public Criteria andStudentQqEqualTo(String value) {
            addCriterion("student_qq =", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotEqualTo(String value) {
            addCriterion("student_qq <>", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThan(String value) {
            addCriterion("student_qq >", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqGreaterThanOrEqualTo(String value) {
            addCriterion("student_qq >=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThan(String value) {
            addCriterion("student_qq <", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLessThanOrEqualTo(String value) {
            addCriterion("student_qq <=", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqLike(String value) {
            addCriterion("student_qq like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotLike(String value) {
            addCriterion("student_qq not like", value, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqIn(List<String> values) {
            addCriterion("student_qq in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotIn(List<String> values) {
            addCriterion("student_qq not in", values, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqBetween(String value1, String value2) {
            addCriterion("student_qq between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentQqNotBetween(String value1, String value2) {
            addCriterion("student_qq not between", value1, value2, "studentQq");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNull() {
            addCriterion("student_email is null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIsNotNull() {
            addCriterion("student_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudentEmailEqualTo(String value) {
            addCriterion("student_email =", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotEqualTo(String value) {
            addCriterion("student_email <>", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThan(String value) {
            addCriterion("student_email >", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailGreaterThanOrEqualTo(String value) {
            addCriterion("student_email >=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThan(String value) {
            addCriterion("student_email <", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLessThanOrEqualTo(String value) {
            addCriterion("student_email <=", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailLike(String value) {
            addCriterion("student_email like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotLike(String value) {
            addCriterion("student_email not like", value, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailIn(List<String> values) {
            addCriterion("student_email in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotIn(List<String> values) {
            addCriterion("student_email not in", values, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailBetween(String value1, String value2) {
            addCriterion("student_email between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentEmailNotBetween(String value1, String value2) {
            addCriterion("student_email not between", value1, value2, "studentEmail");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNull() {
            addCriterion("student_password is null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIsNotNull() {
            addCriterion("student_password is not null");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordEqualTo(String value) {
            addCriterion("student_password =", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotEqualTo(String value) {
            addCriterion("student_password <>", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThan(String value) {
            addCriterion("student_password >", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("student_password >=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThan(String value) {
            addCriterion("student_password <", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLessThanOrEqualTo(String value) {
            addCriterion("student_password <=", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordLike(String value) {
            addCriterion("student_password like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotLike(String value) {
            addCriterion("student_password not like", value, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordIn(List<String> values) {
            addCriterion("student_password in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotIn(List<String> values) {
            addCriterion("student_password not in", values, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordBetween(String value1, String value2) {
            addCriterion("student_password between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentPasswordNotBetween(String value1, String value2) {
            addCriterion("student_password not between", value1, value2, "studentPassword");
            return (Criteria) this;
        }

        public Criteria andStudentImageIsNull() {
            addCriterion("student_image is null");
            return (Criteria) this;
        }

        public Criteria andStudentImageIsNotNull() {
            addCriterion("student_image is not null");
            return (Criteria) this;
        }

        public Criteria andStudentImageEqualTo(String value) {
            addCriterion("student_image =", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageNotEqualTo(String value) {
            addCriterion("student_image <>", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageGreaterThan(String value) {
            addCriterion("student_image >", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageGreaterThanOrEqualTo(String value) {
            addCriterion("student_image >=", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageLessThan(String value) {
            addCriterion("student_image <", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageLessThanOrEqualTo(String value) {
            addCriterion("student_image <=", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageLike(String value) {
            addCriterion("student_image like", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageNotLike(String value) {
            addCriterion("student_image not like", value, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageIn(List<String> values) {
            addCriterion("student_image in", values, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageNotIn(List<String> values) {
            addCriterion("student_image not in", values, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageBetween(String value1, String value2) {
            addCriterion("student_image between", value1, value2, "studentImage");
            return (Criteria) this;
        }

        public Criteria andStudentImageNotBetween(String value1, String value2) {
            addCriterion("student_image not between", value1, value2, "studentImage");
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