package com.xiongzhikai.nest.models;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;

@BsonDiscriminator
public final class Customer {

    private String _id;
    private String nickname;
    private String first_name;
    private String last_name;
    private String phone;
    private String password;

    public Customer() {
    }

    public Customer(String _id, String nickname, String first_name, String last_name, String phone, String password) {
        this._id = _id;
        this.nickname = nickname;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" + " _id='" + getId() + "'" + ", nickname='" + getNickname() + "'" + ", first_name='" + getFirstName()
                + "'" + ", last_name='" + getLastName() + "'" + ", phone='" + getPhone() + "'" + ", password='"
                + getPassword() + "'" + "}";

    }

    @BsonId
    public String getId() {
        return this._id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return this.first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return this.last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
