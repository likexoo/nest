package com.xiongzhikai.nest.controllers;

import com.mongodb.client.MongoClient;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    public MongoClient mainDatasource;

    @GetMapping("/customer")
    public Document getAllCustomers() {
        Document r = this.mainDatasource.getDatabase("nest").getCollection("Customer").find().first();
        return r;
    }

}
