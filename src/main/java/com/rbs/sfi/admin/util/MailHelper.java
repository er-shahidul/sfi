package com.rbs.sfi.admin.util;

//import org.springframework.mail.MailSender;
//import org.springframework.mail.SimpleMailMessage;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailHelper
{
    private JavaMailSender mailSender;

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

//    private MailSender mailSender;
//
//    public void setMailSender(MailSender mailSender) {
//        this.mailSender = mailSender;
//    }

//    public void sendMail(String from, String to, String subject, String msg) {
    public void sendMail(String to, String subject, String msg) {

//        SimpleMailMessage message = new SimpleMailMessage();
//
////      message.setFrom(from);
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(msg);
//        mailSender.send(message);

        try{

            MimeMessage message = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//          helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(msg);

            mailSender.send(message);
        }catch(MessagingException e){e.printStackTrace();}
    }
}