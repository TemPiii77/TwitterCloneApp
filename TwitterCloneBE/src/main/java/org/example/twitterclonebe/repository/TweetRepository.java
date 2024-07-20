package org.example.twitterclonebe.repository;

import org.example.twitterclonebe.domain.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Integer> {
}