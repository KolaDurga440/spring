package com.example.Announcement.repository;


import com.example.Announcement.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface NotificationRepository extends JpaRepository<Notification, Long> {
        List<Notification> findByUserId(Long userId);

}
