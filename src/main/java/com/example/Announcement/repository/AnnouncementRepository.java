package com.example.Announcement.repository;


import com.example.Announcement.entity.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
    public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
        List<Announcement> findByCategory(String category);
        List<Announcement> findByVisibility(String visibility);
        List<Announcement> findByAuthorId(Long authorId);
        List<Announcement> findByScheduledPublishDateBetween(LocalDateTime startDate, LocalDateTime endDate);
        List<Announcement> findByExpirationDateBefore(LocalDateTime currentDate);

}
