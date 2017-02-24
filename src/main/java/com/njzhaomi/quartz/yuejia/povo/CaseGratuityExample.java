package com.njzhaomi.quartz.yuejia.povo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaseGratuityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseGratuityExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyIsNull() {
            addCriterion("author_money is null");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyIsNotNull() {
            addCriterion("author_money is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyEqualTo(Integer value) {
            addCriterion("author_money =", value, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyNotEqualTo(Integer value) {
            addCriterion("author_money <>", value, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyGreaterThan(Integer value) {
            addCriterion("author_money >", value, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_money >=", value, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyLessThan(Integer value) {
            addCriterion("author_money <", value, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("author_money <=", value, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyIn(List<Integer> values) {
            addCriterion("author_money in", values, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyNotIn(List<Integer> values) {
            addCriterion("author_money not in", values, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyBetween(Integer value1, Integer value2) {
            addCriterion("author_money between", value1, value2, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("author_money not between", value1, value2, "authorMoney");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidIsNull() {
            addCriterion("author_openid is null");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidIsNotNull() {
            addCriterion("author_openid is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidEqualTo(String value) {
            addCriterion("author_openid =", value, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidNotEqualTo(String value) {
            addCriterion("author_openid <>", value, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidGreaterThan(String value) {
            addCriterion("author_openid >", value, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("author_openid >=", value, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidLessThan(String value) {
            addCriterion("author_openid <", value, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidLessThanOrEqualTo(String value) {
            addCriterion("author_openid <=", value, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidLike(String value) {
            addCriterion("author_openid like", value, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidNotLike(String value) {
            addCriterion("author_openid not like", value, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidIn(List<String> values) {
            addCriterion("author_openid in", values, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidNotIn(List<String> values) {
            addCriterion("author_openid not in", values, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidBetween(String value1, String value2) {
            addCriterion("author_openid between", value1, value2, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andAuthorOpenidNotBetween(String value1, String value2) {
            addCriterion("author_openid not between", value1, value2, "authorOpenid");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Integer value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Integer value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Integer value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Integer value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Integer> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Integer> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Integer value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Integer value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Integer value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Integer value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Integer> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Integer> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Integer value1, Integer value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidIsNull() {
            addCriterion("payer_openid is null");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidIsNotNull() {
            addCriterion("payer_openid is not null");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidEqualTo(String value) {
            addCriterion("payer_openid =", value, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidNotEqualTo(String value) {
            addCriterion("payer_openid <>", value, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidGreaterThan(String value) {
            addCriterion("payer_openid >", value, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("payer_openid >=", value, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidLessThan(String value) {
            addCriterion("payer_openid <", value, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidLessThanOrEqualTo(String value) {
            addCriterion("payer_openid <=", value, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidLike(String value) {
            addCriterion("payer_openid like", value, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidNotLike(String value) {
            addCriterion("payer_openid not like", value, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidIn(List<String> values) {
            addCriterion("payer_openid in", values, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidNotIn(List<String> values) {
            addCriterion("payer_openid not in", values, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidBetween(String value1, String value2) {
            addCriterion("payer_openid between", value1, value2, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andPayerOpenidNotBetween(String value1, String value2) {
            addCriterion("payer_openid not between", value1, value2, "payerOpenid");
            return (Criteria) this;
        }

        public Criteria andShareMoneyIsNull() {
            addCriterion("share_money is null");
            return (Criteria) this;
        }

        public Criteria andShareMoneyIsNotNull() {
            addCriterion("share_money is not null");
            return (Criteria) this;
        }

        public Criteria andShareMoneyEqualTo(Integer value) {
            addCriterion("share_money =", value, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareMoneyNotEqualTo(Integer value) {
            addCriterion("share_money <>", value, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareMoneyGreaterThan(Integer value) {
            addCriterion("share_money >", value, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareMoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("share_money >=", value, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareMoneyLessThan(Integer value) {
            addCriterion("share_money <", value, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareMoneyLessThanOrEqualTo(Integer value) {
            addCriterion("share_money <=", value, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareMoneyIn(List<Integer> values) {
            addCriterion("share_money in", values, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareMoneyNotIn(List<Integer> values) {
            addCriterion("share_money not in", values, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareMoneyBetween(Integer value1, Integer value2) {
            addCriterion("share_money between", value1, value2, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareMoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("share_money not between", value1, value2, "shareMoney");
            return (Criteria) this;
        }

        public Criteria andShareOpenidIsNull() {
            addCriterion("share_openid is null");
            return (Criteria) this;
        }

        public Criteria andShareOpenidIsNotNull() {
            addCriterion("share_openid is not null");
            return (Criteria) this;
        }

        public Criteria andShareOpenidEqualTo(String value) {
            addCriterion("share_openid =", value, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidNotEqualTo(String value) {
            addCriterion("share_openid <>", value, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidGreaterThan(String value) {
            addCriterion("share_openid >", value, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("share_openid >=", value, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidLessThan(String value) {
            addCriterion("share_openid <", value, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidLessThanOrEqualTo(String value) {
            addCriterion("share_openid <=", value, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidLike(String value) {
            addCriterion("share_openid like", value, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidNotLike(String value) {
            addCriterion("share_openid not like", value, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidIn(List<String> values) {
            addCriterion("share_openid in", values, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidNotIn(List<String> values) {
            addCriterion("share_openid not in", values, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidBetween(String value1, String value2) {
            addCriterion("share_openid between", value1, value2, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andShareOpenidNotBetween(String value1, String value2) {
            addCriterion("share_openid not between", value1, value2, "shareOpenid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNull() {
            addCriterion("from_type is null");
            return (Criteria) this;
        }

        public Criteria andFromTypeIsNotNull() {
            addCriterion("from_type is not null");
            return (Criteria) this;
        }

        public Criteria andFromTypeEqualTo(Integer value) {
            addCriterion("from_type =", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotEqualTo(Integer value) {
            addCriterion("from_type <>", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThan(Integer value) {
            addCriterion("from_type >", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_type >=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThan(Integer value) {
            addCriterion("from_type <", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeLessThanOrEqualTo(Integer value) {
            addCriterion("from_type <=", value, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeIn(List<Integer> values) {
            addCriterion("from_type in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotIn(List<Integer> values) {
            addCriterion("from_type not in", values, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeBetween(Integer value1, Integer value2) {
            addCriterion("from_type between", value1, value2, "fromType");
            return (Criteria) this;
        }

        public Criteria andFromTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("from_type not between", value1, value2, "fromType");
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