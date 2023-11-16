package com.spring.parking.controller;

import com.spring.parking.bean.TestEntity;
import com.spring.parking.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/parking")
public class TestController {

    @Autowired
    private TestDao testDao;

    @GetMapping("/test")
    public String getTest(){
        TestEntity testEntity = new TestEntity();
        testEntity.setName("test");
        testDao.save(testEntity);
        return "successfully";
    }
}
