package com.spring.parking.dao;

import com.spring.parking.bean.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDao extends JpaRepository<TestEntity, Long> {
}
