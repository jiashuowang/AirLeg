package com.leg.test.domain.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "exchange_points")
public class ExchangePoints implements Serializable {
    @Id //主键
    @Column(name = "FLIGHT_NO")
    private String flight_no;
    @Column(name = "POINTS_NEED")
    private int points_need;
    @Column(name = "DEP_CT")
    private String dep_ct;
    @Column(name = "ARR_CT")
    private String arr_ct;
    @Column(name = "DEP_TIME")
    private String dep_time;

    public ExchangePoints() {
    }

    public ExchangePoints(String flight_no, String dep_ct, String arr_ct, String dep_time){
        this.flight_no = flight_no;
        this.dep_ct = dep_ct;
        this.arr_ct = arr_ct;
        this.dep_time = dep_time;
    }

    public ExchangePoints(String flight_no, int points_need, String dep_ct, String arr_ct, String dep_time){
        this.flight_no = flight_no;
        this.points_need = points_need;
        this.dep_ct = dep_ct;
        this.arr_ct = arr_ct;
        this.dep_time = dep_time;
    }

    public String getFlight_no() {
        return flight_no;
    }

    public void setFlight_no(String flight_no) {
        this.flight_no = flight_no;
    }

    public int getPoints_need() {
        return points_need;
    }

    public void setPoints_need(int points_need) {
        this.points_need = points_need;
    }

    public String getDep_ct() {
        return dep_ct;
    }

    public void setDep_ct(String dep_ct) {
        this.dep_ct = dep_ct;
    }

    public String getArr_ct() {
        return arr_ct;
    }

    public void setArr_ct(String arr_ct) {
        this.arr_ct = arr_ct;
    }

    public String getDep_time() {
        return dep_time;
    }

    public void setDep_time(String dep_time) {
        this.dep_time = dep_time;
    }

    @Override
    public String toString() {
        return "ExchangePoints{" +
                "flight_no='" + flight_no + '\'' +
                ", points_need=" + points_need +
                ", dep_ct='" + dep_ct + '\'' +
                ", arr_ct='" + arr_ct + '\'' +
                ", dep_time='" + dep_time + '\'' +
                '}';
    }
}
