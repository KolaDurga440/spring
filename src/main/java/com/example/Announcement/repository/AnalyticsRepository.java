package com.example.Announcement.repository;


import com.example.Announcement.entity.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
    public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
        @Query("SELECT a FROM Analytics a WHERE a.announcementId = :announcementId")
        Analytics findByAnnouncementId(@Param("announcementId") Long announcementId);


}
