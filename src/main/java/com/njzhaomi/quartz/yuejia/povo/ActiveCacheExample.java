package com.njzhaomi.quartz.yuejia.povo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ActiveCacheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActiveCacheExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTotalcntIsNull() {
            addCriterion("totalCnt is null");
            return (Criteria) this;
        }

        public Criteria andTotalcntIsNotNull() {
            addCriterion("totalCnt is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcntEqualTo(String value) {
            addCriterion("totalCnt =", value, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntNotEqualTo(String value) {
            addCriterion("totalCnt <>", value, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntGreaterThan(String value) {
            addCriterion("totalCnt >", value, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntGreaterThanOrEqualTo(String value) {
            addCriterion("totalCnt >=", value, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntLessThan(String value) {
            addCriterion("totalCnt <", value, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntLessThanOrEqualTo(String value) {
            addCriterion("totalCnt <=", value, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntLike(String value) {
            addCriterion("totalCnt like", value, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntNotLike(String value) {
            addCriterion("totalCnt not like", value, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntIn(List<String> values) {
            addCriterion("totalCnt in", values, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntNotIn(List<String> values) {
            addCriterion("totalCnt not in", values, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntBetween(String value1, String value2) {
            addCriterion("totalCnt between", value1, value2, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalcntNotBetween(String value1, String value2) {
            addCriterion("totalCnt not between", value1, value2, "totalcnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntIsNull() {
            addCriterion("totalSalesCnt is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntIsNotNull() {
            addCriterion("totalSalesCnt is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntEqualTo(String value) {
            addCriterion("totalSalesCnt =", value, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntNotEqualTo(String value) {
            addCriterion("totalSalesCnt <>", value, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntGreaterThan(String value) {
            addCriterion("totalSalesCnt >", value, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntGreaterThanOrEqualTo(String value) {
            addCriterion("totalSalesCnt >=", value, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntLessThan(String value) {
            addCriterion("totalSalesCnt <", value, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntLessThanOrEqualTo(String value) {
            addCriterion("totalSalesCnt <=", value, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntLike(String value) {
            addCriterion("totalSalesCnt like", value, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntNotLike(String value) {
            addCriterion("totalSalesCnt not like", value, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntIn(List<String> values) {
            addCriterion("totalSalesCnt in", values, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntNotIn(List<String> values) {
            addCriterion("totalSalesCnt not in", values, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntBetween(String value1, String value2) {
            addCriterion("totalSalesCnt between", value1, value2, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalescntNotBetween(String value1, String value2) {
            addCriterion("totalSalesCnt not between", value1, value2, "totalsalescnt");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("totalMoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("totalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(String value) {
            addCriterion("totalMoney =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(String value) {
            addCriterion("totalMoney <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(String value) {
            addCriterion("totalMoney >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("totalMoney >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(String value) {
            addCriterion("totalMoney <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(String value) {
            addCriterion("totalMoney <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLike(String value) {
            addCriterion("totalMoney like", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotLike(String value) {
            addCriterion("totalMoney not like", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<String> values) {
            addCriterion("totalMoney in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<String> values) {
            addCriterion("totalMoney not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(String value1, String value2) {
            addCriterion("totalMoney between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(String value1, String value2) {
            addCriterion("totalMoney not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntIsNull() {
            addCriterion("totalReadCnt is null");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntIsNotNull() {
            addCriterion("totalReadCnt is not null");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntEqualTo(String value) {
            addCriterion("totalReadCnt =", value, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntNotEqualTo(String value) {
            addCriterion("totalReadCnt <>", value, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntGreaterThan(String value) {
            addCriterion("totalReadCnt >", value, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntGreaterThanOrEqualTo(String value) {
            addCriterion("totalReadCnt >=", value, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntLessThan(String value) {
            addCriterion("totalReadCnt <", value, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntLessThanOrEqualTo(String value) {
            addCriterion("totalReadCnt <=", value, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntLike(String value) {
            addCriterion("totalReadCnt like", value, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntNotLike(String value) {
            addCriterion("totalReadCnt not like", value, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntIn(List<String> values) {
            addCriterion("totalReadCnt in", values, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntNotIn(List<String> values) {
            addCriterion("totalReadCnt not in", values, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntBetween(String value1, String value2) {
            addCriterion("totalReadCnt between", value1, value2, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalreadcntNotBetween(String value1, String value2) {
            addCriterion("totalReadCnt not between", value1, value2, "totalreadcnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntIsNull() {
            addCriterion("totalShareCnt is null");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntIsNotNull() {
            addCriterion("totalShareCnt is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntEqualTo(String value) {
            addCriterion("totalShareCnt =", value, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntNotEqualTo(String value) {
            addCriterion("totalShareCnt <>", value, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntGreaterThan(String value) {
            addCriterion("totalShareCnt >", value, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntGreaterThanOrEqualTo(String value) {
            addCriterion("totalShareCnt >=", value, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntLessThan(String value) {
            addCriterion("totalShareCnt <", value, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntLessThanOrEqualTo(String value) {
            addCriterion("totalShareCnt <=", value, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntLike(String value) {
            addCriterion("totalShareCnt like", value, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntNotLike(String value) {
            addCriterion("totalShareCnt not like", value, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntIn(List<String> values) {
            addCriterion("totalShareCnt in", values, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntNotIn(List<String> values) {
            addCriterion("totalShareCnt not in", values, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntBetween(String value1, String value2) {
            addCriterion("totalShareCnt between", value1, value2, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalsharecntNotBetween(String value1, String value2) {
            addCriterion("totalShareCnt not between", value1, value2, "totalsharecnt");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyIsNull() {
            addCriterion("totalCostMoney is null");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyIsNotNull() {
            addCriterion("totalCostMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyEqualTo(String value) {
            addCriterion("totalCostMoney =", value, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyNotEqualTo(String value) {
            addCriterion("totalCostMoney <>", value, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyGreaterThan(String value) {
            addCriterion("totalCostMoney >", value, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("totalCostMoney >=", value, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyLessThan(String value) {
            addCriterion("totalCostMoney <", value, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyLessThanOrEqualTo(String value) {
            addCriterion("totalCostMoney <=", value, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyLike(String value) {
            addCriterion("totalCostMoney like", value, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyNotLike(String value) {
            addCriterion("totalCostMoney not like", value, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyIn(List<String> values) {
            addCriterion("totalCostMoney in", values, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyNotIn(List<String> values) {
            addCriterion("totalCostMoney not in", values, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyBetween(String value1, String value2) {
            addCriterion("totalCostMoney between", value1, value2, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andTotalcostmoneyNotBetween(String value1, String value2) {
            addCriterion("totalCostMoney not between", value1, value2, "totalcostmoney");
            return (Criteria) this;
        }

        public Criteria andOrdercntIsNull() {
            addCriterion("orderCnt is null");
            return (Criteria) this;
        }

        public Criteria andOrdercntIsNotNull() {
            addCriterion("orderCnt is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercntEqualTo(String value) {
            addCriterion("orderCnt =", value, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntNotEqualTo(String value) {
            addCriterion("orderCnt <>", value, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntGreaterThan(String value) {
            addCriterion("orderCnt >", value, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntGreaterThanOrEqualTo(String value) {
            addCriterion("orderCnt >=", value, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntLessThan(String value) {
            addCriterion("orderCnt <", value, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntLessThanOrEqualTo(String value) {
            addCriterion("orderCnt <=", value, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntLike(String value) {
            addCriterion("orderCnt like", value, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntNotLike(String value) {
            addCriterion("orderCnt not like", value, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntIn(List<String> values) {
            addCriterion("orderCnt in", values, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntNotIn(List<String> values) {
            addCriterion("orderCnt not in", values, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntBetween(String value1, String value2) {
            addCriterion("orderCnt between", value1, value2, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andOrdercntNotBetween(String value1, String value2) {
            addCriterion("orderCnt not between", value1, value2, "ordercnt");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIsNull() {
            addCriterion("totalSales is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIsNotNull() {
            addCriterion("totalSales is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesEqualTo(String value) {
            addCriterion("totalSales =", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotEqualTo(String value) {
            addCriterion("totalSales <>", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesGreaterThan(String value) {
            addCriterion("totalSales >", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesGreaterThanOrEqualTo(String value) {
            addCriterion("totalSales >=", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesLessThan(String value) {
            addCriterion("totalSales <", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesLessThanOrEqualTo(String value) {
            addCriterion("totalSales <=", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesLike(String value) {
            addCriterion("totalSales like", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotLike(String value) {
            addCriterion("totalSales not like", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIn(List<String> values) {
            addCriterion("totalSales in", values, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotIn(List<String> values) {
            addCriterion("totalSales not in", values, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesBetween(String value1, String value2) {
            addCriterion("totalSales between", value1, value2, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotBetween(String value1, String value2) {
            addCriterion("totalSales not between", value1, value2, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalrebateIsNull() {
            addCriterion("totalRebate is null");
            return (Criteria) this;
        }

        public Criteria andTotalrebateIsNotNull() {
            addCriterion("totalRebate is not null");
            return (Criteria) this;
        }

        public Criteria andTotalrebateEqualTo(String value) {
            addCriterion("totalRebate =", value, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateNotEqualTo(String value) {
            addCriterion("totalRebate <>", value, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateGreaterThan(String value) {
            addCriterion("totalRebate >", value, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateGreaterThanOrEqualTo(String value) {
            addCriterion("totalRebate >=", value, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateLessThan(String value) {
            addCriterion("totalRebate <", value, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateLessThanOrEqualTo(String value) {
            addCriterion("totalRebate <=", value, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateLike(String value) {
            addCriterion("totalRebate like", value, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateNotLike(String value) {
            addCriterion("totalRebate not like", value, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateIn(List<String> values) {
            addCriterion("totalRebate in", values, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateNotIn(List<String> values) {
            addCriterion("totalRebate not in", values, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateBetween(String value1, String value2) {
            addCriterion("totalRebate between", value1, value2, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andTotalrebateNotBetween(String value1, String value2) {
            addCriterion("totalRebate not between", value1, value2, "totalrebate");
            return (Criteria) this;
        }

        public Criteria andDynumIsNull() {
            addCriterion("dyNum is null");
            return (Criteria) this;
        }

        public Criteria andDynumIsNotNull() {
            addCriterion("dyNum is not null");
            return (Criteria) this;
        }

        public Criteria andDynumEqualTo(String value) {
            addCriterion("dyNum =", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumNotEqualTo(String value) {
            addCriterion("dyNum <>", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumGreaterThan(String value) {
            addCriterion("dyNum >", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumGreaterThanOrEqualTo(String value) {
            addCriterion("dyNum >=", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumLessThan(String value) {
            addCriterion("dyNum <", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumLessThanOrEqualTo(String value) {
            addCriterion("dyNum <=", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumLike(String value) {
            addCriterion("dyNum like", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumNotLike(String value) {
            addCriterion("dyNum not like", value, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumIn(List<String> values) {
            addCriterion("dyNum in", values, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumNotIn(List<String> values) {
            addCriterion("dyNum not in", values, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumBetween(String value1, String value2) {
            addCriterion("dyNum between", value1, value2, "dynum");
            return (Criteria) this;
        }

        public Criteria andDynumNotBetween(String value1, String value2) {
            addCriterion("dyNum not between", value1, value2, "dynum");
            return (Criteria) this;
        }

        public Criteria andTotalvipsIsNull() {
            addCriterion("totalVips is null");
            return (Criteria) this;
        }

        public Criteria andTotalvipsIsNotNull() {
            addCriterion("totalVips is not null");
            return (Criteria) this;
        }

        public Criteria andTotalvipsEqualTo(String value) {
            addCriterion("totalVips =", value, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsNotEqualTo(String value) {
            addCriterion("totalVips <>", value, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsGreaterThan(String value) {
            addCriterion("totalVips >", value, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsGreaterThanOrEqualTo(String value) {
            addCriterion("totalVips >=", value, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsLessThan(String value) {
            addCriterion("totalVips <", value, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsLessThanOrEqualTo(String value) {
            addCriterion("totalVips <=", value, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsLike(String value) {
            addCriterion("totalVips like", value, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsNotLike(String value) {
            addCriterion("totalVips not like", value, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsIn(List<String> values) {
            addCriterion("totalVips in", values, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsNotIn(List<String> values) {
            addCriterion("totalVips not in", values, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsBetween(String value1, String value2) {
            addCriterion("totalVips between", value1, value2, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsNotBetween(String value1, String value2) {
            addCriterion("totalVips not between", value1, value2, "totalvips");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesIsNull() {
            addCriterion("totalVipSales is null");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesIsNotNull() {
            addCriterion("totalVipSales is not null");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesEqualTo(String value) {
            addCriterion("totalVipSales =", value, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesNotEqualTo(String value) {
            addCriterion("totalVipSales <>", value, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesGreaterThan(String value) {
            addCriterion("totalVipSales >", value, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesGreaterThanOrEqualTo(String value) {
            addCriterion("totalVipSales >=", value, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesLessThan(String value) {
            addCriterion("totalVipSales <", value, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesLessThanOrEqualTo(String value) {
            addCriterion("totalVipSales <=", value, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesLike(String value) {
            addCriterion("totalVipSales like", value, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesNotLike(String value) {
            addCriterion("totalVipSales not like", value, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesIn(List<String> values) {
            addCriterion("totalVipSales in", values, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesNotIn(List<String> values) {
            addCriterion("totalVipSales not in", values, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesBetween(String value1, String value2) {
            addCriterion("totalVipSales between", value1, value2, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andTotalvipsalesNotBetween(String value1, String value2) {
            addCriterion("totalVipSales not between", value1, value2, "totalvipsales");
            return (Criteria) this;
        }

        public Criteria andAllmoneyIsNull() {
            addCriterion("allMoney is null");
            return (Criteria) this;
        }

        public Criteria andAllmoneyIsNotNull() {
            addCriterion("allMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAllmoneyEqualTo(String value) {
            addCriterion("allMoney =", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotEqualTo(String value) {
            addCriterion("allMoney <>", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyGreaterThan(String value) {
            addCriterion("allMoney >", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("allMoney >=", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyLessThan(String value) {
            addCriterion("allMoney <", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyLessThanOrEqualTo(String value) {
            addCriterion("allMoney <=", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyLike(String value) {
            addCriterion("allMoney like", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotLike(String value) {
            addCriterion("allMoney not like", value, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyIn(List<String> values) {
            addCriterion("allMoney in", values, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotIn(List<String> values) {
            addCriterion("allMoney not in", values, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyBetween(String value1, String value2) {
            addCriterion("allMoney between", value1, value2, "allmoney");
            return (Criteria) this;
        }

        public Criteria andAllmoneyNotBetween(String value1, String value2) {
            addCriterion("allMoney not between", value1, value2, "allmoney");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalIsNull() {
            addCriterion("totalWithdrawal is null");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalIsNotNull() {
            addCriterion("totalWithdrawal is not null");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalEqualTo(String value) {
            addCriterion("totalWithdrawal =", value, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalNotEqualTo(String value) {
            addCriterion("totalWithdrawal <>", value, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalGreaterThan(String value) {
            addCriterion("totalWithdrawal >", value, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalGreaterThanOrEqualTo(String value) {
            addCriterion("totalWithdrawal >=", value, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalLessThan(String value) {
            addCriterion("totalWithdrawal <", value, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalLessThanOrEqualTo(String value) {
            addCriterion("totalWithdrawal <=", value, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalLike(String value) {
            addCriterion("totalWithdrawal like", value, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalNotLike(String value) {
            addCriterion("totalWithdrawal not like", value, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalIn(List<String> values) {
            addCriterion("totalWithdrawal in", values, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalNotIn(List<String> values) {
            addCriterion("totalWithdrawal not in", values, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalBetween(String value1, String value2) {
            addCriterion("totalWithdrawal between", value1, value2, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalwithdrawalNotBetween(String value1, String value2) {
            addCriterion("totalWithdrawal not between", value1, value2, "totalwithdrawal");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountIsNull() {
            addCriterion("totalEmployeeCount is null");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountIsNotNull() {
            addCriterion("totalEmployeeCount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountEqualTo(String value) {
            addCriterion("totalEmployeeCount =", value, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountNotEqualTo(String value) {
            addCriterion("totalEmployeeCount <>", value, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountGreaterThan(String value) {
            addCriterion("totalEmployeeCount >", value, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountGreaterThanOrEqualTo(String value) {
            addCriterion("totalEmployeeCount >=", value, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountLessThan(String value) {
            addCriterion("totalEmployeeCount <", value, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountLessThanOrEqualTo(String value) {
            addCriterion("totalEmployeeCount <=", value, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountLike(String value) {
            addCriterion("totalEmployeeCount like", value, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountNotLike(String value) {
            addCriterion("totalEmployeeCount not like", value, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountIn(List<String> values) {
            addCriterion("totalEmployeeCount in", values, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountNotIn(List<String> values) {
            addCriterion("totalEmployeeCount not in", values, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountBetween(String value1, String value2) {
            addCriterion("totalEmployeeCount between", value1, value2, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalemployeecountNotBetween(String value1, String value2) {
            addCriterion("totalEmployeeCount not between", value1, value2, "totalemployeecount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountIsNull() {
            addCriterion("totalUserCount is null");
            return (Criteria) this;
        }

        public Criteria andTotalusercountIsNotNull() {
            addCriterion("totalUserCount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalusercountEqualTo(String value) {
            addCriterion("totalUserCount =", value, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountNotEqualTo(String value) {
            addCriterion("totalUserCount <>", value, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountGreaterThan(String value) {
            addCriterion("totalUserCount >", value, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountGreaterThanOrEqualTo(String value) {
            addCriterion("totalUserCount >=", value, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountLessThan(String value) {
            addCriterion("totalUserCount <", value, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountLessThanOrEqualTo(String value) {
            addCriterion("totalUserCount <=", value, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountLike(String value) {
            addCriterion("totalUserCount like", value, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountNotLike(String value) {
            addCriterion("totalUserCount not like", value, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountIn(List<String> values) {
            addCriterion("totalUserCount in", values, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountNotIn(List<String> values) {
            addCriterion("totalUserCount not in", values, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountBetween(String value1, String value2) {
            addCriterion("totalUserCount between", value1, value2, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalusercountNotBetween(String value1, String value2) {
            addCriterion("totalUserCount not between", value1, value2, "totalusercount");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipIsNull() {
            addCriterion("totalFirstMembership is null");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipIsNotNull() {
            addCriterion("totalFirstMembership is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipEqualTo(String value) {
            addCriterion("totalFirstMembership =", value, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipNotEqualTo(String value) {
            addCriterion("totalFirstMembership <>", value, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipGreaterThan(String value) {
            addCriterion("totalFirstMembership >", value, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipGreaterThanOrEqualTo(String value) {
            addCriterion("totalFirstMembership >=", value, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipLessThan(String value) {
            addCriterion("totalFirstMembership <", value, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipLessThanOrEqualTo(String value) {
            addCriterion("totalFirstMembership <=", value, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipLike(String value) {
            addCriterion("totalFirstMembership like", value, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipNotLike(String value) {
            addCriterion("totalFirstMembership not like", value, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipIn(List<String> values) {
            addCriterion("totalFirstMembership in", values, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipNotIn(List<String> values) {
            addCriterion("totalFirstMembership not in", values, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipBetween(String value1, String value2) {
            addCriterion("totalFirstMembership between", value1, value2, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalfirstmembershipNotBetween(String value1, String value2) {
            addCriterion("totalFirstMembership not between", value1, value2, "totalfirstmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipIsNull() {
            addCriterion("totalSecondMembership is null");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipIsNotNull() {
            addCriterion("totalSecondMembership is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipEqualTo(String value) {
            addCriterion("totalSecondMembership =", value, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipNotEqualTo(String value) {
            addCriterion("totalSecondMembership <>", value, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipGreaterThan(String value) {
            addCriterion("totalSecondMembership >", value, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipGreaterThanOrEqualTo(String value) {
            addCriterion("totalSecondMembership >=", value, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipLessThan(String value) {
            addCriterion("totalSecondMembership <", value, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipLessThanOrEqualTo(String value) {
            addCriterion("totalSecondMembership <=", value, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipLike(String value) {
            addCriterion("totalSecondMembership like", value, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipNotLike(String value) {
            addCriterion("totalSecondMembership not like", value, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipIn(List<String> values) {
            addCriterion("totalSecondMembership in", values, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipNotIn(List<String> values) {
            addCriterion("totalSecondMembership not in", values, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipBetween(String value1, String value2) {
            addCriterion("totalSecondMembership between", value1, value2, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andTotalsecondmembershipNotBetween(String value1, String value2) {
            addCriterion("totalSecondMembership not between", value1, value2, "totalsecondmembership");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumIsNull() {
            addCriterion("representSaleNum is null");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumIsNotNull() {
            addCriterion("representSaleNum is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumEqualTo(String value) {
            addCriterion("representSaleNum =", value, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumNotEqualTo(String value) {
            addCriterion("representSaleNum <>", value, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumGreaterThan(String value) {
            addCriterion("representSaleNum >", value, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumGreaterThanOrEqualTo(String value) {
            addCriterion("representSaleNum >=", value, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumLessThan(String value) {
            addCriterion("representSaleNum <", value, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumLessThanOrEqualTo(String value) {
            addCriterion("representSaleNum <=", value, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumLike(String value) {
            addCriterion("representSaleNum like", value, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumNotLike(String value) {
            addCriterion("representSaleNum not like", value, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumIn(List<String> values) {
            addCriterion("representSaleNum in", values, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumNotIn(List<String> values) {
            addCriterion("representSaleNum not in", values, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumBetween(String value1, String value2) {
            addCriterion("representSaleNum between", value1, value2, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andRepresentsalenumNotBetween(String value1, String value2) {
            addCriterion("representSaleNum not between", value1, value2, "representsalenum");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersIsNull() {
            addCriterion("totalBuyers is null");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersIsNotNull() {
            addCriterion("totalBuyers is not null");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersEqualTo(String value) {
            addCriterion("totalBuyers =", value, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersNotEqualTo(String value) {
            addCriterion("totalBuyers <>", value, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersGreaterThan(String value) {
            addCriterion("totalBuyers >", value, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersGreaterThanOrEqualTo(String value) {
            addCriterion("totalBuyers >=", value, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersLessThan(String value) {
            addCriterion("totalBuyers <", value, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersLessThanOrEqualTo(String value) {
            addCriterion("totalBuyers <=", value, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersLike(String value) {
            addCriterion("totalBuyers like", value, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersNotLike(String value) {
            addCriterion("totalBuyers not like", value, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersIn(List<String> values) {
            addCriterion("totalBuyers in", values, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersNotIn(List<String> values) {
            addCriterion("totalBuyers not in", values, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersBetween(String value1, String value2) {
            addCriterion("totalBuyers between", value1, value2, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andTotalbuyersNotBetween(String value1, String value2) {
            addCriterion("totalBuyers not between", value1, value2, "totalbuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersIsNull() {
            addCriterion("oneBuyers is null");
            return (Criteria) this;
        }

        public Criteria andOnebuyersIsNotNull() {
            addCriterion("oneBuyers is not null");
            return (Criteria) this;
        }

        public Criteria andOnebuyersEqualTo(String value) {
            addCriterion("oneBuyers =", value, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersNotEqualTo(String value) {
            addCriterion("oneBuyers <>", value, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersGreaterThan(String value) {
            addCriterion("oneBuyers >", value, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersGreaterThanOrEqualTo(String value) {
            addCriterion("oneBuyers >=", value, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersLessThan(String value) {
            addCriterion("oneBuyers <", value, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersLessThanOrEqualTo(String value) {
            addCriterion("oneBuyers <=", value, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersLike(String value) {
            addCriterion("oneBuyers like", value, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersNotLike(String value) {
            addCriterion("oneBuyers not like", value, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersIn(List<String> values) {
            addCriterion("oneBuyers in", values, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersNotIn(List<String> values) {
            addCriterion("oneBuyers not in", values, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersBetween(String value1, String value2) {
            addCriterion("oneBuyers between", value1, value2, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andOnebuyersNotBetween(String value1, String value2) {
            addCriterion("oneBuyers not between", value1, value2, "onebuyers");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesIsNull() {
            addCriterion("employeeSales is null");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesIsNotNull() {
            addCriterion("employeeSales is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesEqualTo(String value) {
            addCriterion("employeeSales =", value, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesNotEqualTo(String value) {
            addCriterion("employeeSales <>", value, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesGreaterThan(String value) {
            addCriterion("employeeSales >", value, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesGreaterThanOrEqualTo(String value) {
            addCriterion("employeeSales >=", value, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesLessThan(String value) {
            addCriterion("employeeSales <", value, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesLessThanOrEqualTo(String value) {
            addCriterion("employeeSales <=", value, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesLike(String value) {
            addCriterion("employeeSales like", value, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesNotLike(String value) {
            addCriterion("employeeSales not like", value, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesIn(List<String> values) {
            addCriterion("employeeSales in", values, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesNotIn(List<String> values) {
            addCriterion("employeeSales not in", values, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesBetween(String value1, String value2) {
            addCriterion("employeeSales between", value1, value2, "employeesales");
            return (Criteria) this;
        }

        public Criteria andEmployeesalesNotBetween(String value1, String value2) {
            addCriterion("employeeSales not between", value1, value2, "employeesales");
            return (Criteria) this;
        }

        public Criteria andProductbrowseIsNull() {
            addCriterion("productBrowse is null");
            return (Criteria) this;
        }

        public Criteria andProductbrowseIsNotNull() {
            addCriterion("productBrowse is not null");
            return (Criteria) this;
        }

        public Criteria andProductbrowseEqualTo(String value) {
            addCriterion("productBrowse =", value, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseNotEqualTo(String value) {
            addCriterion("productBrowse <>", value, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseGreaterThan(String value) {
            addCriterion("productBrowse >", value, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseGreaterThanOrEqualTo(String value) {
            addCriterion("productBrowse >=", value, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseLessThan(String value) {
            addCriterion("productBrowse <", value, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseLessThanOrEqualTo(String value) {
            addCriterion("productBrowse <=", value, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseLike(String value) {
            addCriterion("productBrowse like", value, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseNotLike(String value) {
            addCriterion("productBrowse not like", value, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseIn(List<String> values) {
            addCriterion("productBrowse in", values, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseNotIn(List<String> values) {
            addCriterion("productBrowse not in", values, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseBetween(String value1, String value2) {
            addCriterion("productBrowse between", value1, value2, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andProductbrowseNotBetween(String value1, String value2) {
            addCriterion("productBrowse not between", value1, value2, "productbrowse");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("startTime not between", value1, value2, "starttime");
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