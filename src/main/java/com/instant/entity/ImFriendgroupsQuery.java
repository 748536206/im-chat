package com.instant.entity;

import java.util.ArrayList;
import java.util.List;

public class ImFriendgroupsQuery {
    /**
     * im_friendgroups
     */
    protected String orderByClause;

    /**
     * im_friendgroups
     */
    protected boolean distinct;

    /**
     * im_friendgroups
     */
    protected List<Criteria> oredCriteria;

    /**
     * im_friendgroups
     */
    protected Integer pageNo = 1;

    /**
     * im_friendgroups
     */
    protected Integer startRow;

    /**
     * im_friendgroups
     */
    protected Integer pageSize = 10;

    /**
     * im_friendgroups
     */
    protected String fields;

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public ImFriendgroupsQuery() {
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
     * im_friendgroups 2019-06-17
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

        public Criteria andFgIdIsNull() {
            addCriterion("fg_id is null");
            return (Criteria) this;
        }

        public Criteria andFgIdIsNotNull() {
            addCriterion("fg_id is not null");
            return (Criteria) this;
        }

        public Criteria andFgIdEqualTo(Integer value) {
            addCriterion("fg_id =", value, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgIdNotEqualTo(Integer value) {
            addCriterion("fg_id <>", value, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgIdGreaterThan(Integer value) {
            addCriterion("fg_id >", value, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fg_id >=", value, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgIdLessThan(Integer value) {
            addCriterion("fg_id <", value, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgIdLessThanOrEqualTo(Integer value) {
            addCriterion("fg_id <=", value, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgIdIn(List<Integer> values) {
            addCriterion("fg_id in", values, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgIdNotIn(List<Integer> values) {
            addCriterion("fg_id not in", values, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgIdBetween(Integer value1, Integer value2) {
            addCriterion("fg_id between", value1, value2, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fg_id not between", value1, value2, "fgId");
            return (Criteria) this;
        }

        public Criteria andFgNameIsNull() {
            addCriterion("fg_name is null");
            return (Criteria) this;
        }

        public Criteria andFgNameIsNotNull() {
            addCriterion("fg_name is not null");
            return (Criteria) this;
        }

        public Criteria andFgNameEqualTo(String value) {
            addCriterion("fg_name =", value, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameNotEqualTo(String value) {
            addCriterion("fg_name <>", value, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameGreaterThan(String value) {
            addCriterion("fg_name >", value, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameGreaterThanOrEqualTo(String value) {
            addCriterion("fg_name >=", value, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameLessThan(String value) {
            addCriterion("fg_name <", value, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameLessThanOrEqualTo(String value) {
            addCriterion("fg_name <=", value, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameLike(String value) {
            addCriterion("fg_name like", value, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameNotLike(String value) {
            addCriterion("fg_name not like", value, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameIn(List<String> values) {
            addCriterion("fg_name in", values, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameNotIn(List<String> values) {
            addCriterion("fg_name not in", values, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameBetween(String value1, String value2) {
            addCriterion("fg_name between", value1, value2, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgNameNotBetween(String value1, String value2) {
            addCriterion("fg_name not between", value1, value2, "fgName");
            return (Criteria) this;
        }

        public Criteria andFgUseridIsNull() {
            addCriterion("fg_userid is null");
            return (Criteria) this;
        }

        public Criteria andFgUseridIsNotNull() {
            addCriterion("fg_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFgUseridEqualTo(Integer value) {
            addCriterion("fg_userid =", value, "fgUserid");
            return (Criteria) this;
        }

        public Criteria andFgUseridNotEqualTo(Integer value) {
            addCriterion("fg_userid <>", value, "fgUserid");
            return (Criteria) this;
        }

        public Criteria andFgUseridGreaterThan(Integer value) {
            addCriterion("fg_userid >", value, "fgUserid");
            return (Criteria) this;
        }

        public Criteria andFgUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("fg_userid >=", value, "fgUserid");
            return (Criteria) this;
        }

        public Criteria andFgUseridLessThan(Integer value) {
            addCriterion("fg_userid <", value, "fgUserid");
            return (Criteria) this;
        }

        public Criteria andFgUseridLessThanOrEqualTo(Integer value) {
            addCriterion("fg_userid <=", value, "fgUserid");
            return (Criteria) this;
        }

        public Criteria andFgUseridIn(List<Integer> values) {
            addCriterion("fg_userid in", values, "fgUserid");
            return (Criteria) this;
        }

        public Criteria andFgUseridNotIn(List<Integer> values) {
            addCriterion("fg_userid not in", values, "fgUserid");
            return (Criteria) this;
        }

        public Criteria andFgUseridBetween(Integer value1, Integer value2) {
            addCriterion("fg_userid between", value1, value2, "fgUserid");
            return (Criteria) this;
        }

        public Criteria andFgUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("fg_userid not between", value1, value2, "fgUserid");
            return (Criteria) this;
        }
    }

    /**
     * im_friendgroups
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * im_friendgroups 2019-06-17
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