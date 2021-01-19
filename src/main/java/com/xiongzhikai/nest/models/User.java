package com.xiongzhikai.nest.models;

import java.util.Date;
import java.util.Optional;

import com.xiongzhikai.nest.entities.FirstLevelCommentMessage;
import com.xiongzhikai.nest.entities.SecondLevelCommentMessage;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonProperty;

@BsonDiscriminator
public final class User {

    // ==================
    // Key Info
    // ==================

    @BsonId
    private Optional<String> _id ;
    private Optional<String> phone_prefix;
    private Optional<String> phone;
    private Optional<String> nickname;
    private Optional<String> email;

    // ==================
    // Basic Info
    // ==================

    private Optional<String> first_name;
    private Optional<String> last_name;
    private Optional<String> password;
    private Optional<Integer> score;
    private Optional<Integer> level;
    private Optional<Float> exp;
    private Optional<UserRoles> roles;

    // ==================
    // Message Info
    // ==================

    @BsonProperty(useDiscriminator = true)
    private Optional<FirstLevelCommentMessage[]> first_level_comment_messages;
    @BsonProperty(useDiscriminator = true)
    private Optional<SecondLevelCommentMessage[]> second_level_comment_messages;

    // ==================
    // Record Info
    // ==================
    
    private Optional<Date> creation_date;
    private Optional<String> upvote_records;
    private Optional<String> downvote_Records;

    // Getters Setters

    public Optional<String> getId() {
        return this._id;
    }

    public void setId(Optional<String> _id) {
        this._id = _id;
    }

    public Optional<String> getPhonePrefix() {
        return this.phone_prefix;
    }

    public void setPhonePrefix(Optional<String> phone_prefix) {
        this.phone_prefix = phone_prefix;
    }

    public Optional<String> getPhone() {
        return this.phone;
    }

    public void setPhone(Optional<String> phone) {
        this.phone = phone;
    }

    public Optional<String> getNickname() {
        return this.nickname;
    }

    public void setNickname(Optional<String> nickname) {
        this.nickname = nickname;
    }

    public Optional<String> getEmail() {
        return this.email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public Optional<String> getFirstName() {
        return this.first_name;
    }

    public void setFirstName(Optional<String> first_name) {
        this.first_name = first_name;
    }

    public Optional<String> getLastName() {
        return this.last_name;
    }

    public void setLastName(Optional<String> last_name) {
        this.last_name = last_name;
    }

    public Optional<String> getPassword() {
        return this.password;
    }

    public void setPassword(Optional<String> password) {
        this.password = password;
    }

    public Optional<Integer> getScore() {
        return this.score;
    }

    public void setScore(Optional<Integer> score) {
        this.score = score;
    }

    public Optional<Integer> getLevel() {
        return this.level;
    }

    public void setLevel(Optional<Integer> level) {
        this.level = level;
    }

    public Optional<Float> getExp() {
        return this.exp;
    }

    public void setExp(Optional<Float> exp) {
        this.exp = exp;
    }

    public Optional<UserRoles> getRoles() {
        return this.roles;
    }

    public void setRoles(Optional<UserRoles> roles) {
        this.roles = roles;
    }

    public Optional<FirstLevelCommentMessage[]> getFirstLevelCommentMessages() {
        return this.first_level_comment_messages;
    }

    public void setFirstLevelCommentMessages(Optional<FirstLevelCommentMessage[]> first_level_comment_messages) {
        this.first_level_comment_messages = first_level_comment_messages;
    }

    public Optional<SecondLevelCommentMessage[]> getSecondLevelCommentMessages() {
        return this.second_level_comment_messages;
    }

    public void setSecondLevelCommentMessages(Optional<SecondLevelCommentMessage[]> second_level_comment_messages) {
        this.second_level_comment_messages = second_level_comment_messages;
    }

    public Optional<Date> getCreationDate() {
        return this.creation_date;
    }

    public void setCreationDate(Optional<Date> creation_date) {
        this.creation_date = creation_date;
    }

    public Optional<String> getUpvoteRecords() {
        return this.upvote_records;
    }

    public void setUpvoteRecords(Optional<String> upvote_records) {
        this.upvote_records = upvote_records;
    }

    public Optional<String> getDownvoteRecords() {
        return this.downvote_Records;
    }

    public void setDownvoteRecords(Optional<String> downvote_Records) {
        this.downvote_Records = downvote_Records;
    }

}

enum UserRoles {
    ADMIN,
    DEFAULT
}