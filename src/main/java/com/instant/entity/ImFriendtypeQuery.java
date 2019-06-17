package com.instant.entity;

import java.util.ArrayList;
import java.util.List;

public class ImFriendtypeQuery {
    /**
     * im_friendtype
     */
    protected String orderByClause;

    /**
     * im_friendtype
     */
    protected boolean distinct;

    /**
     * im_friendtype
     */
    protected List<Criteria> oredCriteria;

    /**
     * im_friendtype
     */
    protected Integer pageNo = 1;

    /**
     * im_friendtype
     */
    protected Integer startRow;

    /**
     * im_friendtype
     */
    protected Integer pageSize = 10;

    /**
     * im_friendtype
     */
    protected String fields;

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public ImFriendtypeQuery() {
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
     * im_friendtype 2019-06-17
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

        public Criteria andFtIdIsNull() {
            addCriterion("ft_id is null");
            return (Criteria) this;
        }

        public Criteria andFtIdIsNotNull() {
            addCriterion("ft_id is not null");
            return (Criteria) this;
        }

        public Criteria andFtIdEqualTo(Integer value) {
            addCriterion("ft_id =", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdNotEqualTo(Integer value) {
            addCriterion("ft_id <>", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdGreaterThan(Integer value) {
            addCriterion("ft_id >", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ft_id >=", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdLessThan(Integer value) {
            addCriterion("ft_id <", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdLessThanOrEqualTo(Integer value) {
            addCriterion("ft_id <=", value, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdIn(List<Integer> values) {
            addCriterion("ft_id in", values, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdNotIn(List<Integer> values) {
            addCriterion("ft_id not in", values, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdBetween(Integer value1, Integer value2) {
            addCriterion("ft_id between", value1, value2, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ft_id not between", value1, value2, "ftId");
            return (Criteria) this;
        }

        public Criteria andFtNameIsNull() {
            addCriterion("ft_name is null");
            return (Criteria) this;
        }

        public Criteria andFtNameIsNotNull() {
            addCriterion("ft_name is not null");
            return (Criteria) this;
        }

        public Criteria andFtNameEqualTo(String value) {
            addCriterion("ft_name =", value, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameNotEqualTo(String value) {
            addCriterion("ft_name <>", value, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameGreaterThan(String value) {
            addCriterion("ft_name >", value, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameGreaterThanOrEqualTo(String value) {
            addCriterion("ft_name >=", value, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameLessThan(String value) {
            addCriterion("ft_name <", value, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameLessThanOrEqualTo(String value) {
            addCriterion("ft_name <=", value, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameLike(String value) {
            addCriterion("ft_name like", value, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameNotLike(String value) {
            addCriterion("ft_name not like", value, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameIn(List<String> values) {
            addCriterion("ft_name in", values, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameNotIn(List<String> values) {
            addCriterion("ft_name not in", values, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameBetween(String value1, String value2) {
            addCriterion("ft_name between", value1, value2, "ftName");
            return (Criteria) this;
        }

        public Criteria andFtNameNotBetween(String value1, String value2) {
            addCriterion("ft_name not between", value1, value2, "ftName");
            return (Criteria) this;
        }
    }

    /**
     * im_friendtype
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * im_friendtype 2019-06-17
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