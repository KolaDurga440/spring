package com.example.Announcement.dto;

import java.time.LocalDateTime;

public class CommentDto {
    private Long id;
    private Long announcementId;
    private Long authorId;
    private String content;
    private LocalDateTime createdDate;

    public Long getId() {
        return id;
    }

    public Long getAnnouncementId() {
        return announcementId;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
