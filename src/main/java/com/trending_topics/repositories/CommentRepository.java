package com.trending_topics.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trending_topics.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

  List<Comment> findByFeatureId(Long featureId);

}
