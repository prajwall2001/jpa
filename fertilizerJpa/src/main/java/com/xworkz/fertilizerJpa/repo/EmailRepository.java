package com.xworkz.fertilizerJpa.repo;

import com.xworkz.fertilizerJpa.entity.EmailEntity;

public interface EmailRepository {
    Integer save(EmailEntity entity);

}
