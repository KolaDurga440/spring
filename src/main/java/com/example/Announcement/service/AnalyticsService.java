package com.example.Announcement.service;


import com.example.Announcement.entity.Analytics;
import com.example.Announcement.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class AnalyticsService {
        @Autowired
        private AnalyticsRepository analyticsRepository;

        public Analytics saveAnalytics(Analytics analytics) {
            return analyticsRepository.save(analytics);
        }

        public Optional<Analytics> findByAnnouncementId(Long announcementId) {
            return Optional.ofNullable(analyticsRepository.findByAnnouncementId(announcementId));
        }

        public List<Analytics> findAll() {
            return analyticsRepository.findAll();
        }
    }

