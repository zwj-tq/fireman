package com.zgxf.fireman.bean.example;

import java.util.ArrayList;
import java.util.List;

public class GradeHistoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeHistoryExample() {
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

        public Criteria andHidIsNull() {
            addCriterion("hid is null");
            return (Criteria) this;
        }

        public Criteria andHidIsNotNull() {
            addCriterion("hid is not null");
            return (Criteria) this;
        }

        public Criteria andHidEqualTo(Integer value) {
            addCriterion("hid =", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotEqualTo(Integer value) {
            addCriterion("hid <>", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThan(Integer value) {
            addCriterion("hid >", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hid >=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThan(Integer value) {
            addCriterion("hid <", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidLessThanOrEqualTo(Integer value) {
            addCriterion("hid <=", value, "hid");
            return (Criteria) this;
        }

        public Criteria andHidIn(List<Integer> values) {
            addCriterion("hid in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotIn(List<Integer> values) {
            addCriterion("hid not in", values, "hid");
            return (Criteria) this;
        }

        public Criteria andHidBetween(Integer value1, Integer value2) {
            addCriterion("hid between", value1, value2, "hid");
            return (Criteria) this;
        }

        public Criteria andHidNotBetween(Integer value1, Integer value2) {
            addCriterion("hid not between", value1, value2, "hid");
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

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIsNull() {
            addCriterion("write_time is null");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIsNotNull() {
            addCriterion("write_time is not null");
            return (Criteria) this;
        }

        public Criteria andWriteTimeEqualTo(String value) {
            addCriterion("write_time =", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotEqualTo(String value) {
            addCriterion("write_time <>", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeGreaterThan(String value) {
            addCriterion("write_time >", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("write_time >=", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLessThan(String value) {
            addCriterion("write_time <", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLessThanOrEqualTo(String value) {
            addCriterion("write_time <=", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeLike(String value) {
            addCriterion("write_time like", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotLike(String value) {
            addCriterion("write_time not like", value, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeIn(List<String> values) {
            addCriterion("write_time in", values, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotIn(List<String> values) {
            addCriterion("write_time not in", values, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeBetween(String value1, String value2) {
            addCriterion("write_time between", value1, value2, "writeTime");
            return (Criteria) this;
        }

        public Criteria andWriteTimeNotBetween(String value1, String value2) {
            addCriterion("write_time not between", value1, value2, "writeTime");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreIsNull() {
            addCriterion("zfjl_score is null");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreIsNotNull() {
            addCriterion("zfjl_score is not null");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreEqualTo(Integer value) {
            addCriterion("zfjl_score =", value, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreNotEqualTo(Integer value) {
            addCriterion("zfjl_score <>", value, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreGreaterThan(Integer value) {
            addCriterion("zfjl_score >", value, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zfjl_score >=", value, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreLessThan(Integer value) {
            addCriterion("zfjl_score <", value, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreLessThanOrEqualTo(Integer value) {
            addCriterion("zfjl_score <=", value, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreIn(List<Integer> values) {
            addCriterion("zfjl_score in", values, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreNotIn(List<Integer> values) {
            addCriterion("zfjl_score not in", values, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreBetween(Integer value1, Integer value2) {
            addCriterion("zfjl_score between", value1, value2, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andZfjlScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zfjl_score not between", value1, value2, "zfjlScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreIsNull() {
            addCriterion("rcyw_score is null");
            return (Criteria) this;
        }

        public Criteria andRcywScoreIsNotNull() {
            addCriterion("rcyw_score is not null");
            return (Criteria) this;
        }

        public Criteria andRcywScoreEqualTo(Integer value) {
            addCriterion("rcyw_score =", value, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreNotEqualTo(Integer value) {
            addCriterion("rcyw_score <>", value, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreGreaterThan(Integer value) {
            addCriterion("rcyw_score >", value, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcyw_score >=", value, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreLessThan(Integer value) {
            addCriterion("rcyw_score <", value, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreLessThanOrEqualTo(Integer value) {
            addCriterion("rcyw_score <=", value, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreIn(List<Integer> values) {
            addCriterion("rcyw_score in", values, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreNotIn(List<Integer> values) {
            addCriterion("rcyw_score not in", values, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreBetween(Integer value1, Integer value2) {
            addCriterion("rcyw_score between", value1, value2, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andRcywScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("rcyw_score not between", value1, value2, "rcywScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreIsNull() {
            addCriterion("zznl_score is null");
            return (Criteria) this;
        }

        public Criteria andZznlScoreIsNotNull() {
            addCriterion("zznl_score is not null");
            return (Criteria) this;
        }

        public Criteria andZznlScoreEqualTo(Integer value) {
            addCriterion("zznl_score =", value, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreNotEqualTo(Integer value) {
            addCriterion("zznl_score <>", value, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreGreaterThan(Integer value) {
            addCriterion("zznl_score >", value, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zznl_score >=", value, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreLessThan(Integer value) {
            addCriterion("zznl_score <", value, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreLessThanOrEqualTo(Integer value) {
            addCriterion("zznl_score <=", value, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreIn(List<Integer> values) {
            addCriterion("zznl_score in", values, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreNotIn(List<Integer> values) {
            addCriterion("zznl_score not in", values, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreBetween(Integer value1, Integer value2) {
            addCriterion("zznl_score between", value1, value2, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andZznlScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zznl_score not between", value1, value2, "zznlScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreIsNull() {
            addCriterion("gztd_score is null");
            return (Criteria) this;
        }

        public Criteria andGztdScoreIsNotNull() {
            addCriterion("gztd_score is not null");
            return (Criteria) this;
        }

        public Criteria andGztdScoreEqualTo(Integer value) {
            addCriterion("gztd_score =", value, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreNotEqualTo(Integer value) {
            addCriterion("gztd_score <>", value, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreGreaterThan(Integer value) {
            addCriterion("gztd_score >", value, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("gztd_score >=", value, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreLessThan(Integer value) {
            addCriterion("gztd_score <", value, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreLessThanOrEqualTo(Integer value) {
            addCriterion("gztd_score <=", value, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreIn(List<Integer> values) {
            addCriterion("gztd_score in", values, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreNotIn(List<Integer> values) {
            addCriterion("gztd_score not in", values, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreBetween(Integer value1, Integer value2) {
            addCriterion("gztd_score between", value1, value2, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andGztdScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("gztd_score not between", value1, value2, "gztdScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreIsNull() {
            addCriterion("zxcy_score is null");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreIsNotNull() {
            addCriterion("zxcy_score is not null");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreEqualTo(Integer value) {
            addCriterion("zxcy_score =", value, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreNotEqualTo(Integer value) {
            addCriterion("zxcy_score <>", value, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreGreaterThan(Integer value) {
            addCriterion("zxcy_score >", value, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zxcy_score >=", value, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreLessThan(Integer value) {
            addCriterion("zxcy_score <", value, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreLessThanOrEqualTo(Integer value) {
            addCriterion("zxcy_score <=", value, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreIn(List<Integer> values) {
            addCriterion("zxcy_score in", values, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreNotIn(List<Integer> values) {
            addCriterion("zxcy_score not in", values, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreBetween(Integer value1, Integer value2) {
            addCriterion("zxcy_score between", value1, value2, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andZxcyScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zxcy_score not between", value1, value2, "zxcyScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreIsNull() {
            addCriterion("gtjl_score is null");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreIsNotNull() {
            addCriterion("gtjl_score is not null");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreEqualTo(Integer value) {
            addCriterion("gtjl_score =", value, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreNotEqualTo(Integer value) {
            addCriterion("gtjl_score <>", value, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreGreaterThan(Integer value) {
            addCriterion("gtjl_score >", value, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("gtjl_score >=", value, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreLessThan(Integer value) {
            addCriterion("gtjl_score <", value, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreLessThanOrEqualTo(Integer value) {
            addCriterion("gtjl_score <=", value, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreIn(List<Integer> values) {
            addCriterion("gtjl_score in", values, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreNotIn(List<Integer> values) {
            addCriterion("gtjl_score not in", values, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreBetween(Integer value1, Integer value2) {
            addCriterion("gtjl_score between", value1, value2, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andGtjlScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("gtjl_score not between", value1, value2, "gtjlScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreIsNull() {
            addCriterion("zwts_score is null");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreIsNotNull() {
            addCriterion("zwts_score is not null");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreEqualTo(Integer value) {
            addCriterion("zwts_score =", value, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreNotEqualTo(Integer value) {
            addCriterion("zwts_score <>", value, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreGreaterThan(Integer value) {
            addCriterion("zwts_score >", value, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("zwts_score >=", value, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreLessThan(Integer value) {
            addCriterion("zwts_score <", value, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreLessThanOrEqualTo(Integer value) {
            addCriterion("zwts_score <=", value, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreIn(List<Integer> values) {
            addCriterion("zwts_score in", values, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreNotIn(List<Integer> values) {
            addCriterion("zwts_score not in", values, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreBetween(Integer value1, Integer value2) {
            addCriterion("zwts_score between", value1, value2, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andZwtsScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("zwts_score not between", value1, value2, "zwtsScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreIsNull() {
            addCriterion("sum_score is null");
            return (Criteria) this;
        }

        public Criteria andSumScoreIsNotNull() {
            addCriterion("sum_score is not null");
            return (Criteria) this;
        }

        public Criteria andSumScoreEqualTo(Integer value) {
            addCriterion("sum_score =", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreNotEqualTo(Integer value) {
            addCriterion("sum_score <>", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreGreaterThan(Integer value) {
            addCriterion("sum_score >", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_score >=", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreLessThan(Integer value) {
            addCriterion("sum_score <", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreLessThanOrEqualTo(Integer value) {
            addCriterion("sum_score <=", value, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreIn(List<Integer> values) {
            addCriterion("sum_score in", values, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreNotIn(List<Integer> values) {
            addCriterion("sum_score not in", values, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreBetween(Integer value1, Integer value2) {
            addCriterion("sum_score between", value1, value2, "sumScore");
            return (Criteria) this;
        }

        public Criteria andSumScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_score not between", value1, value2, "sumScore");
            return (Criteria) this;
        }

        public Criteria andWriterIdIsNull() {
            addCriterion("writer_id is null");
            return (Criteria) this;
        }

        public Criteria andWriterIdIsNotNull() {
            addCriterion("writer_id is not null");
            return (Criteria) this;
        }

        public Criteria andWriterIdEqualTo(Integer value) {
            addCriterion("writer_id =", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdNotEqualTo(Integer value) {
            addCriterion("writer_id <>", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdGreaterThan(Integer value) {
            addCriterion("writer_id >", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("writer_id >=", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdLessThan(Integer value) {
            addCriterion("writer_id <", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdLessThanOrEqualTo(Integer value) {
            addCriterion("writer_id <=", value, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdIn(List<Integer> values) {
            addCriterion("writer_id in", values, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdNotIn(List<Integer> values) {
            addCriterion("writer_id not in", values, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdBetween(Integer value1, Integer value2) {
            addCriterion("writer_id between", value1, value2, "writerId");
            return (Criteria) this;
        }

        public Criteria andWriterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("writer_id not between", value1, value2, "writerId");
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