package com.instant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImUserGroupstouserQuery {
    /**
     * im_user_groupstouser
     */
    protected String orderByClause;

    /**
     * im_user_groupstouser
     */
    protected boolean distinct;

    /**
     * im_user_groupstouser
     */
    protected List<Criteria> oredCriteria;

    /**
     * im_user_groupstouser
     */
    protected Integer pageNo = 1;

    /**
     * im_user_groupstouser
     */
    protected Integer startRow;

    /**
     * im_user_groupstouser
     */
    protected Integer pageSize = 10;

    /**
     * im_user_groupstouser
     */
    protected String fields;

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public ImUserGroupstouserQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated 2019-06-18
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
     * @mbg.generated 2019-06-18
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public void setFields(String fields) {
        this.fields=fields;
    }

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public String getFields() {
        return fields;
    }

    /**
     * im_user_groupstouser 2019-06-18
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

        public Criteria andUgIdIsNull() {
            addCriterion("ug_id is null");
            return (Criteria) this;
        }

        public Criteria andUgIdIsNotNull() {
            addCriterion("ug_id is not null");
            return (Criteria) this;
        }

        public Criteria andUgIdEqualTo(Integer value) {
            addCriterion("ug_id =", value, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgIdNotEqualTo(Integer value) {
            addCriterion("ug_id <>", value, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgIdGreaterThan(Integer value) {
            addCriterion("ug_id >", value, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ug_id >=", value, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgIdLessThan(Integer value) {
            addCriterion("ug_id <", value, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgIdLessThanOrEqualTo(Integer value) {
            addCriterion("ug_id <=", value, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgIdIn(List<Integer> values) {
            addCriterion("ug_id in", values, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgIdNotIn(List<Integer> values) {
            addCriterion("ug_id not in", values, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgIdBetween(Integer value1, Integer value2) {
            addCriterion("ug_id between", value1, value2, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ug_id not between", value1, value2, "ugId");
            return (Criteria) this;
        }

        public Criteria andUgUseridIsNull() {
            addCriterion("\"ug _userid\" is null");
            return (Criteria) this;
        }

        public Criteria andUgUseridIsNotNull() {
            addCriterion("\"ug _userid\" is not null");
            return (Criteria) this;
        }

        public Criteria andUgUseridEqualTo(Integer value) {
            addCriterion("\"ug _userid\" =", value, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgUseridNotEqualTo(Integer value) {
            addCriterion("\"ug _userid\" <>", value, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgUseridGreaterThan(Integer value) {
            addCriterion("\"ug _userid\" >", value, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"ug _userid\" >=", value, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgUseridLessThan(Integer value) {
            addCriterion("\"ug _userid\" <", value, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgUseridLessThanOrEqualTo(Integer value) {
            addCriterion("\"ug _userid\" <=", value, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgUseridIn(List<Integer> values) {
            addCriterion("\"ug _userid\" in", values, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgUseridNotIn(List<Integer> values) {
            addCriterion("\"ug _userid\" not in", values, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgUseridBetween(Integer value1, Integer value2) {
            addCriterion("\"ug _userid\" between", value1, value2, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("\"ug _userid\" not between", value1, value2, "ugUserid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidIsNull() {
            addCriterion("\"ug _groupid\" is null");
            return (Criteria) this;
        }

        public Criteria andUgGroupidIsNotNull() {
            addCriterion("\"ug _groupid\" is not null");
            return (Criteria) this;
        }

        public Criteria andUgGroupidEqualTo(Integer value) {
            addCriterion("\"ug _groupid\" =", value, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidNotEqualTo(Integer value) {
            addCriterion("\"ug _groupid\" <>", value, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidGreaterThan(Integer value) {
            addCriterion("\"ug _groupid\" >", value, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"ug _groupid\" >=", value, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidLessThan(Integer value) {
            addCriterion("\"ug _groupid\" <", value, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("\"ug _groupid\" <=", value, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidIn(List<Integer> values) {
            addCriterion("\"ug _groupid\" in", values, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidNotIn(List<Integer> values) {
            addCriterion("\"ug _groupid\" not in", values, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidBetween(Integer value1, Integer value2) {
            addCriterion("\"ug _groupid\" between", value1, value2, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("\"ug _groupid\" not between", value1, value2, "ugGroupid");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeIsNull() {
            addCriterion("\"ug _createtime\" is null");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeIsNotNull() {
            addCriterion("\"ug _createtime\" is not null");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeEqualTo(Date value) {
            addCriterion("\"ug _createtime\" =", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeNotEqualTo(Date value) {
            addCriterion("\"ug _createtime\" <>", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeGreaterThan(Date value) {
            addCriterion("\"ug _createtime\" >", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("\"ug _createtime\" >=", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeLessThan(Date value) {
            addCriterion("\"ug _createtime\" <", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("\"ug _createtime\" <=", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeIn(List<Date> values) {
            addCriterion("\"ug _createtime\" in", values, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeNotIn(List<Date> values) {
            addCriterion("\"ug _createtime\" not in", values, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeBetween(Date value1, Date value2) {
            addCriterion("\"ug _createtime\" between", value1, value2, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("\"ug _createtime\" not between", value1, value2, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickIsNull() {
            addCriterion("\"ug _groupnick\" is null");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickIsNotNull() {
            addCriterion("\"ug _groupnick\" is not null");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickEqualTo(String value) {
            addCriterion("\"ug _groupnick\" =", value, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickNotEqualTo(String value) {
            addCriterion("\"ug _groupnick\" <>", value, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickGreaterThan(String value) {
            addCriterion("\"ug _groupnick\" >", value, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickGreaterThanOrEqualTo(String value) {
            addCriterion("\"ug _groupnick\" >=", value, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickLessThan(String value) {
            addCriterion("\"ug _groupnick\" <", value, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickLessThanOrEqualTo(String value) {
            addCriterion("\"ug _groupnick\" <=", value, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickLike(String value) {
            addCriterion("\"ug _groupnick\" like", value, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickNotLike(String value) {
            addCriterion("\"ug _groupnick\" not like", value, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickIn(List<String> values) {
            addCriterion("\"ug _groupnick\" in", values, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickNotIn(List<String> values) {
            addCriterion("\"ug _groupnick\" not in", values, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickBetween(String value1, String value2) {
            addCriterion("\"ug _groupnick\" between", value1, value2, "ugGroupnick");
            return (Criteria) this;
        }

        public Criteria andUgGroupnickNotBetween(String value1, String value2) {
            addCriterion("\"ug _groupnick\" not between", value1, value2, "ugGroupnick");
            return (Criteria) this;
        }
    }

    /**
     * im_user_groupstouser
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * im_user_groupstouser 2019-06-18
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