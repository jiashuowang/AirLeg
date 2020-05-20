package com.leg.test.domain.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "personal_center")
public class Personal implements Serializable {
    @Id //主键
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FFP_DATE")
    private String ffp_date;
    @Column(name = "FFP_TIER")
    private int ffp_tier;
    @Column(name = "AGE")
    private Integer age;
    @Column(name = "WORK_CITY")
    private String work_city;
    @Column(name = "WORK_PROVINCE")
    private String work_province;
    @Column(name = "WORK_COUNTRY")
    private String work_country;
    @Column(name = "FLIGHT_COUNT")
    private int flight_count;
    @Column(name = "PASSWORD")
    private String password;

    public Personal() {
    }

    public Personal(Integer id, String ffp_date, int ffp_tier, Integer age, String work_city, String work_province, String work_country, int flight_count, String password){
        this.id = id;
        this.ffp_date = ffp_date;
        this.ffp_tier = ffp_tier;
        this.age = age;
        this.work_city = work_city;
        this.work_province = work_province;
        this.work_country = work_country;
        this.flight_count = flight_count;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWork_city() {
        return work_city;
    }

    public void setWork_city(String work_city) {
        this.work_city = work_city;
    }

    public String getWork_province() {
        return work_province;
    }

    public void setWork_province(String work_province) {
        this.work_province = work_province;
    }

    public String getWork_country() {
        return work_country;
    }

    public void setWork_country(String work_country) {
        this.work_country = work_country;
    }

    public int getFlight_count() {
        return flight_count;
    }

    public void setFlight_count(int flight_count) {
        this.flight_count = flight_count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "id=" + id +
                ", ffp_date='" + ffp_date + '\'' +
                ", ffp_tier=" + ffp_tier +
                ", age=" + age +
                ", work_city='" + work_city + '\'' +
                ", work_province='" + work_province + '\'' +
                ", work_country='" + work_country + '\'' +
                ", flight_count=" + flight_count +
                ", password='" + password + '\'' +
                '}';
    }
}
