package com.njzhaomi.quartz.yuejia.povo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExtendCaseAcctExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtendCaseAcctExample() {
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

        public Criteria andCaseidIsNull() {
            addCriterion("caseid is null");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNotNull() {
            addCriterion("caseid is not null");
            return (Criteria) this;
        }

        public Criteria andCaseidEqualTo(Integer value) {
            addCriterion("caseid =", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotEqualTo(Integer value) {
            addCriterion("caseid <>", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThan(Integer value) {
            addCriterion("caseid >", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("caseid >=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThan(Integer value) {
            addCriterion("caseid <", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThanOrEqualTo(Integer value) {
            addCriterion("caseid <=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidIn(List<Integer> values) {
            addCriterion("caseid in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotIn(List<Integer> values) {
            addCriterion("caseid not in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidBetween(Integer value1, Integer value2) {
            addCriterion("caseid between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("caseid not between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(String value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(String value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(String value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(String value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(String value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(String value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLike(String value) {
            addCriterion("uid like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotLike(String value) {
            addCriterion("uid not like", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<String> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<String> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(String value1, String value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(String value1, String value2) {
            addCriterion("uid not between", value1, value2, "uid");
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

        public Criteria andUpidIsNull() {
            addCriterion("upid is null");
            return (Criteria) this;
        }

        public Criteria andUpidIsNotNull() {
            addCriterion("upid is not null");
            return (Criteria) this;
        }

        public Criteria andUpidEqualTo(String value) {
            addCriterion("upid =", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotEqualTo(String value) {
            addCriterion("upid <>", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThan(String value) {
            addCriterion("upid >", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThanOrEqualTo(String value) {
            addCriterion("upid >=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThan(String value) {
            addCriterion("upid <", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThanOrEqualTo(String value) {
            addCriterion("upid <=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLike(String value) {
            addCriterion("upid like", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotLike(String value) {
            addCriterion("upid not like", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidIn(List<String> values) {
            addCriterion("upid in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotIn(List<String> values) {
            addCriterion("upid not in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidBetween(String value1, String value2) {
            addCriterion("upid between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotBetween(String value1, String value2) {
            addCriterion("upid not between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andEntityIsNull() {
            addCriterion("entity is null");
            return (Criteria) this;
        }

        public Criteria andEntityIsNotNull() {
            addCriterion("entity is not null");
            return (Criteria) this;
        }

        public Criteria andEntityEqualTo(String value) {
            addCriterion("entity =", value, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityNotEqualTo(String value) {
            addCriterion("entity <>", value, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityGreaterThan(String value) {
            addCriterion("entity >", value, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityGreaterThanOrEqualTo(String value) {
            addCriterion("entity >=", value, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityLessThan(String value) {
            addCriterion("entity <", value, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityLessThanOrEqualTo(String value) {
            addCriterion("entity <=", value, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityLike(String value) {
            addCriterion("entity like", value, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityNotLike(String value) {
            addCriterion("entity not like", value, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityIn(List<String> values) {
            addCriterion("entity in", values, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityNotIn(List<String> values) {
            addCriterion("entity not in", values, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityBetween(String value1, String value2) {
            addCriterion("entity between", value1, value2, "entity");
            return (Criteria) this;
        }

        public Criteria andEntityNotBetween(String value1, String value2) {
            addCriterion("entity not between", value1, value2, "entity");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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