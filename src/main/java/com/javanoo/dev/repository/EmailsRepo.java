package com.javanoo.dev.repository;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javanoo.dev.model.Email;

@Repository
public interface EmailsRepo extends CrudRepository<Email, Integer> {

    @Modifying
    @Query("INSERT INTO emails SET emailAddress = :emailAddress, emailSubject = :emailSubject, emailMessage = :emailMessage;")
    void createEmail(String emailAddress, String emailSubject, String emailMessage);
    
}