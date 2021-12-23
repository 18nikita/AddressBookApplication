package com.example.addressbookapplication.util;

import com.example.addressbookapplication.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    private JavaMailSender mailSender;

    @Autowired
    public MailService(JavaMailSender mailSender) {
        this.mailSender=mailSender;
    }
    public void sendNotification(Contact contact) {
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setTo(contact.getEmail());
        mailMessage.setFrom("kumarbalingallogin@gmail.com");
        mailMessage.setSubject("for demo purpose");
        mailMessage.setText("Abcd");
        mailSender.send(mailMessage);
    }

}
