package com.njzhaomi.quartz.yuejia.povo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andLogoPicIsNull() {
            addCriterion("logo_pic is null");
            return (Criteria) this;
        }

        public Criteria andLogoPicIsNotNull() {
            addCriterion("logo_pic is not null");
            return (Criteria) this;
        }

        public Criteria andLogoPicEqualTo(String value) {
            addCriterion("logo_pic =", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicNotEqualTo(String value) {
            addCriterion("logo_pic <>", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicGreaterThan(String value) {
            addCriterion("logo_pic >", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicGreaterThanOrEqualTo(String value) {
            addCriterion("logo_pic >=", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicLessThan(String value) {
            addCriterion("logo_pic <", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicLessThanOrEqualTo(String value) {
            addCriterion("logo_pic <=", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicLike(String value) {
            addCriterion("logo_pic like", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicNotLike(String value) {
            addCriterion("logo_pic not like", value, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicIn(List<String> values) {
            addCriterion("logo_pic in", values, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicNotIn(List<String> values) {
            addCriterion("logo_pic not in", values, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicBetween(String value1, String value2) {
            addCriterion("logo_pic between", value1, value2, "logoPic");
            return (Criteria) this;
        }

        public Criteria andLogoPicNotBetween(String value1, String value2) {
            addCriterion("logo_pic not between", value1, value2, "logoPic");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaid is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaid is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("areaid =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("areaid <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("areaid >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaid >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("areaid <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("areaid <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("areaid in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("areaid not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("areaid between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("areaid not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCasepositionIsNull() {
            addCriterion("caseposition is null");
            return (Criteria) this;
        }

        public Criteria andCasepositionIsNotNull() {
            addCriterion("caseposition is not null");
            return (Criteria) this;
        }

        public Criteria andCasepositionEqualTo(String value) {
            addCriterion("caseposition =", value, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionNotEqualTo(String value) {
            addCriterion("caseposition <>", value, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionGreaterThan(String value) {
            addCriterion("caseposition >", value, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionGreaterThanOrEqualTo(String value) {
            addCriterion("caseposition >=", value, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionLessThan(String value) {
            addCriterion("caseposition <", value, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionLessThanOrEqualTo(String value) {
            addCriterion("caseposition <=", value, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionLike(String value) {
            addCriterion("caseposition like", value, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionNotLike(String value) {
            addCriterion("caseposition not like", value, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionIn(List<String> values) {
            addCriterion("caseposition in", values, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionNotIn(List<String> values) {
            addCriterion("caseposition not in", values, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionBetween(String value1, String value2) {
            addCriterion("caseposition between", value1, value2, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasepositionNotBetween(String value1, String value2) {
            addCriterion("caseposition not between", value1, value2, "caseposition");
            return (Criteria) this;
        }

        public Criteria andCasestatusIsNull() {
            addCriterion("casestatus is null");
            return (Criteria) this;
        }

        public Criteria andCasestatusIsNotNull() {
            addCriterion("casestatus is not null");
            return (Criteria) this;
        }

        public Criteria andCasestatusEqualTo(Integer value) {
            addCriterion("casestatus =", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusNotEqualTo(Integer value) {
            addCriterion("casestatus <>", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusGreaterThan(Integer value) {
            addCriterion("casestatus >", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("casestatus >=", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusLessThan(Integer value) {
            addCriterion("casestatus <", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusLessThanOrEqualTo(Integer value) {
            addCriterion("casestatus <=", value, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusIn(List<Integer> values) {
            addCriterion("casestatus in", values, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusNotIn(List<Integer> values) {
            addCriterion("casestatus not in", values, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusBetween(Integer value1, Integer value2) {
            addCriterion("casestatus between", value1, value2, "casestatus");
            return (Criteria) this;
        }

        public Criteria andCasestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("casestatus not between", value1, value2, "casestatus");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("rdate is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("rdate is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(Date value) {
            addCriterionForJDBCDate("rdate =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("rdate <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(Date value) {
            addCriterionForJDBCDate("rdate >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rdate >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(Date value) {
            addCriterionForJDBCDate("rdate <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("rdate <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<Date> values) {
            addCriterionForJDBCDate("rdate in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("rdate not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rdate between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("rdate not between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andDdateIsNull() {
            addCriterion("ddate is null");
            return (Criteria) this;
        }

        public Criteria andDdateIsNotNull() {
            addCriterion("ddate is not null");
            return (Criteria) this;
        }

        public Criteria andDdateEqualTo(Date value) {
            addCriterionForJDBCDate("ddate =", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ddate <>", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThan(Date value) {
            addCriterionForJDBCDate("ddate >", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ddate >=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThan(Date value) {
            addCriterionForJDBCDate("ddate <", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ddate <=", value, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateIn(List<Date> values) {
            addCriterionForJDBCDate("ddate in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ddate not in", values, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ddate between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andDdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ddate not between", value1, value2, "ddate");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andCpointIsNull() {
            addCriterion("cpoint is null");
            return (Criteria) this;
        }

        public Criteria andCpointIsNotNull() {
            addCriterion("cpoint is not null");
            return (Criteria) this;
        }

        public Criteria andCpointEqualTo(Integer value) {
            addCriterion("cpoint =", value, "cpoint");
            return (Criteria) this;
        }

        public Criteria andCpointNotEqualTo(Integer value) {
            addCriterion("cpoint <>", value, "cpoint");
            return (Criteria) this;
        }

        public Criteria andCpointGreaterThan(Integer value) {
            addCriterion("cpoint >", value, "cpoint");
            return (Criteria) this;
        }

        public Criteria andCpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpoint >=", value, "cpoint");
            return (Criteria) this;
        }

        public Criteria andCpointLessThan(Integer value) {
            addCriterion("cpoint <", value, "cpoint");
            return (Criteria) this;
        }

        public Criteria andCpointLessThanOrEqualTo(Integer value) {
            addCriterion("cpoint <=", value, "cpoint");
            return (Criteria) this;
        }

        public Criteria andCpointIn(List<Integer> values) {
            addCriterion("cpoint in", values, "cpoint");
            return (Criteria) this;
        }

        public Criteria andCpointNotIn(List<Integer> values) {
            addCriterion("cpoint not in", values, "cpoint");
            return (Criteria) this;
        }

        public Criteria andCpointBetween(Integer value1, Integer value2) {
            addCriterion("cpoint between", value1, value2, "cpoint");
            return (Criteria) this;
        }

        public Criteria andCpointNotBetween(Integer value1, Integer value2) {
            addCriterion("cpoint not between", value1, value2, "cpoint");
            return (Criteria) this;
        }

        public Criteria andAdminuidIsNull() {
            addCriterion("adminuid is null");
            return (Criteria) this;
        }

        public Criteria andAdminuidIsNotNull() {
            addCriterion("adminuid is not null");
            return (Criteria) this;
        }

        public Criteria andAdminuidEqualTo(String value) {
            addCriterion("adminuid =", value, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidNotEqualTo(String value) {
            addCriterion("adminuid <>", value, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidGreaterThan(String value) {
            addCriterion("adminuid >", value, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidGreaterThanOrEqualTo(String value) {
            addCriterion("adminuid >=", value, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidLessThan(String value) {
            addCriterion("adminuid <", value, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidLessThanOrEqualTo(String value) {
            addCriterion("adminuid <=", value, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidLike(String value) {
            addCriterion("adminuid like", value, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidNotLike(String value) {
            addCriterion("adminuid not like", value, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidIn(List<String> values) {
            addCriterion("adminuid in", values, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidNotIn(List<String> values) {
            addCriterion("adminuid not in", values, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidBetween(String value1, String value2) {
            addCriterion("adminuid between", value1, value2, "adminuid");
            return (Criteria) this;
        }

        public Criteria andAdminuidNotBetween(String value1, String value2) {
            addCriterion("adminuid not between", value1, value2, "adminuid");
            return (Criteria) this;
        }

        public Criteria andReadcntIsNull() {
            addCriterion("readcnt is null");
            return (Criteria) this;
        }

        public Criteria andReadcntIsNotNull() {
            addCriterion("readcnt is not null");
            return (Criteria) this;
        }

        public Criteria andReadcntEqualTo(Integer value) {
            addCriterion("readcnt =", value, "readcnt");
            return (Criteria) this;
        }

        public Criteria andReadcntNotEqualTo(Integer value) {
            addCriterion("readcnt <>", value, "readcnt");
            return (Criteria) this;
        }

        public Criteria andReadcntGreaterThan(Integer value) {
            addCriterion("readcnt >", value, "readcnt");
            return (Criteria) this;
        }

        public Criteria andReadcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("readcnt >=", value, "readcnt");
            return (Criteria) this;
        }

        public Criteria andReadcntLessThan(Integer value) {
            addCriterion("readcnt <", value, "readcnt");
            return (Criteria) this;
        }

        public Criteria andReadcntLessThanOrEqualTo(Integer value) {
            addCriterion("readcnt <=", value, "readcnt");
            return (Criteria) this;
        }

        public Criteria andReadcntIn(List<Integer> values) {
            addCriterion("readcnt in", values, "readcnt");
            return (Criteria) this;
        }

        public Criteria andReadcntNotIn(List<Integer> values) {
            addCriterion("readcnt not in", values, "readcnt");
            return (Criteria) this;
        }

        public Criteria andReadcntBetween(Integer value1, Integer value2) {
            addCriterion("readcnt between", value1, value2, "readcnt");
            return (Criteria) this;
        }

        public Criteria andReadcntNotBetween(Integer value1, Integer value2) {
            addCriterion("readcnt not between", value1, value2, "readcnt");
            return (Criteria) this;
        }

        public Criteria andSharecntIsNull() {
            addCriterion("sharecnt is null");
            return (Criteria) this;
        }

        public Criteria andSharecntIsNotNull() {
            addCriterion("sharecnt is not null");
            return (Criteria) this;
        }

        public Criteria andSharecntEqualTo(Integer value) {
            addCriterion("sharecnt =", value, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andSharecntNotEqualTo(Integer value) {
            addCriterion("sharecnt <>", value, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andSharecntGreaterThan(Integer value) {
            addCriterion("sharecnt >", value, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andSharecntGreaterThanOrEqualTo(Integer value) {
            addCriterion("sharecnt >=", value, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andSharecntLessThan(Integer value) {
            addCriterion("sharecnt <", value, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andSharecntLessThanOrEqualTo(Integer value) {
            addCriterion("sharecnt <=", value, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andSharecntIn(List<Integer> values) {
            addCriterion("sharecnt in", values, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andSharecntNotIn(List<Integer> values) {
            addCriterion("sharecnt not in", values, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andSharecntBetween(Integer value1, Integer value2) {
            addCriterion("sharecnt between", value1, value2, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andSharecntNotBetween(Integer value1, Integer value2) {
            addCriterion("sharecnt not between", value1, value2, "sharecnt");
            return (Criteria) this;
        }

        public Criteria andJoincntIsNull() {
            addCriterion("joincnt is null");
            return (Criteria) this;
        }

        public Criteria andJoincntIsNotNull() {
            addCriterion("joincnt is not null");
            return (Criteria) this;
        }

        public Criteria andJoincntEqualTo(Integer value) {
            addCriterion("joincnt =", value, "joincnt");
            return (Criteria) this;
        }

        public Criteria andJoincntNotEqualTo(Integer value) {
            addCriterion("joincnt <>", value, "joincnt");
            return (Criteria) this;
        }

        public Criteria andJoincntGreaterThan(Integer value) {
            addCriterion("joincnt >", value, "joincnt");
            return (Criteria) this;
        }

        public Criteria andJoincntGreaterThanOrEqualTo(Integer value) {
            addCriterion("joincnt >=", value, "joincnt");
            return (Criteria) this;
        }

        public Criteria andJoincntLessThan(Integer value) {
            addCriterion("joincnt <", value, "joincnt");
            return (Criteria) this;
        }

        public Criteria andJoincntLessThanOrEqualTo(Integer value) {
            addCriterion("joincnt <=", value, "joincnt");
            return (Criteria) this;
        }

        public Criteria andJoincntIn(List<Integer> values) {
            addCriterion("joincnt in", values, "joincnt");
            return (Criteria) this;
        }

        public Criteria andJoincntNotIn(List<Integer> values) {
            addCriterion("joincnt not in", values, "joincnt");
            return (Criteria) this;
        }

        public Criteria andJoincntBetween(Integer value1, Integer value2) {
            addCriterion("joincnt between", value1, value2, "joincnt");
            return (Criteria) this;
        }

        public Criteria andJoincntNotBetween(Integer value1, Integer value2) {
            addCriterion("joincnt not between", value1, value2, "joincnt");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("cdate is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("cdate is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("cdate =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("cdate <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("cdate >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdate >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("cdate <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("cdate <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("cdate in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("cdate not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("cdate between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("cdate not between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdIsNull() {
            addCriterion("case_content_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdIsNotNull() {
            addCriterion("case_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdEqualTo(Long value) {
            addCriterion("case_content_id =", value, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdNotEqualTo(Long value) {
            addCriterion("case_content_id <>", value, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdGreaterThan(Long value) {
            addCriterion("case_content_id >", value, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("case_content_id >=", value, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdLessThan(Long value) {
            addCriterion("case_content_id <", value, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdLessThanOrEqualTo(Long value) {
            addCriterion("case_content_id <=", value, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdIn(List<Long> values) {
            addCriterion("case_content_id in", values, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdNotIn(List<Long> values) {
            addCriterion("case_content_id not in", values, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdBetween(Long value1, Long value2) {
            addCriterion("case_content_id between", value1, value2, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andCaseContentIdNotBetween(Long value1, Long value2) {
            addCriterion("case_content_id not between", value1, value2, "caseContentId");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoIsNull() {
            addCriterion("qrcode_logo is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoIsNotNull() {
            addCriterion("qrcode_logo is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoEqualTo(String value) {
            addCriterion("qrcode_logo =", value, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoNotEqualTo(String value) {
            addCriterion("qrcode_logo <>", value, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoGreaterThan(String value) {
            addCriterion("qrcode_logo >", value, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode_logo >=", value, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoLessThan(String value) {
            addCriterion("qrcode_logo <", value, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoLessThanOrEqualTo(String value) {
            addCriterion("qrcode_logo <=", value, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoLike(String value) {
            addCriterion("qrcode_logo like", value, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoNotLike(String value) {
            addCriterion("qrcode_logo not like", value, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoIn(List<String> values) {
            addCriterion("qrcode_logo in", values, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoNotIn(List<String> values) {
            addCriterion("qrcode_logo not in", values, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoBetween(String value1, String value2) {
            addCriterion("qrcode_logo between", value1, value2, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andQrcodeLogoNotBetween(String value1, String value2) {
            addCriterion("qrcode_logo not between", value1, value2, "qrcodeLogo");
            return (Criteria) this;
        }

        public Criteria andJoinTitleIsNull() {
            addCriterion("join_title is null");
            return (Criteria) this;
        }

        public Criteria andJoinTitleIsNotNull() {
            addCriterion("join_title is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTitleEqualTo(String value) {
            addCriterion("join_title =", value, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleNotEqualTo(String value) {
            addCriterion("join_title <>", value, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleGreaterThan(String value) {
            addCriterion("join_title >", value, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleGreaterThanOrEqualTo(String value) {
            addCriterion("join_title >=", value, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleLessThan(String value) {
            addCriterion("join_title <", value, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleLessThanOrEqualTo(String value) {
            addCriterion("join_title <=", value, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleLike(String value) {
            addCriterion("join_title like", value, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleNotLike(String value) {
            addCriterion("join_title not like", value, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleIn(List<String> values) {
            addCriterion("join_title in", values, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleNotIn(List<String> values) {
            addCriterion("join_title not in", values, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleBetween(String value1, String value2) {
            addCriterion("join_title between", value1, value2, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andJoinTitleNotBetween(String value1, String value2) {
            addCriterion("join_title not between", value1, value2, "joinTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNull() {
            addCriterion("share_title is null");
            return (Criteria) this;
        }

        public Criteria andShareTitleIsNotNull() {
            addCriterion("share_title is not null");
            return (Criteria) this;
        }

        public Criteria andShareTitleEqualTo(String value) {
            addCriterion("share_title =", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotEqualTo(String value) {
            addCriterion("share_title <>", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThan(String value) {
            addCriterion("share_title >", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleGreaterThanOrEqualTo(String value) {
            addCriterion("share_title >=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThan(String value) {
            addCriterion("share_title <", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLessThanOrEqualTo(String value) {
            addCriterion("share_title <=", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleLike(String value) {
            addCriterion("share_title like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotLike(String value) {
            addCriterion("share_title not like", value, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleIn(List<String> values) {
            addCriterion("share_title in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotIn(List<String> values) {
            addCriterion("share_title not in", values, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleBetween(String value1, String value2) {
            addCriterion("share_title between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andShareTitleNotBetween(String value1, String value2) {
            addCriterion("share_title not between", value1, value2, "shareTitle");
            return (Criteria) this;
        }

        public Criteria andReadmixIsNull() {
            addCriterion("readmix is null");
            return (Criteria) this;
        }

        public Criteria andReadmixIsNotNull() {
            addCriterion("readmix is not null");
            return (Criteria) this;
        }

        public Criteria andReadmixEqualTo(Integer value) {
            addCriterion("readmix =", value, "readmix");
            return (Criteria) this;
        }

        public Criteria andReadmixNotEqualTo(Integer value) {
            addCriterion("readmix <>", value, "readmix");
            return (Criteria) this;
        }

        public Criteria andReadmixGreaterThan(Integer value) {
            addCriterion("readmix >", value, "readmix");
            return (Criteria) this;
        }

        public Criteria andReadmixGreaterThanOrEqualTo(Integer value) {
            addCriterion("readmix >=", value, "readmix");
            return (Criteria) this;
        }

        public Criteria andReadmixLessThan(Integer value) {
            addCriterion("readmix <", value, "readmix");
            return (Criteria) this;
        }

        public Criteria andReadmixLessThanOrEqualTo(Integer value) {
            addCriterion("readmix <=", value, "readmix");
            return (Criteria) this;
        }

        public Criteria andReadmixIn(List<Integer> values) {
            addCriterion("readmix in", values, "readmix");
            return (Criteria) this;
        }

        public Criteria andReadmixNotIn(List<Integer> values) {
            addCriterion("readmix not in", values, "readmix");
            return (Criteria) this;
        }

        public Criteria andReadmixBetween(Integer value1, Integer value2) {
            addCriterion("readmix between", value1, value2, "readmix");
            return (Criteria) this;
        }

        public Criteria andReadmixNotBetween(Integer value1, Integer value2) {
            addCriterion("readmix not between", value1, value2, "readmix");
            return (Criteria) this;
        }

        public Criteria andSharemixIsNull() {
            addCriterion("sharemix is null");
            return (Criteria) this;
        }

        public Criteria andSharemixIsNotNull() {
            addCriterion("sharemix is not null");
            return (Criteria) this;
        }

        public Criteria andSharemixEqualTo(Integer value) {
            addCriterion("sharemix =", value, "sharemix");
            return (Criteria) this;
        }

        public Criteria andSharemixNotEqualTo(Integer value) {
            addCriterion("sharemix <>", value, "sharemix");
            return (Criteria) this;
        }

        public Criteria andSharemixGreaterThan(Integer value) {
            addCriterion("sharemix >", value, "sharemix");
            return (Criteria) this;
        }

        public Criteria andSharemixGreaterThanOrEqualTo(Integer value) {
            addCriterion("sharemix >=", value, "sharemix");
            return (Criteria) this;
        }

        public Criteria andSharemixLessThan(Integer value) {
            addCriterion("sharemix <", value, "sharemix");
            return (Criteria) this;
        }

        public Criteria andSharemixLessThanOrEqualTo(Integer value) {
            addCriterion("sharemix <=", value, "sharemix");
            return (Criteria) this;
        }

        public Criteria andSharemixIn(List<Integer> values) {
            addCriterion("sharemix in", values, "sharemix");
            return (Criteria) this;
        }

        public Criteria andSharemixNotIn(List<Integer> values) {
            addCriterion("sharemix not in", values, "sharemix");
            return (Criteria) this;
        }

        public Criteria andSharemixBetween(Integer value1, Integer value2) {
            addCriterion("sharemix between", value1, value2, "sharemix");
            return (Criteria) this;
        }

        public Criteria andSharemixNotBetween(Integer value1, Integer value2) {
            addCriterion("sharemix not between", value1, value2, "sharemix");
            return (Criteria) this;
        }

        public Criteria andJoinmixIsNull() {
            addCriterion("joinmix is null");
            return (Criteria) this;
        }

        public Criteria andJoinmixIsNotNull() {
            addCriterion("joinmix is not null");
            return (Criteria) this;
        }

        public Criteria andJoinmixEqualTo(Integer value) {
            addCriterion("joinmix =", value, "joinmix");
            return (Criteria) this;
        }

        public Criteria andJoinmixNotEqualTo(Integer value) {
            addCriterion("joinmix <>", value, "joinmix");
            return (Criteria) this;
        }

        public Criteria andJoinmixGreaterThan(Integer value) {
            addCriterion("joinmix >", value, "joinmix");
            return (Criteria) this;
        }

        public Criteria andJoinmixGreaterThanOrEqualTo(Integer value) {
            addCriterion("joinmix >=", value, "joinmix");
            return (Criteria) this;
        }

        public Criteria andJoinmixLessThan(Integer value) {
            addCriterion("joinmix <", value, "joinmix");
            return (Criteria) this;
        }

        public Criteria andJoinmixLessThanOrEqualTo(Integer value) {
            addCriterion("joinmix <=", value, "joinmix");
            return (Criteria) this;
        }

        public Criteria andJoinmixIn(List<Integer> values) {
            addCriterion("joinmix in", values, "joinmix");
            return (Criteria) this;
        }

        public Criteria andJoinmixNotIn(List<Integer> values) {
            addCriterion("joinmix not in", values, "joinmix");
            return (Criteria) this;
        }

        public Criteria andJoinmixBetween(Integer value1, Integer value2) {
            addCriterion("joinmix between", value1, value2, "joinmix");
            return (Criteria) this;
        }

        public Criteria andJoinmixNotBetween(Integer value1, Integer value2) {
            addCriterion("joinmix not between", value1, value2, "joinmix");
            return (Criteria) this;
        }

        public Criteria andMaxpointIsNull() {
            addCriterion("maxpoint is null");
            return (Criteria) this;
        }

        public Criteria andMaxpointIsNotNull() {
            addCriterion("maxpoint is not null");
            return (Criteria) this;
        }

        public Criteria andMaxpointEqualTo(Integer value) {
            addCriterion("maxpoint =", value, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andMaxpointNotEqualTo(Integer value) {
            addCriterion("maxpoint <>", value, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andMaxpointGreaterThan(Integer value) {
            addCriterion("maxpoint >", value, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andMaxpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxpoint >=", value, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andMaxpointLessThan(Integer value) {
            addCriterion("maxpoint <", value, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andMaxpointLessThanOrEqualTo(Integer value) {
            addCriterion("maxpoint <=", value, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andMaxpointIn(List<Integer> values) {
            addCriterion("maxpoint in", values, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andMaxpointNotIn(List<Integer> values) {
            addCriterion("maxpoint not in", values, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andMaxpointBetween(Integer value1, Integer value2) {
            addCriterion("maxpoint between", value1, value2, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andMaxpointNotBetween(Integer value1, Integer value2) {
            addCriterion("maxpoint not between", value1, value2, "maxpoint");
            return (Criteria) this;
        }

        public Criteria andAppidIsNull() {
            addCriterion("appid is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appid is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(String value) {
            addCriterion("appid =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(String value) {
            addCriterion("appid <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(String value) {
            addCriterion("appid >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(String value) {
            addCriterion("appid >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(String value) {
            addCriterion("appid <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(String value) {
            addCriterion("appid <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLike(String value) {
            addCriterion("appid like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotLike(String value) {
            addCriterion("appid not like", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<String> values) {
            addCriterion("appid in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<String> values) {
            addCriterion("appid not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(String value1, String value2) {
            addCriterion("appid between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(String value1, String value2) {
            addCriterion("appid not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andLabelsIsNull() {
            addCriterion("labels is null");
            return (Criteria) this;
        }

        public Criteria andLabelsIsNotNull() {
            addCriterion("labels is not null");
            return (Criteria) this;
        }

        public Criteria andLabelsEqualTo(String value) {
            addCriterion("labels =", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotEqualTo(String value) {
            addCriterion("labels <>", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsGreaterThan(String value) {
            addCriterion("labels >", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsGreaterThanOrEqualTo(String value) {
            addCriterion("labels >=", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLessThan(String value) {
            addCriterion("labels <", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLessThanOrEqualTo(String value) {
            addCriterion("labels <=", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsLike(String value) {
            addCriterion("labels like", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotLike(String value) {
            addCriterion("labels not like", value, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsIn(List<String> values) {
            addCriterion("labels in", values, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotIn(List<String> values) {
            addCriterion("labels not in", values, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsBetween(String value1, String value2) {
            addCriterion("labels between", value1, value2, "labels");
            return (Criteria) this;
        }

        public Criteria andLabelsNotBetween(String value1, String value2) {
            addCriterion("labels not between", value1, value2, "labels");
            return (Criteria) this;
        }

        public Criteria andSmalllogoIsNull() {
            addCriterion("smallLogo is null");
            return (Criteria) this;
        }

        public Criteria andSmalllogoIsNotNull() {
            addCriterion("smallLogo is not null");
            return (Criteria) this;
        }

        public Criteria andSmalllogoEqualTo(String value) {
            addCriterion("smallLogo =", value, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoNotEqualTo(String value) {
            addCriterion("smallLogo <>", value, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoGreaterThan(String value) {
            addCriterion("smallLogo >", value, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoGreaterThanOrEqualTo(String value) {
            addCriterion("smallLogo >=", value, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoLessThan(String value) {
            addCriterion("smallLogo <", value, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoLessThanOrEqualTo(String value) {
            addCriterion("smallLogo <=", value, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoLike(String value) {
            addCriterion("smallLogo like", value, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoNotLike(String value) {
            addCriterion("smallLogo not like", value, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoIn(List<String> values) {
            addCriterion("smallLogo in", values, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoNotIn(List<String> values) {
            addCriterion("smallLogo not in", values, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoBetween(String value1, String value2) {
            addCriterion("smallLogo between", value1, value2, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmalllogoNotBetween(String value1, String value2) {
            addCriterion("smallLogo not between", value1, value2, "smalllogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoIsNull() {
            addCriterion("small_logo is null");
            return (Criteria) this;
        }

        public Criteria andSmallLogoIsNotNull() {
            addCriterion("small_logo is not null");
            return (Criteria) this;
        }

        public Criteria andSmallLogoEqualTo(String value) {
            addCriterion("small_logo =", value, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoNotEqualTo(String value) {
            addCriterion("small_logo <>", value, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoGreaterThan(String value) {
            addCriterion("small_logo >", value, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoGreaterThanOrEqualTo(String value) {
            addCriterion("small_logo >=", value, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoLessThan(String value) {
            addCriterion("small_logo <", value, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoLessThanOrEqualTo(String value) {
            addCriterion("small_logo <=", value, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoLike(String value) {
            addCriterion("small_logo like", value, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoNotLike(String value) {
            addCriterion("small_logo not like", value, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoIn(List<String> values) {
            addCriterion("small_logo in", values, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoNotIn(List<String> values) {
            addCriterion("small_logo not in", values, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoBetween(String value1, String value2) {
            addCriterion("small_logo between", value1, value2, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andSmallLogoNotBetween(String value1, String value2) {
            addCriterion("small_logo not between", value1, value2, "smallLogo");
            return (Criteria) this;
        }

        public Criteria andIsproductIsNull() {
            addCriterion("isProduct is null");
            return (Criteria) this;
        }

        public Criteria andIsproductIsNotNull() {
            addCriterion("isProduct is not null");
            return (Criteria) this;
        }

        public Criteria andIsproductEqualTo(Integer value) {
            addCriterion("isProduct =", value, "isproduct");
            return (Criteria) this;
        }

        public Criteria andIsproductNotEqualTo(Integer value) {
            addCriterion("isProduct <>", value, "isproduct");
            return (Criteria) this;
        }

        public Criteria andIsproductGreaterThan(Integer value) {
            addCriterion("isProduct >", value, "isproduct");
            return (Criteria) this;
        }

        public Criteria andIsproductGreaterThanOrEqualTo(Integer value) {
            addCriterion("isProduct >=", value, "isproduct");
            return (Criteria) this;
        }

        public Criteria andIsproductLessThan(Integer value) {
            addCriterion("isProduct <", value, "isproduct");
            return (Criteria) this;
        }

        public Criteria andIsproductLessThanOrEqualTo(Integer value) {
            addCriterion("isProduct <=", value, "isproduct");
            return (Criteria) this;
        }

        public Criteria andIsproductIn(List<Integer> values) {
            addCriterion("isProduct in", values, "isproduct");
            return (Criteria) this;
        }

        public Criteria andIsproductNotIn(List<Integer> values) {
            addCriterion("isProduct not in", values, "isproduct");
            return (Criteria) this;
        }

        public Criteria andIsproductBetween(Integer value1, Integer value2) {
            addCriterion("isProduct between", value1, value2, "isproduct");
            return (Criteria) this;
        }

        public Criteria andIsproductNotBetween(Integer value1, Integer value2) {
            addCriterion("isProduct not between", value1, value2, "isproduct");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(Integer value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(Integer value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(Integer value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(Integer value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(Integer value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(Integer value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<Integer> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<Integer> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(Integer value1, Integer value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(Integer value1, Integer value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeIsNull() {
            addCriterion("offical_describe is null");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeIsNotNull() {
            addCriterion("offical_describe is not null");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeEqualTo(String value) {
            addCriterion("offical_describe =", value, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeNotEqualTo(String value) {
            addCriterion("offical_describe <>", value, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeGreaterThan(String value) {
            addCriterion("offical_describe >", value, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("offical_describe >=", value, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeLessThan(String value) {
            addCriterion("offical_describe <", value, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeLessThanOrEqualTo(String value) {
            addCriterion("offical_describe <=", value, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeLike(String value) {
            addCriterion("offical_describe like", value, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeNotLike(String value) {
            addCriterion("offical_describe not like", value, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeIn(List<String> values) {
            addCriterion("offical_describe in", values, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeNotIn(List<String> values) {
            addCriterion("offical_describe not in", values, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeBetween(String value1, String value2) {
            addCriterion("offical_describe between", value1, value2, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andOfficalDescribeNotBetween(String value1, String value2) {
            addCriterion("offical_describe not between", value1, value2, "officalDescribe");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIsNull() {
            addCriterion("background_color is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIsNotNull() {
            addCriterion("background_color is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorEqualTo(String value) {
            addCriterion("background_color =", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotEqualTo(String value) {
            addCriterion("background_color <>", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorGreaterThan(String value) {
            addCriterion("background_color >", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorGreaterThanOrEqualTo(String value) {
            addCriterion("background_color >=", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLessThan(String value) {
            addCriterion("background_color <", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLessThanOrEqualTo(String value) {
            addCriterion("background_color <=", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorLike(String value) {
            addCriterion("background_color like", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotLike(String value) {
            addCriterion("background_color not like", value, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorIn(List<String> values) {
            addCriterion("background_color in", values, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotIn(List<String> values) {
            addCriterion("background_color not in", values, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorBetween(String value1, String value2) {
            addCriterion("background_color between", value1, value2, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andBackgroundColorNotBetween(String value1, String value2) {
            addCriterion("background_color not between", value1, value2, "backgroundColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorIsNull() {
            addCriterion("title_color is null");
            return (Criteria) this;
        }

        public Criteria andTitleColorIsNotNull() {
            addCriterion("title_color is not null");
            return (Criteria) this;
        }

        public Criteria andTitleColorEqualTo(String value) {
            addCriterion("title_color =", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorNotEqualTo(String value) {
            addCriterion("title_color <>", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorGreaterThan(String value) {
            addCriterion("title_color >", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorGreaterThanOrEqualTo(String value) {
            addCriterion("title_color >=", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorLessThan(String value) {
            addCriterion("title_color <", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorLessThanOrEqualTo(String value) {
            addCriterion("title_color <=", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorLike(String value) {
            addCriterion("title_color like", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorNotLike(String value) {
            addCriterion("title_color not like", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorIn(List<String> values) {
            addCriterion("title_color in", values, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorNotIn(List<String> values) {
            addCriterion("title_color not in", values, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorBetween(String value1, String value2) {
            addCriterion("title_color between", value1, value2, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorNotBetween(String value1, String value2) {
            addCriterion("title_color not between", value1, value2, "titleColor");
            return (Criteria) this;
        }

        public Criteria andCommentcntIsNull() {
            addCriterion("commentcnt is null");
            return (Criteria) this;
        }

        public Criteria andCommentcntIsNotNull() {
            addCriterion("commentcnt is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcntEqualTo(Integer value) {
            addCriterion("commentcnt =", value, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andCommentcntNotEqualTo(Integer value) {
            addCriterion("commentcnt <>", value, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andCommentcntGreaterThan(Integer value) {
            addCriterion("commentcnt >", value, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andCommentcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentcnt >=", value, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andCommentcntLessThan(Integer value) {
            addCriterion("commentcnt <", value, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andCommentcntLessThanOrEqualTo(Integer value) {
            addCriterion("commentcnt <=", value, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andCommentcntIn(List<Integer> values) {
            addCriterion("commentcnt in", values, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andCommentcntNotIn(List<Integer> values) {
            addCriterion("commentcnt not in", values, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andCommentcntBetween(Integer value1, Integer value2) {
            addCriterion("commentcnt between", value1, value2, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andCommentcntNotBetween(Integer value1, Integer value2) {
            addCriterion("commentcnt not between", value1, value2, "commentcnt");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNull() {
            addCriterion("off_time is null");
            return (Criteria) this;
        }

        public Criteria andOffTimeIsNotNull() {
            addCriterion("off_time is not null");
            return (Criteria) this;
        }

        public Criteria andOffTimeEqualTo(Date value) {
            addCriterionForJDBCDate("off_time =", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("off_time <>", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("off_time >", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("off_time >=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThan(Date value) {
            addCriterionForJDBCDate("off_time <", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("off_time <=", value, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeIn(List<Date> values) {
            addCriterionForJDBCDate("off_time in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("off_time not in", values, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("off_time between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andOffTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("off_time not between", value1, value2, "offTime");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentIsNull() {
            addCriterion("default_comment is null");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentIsNotNull() {
            addCriterion("default_comment is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentEqualTo(String value) {
            addCriterion("default_comment =", value, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentNotEqualTo(String value) {
            addCriterion("default_comment <>", value, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentGreaterThan(String value) {
            addCriterion("default_comment >", value, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentGreaterThanOrEqualTo(String value) {
            addCriterion("default_comment >=", value, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentLessThan(String value) {
            addCriterion("default_comment <", value, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentLessThanOrEqualTo(String value) {
            addCriterion("default_comment <=", value, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentLike(String value) {
            addCriterion("default_comment like", value, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentNotLike(String value) {
            addCriterion("default_comment not like", value, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentIn(List<String> values) {
            addCriterion("default_comment in", values, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentNotIn(List<String> values) {
            addCriterion("default_comment not in", values, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentBetween(String value1, String value2) {
            addCriterion("default_comment between", value1, value2, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultCommentNotBetween(String value1, String value2) {
            addCriterion("default_comment not between", value1, value2, "defaultComment");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameIsNull() {
            addCriterion("default_nickname is null");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameIsNotNull() {
            addCriterion("default_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameEqualTo(String value) {
            addCriterion("default_nickname =", value, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameNotEqualTo(String value) {
            addCriterion("default_nickname <>", value, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameGreaterThan(String value) {
            addCriterion("default_nickname >", value, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("default_nickname >=", value, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameLessThan(String value) {
            addCriterion("default_nickname <", value, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameLessThanOrEqualTo(String value) {
            addCriterion("default_nickname <=", value, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameLike(String value) {
            addCriterion("default_nickname like", value, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameNotLike(String value) {
            addCriterion("default_nickname not like", value, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameIn(List<String> values) {
            addCriterion("default_nickname in", values, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameNotIn(List<String> values) {
            addCriterion("default_nickname not in", values, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameBetween(String value1, String value2) {
            addCriterion("default_nickname between", value1, value2, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andDefaultNicknameNotBetween(String value1, String value2) {
            addCriterion("default_nickname not between", value1, value2, "defaultNickname");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNull() {
            addCriterion("casetype is null");
            return (Criteria) this;
        }

        public Criteria andCasetypeIsNotNull() {
            addCriterion("casetype is not null");
            return (Criteria) this;
        }

        public Criteria andCasetypeEqualTo(String value) {
            addCriterion("casetype =", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotEqualTo(String value) {
            addCriterion("casetype <>", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThan(String value) {
            addCriterion("casetype >", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeGreaterThanOrEqualTo(String value) {
            addCriterion("casetype >=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThan(String value) {
            addCriterion("casetype <", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLessThanOrEqualTo(String value) {
            addCriterion("casetype <=", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeLike(String value) {
            addCriterion("casetype like", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotLike(String value) {
            addCriterion("casetype not like", value, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeIn(List<String> values) {
            addCriterion("casetype in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotIn(List<String> values) {
            addCriterion("casetype not in", values, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeBetween(String value1, String value2) {
            addCriterion("casetype between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andCasetypeNotBetween(String value1, String value2) {
            addCriterion("casetype not between", value1, value2, "casetype");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNull() {
            addCriterion("headImg is null");
            return (Criteria) this;
        }

        public Criteria andHeadimgIsNotNull() {
            addCriterion("headImg is not null");
            return (Criteria) this;
        }

        public Criteria andHeadimgEqualTo(String value) {
            addCriterion("headImg =", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotEqualTo(String value) {
            addCriterion("headImg <>", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThan(String value) {
            addCriterion("headImg >", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgGreaterThanOrEqualTo(String value) {
            addCriterion("headImg >=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThan(String value) {
            addCriterion("headImg <", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLessThanOrEqualTo(String value) {
            addCriterion("headImg <=", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgLike(String value) {
            addCriterion("headImg like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotLike(String value) {
            addCriterion("headImg not like", value, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgIn(List<String> values) {
            addCriterion("headImg in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotIn(List<String> values) {
            addCriterion("headImg not in", values, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgBetween(String value1, String value2) {
            addCriterion("headImg between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andHeadimgNotBetween(String value1, String value2) {
            addCriterion("headImg not between", value1, value2, "headimg");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickName is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickName is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickName =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickName <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickName >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickName >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickName <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickName <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickName like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickName not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickName in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickName not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickName between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickName not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNull() {
            addCriterion("phoneNo is null");
            return (Criteria) this;
        }

        public Criteria andPhonenoIsNotNull() {
            addCriterion("phoneNo is not null");
            return (Criteria) this;
        }

        public Criteria andPhonenoEqualTo(String value) {
            addCriterion("phoneNo =", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotEqualTo(String value) {
            addCriterion("phoneNo <>", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThan(String value) {
            addCriterion("phoneNo >", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoGreaterThanOrEqualTo(String value) {
            addCriterion("phoneNo >=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThan(String value) {
            addCriterion("phoneNo <", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLessThanOrEqualTo(String value) {
            addCriterion("phoneNo <=", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoLike(String value) {
            addCriterion("phoneNo like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotLike(String value) {
            addCriterion("phoneNo not like", value, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoIn(List<String> values) {
            addCriterion("phoneNo in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotIn(List<String> values) {
            addCriterion("phoneNo not in", values, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoBetween(String value1, String value2) {
            addCriterion("phoneNo between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andPhonenoNotBetween(String value1, String value2) {
            addCriterion("phoneNo not between", value1, value2, "phoneno");
            return (Criteria) this;
        }

        public Criteria andIsoriginalIsNull() {
            addCriterion("isOriginal is null");
            return (Criteria) this;
        }

        public Criteria andIsoriginalIsNotNull() {
            addCriterion("isOriginal is not null");
            return (Criteria) this;
        }

        public Criteria andIsoriginalEqualTo(String value) {
            addCriterion("isOriginal =", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotEqualTo(String value) {
            addCriterion("isOriginal <>", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalGreaterThan(String value) {
            addCriterion("isOriginal >", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalGreaterThanOrEqualTo(String value) {
            addCriterion("isOriginal >=", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalLessThan(String value) {
            addCriterion("isOriginal <", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalLessThanOrEqualTo(String value) {
            addCriterion("isOriginal <=", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalLike(String value) {
            addCriterion("isOriginal like", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotLike(String value) {
            addCriterion("isOriginal not like", value, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalIn(List<String> values) {
            addCriterion("isOriginal in", values, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotIn(List<String> values) {
            addCriterion("isOriginal not in", values, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalBetween(String value1, String value2) {
            addCriterion("isOriginal between", value1, value2, "isoriginal");
            return (Criteria) this;
        }

        public Criteria andIsoriginalNotBetween(String value1, String value2) {
            addCriterion("isOriginal not between", value1, value2, "isoriginal");
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