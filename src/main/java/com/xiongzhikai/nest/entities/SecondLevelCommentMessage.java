package com.xiongzhikai.nest.entities;

import java.util.Optional;

import org.bson.codecs.pojo.annotations.BsonId;

public class SecondLevelCommentMessage {
    
    @BsonId
    private Optional<String> _id ;
    private Optional<Boolean> isRead;
    @BsonId
    private Optional<String> secondLevelCommentId;

    // Getters Setters

    public Optional<String> getId() {
        return this._id;
    }

    public void setId(Optional<String> _id) {
        this._id = _id;
    }

    public Optional<Boolean> getIsRead() {
        return this.isRead;
    }

    public void setIsRead(Optional<Boolean> isRead) {
        this.isRead = isRead;
    }

    public Optional<String> getSecondLevelCommentId() {
        return this.secondLevelCommentId;
    }

    public void setSecondLevelCommentId(Optional<String> secondLevelCommentId) {
        this.secondLevelCommentId = secondLevelCommentId;
    }
    
}
