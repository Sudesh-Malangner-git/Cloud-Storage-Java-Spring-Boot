package com.udacity.jwdnd.course1.cloudstorage.model;

public class SupportReport {
    private Integer id;
    private String subject;
    private String message;
    private String createdAt;
    private Integer userId;
    private String username;

    public SupportReport() {
    }

    public SupportReport(Integer id, String subject, String message, String createdAt, Integer userId, String username) {
        this.id = id;
        this.subject = subject;
        this.message = message;
        this.createdAt = createdAt;
        this.userId = userId;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
