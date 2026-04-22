package com.javanoo.dev.service;

import org.springframework.stereotype.Service;

import com.javanoo.dev.model.Email;
import com.javanoo.dev.repository.EmailsRepo;

@Service
public class MailingService {
    
    private final EmailsRepo emailRepo;

    MailingService (EmailsRepo emailRepo){
        this.emailRepo = emailRepo;
    }

    public void storeEmail(Email email){
        emailRepo.createEmail(email.getEmailAddress(), email.getEmailSubject(), email.getEmailMessage());
    }

}
