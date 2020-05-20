package com.leg.test.service;


public interface LoginService {
    String login(Integer ID, String PASSWORD);

    String register(Integer id, String password, Integer age, String work_city, String work_province, String work_country);

}
