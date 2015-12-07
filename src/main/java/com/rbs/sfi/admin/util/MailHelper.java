package com.rbs.sfi.admin.util;

//import org.springframework.mail.MailSender;
//import org.springframework.mail.SimpleMailMessage;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import com.rbs.sfi.admin.entities.User;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailHelper
{
    private JavaMailSender mailSender;

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String to, String subject, String msg, User user) {

        try{

            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(to);
            helper.setSubject(subject);

            helper.setText(
                    "<html><body>" +
                    "<style type='text/css'> #sfi-confirmation td { font-family: Arial, Helvetica, sans-serif; color: #333333; font-size: 13px; line-height: 15px; }\n" +
                            "\t#sfi-confirmation a { color: #333333; }\n" +
                            "\t#sfi-confirmation p { font-family: Arial, Helvetica, sans-serif; padding: 0 0 15px 0; margin: 0; font-size: 13px; line-height: 15px; }\n" +
                            "\t#sfi-confirmation i { font-style: italic; }" +
                    "</style>"+
                    "<table id=\"sfi-confirmation\" width=\"840\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\" bgcolor=\"#FFFFFF\">\n" +
                            "\t<tr>\n" +
                            "\t\t<td>\n" +
                            "\t\t\t<table cellpadding=\"6\" cellspacing=\"0\" width=\"100%\" style=\"border: 1px solid #797979;\">\n" +
                            "\t\t\t\t<tr>\n" +
                            "\t\t\t\t\t<td colspan=\"3\" style=\"border-bottom: 1px solid #009900;\">\n" +
                            "\t\t\t\t\t\t<a href=\"\">\n" +
                            "\t\t\t\t\t\t\t<img th:src=\"/assets/images/u4.png\" th:alt=\"\" style=\"border: none;\" />\n" +
                            "\t\t\t\t\t\t</a>\n" +
                            "\t\t\t\t\t</td>\n" +
                            "\t\t\t\t</tr>\n" +
                            "\t\t\t\t<tr>\n" +
                            "\t\t\t\t\t<td width=\"35\">&nbsp;</td>\n" +
                            "\t\t\t\t\t<td style=\"padding-top: 30px; padding-bottom: 20px;\">"+
                            "<p>Hi " + user.getFullname() + ",</p>\n" +
                            "\t\t\t\t\t\t<p>Please reset your user password at\n" +
                            "\t\t\t\t\t\t\t<a href=" +"/"+ msg + ">here</a>\n" +
                            "\t\t\t\t\t\t</p>\n" +
                            "\n" +
                            "\t\t\t\t\t\t<p>\n" +
                            "\t\t\t\t\t\t\t<a href=" +"/"+ msg + ">" +
                            "Go to SFI Annual Report Form</a>\n" +
                            "\t\t\t\t\t\t</p>\n" +
                            "\t\t\t\t\t\t<p>Regards,</p>\n" +
                            "\t\t\t\t\t\t<p>\n" +
                            "\t\t\t\t\t\t\tRachel Dierolf<br />\n" +
                            "\t\t\t\t\t\t\tSFI Manager, Office of Label Use and Licensing<br />\n" +
                            "\t\t\t\t\t\t\tPEFC US Governing Body Secretary<br />\n" +
                            "\t\t\t\t\t\t\ttel: 613-274-0124<br />\n" +
                            "\t\t\t\t\t\t\temail: rachel.dierolf@sfiprogram.org\n" +
                            "\t\t\t\t\t\t</p>\n" +
                            "\t\t\t\t\t</td>\n" +
                            "\t\t\t\t\t<td width=\"35\">&nbsp;</td>\n" +
                            "\t\t\t\t</tr>\n" +
                            "\t\t\t\t<tr>\n" +
                            "\t\t\t\t\t<td colspan=\"3\" align=\"right\" style=\"border-top: 1px solid #009900;\">\n" +
                            "\t\t\t\t\t\t<a href=\"\">\n" +
                            "\t\t\t\t\t\t\t<img th:src=\"/assets/images/u4.png\" th:alt=\"\" style=\"border: none;\" />\n" +
                            "\t\t\t\t\t\t</a>\n" +
                            "\t\t\t\t\t</td>\n" +
                            "\t\t\t\t</tr>\n" +
                            "\t\t\t</table>\n" +
                            "\t\t</td>\n" +
                            "\t</tr>\n" +
                            "</table>"+
                            "</body></html>"
                    , true);

            mailSender.send(message);
        }catch(MessagingException e){e.printStackTrace();}
    }
}