package com.leg.test.domain.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "login")
public class Login implements Serializable {
    @Id //主键
//    @GeneratedValue(strategy = GenerationType.IDENTITY) //id自增
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PASSWORD")
    private String password;

    public Login() {
    }

    public Login(Integer id, String password){
        this.id = id;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
