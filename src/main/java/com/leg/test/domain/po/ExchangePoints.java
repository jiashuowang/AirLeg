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
    private String flightno;
    @Column(name = "POINTS_NEED")
    private int pointsneed;
    @Column(name = "DEP_CT")
    private String depct;
    @Column(name = "ARR_CT")
    private String arrct;
    @Column(name = "DEP_TIME")
    private String deptime;

    public ExchangePoints() {
    }

    public ExchangePoints(String flight_no, String dep_ct, String arr_ct, String dep_time){
        this.flightno = flight_no;
        this.depct = dep_ct;
        this.arrct = arr_ct;
        this.deptime = dep_time;
    }

    public ExchangePoints(String flight_no, int points_need, String dep_ct, String arr_ct, String dep_time){
        this.flightno = flight_no;
        this.pointsneed = points_need;
        this.depct = dep_ct;
        this.arrct = arr_ct;
        this.deptime = dep_time;
    }

    public String getFlight_no() {
        return flightno;
    }

    public void setFlight_no(String flight_no) {
        this.flightno = flight_no;
    }

    public int getPoints_need() {
        return pointsneed;
    }

    public void setPoints_need(int points_need) {
        this.pointsneed = points_need;
    }

    public String getDep_ct() {
        return depct;
    }

    public void setDep_ct(String dep_ct) {
        this.depct = dep_ct;
    }

    public String getArr_ct() {
        return arrct;
    }

    public void setArr_ct(String arr_ct) {
        this.arrct = arr_ct;
    }

    public String getDep_time() {
        return deptime;
    }

    public void setDep_time(String dep_time) {
        this.deptime = dep_time;
    }

    @Override
    public String toString() {
        return "ExchangePoints{" +
                "flightno='" + flightno + '\'' +
                ", pointsneed=" + pointsneed +
                ", depct='" + depct + '\'' +
                ", arrct='" + arrct + '\'' +
                ", deptime='" + deptime + '\'' +
                '}';
    }
}
