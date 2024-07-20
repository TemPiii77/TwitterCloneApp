package org.example.twitterclonebe.repository;

import org.example.twitterclonebe.domain.Usr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsrRepository extends JpaRepository<Usr, Integer> {

    @Query(value = "select * from usr where id=29", nativeQuery = true)
    Usr test();

}