package com.example.Announcement.service;

import com.example.Announcement.entity.Notification;
import com.example.Announcement.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class NotificationService {
        @Autowired
        private NotificationRepository notificationRepository;

        public Notification saveNotification(Notification notification) {
            return notificationRepository.save(notification);
        }

        public List<Notification> findByUserId(Long userId) {
            return notificationRepository.findByUserId(userId);
        }
    }

