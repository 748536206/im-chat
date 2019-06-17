package com.instant.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImUserGroupsQuery {
    /**
     * im_user_groups
     */
    protected String orderByClause;

    /**
     * im_user_groups
     */
    protected boolean distinct;

    /**
     * im_user_groups
     */
    protected List<Criteria> oredCriteria;

    /**
     * im_user_groups
     */
    protected Integer pageNo = 1;

    /**
     * im_user_groups
     */
    protected Integer startRow;

    /**
     * im_user_groups
     */
    protected Integer pageSize = 10;

    /**
     * im_user_groups
     */
    protected String fields;

    /**
     *
     * @mbg.generated 2019-06-18
     */
    public ImUserGroupsQuery() {
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
     * im_user_groups 2019-06-18
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

        public Criteria andUgNameIsNull() {
            addCriterion("ug_name is null");
            return (Criteria) this;
        }

        public Criteria andUgNameIsNotNull() {
            addCriterion("ug_name is not null");
            return (Criteria) this;
        }

        public Criteria andUgNameEqualTo(String value) {
            addCriterion("ug_name =", value, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameNotEqualTo(String value) {
            addCriterion("ug_name <>", value, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameGreaterThan(String value) {
            addCriterion("ug_name >", value, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ug_name >=", value, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameLessThan(String value) {
            addCriterion("ug_name <", value, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameLessThanOrEqualTo(String value) {
            addCriterion("ug_name <=", value, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameLike(String value) {
            addCriterion("ug_name like", value, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameNotLike(String value) {
            addCriterion("ug_name not like", value, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameIn(List<String> values) {
            addCriterion("ug_name in", values, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameNotIn(List<String> values) {
            addCriterion("ug_name not in", values, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameBetween(String value1, String value2) {
            addCriterion("ug_name between", value1, value2, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgNameNotBetween(String value1, String value2) {
            addCriterion("ug_name not between", value1, value2, "ugName");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeIsNull() {
            addCriterion("ug_createtime is null");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeIsNotNull() {
            addCriterion("ug_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeEqualTo(Date value) {
            addCriterion("ug_createtime =", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeNotEqualTo(Date value) {
            addCriterion("ug_createtime <>", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeGreaterThan(Date value) {
            addCriterion("ug_createtime >", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ug_createtime >=", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeLessThan(Date value) {
            addCriterion("ug_createtime <", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("ug_createtime <=", value, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeIn(List<Date> values) {
            addCriterion("ug_createtime in", values, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeNotIn(List<Date> values) {
            addCriterion("ug_createtime not in", values, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeBetween(Date value1, Date value2) {
            addCriterion("ug_createtime between", value1, value2, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("ug_createtime not between", value1, value2, "ugCreatetime");
            return (Criteria) this;
        }

        public Criteria andUgAdminidIsNull() {
            addCriterion("ug_adminid is null");
            return (Criteria) this;
        }

        public Criteria andUgAdminidIsNotNull() {
            addCriterion("ug_adminid is not null");
            return (Criteria) this;
        }

        public Criteria andUgAdminidEqualTo(Integer value) {
            addCriterion("ug_adminid =", value, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgAdminidNotEqualTo(Integer value) {
            addCriterion("ug_adminid <>", value, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgAdminidGreaterThan(Integer value) {
            addCriterion("ug_adminid >", value, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ug_adminid >=", value, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgAdminidLessThan(Integer value) {
            addCriterion("ug_adminid <", value, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("ug_adminid <=", value, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgAdminidIn(List<Integer> values) {
            addCriterion("ug_adminid in", values, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgAdminidNotIn(List<Integer> values) {
            addCriterion("ug_adminid not in", values, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgAdminidBetween(Integer value1, Integer value2) {
            addCriterion("ug_adminid between", value1, value2, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("ug_adminid not between", value1, value2, "ugAdminid");
            return (Criteria) this;
        }

        public Criteria andUgIconIsNull() {
            addCriterion("ug_icon is null");
            return (Criteria) this;
        }

        public Criteria andUgIconIsNotNull() {
            addCriterion("ug_icon is not null");
            return (Criteria) this;
        }

        public Criteria andUgIconEqualTo(String value) {
            addCriterion("ug_icon =", value, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconNotEqualTo(String value) {
            addCriterion("ug_icon <>", value, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconGreaterThan(String value) {
            addCriterion("ug_icon >", value, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconGreaterThanOrEqualTo(String value) {
            addCriterion("ug_icon >=", value, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconLessThan(String value) {
            addCriterion("ug_icon <", value, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconLessThanOrEqualTo(String value) {
            addCriterion("ug_icon <=", value, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconLike(String value) {
            addCriterion("ug_icon like", value, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconNotLike(String value) {
            addCriterion("ug_icon not like", value, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconIn(List<String> values) {
            addCriterion("ug_icon in", values, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconNotIn(List<String> values) {
            addCriterion("ug_icon not in", values, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconBetween(String value1, String value2) {
            addCriterion("ug_icon between", value1, value2, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgIconNotBetween(String value1, String value2) {
            addCriterion("ug_icon not between", value1, value2, "ugIcon");
            return (Criteria) this;
        }

        public Criteria andUgNoticeIsNull() {
            addCriterion("ug_notice is null");
            return (Criteria) this;
        }

        public Criteria andUgNoticeIsNotNull() {
            addCriterion("ug_notice is not null");
            return (Criteria) this;
        }

        public Criteria andUgNoticeEqualTo(String value) {
            addCriterion("ug_notice =", value, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeNotEqualTo(String value) {
            addCriterion("ug_notice <>", value, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeGreaterThan(String value) {
            addCriterion("ug_notice >", value, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("ug_notice >=", value, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeLessThan(String value) {
            addCriterion("ug_notice <", value, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeLessThanOrEqualTo(String value) {
            addCriterion("ug_notice <=", value, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeLike(String value) {
            addCriterion("ug_notice like", value, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeNotLike(String value) {
            addCriterion("ug_notice not like", value, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeIn(List<String> values) {
            addCriterion("ug_notice in", values, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeNotIn(List<String> values) {
            addCriterion("ug_notice not in", values, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeBetween(String value1, String value2) {
            addCriterion("ug_notice between", value1, value2, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgNoticeNotBetween(String value1, String value2) {
            addCriterion("ug_notice not between", value1, value2, "ugNotice");
            return (Criteria) this;
        }

        public Criteria andUgIntroIsNull() {
            addCriterion("ug_intro is null");
            return (Criteria) this;
        }

        public Criteria andUgIntroIsNotNull() {
            addCriterion("ug_intro is not null");
            return (Criteria) this;
        }

        public Criteria andUgIntroEqualTo(String value) {
            addCriterion("ug_intro =", value, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroNotEqualTo(String value) {
            addCriterion("ug_intro <>", value, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroGreaterThan(String value) {
            addCriterion("ug_intro >", value, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroGreaterThanOrEqualTo(String value) {
            addCriterion("ug_intro >=", value, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroLessThan(String value) {
            addCriterion("ug_intro <", value, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroLessThanOrEqualTo(String value) {
            addCriterion("ug_intro <=", value, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroLike(String value) {
            addCriterion("ug_intro like", value, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroNotLike(String value) {
            addCriterion("ug_intro not like", value, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroIn(List<String> values) {
            addCriterion("ug_intro in", values, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroNotIn(List<String> values) {
            addCriterion("ug_intro not in", values, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroBetween(String value1, String value2) {
            addCriterion("ug_intro between", value1, value2, "ugIntro");
            return (Criteria) this;
        }

        public Criteria andUgIntroNotBetween(String value1, String value2) {
            addCriterion("ug_intro not between", value1, value2, "ugIntro");
            return (Criteria) this;
        }
    }

    /**
     * im_user_groups
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * im_user_groups 2019-06-18
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