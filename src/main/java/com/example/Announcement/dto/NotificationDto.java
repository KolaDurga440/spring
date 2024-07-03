package com.example.Announcement.dto;

import java.time.LocalDateTime;

public class NotificationDto {
        private Long id;
        private Long userId;
        private Long announcementId;
        private String type; // Email, In-App
        private LocalDateTime sentDate;

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Long getAnnouncementId() {
        return announcementId;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getSentDate() {
        return sentDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSentDate(LocalDateTime sentDate) {
        this.sentDate = sentDate;
    }
}
