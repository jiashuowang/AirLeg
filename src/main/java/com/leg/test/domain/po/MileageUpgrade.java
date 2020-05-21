package com.leg.test.domain.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "mileage_upgrade")
public class MileageUpgrade implements Serializable {
    @Id //主键
    @Column(name = "FLIGHT_NO")
    private String flightNo;
    @Column(name = "MILEAGE")
    private Integer mileage;

    public MileageUpgrade(){}

    public MileageUpgrade(String flightNo, Integer mileage) {
        this.flightNo = flightNo;
        this.mileage = mileage;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "MileageUpgrade{" +
                "flightNo='" + flightNo + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
