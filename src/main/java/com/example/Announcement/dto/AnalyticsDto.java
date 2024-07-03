package com.example.Announcement.dto;

public class AnalyticsDto {

        private Long announcementId;
        private Long views;
        private Long comments;
        private Long interactions;

    public Long getAnnouncementId() {
        return announcementId;
    }

    public Long getViews() {
        return views;
    }

    public Long getComments() {
        return comments;
    }

    public Long getInteractions() {
        return interactions;
    }

    public void setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
    }

    public void setViews(Long views) {
        this.views = views;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public void setInteractions(Long interactions) {
        this.interactions = interactions;
    }
}
