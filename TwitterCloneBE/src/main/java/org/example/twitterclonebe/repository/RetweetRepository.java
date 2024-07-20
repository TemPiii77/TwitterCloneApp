package org.example.twitterclonebe.repository;

import org.example.twitterclonebe.domain.Retweet;
import org.example.twitterclonebe.domain.RetweetId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RetweetRepository extends JpaRepository<Retweet, RetweetId> {
}