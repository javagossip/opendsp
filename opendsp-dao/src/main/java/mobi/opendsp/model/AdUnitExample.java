package mobi.opendsp.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public AdUnitExample() {
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

        public Criteria andCampaignIdIsNull() {
            addCriterion("campaign_id is null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIsNotNull() {
            addCriterion("campaign_id is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignIdEqualTo(Integer value) {
            addCriterion("campaign_id =", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotEqualTo(Integer value) {
            addCriterion("campaign_id <>", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThan(Integer value) {
            addCriterion("campaign_id >", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("campaign_id >=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThan(Integer value) {
            addCriterion("campaign_id <", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdLessThanOrEqualTo(Integer value) {
            addCriterion("campaign_id <=", value, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdIn(List<Integer> values) {
            addCriterion("campaign_id in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotIn(List<Integer> values) {
            addCriterion("campaign_id not in", values, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdBetween(Integer value1, Integer value2) {
            addCriterion("campaign_id between", value1, value2, "campaignId");
            return (Criteria) this;
        }

        public Criteria andCampaignIdNotBetween(Integer value1, Integer value2) {
            addCriterion("campaign_id not between", value1, value2, "campaignId");
            return (Criteria) this;
        }

        public Criteria andSchedulingIsNull() {
            addCriterion("scheduling is null");
            return (Criteria) this;
        }

        public Criteria andSchedulingIsNotNull() {
            addCriterion("scheduling is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulingEqualTo(String value) {
            addCriterion("scheduling =", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingNotEqualTo(String value) {
            addCriterion("scheduling <>", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingGreaterThan(String value) {
            addCriterion("scheduling >", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingGreaterThanOrEqualTo(String value) {
            addCriterion("scheduling >=", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingLessThan(String value) {
            addCriterion("scheduling <", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingLessThanOrEqualTo(String value) {
            addCriterion("scheduling <=", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingLike(String value) {
            addCriterion("scheduling like", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingNotLike(String value) {
            addCriterion("scheduling not like", value, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingIn(List<String> values) {
            addCriterion("scheduling in", values, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingNotIn(List<String> values) {
            addCriterion("scheduling not in", values, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingBetween(String value1, String value2) {
            addCriterion("scheduling between", value1, value2, "scheduling");
            return (Criteria) this;
        }

        public Criteria andSchedulingNotBetween(String value1, String value2) {
            addCriterion("scheduling not between", value1, value2, "scheduling");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodIsNull() {
            addCriterion("deliver_method is null");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodIsNotNull() {
            addCriterion("deliver_method is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodEqualTo(Byte value) {
            addCriterion("deliver_method =", value, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodNotEqualTo(Byte value) {
            addCriterion("deliver_method <>", value, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodGreaterThan(Byte value) {
            addCriterion("deliver_method >", value, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodGreaterThanOrEqualTo(Byte value) {
            addCriterion("deliver_method >=", value, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodLessThan(Byte value) {
            addCriterion("deliver_method <", value, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodLessThanOrEqualTo(Byte value) {
            addCriterion("deliver_method <=", value, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodIn(List<Byte> values) {
            addCriterion("deliver_method in", values, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodNotIn(List<Byte> values) {
            addCriterion("deliver_method not in", values, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodBetween(Byte value1, Byte value2) {
            addCriterion("deliver_method between", value1, value2, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andDeliverMethodNotBetween(Byte value1, Byte value2) {
            addCriterion("deliver_method not between", value1, value2, "deliverMethod");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesIsNull() {
            addCriterion("deliver_times is null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesIsNotNull() {
            addCriterion("deliver_times is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesEqualTo(Long value) {
            addCriterion("deliver_times =", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesNotEqualTo(Long value) {
            addCriterion("deliver_times <>", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesGreaterThan(Long value) {
            addCriterion("deliver_times >", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesGreaterThanOrEqualTo(Long value) {
            addCriterion("deliver_times >=", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesLessThan(Long value) {
            addCriterion("deliver_times <", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesLessThanOrEqualTo(Long value) {
            addCriterion("deliver_times <=", value, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesIn(List<Long> values) {
            addCriterion("deliver_times in", values, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesNotIn(List<Long> values) {
            addCriterion("deliver_times not in", values, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesBetween(Long value1, Long value2) {
            addCriterion("deliver_times between", value1, value2, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andDeliverTimesNotBetween(Long value1, Long value2) {
            addCriterion("deliver_times not between", value1, value2, "deliverTimes");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNull() {
            addCriterion("promotion_type is null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIsNotNull() {
            addCriterion("promotion_type is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeEqualTo(Byte value) {
            addCriterion("promotion_type =", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotEqualTo(Byte value) {
            addCriterion("promotion_type <>", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThan(Byte value) {
            addCriterion("promotion_type >", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("promotion_type >=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThan(Byte value) {
            addCriterion("promotion_type <", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeLessThanOrEqualTo(Byte value) {
            addCriterion("promotion_type <=", value, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeIn(List<Byte> values) {
            addCriterion("promotion_type in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotIn(List<Byte> values) {
            addCriterion("promotion_type not in", values, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeBetween(Byte value1, Byte value2) {
            addCriterion("promotion_type between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andPromotionTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("promotion_type not between", value1, value2, "promotionType");
            return (Criteria) this;
        }

        public Criteria andLandingPageIsNull() {
            addCriterion("landing_page is null");
            return (Criteria) this;
        }

        public Criteria andLandingPageIsNotNull() {
            addCriterion("landing_page is not null");
            return (Criteria) this;
        }

        public Criteria andLandingPageEqualTo(String value) {
            addCriterion("landing_page =", value, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageNotEqualTo(String value) {
            addCriterion("landing_page <>", value, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageGreaterThan(String value) {
            addCriterion("landing_page >", value, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageGreaterThanOrEqualTo(String value) {
            addCriterion("landing_page >=", value, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageLessThan(String value) {
            addCriterion("landing_page <", value, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageLessThanOrEqualTo(String value) {
            addCriterion("landing_page <=", value, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageLike(String value) {
            addCriterion("landing_page like", value, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageNotLike(String value) {
            addCriterion("landing_page not like", value, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageIn(List<String> values) {
            addCriterion("landing_page in", values, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageNotIn(List<String> values) {
            addCriterion("landing_page not in", values, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageBetween(String value1, String value2) {
            addCriterion("landing_page between", value1, value2, "landingPage");
            return (Criteria) this;
        }

        public Criteria andLandingPageNotBetween(String value1, String value2) {
            addCriterion("landing_page not between", value1, value2, "landingPage");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNull() {
            addCriterion("cost_type is null");
            return (Criteria) this;
        }

        public Criteria andCostTypeIsNotNull() {
            addCriterion("cost_type is not null");
            return (Criteria) this;
        }

        public Criteria andCostTypeEqualTo(Byte value) {
            addCriterion("cost_type =", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotEqualTo(Byte value) {
            addCriterion("cost_type <>", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThan(Byte value) {
            addCriterion("cost_type >", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("cost_type >=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThan(Byte value) {
            addCriterion("cost_type <", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeLessThanOrEqualTo(Byte value) {
            addCriterion("cost_type <=", value, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeIn(List<Byte> values) {
            addCriterion("cost_type in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotIn(List<Byte> values) {
            addCriterion("cost_type not in", values, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeBetween(Byte value1, Byte value2) {
            addCriterion("cost_type between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andCostTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("cost_type not between", value1, value2, "costType");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andPkgNameIsNull() {
            addCriterion("pkg_name is null");
            return (Criteria) this;
        }

        public Criteria andPkgNameIsNotNull() {
            addCriterion("pkg_name is not null");
            return (Criteria) this;
        }

        public Criteria andPkgNameEqualTo(String value) {
            addCriterion("pkg_name =", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotEqualTo(String value) {
            addCriterion("pkg_name <>", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameGreaterThan(String value) {
            addCriterion("pkg_name >", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameGreaterThanOrEqualTo(String value) {
            addCriterion("pkg_name >=", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLessThan(String value) {
            addCriterion("pkg_name <", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLessThanOrEqualTo(String value) {
            addCriterion("pkg_name <=", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameLike(String value) {
            addCriterion("pkg_name like", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotLike(String value) {
            addCriterion("pkg_name not like", value, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameIn(List<String> values) {
            addCriterion("pkg_name in", values, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotIn(List<String> values) {
            addCriterion("pkg_name not in", values, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameBetween(String value1, String value2) {
            addCriterion("pkg_name between", value1, value2, "pkgName");
            return (Criteria) this;
        }

        public Criteria andPkgNameNotBetween(String value1, String value2) {
            addCriterion("pkg_name not between", value1, value2, "pkgName");
            return (Criteria) this;
        }

        public Criteria andBidStrategyIsNull() {
            addCriterion("bid_strategy is null");
            return (Criteria) this;
        }

        public Criteria andBidStrategyIsNotNull() {
            addCriterion("bid_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andBidStrategyEqualTo(Byte value) {
            addCriterion("bid_strategy =", value, "bidStrategy");
            return (Criteria) this;
        }

        public Criteria andBidStrategyNotEqualTo(Byte value) {
            addCriterion("bid_strategy <>", value, "bidStrategy");
            return (Criteria) this;
        }

        public Criteria andBidStrategyGreaterThan(Byte value) {
            addCriterion("bid_strategy >", value, "bidStrategy");
            return (Criteria) this;
        }

        public Criteria andBidStrategyGreaterThanOrEqualTo(Byte value) {
            addCriterion("bid_strategy >=", value, "bidStrategy");
            return (Criteria) this;
        }

        public Criteria andBidStrategyLessThan(Byte value) {
            addCriterion("bid_strategy <", value, "bidStrategy");
            return (Criteria) this;
        }

        public Criteria andBidStrategyLessThanOrEqualTo(Byte value) {
            addCriterion("bid_strategy <=", value, "bidStrategy");
            return (Criteria) this;
        }

        public Criteria andBidStrategyIn(List<Byte> values) {
            addCriterion("bid_strategy in", values, "bidStrategy");
            return (Criteria) this;
        }

        public Criteria andBidStrategyNotIn(List<Byte> values) {
            addCriterion("bid_strategy not in", values, "bidStrategy");
            return (Criteria) this;
        }

        public Criteria andBidStrategyBetween(Byte value1, Byte value2) {
            addCriterion("bid_strategy between", value1, value2, "bidStrategy");
            return (Criteria) this;
        }

        public Criteria andBidStrategyNotBetween(Byte value1, Byte value2) {
            addCriterion("bid_strategy not between", value1, value2, "bidStrategy");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTargetAgeIsNull() {
            addCriterion("target_age is null");
            return (Criteria) this;
        }

        public Criteria andTargetAgeIsNotNull() {
            addCriterion("target_age is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAgeEqualTo(Long value) {
            addCriterion("target_age =", value, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAgeNotEqualTo(Long value) {
            addCriterion("target_age <>", value, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAgeGreaterThan(Long value) {
            addCriterion("target_age >", value, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAgeGreaterThanOrEqualTo(Long value) {
            addCriterion("target_age >=", value, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAgeLessThan(Long value) {
            addCriterion("target_age <", value, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAgeLessThanOrEqualTo(Long value) {
            addCriterion("target_age <=", value, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAgeIn(List<Long> values) {
            addCriterion("target_age in", values, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAgeNotIn(List<Long> values) {
            addCriterion("target_age not in", values, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAgeBetween(Long value1, Long value2) {
            addCriterion("target_age between", value1, value2, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAgeNotBetween(Long value1, Long value2) {
            addCriterion("target_age not between", value1, value2, "targetAge");
            return (Criteria) this;
        }

        public Criteria andTargetAreaIsNull() {
            addCriterion("target_area is null");
            return (Criteria) this;
        }

        public Criteria andTargetAreaIsNotNull() {
            addCriterion("target_area is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAreaEqualTo(String value) {
            addCriterion("target_area =", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaNotEqualTo(String value) {
            addCriterion("target_area <>", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaGreaterThan(String value) {
            addCriterion("target_area >", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaGreaterThanOrEqualTo(String value) {
            addCriterion("target_area >=", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaLessThan(String value) {
            addCriterion("target_area <", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaLessThanOrEqualTo(String value) {
            addCriterion("target_area <=", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaLike(String value) {
            addCriterion("target_area like", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaNotLike(String value) {
            addCriterion("target_area not like", value, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaIn(List<String> values) {
            addCriterion("target_area in", values, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaNotIn(List<String> values) {
            addCriterion("target_area not in", values, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaBetween(String value1, String value2) {
            addCriterion("target_area between", value1, value2, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetAreaNotBetween(String value1, String value2) {
            addCriterion("target_area not between", value1, value2, "targetArea");
            return (Criteria) this;
        }

        public Criteria andTargetGenderIsNull() {
            addCriterion("target_gender is null");
            return (Criteria) this;
        }

        public Criteria andTargetGenderIsNotNull() {
            addCriterion("target_gender is not null");
            return (Criteria) this;
        }

        public Criteria andTargetGenderEqualTo(Byte value) {
            addCriterion("target_gender =", value, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetGenderNotEqualTo(Byte value) {
            addCriterion("target_gender <>", value, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetGenderGreaterThan(Byte value) {
            addCriterion("target_gender >", value, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("target_gender >=", value, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetGenderLessThan(Byte value) {
            addCriterion("target_gender <", value, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetGenderLessThanOrEqualTo(Byte value) {
            addCriterion("target_gender <=", value, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetGenderIn(List<Byte> values) {
            addCriterion("target_gender in", values, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetGenderNotIn(List<Byte> values) {
            addCriterion("target_gender not in", values, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetGenderBetween(Byte value1, Byte value2) {
            addCriterion("target_gender between", value1, value2, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("target_gender not between", value1, value2, "targetGender");
            return (Criteria) this;
        }

        public Criteria andTargetLbsIsNull() {
            addCriterion("target_lbs is null");
            return (Criteria) this;
        }

        public Criteria andTargetLbsIsNotNull() {
            addCriterion("target_lbs is not null");
            return (Criteria) this;
        }

        public Criteria andTargetLbsEqualTo(String value) {
            addCriterion("target_lbs =", value, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsNotEqualTo(String value) {
            addCriterion("target_lbs <>", value, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsGreaterThan(String value) {
            addCriterion("target_lbs >", value, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsGreaterThanOrEqualTo(String value) {
            addCriterion("target_lbs >=", value, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsLessThan(String value) {
            addCriterion("target_lbs <", value, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsLessThanOrEqualTo(String value) {
            addCriterion("target_lbs <=", value, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsLike(String value) {
            addCriterion("target_lbs like", value, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsNotLike(String value) {
            addCriterion("target_lbs not like", value, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsIn(List<String> values) {
            addCriterion("target_lbs in", values, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsNotIn(List<String> values) {
            addCriterion("target_lbs not in", values, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsBetween(String value1, String value2) {
            addCriterion("target_lbs between", value1, value2, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetLbsNotBetween(String value1, String value2) {
            addCriterion("target_lbs not between", value1, value2, "targetLbs");
            return (Criteria) this;
        }

        public Criteria andTargetOsIsNull() {
            addCriterion("target_os is null");
            return (Criteria) this;
        }

        public Criteria andTargetOsIsNotNull() {
            addCriterion("target_os is not null");
            return (Criteria) this;
        }

        public Criteria andTargetOsEqualTo(Byte value) {
            addCriterion("target_os =", value, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsNotEqualTo(Byte value) {
            addCriterion("target_os <>", value, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsGreaterThan(Byte value) {
            addCriterion("target_os >", value, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsGreaterThanOrEqualTo(Byte value) {
            addCriterion("target_os >=", value, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsLessThan(Byte value) {
            addCriterion("target_os <", value, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsLessThanOrEqualTo(Byte value) {
            addCriterion("target_os <=", value, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsIn(List<Byte> values) {
            addCriterion("target_os in", values, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsNotIn(List<Byte> values) {
            addCriterion("target_os not in", values, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsBetween(Byte value1, Byte value2) {
            addCriterion("target_os between", value1, value2, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsNotBetween(Byte value1, Byte value2) {
            addCriterion("target_os not between", value1, value2, "targetOs");
            return (Criteria) this;
        }

        public Criteria andTargetOsvIsNull() {
            addCriterion("target_osv is null");
            return (Criteria) this;
        }

        public Criteria andTargetOsvIsNotNull() {
            addCriterion("target_osv is not null");
            return (Criteria) this;
        }

        public Criteria andTargetOsvEqualTo(String value) {
            addCriterion("target_osv =", value, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvNotEqualTo(String value) {
            addCriterion("target_osv <>", value, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvGreaterThan(String value) {
            addCriterion("target_osv >", value, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvGreaterThanOrEqualTo(String value) {
            addCriterion("target_osv >=", value, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvLessThan(String value) {
            addCriterion("target_osv <", value, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvLessThanOrEqualTo(String value) {
            addCriterion("target_osv <=", value, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvLike(String value) {
            addCriterion("target_osv like", value, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvNotLike(String value) {
            addCriterion("target_osv not like", value, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvIn(List<String> values) {
            addCriterion("target_osv in", values, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvNotIn(List<String> values) {
            addCriterion("target_osv not in", values, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvBetween(String value1, String value2) {
            addCriterion("target_osv between", value1, value2, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetOsvNotBetween(String value1, String value2) {
            addCriterion("target_osv not between", value1, value2, "targetOsv");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeIsNull() {
            addCriterion("target_income is null");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeIsNotNull() {
            addCriterion("target_income is not null");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeEqualTo(Integer value) {
            addCriterion("target_income =", value, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeNotEqualTo(Integer value) {
            addCriterion("target_income <>", value, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeGreaterThan(Integer value) {
            addCriterion("target_income >", value, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_income >=", value, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeLessThan(Integer value) {
            addCriterion("target_income <", value, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeLessThanOrEqualTo(Integer value) {
            addCriterion("target_income <=", value, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeIn(List<Integer> values) {
            addCriterion("target_income in", values, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeNotIn(List<Integer> values) {
            addCriterion("target_income not in", values, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeBetween(Integer value1, Integer value2) {
            addCriterion("target_income between", value1, value2, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetIncomeNotBetween(Integer value1, Integer value2) {
            addCriterion("target_income not between", value1, value2, "targetIncome");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorIsNull() {
            addCriterion("target_behavior is null");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorIsNotNull() {
            addCriterion("target_behavior is not null");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorEqualTo(String value) {
            addCriterion("target_behavior =", value, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorNotEqualTo(String value) {
            addCriterion("target_behavior <>", value, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorGreaterThan(String value) {
            addCriterion("target_behavior >", value, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorGreaterThanOrEqualTo(String value) {
            addCriterion("target_behavior >=", value, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorLessThan(String value) {
            addCriterion("target_behavior <", value, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorLessThanOrEqualTo(String value) {
            addCriterion("target_behavior <=", value, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorLike(String value) {
            addCriterion("target_behavior like", value, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorNotLike(String value) {
            addCriterion("target_behavior not like", value, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorIn(List<String> values) {
            addCriterion("target_behavior in", values, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorNotIn(List<String> values) {
            addCriterion("target_behavior not in", values, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorBetween(String value1, String value2) {
            addCriterion("target_behavior between", value1, value2, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetBehaviorNotBetween(String value1, String value2) {
            addCriterion("target_behavior not between", value1, value2, "targetBehavior");
            return (Criteria) this;
        }

        public Criteria andTargetMediaIsNull() {
            addCriterion("target_media is null");
            return (Criteria) this;
        }

        public Criteria andTargetMediaIsNotNull() {
            addCriterion("target_media is not null");
            return (Criteria) this;
        }

        public Criteria andTargetMediaEqualTo(String value) {
            addCriterion("target_media =", value, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaNotEqualTo(String value) {
            addCriterion("target_media <>", value, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaGreaterThan(String value) {
            addCriterion("target_media >", value, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaGreaterThanOrEqualTo(String value) {
            addCriterion("target_media >=", value, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaLessThan(String value) {
            addCriterion("target_media <", value, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaLessThanOrEqualTo(String value) {
            addCriterion("target_media <=", value, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaLike(String value) {
            addCriterion("target_media like", value, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaNotLike(String value) {
            addCriterion("target_media not like", value, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaIn(List<String> values) {
            addCriterion("target_media in", values, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaNotIn(List<String> values) {
            addCriterion("target_media not in", values, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaBetween(String value1, String value2) {
            addCriterion("target_media between", value1, value2, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetMediaNotBetween(String value1, String value2) {
            addCriterion("target_media not between", value1, value2, "targetMedia");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalIsNull() {
            addCriterion("target_terminal is null");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalIsNotNull() {
            addCriterion("target_terminal is not null");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalEqualTo(Byte value) {
            addCriterion("target_terminal =", value, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalNotEqualTo(Byte value) {
            addCriterion("target_terminal <>", value, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalGreaterThan(Byte value) {
            addCriterion("target_terminal >", value, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalGreaterThanOrEqualTo(Byte value) {
            addCriterion("target_terminal >=", value, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalLessThan(Byte value) {
            addCriterion("target_terminal <", value, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalLessThanOrEqualTo(Byte value) {
            addCriterion("target_terminal <=", value, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalIn(List<Byte> values) {
            addCriterion("target_terminal in", values, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalNotIn(List<Byte> values) {
            addCriterion("target_terminal not in", values, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalBetween(Byte value1, Byte value2) {
            addCriterion("target_terminal between", value1, value2, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetTerminalNotBetween(Byte value1, Byte value2) {
            addCriterion("target_terminal not between", value1, value2, "targetTerminal");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeIsNull() {
            addCriterion("target_devicetype is null");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeIsNotNull() {
            addCriterion("target_devicetype is not null");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeEqualTo(Integer value) {
            addCriterion("target_devicetype =", value, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeNotEqualTo(Integer value) {
            addCriterion("target_devicetype <>", value, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeGreaterThan(Integer value) {
            addCriterion("target_devicetype >", value, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_devicetype >=", value, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeLessThan(Integer value) {
            addCriterion("target_devicetype <", value, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeLessThanOrEqualTo(Integer value) {
            addCriterion("target_devicetype <=", value, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeIn(List<Integer> values) {
            addCriterion("target_devicetype in", values, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeNotIn(List<Integer> values) {
            addCriterion("target_devicetype not in", values, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeBetween(Integer value1, Integer value2) {
            addCriterion("target_devicetype between", value1, value2, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetDevicetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("target_devicetype not between", value1, value2, "targetDevicetype");
            return (Criteria) this;
        }

        public Criteria andTargetModelIsNull() {
            addCriterion("target_model is null");
            return (Criteria) this;
        }

        public Criteria andTargetModelIsNotNull() {
            addCriterion("target_model is not null");
            return (Criteria) this;
        }

        public Criteria andTargetModelEqualTo(Integer value) {
            addCriterion("target_model =", value, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetModelNotEqualTo(Integer value) {
            addCriterion("target_model <>", value, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetModelGreaterThan(Integer value) {
            addCriterion("target_model >", value, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_model >=", value, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetModelLessThan(Integer value) {
            addCriterion("target_model <", value, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetModelLessThanOrEqualTo(Integer value) {
            addCriterion("target_model <=", value, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetModelIn(List<Integer> values) {
            addCriterion("target_model in", values, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetModelNotIn(List<Integer> values) {
            addCriterion("target_model not in", values, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetModelBetween(Integer value1, Integer value2) {
            addCriterion("target_model between", value1, value2, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetModelNotBetween(Integer value1, Integer value2) {
            addCriterion("target_model not between", value1, value2, "targetModel");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierIsNull() {
            addCriterion("target_carrier is null");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierIsNotNull() {
            addCriterion("target_carrier is not null");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierEqualTo(Integer value) {
            addCriterion("target_carrier =", value, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierNotEqualTo(Integer value) {
            addCriterion("target_carrier <>", value, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierGreaterThan(Integer value) {
            addCriterion("target_carrier >", value, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_carrier >=", value, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierLessThan(Integer value) {
            addCriterion("target_carrier <", value, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierLessThanOrEqualTo(Integer value) {
            addCriterion("target_carrier <=", value, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierIn(List<Integer> values) {
            addCriterion("target_carrier in", values, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierNotIn(List<Integer> values) {
            addCriterion("target_carrier not in", values, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierBetween(Integer value1, Integer value2) {
            addCriterion("target_carrier between", value1, value2, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetCarrierNotBetween(Integer value1, Integer value2) {
            addCriterion("target_carrier not between", value1, value2, "targetCarrier");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeIsNull() {
            addCriterion("target_connection_type is null");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeIsNotNull() {
            addCriterion("target_connection_type is not null");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeEqualTo(Integer value) {
            addCriterion("target_connection_type =", value, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeNotEqualTo(Integer value) {
            addCriterion("target_connection_type <>", value, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeGreaterThan(Integer value) {
            addCriterion("target_connection_type >", value, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("target_connection_type >=", value, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeLessThan(Integer value) {
            addCriterion("target_connection_type <", value, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("target_connection_type <=", value, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeIn(List<Integer> values) {
            addCriterion("target_connection_type in", values, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeNotIn(List<Integer> values) {
            addCriterion("target_connection_type not in", values, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeBetween(Integer value1, Integer value2) {
            addCriterion("target_connection_type between", value1, value2, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetConnectionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("target_connection_type not between", value1, value2, "targetConnectionType");
            return (Criteria) this;
        }

        public Criteria andTargetExtIsNull() {
            addCriterion("target_ext is null");
            return (Criteria) this;
        }

        public Criteria andTargetExtIsNotNull() {
            addCriterion("target_ext is not null");
            return (Criteria) this;
        }

        public Criteria andTargetExtEqualTo(String value) {
            addCriterion("target_ext =", value, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtNotEqualTo(String value) {
            addCriterion("target_ext <>", value, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtGreaterThan(String value) {
            addCriterion("target_ext >", value, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtGreaterThanOrEqualTo(String value) {
            addCriterion("target_ext >=", value, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtLessThan(String value) {
            addCriterion("target_ext <", value, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtLessThanOrEqualTo(String value) {
            addCriterion("target_ext <=", value, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtLike(String value) {
            addCriterion("target_ext like", value, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtNotLike(String value) {
            addCriterion("target_ext not like", value, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtIn(List<String> values) {
            addCriterion("target_ext in", values, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtNotIn(List<String> values) {
            addCriterion("target_ext not in", values, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtBetween(String value1, String value2) {
            addCriterion("target_ext between", value1, value2, "targetExt");
            return (Criteria) this;
        }

        public Criteria andTargetExtNotBetween(String value1, String value2) {
            addCriterion("target_ext not between", value1, value2, "targetExt");
            return (Criteria) this;
        }

        public Criteria andDealIdIsNull() {
            addCriterion("deal_id is null");
            return (Criteria) this;
        }

        public Criteria andDealIdIsNotNull() {
            addCriterion("deal_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealIdEqualTo(String value) {
            addCriterion("deal_id =", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotEqualTo(String value) {
            addCriterion("deal_id <>", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThan(String value) {
            addCriterion("deal_id >", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdGreaterThanOrEqualTo(String value) {
            addCriterion("deal_id >=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThan(String value) {
            addCriterion("deal_id <", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLessThanOrEqualTo(String value) {
            addCriterion("deal_id <=", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdLike(String value) {
            addCriterion("deal_id like", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotLike(String value) {
            addCriterion("deal_id not like", value, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdIn(List<String> values) {
            addCriterion("deal_id in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotIn(List<String> values) {
            addCriterion("deal_id not in", values, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdBetween(String value1, String value2) {
            addCriterion("deal_id between", value1, value2, "dealId");
            return (Criteria) this;
        }

        public Criteria andDealIdNotBetween(String value1, String value2) {
            addCriterion("deal_id not between", value1, value2, "dealId");
            return (Criteria) this;
        }

        public Criteria andImpTrackersIsNull() {
            addCriterion("imp_trackers is null");
            return (Criteria) this;
        }

        public Criteria andImpTrackersIsNotNull() {
            addCriterion("imp_trackers is not null");
            return (Criteria) this;
        }

        public Criteria andImpTrackersEqualTo(String value) {
            addCriterion("imp_trackers =", value, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersNotEqualTo(String value) {
            addCriterion("imp_trackers <>", value, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersGreaterThan(String value) {
            addCriterion("imp_trackers >", value, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersGreaterThanOrEqualTo(String value) {
            addCriterion("imp_trackers >=", value, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersLessThan(String value) {
            addCriterion("imp_trackers <", value, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersLessThanOrEqualTo(String value) {
            addCriterion("imp_trackers <=", value, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersLike(String value) {
            addCriterion("imp_trackers like", value, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersNotLike(String value) {
            addCriterion("imp_trackers not like", value, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersIn(List<String> values) {
            addCriterion("imp_trackers in", values, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersNotIn(List<String> values) {
            addCriterion("imp_trackers not in", values, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersBetween(String value1, String value2) {
            addCriterion("imp_trackers between", value1, value2, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andImpTrackersNotBetween(String value1, String value2) {
            addCriterion("imp_trackers not between", value1, value2, "impTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersIsNull() {
            addCriterion("clk_trackers is null");
            return (Criteria) this;
        }

        public Criteria andClkTrackersIsNotNull() {
            addCriterion("clk_trackers is not null");
            return (Criteria) this;
        }

        public Criteria andClkTrackersEqualTo(String value) {
            addCriterion("clk_trackers =", value, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersNotEqualTo(String value) {
            addCriterion("clk_trackers <>", value, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersGreaterThan(String value) {
            addCriterion("clk_trackers >", value, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersGreaterThanOrEqualTo(String value) {
            addCriterion("clk_trackers >=", value, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersLessThan(String value) {
            addCriterion("clk_trackers <", value, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersLessThanOrEqualTo(String value) {
            addCriterion("clk_trackers <=", value, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersLike(String value) {
            addCriterion("clk_trackers like", value, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersNotLike(String value) {
            addCriterion("clk_trackers not like", value, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersIn(List<String> values) {
            addCriterion("clk_trackers in", values, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersNotIn(List<String> values) {
            addCriterion("clk_trackers not in", values, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersBetween(String value1, String value2) {
            addCriterion("clk_trackers between", value1, value2, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andClkTrackersNotBetween(String value1, String value2) {
            addCriterion("clk_trackers not between", value1, value2, "clkTrackers");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNull() {
            addCriterion("bid_price is null");
            return (Criteria) this;
        }

        public Criteria andBidPriceIsNotNull() {
            addCriterion("bid_price is not null");
            return (Criteria) this;
        }

        public Criteria andBidPriceEqualTo(Integer value) {
            addCriterion("bid_price =", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotEqualTo(Integer value) {
            addCriterion("bid_price <>", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThan(Integer value) {
            addCriterion("bid_price >", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid_price >=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThan(Integer value) {
            addCriterion("bid_price <", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceLessThanOrEqualTo(Integer value) {
            addCriterion("bid_price <=", value, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceIn(List<Integer> values) {
            addCriterion("bid_price in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotIn(List<Integer> values) {
            addCriterion("bid_price not in", values, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceBetween(Integer value1, Integer value2) {
            addCriterion("bid_price between", value1, value2, "bidPrice");
            return (Criteria) this;
        }

        public Criteria andBidPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("bid_price not between", value1, value2, "bidPrice");
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