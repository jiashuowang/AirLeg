package com.leg.test.domain.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "place_recommendation")
public class Place implements Serializable {
    @Id //主键
    @Column(name = "PLACE_NAME")
    private  String placeName;
    @Column(name = "PLACE_URL")
    private String placeURL;
    @Column(name = "JUMP_PAGE")
    private String jumpPage;

    public Place(){

    }

    public Place(String placeName, String placeURL, String jumpPage) {
        this.placeName = placeName;
        this.placeURL = placeURL;
        this.jumpPage = jumpPage;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceURL() {
        return placeURL;
    }

    public void setPlaceURL(String placeURL) {
        this.placeURL = placeURL;
    }

    public String getJumpPage() {
        return jumpPage;
    }

    public void setJumpPage(String jumpPage) {
        this.jumpPage = jumpPage;
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeName='" + placeName + '\'' +
                ", placeURL='" + placeURL + '\'' +
                ", jumpPage='" + jumpPage + '\'' +
                '}';
    }
}
