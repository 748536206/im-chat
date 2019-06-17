package com.instant.entity;

import java.util.ArrayList;
import java.util.List;

public class ImUserFriendshippolicyQuery {
    /**
     * im_user_friendshippolicy
     */
    protected String orderByClause;

    /**
     * im_user_friendshippolicy
     */
    protected boolean distinct;

    /**
     * im_user_friendshippolicy
     */
    protected List<Criteria> oredCriteria;

    /**
     * im_user_friendshippolicy
     */
    protected Integer pageNo = 1;

    /**
     * im_user_friendshippolicy
     */
    protected Integer startRow;

    /**
     * im_user_friendshippolicy
     */
    protected Integer pageSize = 10;

    /**
     * im_user_friendshippolicy
     */
    protected String fields;

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public ImUserFriendshippolicyQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public void setFields(String fields) {
        this.fields=fields;
    }

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public String getFields() {
        return fields;
    }

    /**
     * im_user_friendshippolicy 2019-06-17
     */
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

        public Criteria andUFpIdIsNull() {
            addCriterion("u_fp_id is null");
            return (Criteria) this;
        }

        public Criteria andUFpIdIsNotNull() {
            addCriterion("u_fp_id is not null");
            return (Criteria) this;
        }

        public Criteria andUFpIdEqualTo(Integer value) {
            addCriterion("u_fp_id =", value, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFpIdNotEqualTo(Integer value) {
            addCriterion("u_fp_id <>", value, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFpIdGreaterThan(Integer value) {
            addCriterion("u_fp_id >", value, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_fp_id >=", value, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFpIdLessThan(Integer value) {
            addCriterion("u_fp_id <", value, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFpIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_fp_id <=", value, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFpIdIn(List<Integer> values) {
            addCriterion("u_fp_id in", values, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFpIdNotIn(List<Integer> values) {
            addCriterion("u_fp_id not in", values, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFpIdBetween(Integer value1, Integer value2) {
            addCriterion("u_fp_id between", value1, value2, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_fp_id not between", value1, value2, "uFpId");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyIsNull() {
            addCriterion("u_friendshippolicy is null");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyIsNotNull() {
            addCriterion("u_friendshippolicy is not null");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyEqualTo(String value) {
            addCriterion("u_friendshippolicy =", value, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyNotEqualTo(String value) {
            addCriterion("u_friendshippolicy <>", value, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyGreaterThan(String value) {
            addCriterion("u_friendshippolicy >", value, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyGreaterThanOrEqualTo(String value) {
            addCriterion("u_friendshippolicy >=", value, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyLessThan(String value) {
            addCriterion("u_friendshippolicy <", value, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyLessThanOrEqualTo(String value) {
            addCriterion("u_friendshippolicy <=", value, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyLike(String value) {
            addCriterion("u_friendshippolicy like", value, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyNotLike(String value) {
            addCriterion("u_friendshippolicy not like", value, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyIn(List<String> values) {
            addCriterion("u_friendshippolicy in", values, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyNotIn(List<String> values) {
            addCriterion("u_friendshippolicy not in", values, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyBetween(String value1, String value2) {
            addCriterion("u_friendshippolicy between", value1, value2, "uFriendshippolicy");
            return (Criteria) this;
        }

        public Criteria andUFriendshippolicyNotBetween(String value1, String value2) {
            addCriterion("u_friendshippolicy not between", value1, value2, "uFriendshippolicy");
            return (Criteria) this;
        }
    }

    /**
     * im_user_friendshippolicy
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * im_user_friendshippolicy 2019-06-17
     */
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