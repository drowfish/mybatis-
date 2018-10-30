package com.ssm.model;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNull() {
            addCriterion("coursename is null");
            return (Criteria) this;
        }

        public Criteria andCoursenameIsNotNull() {
            addCriterion("coursename is not null");
            return (Criteria) this;
        }

        public Criteria andCoursenameEqualTo(String value) {
            addCriterion("coursename =", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotEqualTo(String value) {
            addCriterion("coursename <>", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThan(String value) {
            addCriterion("coursename >", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameGreaterThanOrEqualTo(String value) {
            addCriterion("coursename >=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThan(String value) {
            addCriterion("coursename <", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLessThanOrEqualTo(String value) {
            addCriterion("coursename <=", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameLike(String value) {
            addCriterion("coursename like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotLike(String value) {
            addCriterion("coursename not like", value, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameIn(List<String> values) {
            addCriterion("coursename in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotIn(List<String> values) {
            addCriterion("coursename not in", values, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameBetween(String value1, String value2) {
            addCriterion("coursename between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursenameNotBetween(String value1, String value2) {
            addCriterion("coursename not between", value1, value2, "coursename");
            return (Criteria) this;
        }

        public Criteria andCoursedescIsNull() {
            addCriterion("coursedesc is null");
            return (Criteria) this;
        }

        public Criteria andCoursedescIsNotNull() {
            addCriterion("coursedesc is not null");
            return (Criteria) this;
        }

        public Criteria andCoursedescEqualTo(String value) {
            addCriterion("coursedesc =", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotEqualTo(String value) {
            addCriterion("coursedesc <>", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescGreaterThan(String value) {
            addCriterion("coursedesc >", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescGreaterThanOrEqualTo(String value) {
            addCriterion("coursedesc >=", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescLessThan(String value) {
            addCriterion("coursedesc <", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescLessThanOrEqualTo(String value) {
            addCriterion("coursedesc <=", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescLike(String value) {
            addCriterion("coursedesc like", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotLike(String value) {
            addCriterion("coursedesc not like", value, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescIn(List<String> values) {
            addCriterion("coursedesc in", values, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotIn(List<String> values) {
            addCriterion("coursedesc not in", values, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescBetween(String value1, String value2) {
            addCriterion("coursedesc between", value1, value2, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCoursedescNotBetween(String value1, String value2) {
            addCriterion("coursedesc not between", value1, value2, "coursedesc");
            return (Criteria) this;
        }

        public Criteria andCourseteacherIsNull() {
            addCriterion("courseteacher is null");
            return (Criteria) this;
        }

        public Criteria andCourseteacherIsNotNull() {
            addCriterion("courseteacher is not null");
            return (Criteria) this;
        }

        public Criteria andCourseteacherEqualTo(String value) {
            addCriterion("courseteacher =", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherNotEqualTo(String value) {
            addCriterion("courseteacher <>", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherGreaterThan(String value) {
            addCriterion("courseteacher >", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherGreaterThanOrEqualTo(String value) {
            addCriterion("courseteacher >=", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherLessThan(String value) {
            addCriterion("courseteacher <", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherLessThanOrEqualTo(String value) {
            addCriterion("courseteacher <=", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherLike(String value) {
            addCriterion("courseteacher like", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherNotLike(String value) {
            addCriterion("courseteacher not like", value, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherIn(List<String> values) {
            addCriterion("courseteacher in", values, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherNotIn(List<String> values) {
            addCriterion("courseteacher not in", values, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherBetween(String value1, String value2) {
            addCriterion("courseteacher between", value1, value2, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCourseteacherNotBetween(String value1, String value2) {
            addCriterion("courseteacher not between", value1, value2, "courseteacher");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNull() {
            addCriterion("coursetype is null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIsNotNull() {
            addCriterion("coursetype is not null");
            return (Criteria) this;
        }

        public Criteria andCoursetypeEqualTo(String value) {
            addCriterion("coursetype =", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotEqualTo(String value) {
            addCriterion("coursetype <>", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThan(String value) {
            addCriterion("coursetype >", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeGreaterThanOrEqualTo(String value) {
            addCriterion("coursetype >=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThan(String value) {
            addCriterion("coursetype <", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLessThanOrEqualTo(String value) {
            addCriterion("coursetype <=", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeLike(String value) {
            addCriterion("coursetype like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotLike(String value) {
            addCriterion("coursetype not like", value, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeIn(List<String> values) {
            addCriterion("coursetype in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotIn(List<String> values) {
            addCriterion("coursetype not in", values, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeBetween(String value1, String value2) {
            addCriterion("coursetype between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andCoursetypeNotBetween(String value1, String value2) {
            addCriterion("coursetype not between", value1, value2, "coursetype");
            return (Criteria) this;
        }

        public Criteria andSecondidIsNull() {
            addCriterion("secondid is null");
            return (Criteria) this;
        }

        public Criteria andSecondidIsNotNull() {
            addCriterion("secondid is not null");
            return (Criteria) this;
        }

        public Criteria andSecondidEqualTo(Integer value) {
            addCriterion("secondid =", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidNotEqualTo(Integer value) {
            addCriterion("secondid <>", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidGreaterThan(Integer value) {
            addCriterion("secondid >", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondid >=", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidLessThan(Integer value) {
            addCriterion("secondid <", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidLessThanOrEqualTo(Integer value) {
            addCriterion("secondid <=", value, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidIn(List<Integer> values) {
            addCriterion("secondid in", values, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidNotIn(List<Integer> values) {
            addCriterion("secondid not in", values, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidBetween(Integer value1, Integer value2) {
            addCriterion("secondid between", value1, value2, "secondid");
            return (Criteria) this;
        }

        public Criteria andSecondidNotBetween(Integer value1, Integer value2) {
            addCriterion("secondid not between", value1, value2, "secondid");
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