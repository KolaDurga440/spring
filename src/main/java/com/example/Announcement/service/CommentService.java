package com.example.Announcement.service;


import com.example.Announcement.entity.Comment;
import com.example.Announcement.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class CommentService {
        @Autowired
        private CommentRepository commentRepository;

        public Comment saveComment(Comment comment) {
            return commentRepository.save(comment);
        }

        public List<Comment> findByAnnouncementId(Long announcementId) {
            return commentRepository.findByAnnouncementId(announcementId);
        }

        public void deleteComment(Long id) {
            commentRepository.deleteById(id);
        }
    }

