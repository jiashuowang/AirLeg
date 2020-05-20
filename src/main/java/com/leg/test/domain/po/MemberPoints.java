package com.leg.test.domain.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "member_points")
public class MemberPoints implements Serializable {
    @Id //主键
    @Column(name = "ID")
    private Integer id;
    @Column(name = "SEG_KM_SUM")
    private int seg_km_sum;
    @Column(name = "EXCHANGE_COUNT")
    private int exchange_count;
    @Column(name = "EP_SUM")
    private int ep_sum;
    @Column(name = "ADD_POINTS_SUM")
    private int add_point_sum;
    @Column(name = "POINTS_SUM")
    private int points_sum;

    public MemberPoints() {
    }
    public MemberPoints(Integer id, int seg_km_sum, int exchange_count, int ep_sum, int add_point_sum, int points_sum){
        this.id = id;
        this.seg_km_sum = seg_km_sum;
        this.exchange_count = exchange_count;
        this.ep_sum = ep_sum;
        this.add_point_sum = add_point_sum;
        this.points_sum = points_sum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSeg_km_sum() {
        return seg_km_sum;
    }

    public void setSeg_km_sum(int seg_km_sum) {
        this.seg_km_sum = seg_km_sum;
    }

    public int getExchange_count() {
        return exchange_count;
    }

    public void setExchange_count(int exchange_count) {
        this.exchange_count = exchange_count;
    }

    public int getEp_sum() {
        return ep_sum;
    }

    public void setEp_sum(int ep_sum) {
        this.ep_sum = ep_sum;
    }

    public int getAdd_point_sum() {
        return add_point_sum;
    }

    public void setAdd_point_sum(int add_point_sum) {
        this.add_point_sum = add_point_sum;
    }

    public int getPoints_sum() {
        return points_sum;
    }

    public void setPoints_sum(int points_sum) {
        this.points_sum = points_sum;
    }

    @Override
    public String toString() {
        return "MemberPoints{" +
                "id=" + id +
                ", seg_km_sum=" + seg_km_sum +
                ", exchange_count=" + exchange_count +
                ", ep_sum=" + ep_sum +
                ", add_point_sum=" + add_point_sum +
                ", points_sum=" + points_sum +
                '}';
    }
}
