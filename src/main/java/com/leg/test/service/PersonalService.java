package com.leg.test.service;

import com.leg.test.domain.po.Personal;

public interface PersonalService {
    Personal findById(Integer id);

    String update(Personal personal);

    String validatePassword(Integer ID, String oldPassword);

    String updatePassword(Integer ID, String oldPassword, String newPassword);
}
