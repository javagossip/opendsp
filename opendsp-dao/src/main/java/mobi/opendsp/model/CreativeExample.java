package mobi.opendsp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreativeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public CreativeExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdIsNull() {
            addCriterion("ad_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdIsNotNull() {
            addCriterion("ad_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdEqualTo(Integer value) {
            addCriterion("ad_unit_id =", value, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdNotEqualTo(Integer value) {
            addCriterion("ad_unit_id <>", value, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdGreaterThan(Integer value) {
            addCriterion("ad_unit_id >", value, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ad_unit_id >=", value, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdLessThan(Integer value) {
            addCriterion("ad_unit_id <", value, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("ad_unit_id <=", value, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdIn(List<Integer> values) {
            addCriterion("ad_unit_id in", values, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdNotIn(List<Integer> values) {
            addCriterion("ad_unit_id not in", values, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("ad_unit_id between", value1, value2, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andAdUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ad_unit_id not between", value1, value2, "adUnitId");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlIsNull() {
            addCriterion("material_url is null");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlIsNotNull() {
            addCriterion("material_url is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlEqualTo(String value) {
            addCriterion("material_url =", value, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlNotEqualTo(String value) {
            addCriterion("material_url <>", value, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlGreaterThan(String value) {
            addCriterion("material_url >", value, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlGreaterThanOrEqualTo(String value) {
            addCriterion("material_url >=", value, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlLessThan(String value) {
            addCriterion("material_url <", value, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlLessThanOrEqualTo(String value) {
            addCriterion("material_url <=", value, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlLike(String value) {
            addCriterion("material_url like", value, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlNotLike(String value) {
            addCriterion("material_url not like", value, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlIn(List<String> values) {
            addCriterion("material_url in", values, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlNotIn(List<String> values) {
            addCriterion("material_url not in", values, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlBetween(String value1, String value2) {
            addCriterion("material_url between", value1, value2, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andMaterialUrlNotBetween(String value1, String value2) {
            addCriterion("material_url not between", value1, value2, "materialUrl");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetIsNull() {
            addCriterion("html_snippet is null");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetIsNotNull() {
            addCriterion("html_snippet is not null");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetEqualTo(String value) {
            addCriterion("html_snippet =", value, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetNotEqualTo(String value) {
            addCriterion("html_snippet <>", value, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetGreaterThan(String value) {
            addCriterion("html_snippet >", value, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetGreaterThanOrEqualTo(String value) {
            addCriterion("html_snippet >=", value, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetLessThan(String value) {
            addCriterion("html_snippet <", value, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetLessThanOrEqualTo(String value) {
            addCriterion("html_snippet <=", value, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetLike(String value) {
            addCriterion("html_snippet like", value, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetNotLike(String value) {
            addCriterion("html_snippet not like", value, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetIn(List<String> values) {
            addCriterion("html_snippet in", values, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetNotIn(List<String> values) {
            addCriterion("html_snippet not in", values, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetBetween(String value1, String value2) {
            addCriterion("html_snippet between", value1, value2, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andHtmlSnippetNotBetween(String value1, String value2) {
            addCriterion("html_snippet not between", value1, value2, "htmlSnippet");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNull() {
            addCriterion("review_status is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("review_status is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusEqualTo(String value) {
            addCriterion("review_status =", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotEqualTo(String value) {
            addCriterion("review_status <>", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThan(String value) {
            addCriterion("review_status >", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(String value) {
            addCriterion("review_status >=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThan(String value) {
            addCriterion("review_status <", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(String value) {
            addCriterion("review_status <=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLike(String value) {
            addCriterion("review_status like", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotLike(String value) {
            addCriterion("review_status not like", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIn(List<String> values) {
            addCriterion("review_status in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotIn(List<String> values) {
            addCriterion("review_status not in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusBetween(String value1, String value2) {
            addCriterion("review_status between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotBetween(String value1, String value2) {
            addCriterion("review_status not between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsIsNull() {
            addCriterion("review_comments is null");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsIsNotNull() {
            addCriterion("review_comments is not null");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsEqualTo(String value) {
            addCriterion("review_comments =", value, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsNotEqualTo(String value) {
            addCriterion("review_comments <>", value, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsGreaterThan(String value) {
            addCriterion("review_comments >", value, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("review_comments >=", value, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsLessThan(String value) {
            addCriterion("review_comments <", value, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsLessThanOrEqualTo(String value) {
            addCriterion("review_comments <=", value, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsLike(String value) {
            addCriterion("review_comments like", value, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsNotLike(String value) {
            addCriterion("review_comments not like", value, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsIn(List<String> values) {
            addCriterion("review_comments in", values, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsNotIn(List<String> values) {
            addCriterion("review_comments not in", values, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsBetween(String value1, String value2) {
            addCriterion("review_comments between", value1, value2, "reviewComments");
            return (Criteria) this;
        }

        public Criteria andReviewCommentsNotBetween(String value1, String value2) {
            addCriterion("review_comments not between", value1, value2, "reviewComments");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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