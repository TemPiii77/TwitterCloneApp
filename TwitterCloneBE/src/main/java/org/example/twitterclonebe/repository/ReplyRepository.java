package org.example.twitterclonebe.repository;

import org.example.twitterclonebe.domain.Reply;
import org.example.twitterclonebe.domain.ReplyId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, ReplyId> {
}