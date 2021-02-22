package com.trending_topics.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trending_topics.domain.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
