package com.leg.test.domain.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "flight_query")//user跟这个表有对应关系
public class Flight implements Serializable {
    @Id //主键
    @Column(name = "FLIGHT_NO")
    private String flightno;
    @Column(name = "DEP_CT")
    private String dep_ct;
    @Column(name = "DEP_CODE")
    private String dep_code;
    @Column(name = "ARR_CT")
    private String arr_ct;
    @Column(name = "ARR_CODE")
    private String arr_code;
    @Column(name = "DEP_TERMINAL")
    private String dep_terminal;
    @Column(name = "ARR_TERMINAL")
    private String arr_terminal;
    @Column(name = "DEP_SCHEDULED")
    private String depscheduled;
    @Column(name = "ARR_SCHEDULED")
    private String arr_scheduled;
    @Column(name = "DEP_ACTUAL")
    private String dep_actual;
    @Column(name = "ARR_ACTUAL")
    private String arr_actual;
    @Column(name = "FLIGHT_STATE")
    private String flight_state;
    @Column(name = "PRICE")
    private int price;
    @Column(name = "DATE")
    private String date;

    public Flight() {
    }

    public Flight(String FLIGHT_NO, String DEP_CT, String DEP_CODE, String ARR_CT, String ARR_CODE, String DEP_TERMINAL, String ARR_TERMINAL, String DEP_SCHEDULED, String ARR_SCHEDULED, String DEP_ACTUAL, String ARR_ACTUAL, String FLIGHT_STATE, int price, String date) {
        this.flightno = FLIGHT_NO;
        this.dep_ct = DEP_CT;
        this.dep_code = DEP_CODE;
        this.arr_ct = ARR_CT;
        this.arr_code = ARR_CODE;
        this.dep_terminal = DEP_TERMINAL;
        this.arr_terminal = ARR_TERMINAL;
        this.depscheduled = DEP_SCHEDULED;
        this.arr_scheduled = ARR_SCHEDULED;
        this.dep_actual = DEP_ACTUAL;
        this.arr_actual = ARR_ACTUAL;
        this.flight_state = FLIGHT_STATE;
        this.price = price;
        this.date = date;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public String getDepscheduled() {
        return depscheduled;
    }

    public void setDepscheduled(String depscheduled) {
        this.depscheduled = depscheduled;
    }

    public String getDep_ct() {
        return dep_ct;
    }

    public void setDep_ct(String dep_ct) {
        this.dep_ct = dep_ct;
    }

    public String getDep_code() {
        return dep_code;
    }

    public void setDep_code(String dep_code) {
        this.dep_code = dep_code;
    }

    public String getArr_ct() {
        return arr_ct;
    }

    public void setArr_ct(String arr_ct) {
        this.arr_ct = arr_ct;
    }

    public String getArr_code() {
        return arr_code;
    }

    public void setArr_code(String arr_code) {
        this.arr_code = arr_code;
    }

    public String getDep_terminal() {
        return dep_terminal;
    }

    public void setDep_terminal(String dep_terminal) {
        this.dep_terminal = dep_terminal;
    }

    public String getArr_terminal() {
        return arr_terminal;
    }

    public void setArr_terminal(String arr_terminal) {
        this.arr_terminal = arr_terminal;
    }



    public String getArr_scheduled() {
        return arr_scheduled;
    }

    public void setArr_scheduled(String arr_scheduled) {
        this.arr_scheduled = arr_scheduled;
    }

    public String getDep_actual() {
        return dep_actual;
    }

    public void setDep_actual(String dep_actual) {
        this.dep_actual = dep_actual;
    }

    public String getArr_actual() {
        return arr_actual;
    }

    public void setArr_actual(String arr_actual) {
        this.arr_actual = arr_actual;
    }

    public String getFlight_state() {
        return flight_state;
    }

    public void setFlight_state(String flight_state) {
        this.flight_state = flight_state;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "flightno='" + flightno + '\'' +
                ", dep_ct='" + dep_ct + '\'' +
                ", dep_code='" + dep_code + '\'' +
                ", arr_ct='" + arr_ct + '\'' +
                ", arr_code='" + arr_code + '\'' +
                ", dep_terminal='" + dep_terminal + '\'' +
                ", arr_terminal='" + arr_terminal + '\'' +
                ", depscheduled='" + depscheduled + '\'' +
                ", arr_scheduled='" + arr_scheduled + '\'' +
                ", dep_actual='" + dep_actual + '\'' +
                ", arr_actual='" + arr_actual + '\'' +
                ", flight_state='" + flight_state + '\'' +
                ", price=" + price +
                ", date='" + date + '\'' +
                '}';
    }
}
