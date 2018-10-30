package com.ssm.model;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideodescIsNull() {
            addCriterion("videodesc is null");
            return (Criteria) this;
        }

        public Criteria andVideodescIsNotNull() {
            addCriterion("videodesc is not null");
            return (Criteria) this;
        }

        public Criteria andVideodescEqualTo(String value) {
            addCriterion("videodesc =", value, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescNotEqualTo(String value) {
            addCriterion("videodesc <>", value, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescGreaterThan(String value) {
            addCriterion("videodesc >", value, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescGreaterThanOrEqualTo(String value) {
            addCriterion("videodesc >=", value, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescLessThan(String value) {
            addCriterion("videodesc <", value, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescLessThanOrEqualTo(String value) {
            addCriterion("videodesc <=", value, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescLike(String value) {
            addCriterion("videodesc like", value, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescNotLike(String value) {
            addCriterion("videodesc not like", value, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescIn(List<String> values) {
            addCriterion("videodesc in", values, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescNotIn(List<String> values) {
            addCriterion("videodesc not in", values, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescBetween(String value1, String value2) {
            addCriterion("videodesc between", value1, value2, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideodescNotBetween(String value1, String value2) {
            addCriterion("videodesc not between", value1, value2, "videodesc");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNull() {
            addCriterion("videoid is null");
            return (Criteria) this;
        }

        public Criteria andVideoidIsNotNull() {
            addCriterion("videoid is not null");
            return (Criteria) this;
        }

        public Criteria andVideoidEqualTo(String value) {
            addCriterion("videoid =", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotEqualTo(String value) {
            addCriterion("videoid <>", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThan(String value) {
            addCriterion("videoid >", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidGreaterThanOrEqualTo(String value) {
            addCriterion("videoid >=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThan(String value) {
            addCriterion("videoid <", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLessThanOrEqualTo(String value) {
            addCriterion("videoid <=", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidLike(String value) {
            addCriterion("videoid like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotLike(String value) {
            addCriterion("videoid not like", value, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidIn(List<String> values) {
            addCriterion("videoid in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotIn(List<String> values) {
            addCriterion("videoid not in", values, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidBetween(String value1, String value2) {
            addCriterion("videoid between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andVideoidNotBetween(String value1, String value2) {
            addCriterion("videoid not between", value1, value2, "videoid");
            return (Criteria) this;
        }

        public Criteria andThirdidIsNull() {
            addCriterion("thirdid is null");
            return (Criteria) this;
        }

        public Criteria andThirdidIsNotNull() {
            addCriterion("thirdid is not null");
            return (Criteria) this;
        }

        public Criteria andThirdidEqualTo(Integer value) {
            addCriterion("thirdid =", value, "thirdid");
            return (Criteria) this;
        }

        public Criteria andThirdidNotEqualTo(Integer value) {
            addCriterion("thirdid <>", value, "thirdid");
            return (Criteria) this;
        }

        public Criteria andThirdidGreaterThan(Integer value) {
            addCriterion("thirdid >", value, "thirdid");
            return (Criteria) this;
        }

        public Criteria andThirdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("thirdid >=", value, "thirdid");
            return (Criteria) this;
        }

        public Criteria andThirdidLessThan(Integer value) {
            addCriterion("thirdid <", value, "thirdid");
            return (Criteria) this;
        }

        public Criteria andThirdidLessThanOrEqualTo(Integer value) {
            addCriterion("thirdid <=", value, "thirdid");
            return (Criteria) this;
        }

        public Criteria andThirdidIn(List<Integer> values) {
            addCriterion("thirdid in", values, "thirdid");
            return (Criteria) this;
        }

        public Criteria andThirdidNotIn(List<Integer> values) {
            addCriterion("thirdid not in", values, "thirdid");
            return (Criteria) this;
        }

        public Criteria andThirdidBetween(Integer value1, Integer value2) {
            addCriterion("thirdid between", value1, value2, "thirdid");
            return (Criteria) this;
        }

        public Criteria andThirdidNotBetween(Integer value1, Integer value2) {
            addCriterion("thirdid not between", value1, value2, "thirdid");
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