package com.example.Announcement.service;

import com.example.Announcement.entity.Announcement;
import com.example.Announcement.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
    public class AnnouncementService {
        @Autowired
        private AnnouncementRepository announcementRepository;

        public Announcement saveAnnouncement(Announcement announcement) {
            return announcementRepository.save(announcement);
        }

        public Optional<Announcement> findById(Long id) {
            return announcementRepository.findById(id);
        }

        public List<Announcement> findByCategory(String category) {
            return announcementRepository.findByCategory(category);
        }

        public List<Announcement> findByVisibility(String visibility) {
            return announcementRepository.findByVisibility(visibility);
        }

        public List<Announcement> findByAuthorId(Long authorId) {
            return announcementRepository.findByAuthorId(authorId);
        }

        public List<Announcement> findScheduledAnnouncements(LocalDateTime startDate, LocalDateTime endDate) {
            return announcementRepository.findByScheduledPublishDateBetween(startDate, endDate);
        }

        public List<Announcement> findExpiredAnnouncements(LocalDateTime currentDate) {
            return announcementRepository.findByExpirationDateBefore(currentDate);
        }

        public void deleteAnnouncement(Long id) {
            announcementRepository.deleteById(id);
        }

}
