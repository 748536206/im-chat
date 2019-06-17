package com.instant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImMessagesQuery {
    /**
     * im_messages
     */
    protected String orderByClause;

    /**
     * im_messages
     */
    protected boolean distinct;

    /**
     * im_messages
     */
    protected List<Criteria> oredCriteria;

    /**
     * im_messages
     */
    protected Integer pageNo = 1;

    /**
     * im_messages
     */
    protected Integer startRow;

    /**
     * im_messages
     */
    protected Integer pageSize = 10;

    /**
     * im_messages
     */
    protected String fields;

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public ImMessagesQuery() {
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
     * im_messages 2019-06-17
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesIsNull() {
            addCriterion("m_postmessages is null");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesIsNotNull() {
            addCriterion("m_postmessages is not null");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesEqualTo(String value) {
            addCriterion("m_postmessages =", value, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesNotEqualTo(String value) {
            addCriterion("m_postmessages <>", value, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesGreaterThan(String value) {
            addCriterion("m_postmessages >", value, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesGreaterThanOrEqualTo(String value) {
            addCriterion("m_postmessages >=", value, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesLessThan(String value) {
            addCriterion("m_postmessages <", value, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesLessThanOrEqualTo(String value) {
            addCriterion("m_postmessages <=", value, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesLike(String value) {
            addCriterion("m_postmessages like", value, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesNotLike(String value) {
            addCriterion("m_postmessages not like", value, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesIn(List<String> values) {
            addCriterion("m_postmessages in", values, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesNotIn(List<String> values) {
            addCriterion("m_postmessages not in", values, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesBetween(String value1, String value2) {
            addCriterion("m_postmessages between", value1, value2, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMPostmessagesNotBetween(String value1, String value2) {
            addCriterion("m_postmessages not between", value1, value2, "mPostmessages");
            return (Criteria) this;
        }

        public Criteria andMStatusIsNull() {
            addCriterion("m_status is null");
            return (Criteria) this;
        }

        public Criteria andMStatusIsNotNull() {
            addCriterion("m_status is not null");
            return (Criteria) this;
        }

        public Criteria andMStatusEqualTo(String value) {
            addCriterion("m_status =", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotEqualTo(String value) {
            addCriterion("m_status <>", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusGreaterThan(String value) {
            addCriterion("m_status >", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusGreaterThanOrEqualTo(String value) {
            addCriterion("m_status >=", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusLessThan(String value) {
            addCriterion("m_status <", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusLessThanOrEqualTo(String value) {
            addCriterion("m_status <=", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusLike(String value) {
            addCriterion("m_status like", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotLike(String value) {
            addCriterion("m_status not like", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusIn(List<String> values) {
            addCriterion("m_status in", values, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotIn(List<String> values) {
            addCriterion("m_status not in", values, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusBetween(String value1, String value2) {
            addCriterion("m_status between", value1, value2, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotBetween(String value1, String value2) {
            addCriterion("m_status not between", value1, value2, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("m_time is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("m_time is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(Date value) {
            addCriterion("m_time =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(Date value) {
            addCriterion("m_time <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(Date value) {
            addCriterion("m_time >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("m_time >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(Date value) {
            addCriterion("m_time <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(Date value) {
            addCriterion("m_time <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<Date> values) {
            addCriterion("m_time in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<Date> values) {
            addCriterion("m_time not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(Date value1, Date value2) {
            addCriterion("m_time between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(Date value1, Date value2) {
            addCriterion("m_time not between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidIsNull() {
            addCriterion("m_messagestypeid is null");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidIsNotNull() {
            addCriterion("m_messagestypeid is not null");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidEqualTo(Integer value) {
            addCriterion("m_messagestypeid =", value, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidNotEqualTo(Integer value) {
            addCriterion("m_messagestypeid <>", value, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidGreaterThan(Integer value) {
            addCriterion("m_messagestypeid >", value, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_messagestypeid >=", value, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidLessThan(Integer value) {
            addCriterion("m_messagestypeid <", value, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidLessThanOrEqualTo(Integer value) {
            addCriterion("m_messagestypeid <=", value, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidIn(List<Integer> values) {
            addCriterion("m_messagestypeid in", values, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidNotIn(List<Integer> values) {
            addCriterion("m_messagestypeid not in", values, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidBetween(Integer value1, Integer value2) {
            addCriterion("m_messagestypeid between", value1, value2, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMMessagestypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("m_messagestypeid not between", value1, value2, "mMessagestypeid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridIsNull() {
            addCriterion("\"m_ fromuserid\" is null");
            return (Criteria) this;
        }

        public Criteria andMFromuseridIsNotNull() {
            addCriterion("\"m_ fromuserid\" is not null");
            return (Criteria) this;
        }

        public Criteria andMFromuseridEqualTo(Integer value) {
            addCriterion("\"m_ fromuserid\" =", value, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridNotEqualTo(Integer value) {
            addCriterion("\"m_ fromuserid\" <>", value, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridGreaterThan(Integer value) {
            addCriterion("\"m_ fromuserid\" >", value, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("\"m_ fromuserid\" >=", value, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridLessThan(Integer value) {
            addCriterion("\"m_ fromuserid\" <", value, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridLessThanOrEqualTo(Integer value) {
            addCriterion("\"m_ fromuserid\" <=", value, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridIn(List<Integer> values) {
            addCriterion("\"m_ fromuserid\" in", values, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridNotIn(List<Integer> values) {
            addCriterion("\"m_ fromuserid\" not in", values, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridBetween(Integer value1, Integer value2) {
            addCriterion("\"m_ fromuserid\" between", value1, value2, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMFromuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("\"m_ fromuserid\" not between", value1, value2, "mFromuserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridIsNull() {
            addCriterion("m_touserid is null");
            return (Criteria) this;
        }

        public Criteria andMTouseridIsNotNull() {
            addCriterion("m_touserid is not null");
            return (Criteria) this;
        }

        public Criteria andMTouseridEqualTo(Integer value) {
            addCriterion("m_touserid =", value, "mTouserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridNotEqualTo(Integer value) {
            addCriterion("m_touserid <>", value, "mTouserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridGreaterThan(Integer value) {
            addCriterion("m_touserid >", value, "mTouserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_touserid >=", value, "mTouserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridLessThan(Integer value) {
            addCriterion("m_touserid <", value, "mTouserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridLessThanOrEqualTo(Integer value) {
            addCriterion("m_touserid <=", value, "mTouserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridIn(List<Integer> values) {
            addCriterion("m_touserid in", values, "mTouserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridNotIn(List<Integer> values) {
            addCriterion("m_touserid not in", values, "mTouserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridBetween(Integer value1, Integer value2) {
            addCriterion("m_touserid between", value1, value2, "mTouserid");
            return (Criteria) this;
        }

        public Criteria andMTouseridNotBetween(Integer value1, Integer value2) {
            addCriterion("m_touserid not between", value1, value2, "mTouserid");
            return (Criteria) this;
        }
    }

    /**
     * im_messages
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * im_messages 2019-06-17
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