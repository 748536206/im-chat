package com.instant.entity;

import java.util.ArrayList;
import java.util.List;

public class ImFriendsQuery {
    /**
     * im_friends
     */
    protected String orderByClause;

    /**
     * im_friends
     */
    protected boolean distinct;

    /**
     * im_friends
     */
    protected List<Criteria> oredCriteria;

    /**
     * im_friends
     */
    protected Integer pageNo = 1;

    /**
     * im_friends
     */
    protected Integer startRow;

    /**
     * im_friends
     */
    protected Integer pageSize = 10;

    /**
     * im_friends
     */
    protected String fields;

    /**
     *
     * @mbg.generated 2019-06-17
     */
    public ImFriendsQuery() {
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
     * im_friends 2019-06-17
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFFirendidIsNull() {
            addCriterion("f_firendid is null");
            return (Criteria) this;
        }

        public Criteria andFFirendidIsNotNull() {
            addCriterion("f_firendid is not null");
            return (Criteria) this;
        }

        public Criteria andFFirendidEqualTo(Integer value) {
            addCriterion("f_firendid =", value, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFFirendidNotEqualTo(Integer value) {
            addCriterion("f_firendid <>", value, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFFirendidGreaterThan(Integer value) {
            addCriterion("f_firendid >", value, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFFirendidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_firendid >=", value, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFFirendidLessThan(Integer value) {
            addCriterion("f_firendid <", value, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFFirendidLessThanOrEqualTo(Integer value) {
            addCriterion("f_firendid <=", value, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFFirendidIn(List<Integer> values) {
            addCriterion("f_firendid in", values, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFFirendidNotIn(List<Integer> values) {
            addCriterion("f_firendid not in", values, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFFirendidBetween(Integer value1, Integer value2) {
            addCriterion("f_firendid between", value1, value2, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFFirendidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_firendid not between", value1, value2, "fFirendid");
            return (Criteria) this;
        }

        public Criteria andFUseridIsNull() {
            addCriterion("f_userid is null");
            return (Criteria) this;
        }

        public Criteria andFUseridIsNotNull() {
            addCriterion("f_userid is not null");
            return (Criteria) this;
        }

        public Criteria andFUseridEqualTo(Integer value) {
            addCriterion("f_userid =", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotEqualTo(Integer value) {
            addCriterion("f_userid <>", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThan(Integer value) {
            addCriterion("f_userid >", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_userid >=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThan(Integer value) {
            addCriterion("f_userid <", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridLessThanOrEqualTo(Integer value) {
            addCriterion("f_userid <=", value, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridIn(List<Integer> values) {
            addCriterion("f_userid in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotIn(List<Integer> values) {
            addCriterion("f_userid not in", values, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridBetween(Integer value1, Integer value2) {
            addCriterion("f_userid between", value1, value2, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("f_userid not between", value1, value2, "fUserid");
            return (Criteria) this;
        }

        public Criteria andFNameIsNull() {
            addCriterion("f_name is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("f_name is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("f_name =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("f_name <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("f_name >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_name >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("f_name <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("f_name <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("f_name like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("f_name not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("f_name in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("f_name not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("f_name between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("f_name not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidIsNull() {
            addCriterion("f_friendtypeid is null");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidIsNotNull() {
            addCriterion("f_friendtypeid is not null");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidEqualTo(Integer value) {
            addCriterion("f_friendtypeid =", value, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidNotEqualTo(Integer value) {
            addCriterion("f_friendtypeid <>", value, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidGreaterThan(Integer value) {
            addCriterion("f_friendtypeid >", value, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_friendtypeid >=", value, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidLessThan(Integer value) {
            addCriterion("f_friendtypeid <", value, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("f_friendtypeid <=", value, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidIn(List<Integer> values) {
            addCriterion("f_friendtypeid in", values, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidNotIn(List<Integer> values) {
            addCriterion("f_friendtypeid not in", values, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidBetween(Integer value1, Integer value2) {
            addCriterion("f_friendtypeid between", value1, value2, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_friendtypeid not between", value1, value2, "fFriendtypeid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidIsNull() {
            addCriterion("f_friendgroupsid is null");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidIsNotNull() {
            addCriterion("f_friendgroupsid is not null");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidEqualTo(Integer value) {
            addCriterion("f_friendgroupsid =", value, "fFriendgroupsid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidNotEqualTo(Integer value) {
            addCriterion("f_friendgroupsid <>", value, "fFriendgroupsid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidGreaterThan(Integer value) {
            addCriterion("f_friendgroupsid >", value, "fFriendgroupsid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_friendgroupsid >=", value, "fFriendgroupsid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidLessThan(Integer value) {
            addCriterion("f_friendgroupsid <", value, "fFriendgroupsid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidLessThanOrEqualTo(Integer value) {
            addCriterion("f_friendgroupsid <=", value, "fFriendgroupsid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidIn(List<Integer> values) {
            addCriterion("f_friendgroupsid in", values, "fFriendgroupsid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidNotIn(List<Integer> values) {
            addCriterion("f_friendgroupsid not in", values, "fFriendgroupsid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidBetween(Integer value1, Integer value2) {
            addCriterion("f_friendgroupsid between", value1, value2, "fFriendgroupsid");
            return (Criteria) this;
        }

        public Criteria andFFriendgroupsidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_friendgroupsid not between", value1, value2, "fFriendgroupsid");
            return (Criteria) this;
        }
    }

    /**
     * im_friends
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * im_friends 2019-06-17
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