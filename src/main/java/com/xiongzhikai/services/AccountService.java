package com.xiongzhikai.services;

import javax.annotation.PostConstruct;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService<T> {

    @Autowired
    private MongoDatabase mainDatabase;

    private MongoCollection<T> collection;

    private final Class<T> model;

    public AccountService(Class<T> model) {
        if (model.getName() == "Customer") {
            this.model = model;
        } else {
            throw new Error("Cannot using unknown model in AccountService's initialization.");
        }
    }

    @PostConstruct
    public void init() {
        if (model.getName() == "Customer") {
            this.collection = this.mainDatabase.getCollection("Customer", model);
        }
    }

    public T setPassword(ObjectId _id, String oldPassword, String newPassword) {
        // 
        Bson filter = Filters.eq("_id", _id);
        T account = this.collection.find(filter).first();
        // 
        // account.
        //
        return null;
    }

}
