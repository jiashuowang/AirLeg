package com.leg.test.domain.po;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "admin")//user跟这个表有对应关系
public class Member implements Serializable {
    @Id //主键
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //id自增
    private Integer ID;
    @Column(name = "FFP_DATE")
    private String ffp_date;
    @Column(name = "FFP_TIER")
    private int ffp_tier;
    private Integer AGE;
    @Column(name = "FLIGHT_COUNT")
    private int flight_count;
    private String CLUSTER;
    @Column(name = "AVG_DISCOUNT")
    private double avg_discount;


    public Member() {
    }

    public Member(Integer ID, String ffp_date, int ffp_tier, Integer AGE, int flight_count, String CLUSTER, double avg_discount) {
        this.ID = ID;
        this.ffp_date = ffp_date;
        this.ffp_tier = ffp_tier;
        this.AGE = AGE;
        this.flight_count = flight_count;
        this.CLUSTER = CLUSTER;
        this.avg_discount = avg_discount;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFfp_date() {
        return ffp_date;
    }

    public void setFfp_date(String ffp_date) {
        this.ffp_date = ffp_date;
    }

    public int getFfp_tier() {
        return ffp_tier;
    }

    public void setFfp_tier(int ffp_tier) {
        this.ffp_tier = ffp_tier;
    }

    public Integer getAGE() {
        return AGE;
    }

    public void setAGE(Integer AGE) {
        this.AGE = AGE;
    }

    public int getFlight_count() {
        return flight_count;
    }

    public void setFlight_count(int flight_count) {
        this.flight_count = flight_count;
    }

    public String getCLUSTER() {
        return CLUSTER;
    }

    public void setCLUSTER(String CLUSTER) {
        this.CLUSTER = CLUSTER;
    }

    public double getAvg_discount() {
        return avg_discount;
    }

    public void setAvg_discount(double avg_discount) {
        this.avg_discount = avg_discount;
    }

    @Override
    public String toString() {
        return "Member{" +
                "ID=" + ID +
                ", ffp_date='" + ffp_date + '\'' +
                ", ffp_tier=" + ffp_tier +
                ", AGE=" + AGE +
                ", flight_count=" + flight_count +
                ", CLUSTER='" + CLUSTER + '\'' +
                ", avg_discount=" + avg_discount +
                '}';
    }
}
