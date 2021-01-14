package com.xiongzhikai.services;

import javax.annotation.PostConstruct;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.xiongzhikai.nest.models.Customer;

import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService<M> {

    @Autowired
    private MongoDatabase mainDatabase;

    private MongoCollection<M> collection;

    private final Class<M> model;

    public AccountService(Class<M> model) {
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

    public M setPassword(ObjectId _id, String oldPassword, String newPassword) {
        // 
        Bson filter = Filters.eq("_id", _id);
        M account = this.collection.find(filter).first();
        // 
        // account.
        //
        return null;
    }

}
