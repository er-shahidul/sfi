package com.rbs.www.common.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import com.rbs.www.admin.models.entities.User;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailHelper
{
    private JavaMailSender mailSender;

    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String to, String subject, String url, User user, String mailType, String path) {
        String form = "sfiprogram.org";
        String msg = "http://"+url;
        try{
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(form);
            helper.setTo(to);
            helper.setSubject(subject);

            if(mailType == "confirm") confirmBody(msg, user, helper, path);
            else if(mailType == "reset") resetBody(msg, user, helper, path);
            else helper.setText("", true);

            mailSender.send(message);
        }catch(MessagingException e){e.printStackTrace();}
    }

    private void confirmBody(String msg, User user, MimeMessageHelper helper, String path) throws MessagingException {
            String imagePath = "http://" + path + "/assets/images/u4.png";
            helper.setText(
                "<html><body>" +

                "<style type='text/css'> #sfi-confirmation td { font-family: Arial, Helvetica, sans-serif; color: #333333; font-size: 13px; line-height: 15px; }\n" +
                        "#sfi-confirmation a { color: #333333; }\n" +
                        "#sfi-confirmation p { font-family: Arial, Helvetica, sans-serif; padding: 0 0 15px 0; margin: 0; font-size: 13px; line-height: 15px; }\n" +
                        "#sfi-confirmation i { font-style: italic; }" +
                "</style>"+

                "<table id=\"sfi-confirmation\" width=\"840\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\" bgcolor=\"#FFFFFF\">\n" +
                        "<tr>\n" +
                        "<td>\n" +

                        "<table cellpadding=\"6\" cellspacing=\"0\" width=\"100%\" style=\"border: 1px solid #797979;\">\n" +

                        "<tr>\n" +
                        "<td colspan=\"3\" style=\"border-bottom: 1px solid #009900;\">\n" +
                        "<img src=\"" + imagePath + "\" alt=\"\" style=\"border: none;\" />\n" +
                        "</td>\n" +
                        "</tr>\n" +

                        "<tr>\n" +
                        "<td width=\"35\">&nbsp;</td>\n" +

                        "<td style=\"padding-top: 30px; padding-bottom: 20px;\">"+

                        "<p>Welcome " + user.getFirstName() + ",</p>\n" +
                        "<p>To complete your registration to the SFI Annual Reporting & Survey Tool please follow this link:</p>\n" +
                        "<a href=\" "+msg+" \" >Go to SFI Annual Reporting & Survey Tool</a> \n" +
                        "<p>if link is not work than copy this url <b> "+msg+" </b></p>\n" +
                        "<p></p>\n" +
                        "<p>If you require any additional help or have questions, please feel free to contact me.</p>\n" +
                        "<p></p>\n" +
                        "<p>Regards,</p>\n" +
                        "<p>\n" +
                        "Rachel Dierolf<br />\n" +
                        "SFI Manager, Office of Label Use and Licensing<br />\n" +
                        "PEFC US Governing Body Secretary<br />\n" +
                        "tel: 613-274-0124<br />\n" +
                        "email: rachel.dierolf@sfiprogram.org\n" +
                        "</p>\n" +

                        "</td>\n" +

                        "<td width=\"35\">&nbsp;</td>\n" +
                        "</tr>\n" +

                        "<tr>\n" +
                        "<td colspan=\"3\" style=\"border-bottom: 1px solid #009900;\">\n" +
                        "<img src=\"" + imagePath + "\" alt=\"\" style=\"border: none;\" />\n" +
                        "</td>\n" +
                        "</tr>\n" +

                        "</table>\n" +

                        "</td>\n" +
                        "</tr>\n" +
                        "</table>"+

                        "</body></html>"
                , true);
    }

    private void resetBody(String msg, User user, MimeMessageHelper helper, String path) throws MessagingException {
            String imagePath = "http://" + path + "/assets/images/u4.png";
            helper.setText(
                "<html><body>" +

                "<style type='text/css'> #sfi-confirmation td { font-family: Arial, Helvetica, sans-serif; color: #333333; font-size: 13px; line-height: 15px; }\n" +
                        "#sfi-confirmation a { color: #333333; }\n" +
                        "#sfi-confirmation p { font-family: Arial, Helvetica, sans-serif; padding: 0 0 15px 0; margin: 0; font-size: 13px; line-height: 15px; }\n" +
                        "#sfi-confirmation i { font-style: italic; }" +
                "</style>"+

                "<table id=\"sfi-confirmation\" width=\"840\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\" bgcolor=\"#FFFFFF\">\n" +
                        "<tr>\n" +
                        "<td>\n" +

                        "<table cellpadding=\"6\" cellspacing=\"0\" width=\"100%\" style=\"border: 1px solid #797979;\">\n" +

                        "<tr>\n" +
                        "<td colspan=\"3\" style=\"border-bottom: 1px solid #009900;\">\n" +
                        "<img src=\"" + imagePath + "\" alt=\"\" style=\"border: none;\" />\n" +
                        "</td>\n" +
                        "</tr>\n" +

                        "<tr>\n" +
                        "<td width=\"35\">&nbsp;</td>\n" +

                        "<td style=\"padding-top: 30px; padding-bottom: 20px;\">"+

                        "<p>Welcome " + user.getFirstName() + ",</p>\n" +
                        "<p>To change your password please click the following link</p>\n" +
                        "<a href=\" "+msg+" \" >Go to SFI Annual Reporting & Survey Tool</a> \n" +
                        "<p>if link is not work than copy this url <b> "+msg+" </b></p>\n" +
                        "<p></p>\n" +
                        "<p>If you require any additional help or have questions, please feel free to contact me.</p>\n" +
                        "<p></p>\n" +
                        "<p>Regards,</p>\n" +
                        "<p>\n" +
                        "Rachel Dierolf<br />\n" +
                        "SFI Manager, Office of Label Use and Licensing<br />\n" +
                        "PEFC US Governing Body Secretary<br />\n" +
                        "tel: 613-274-0124<br />\n" +
                        "email: rachel.dierolf@sfiprogram.org\n" +
                        "</p>\n" +

                        "</td>\n" +

                        "<td width=\"35\">&nbsp;</td>\n" +
                        "</tr>\n" +

                        "<tr>\n" +
                        "<td colspan=\"3\" style=\"border-bottom: 1px solid #009900;\">\n" +
                        "<img src=\"" + imagePath + "\" alt=\"\" style=\"border: none;\" />\n" +
                        "</td>\n" +
                        "</tr>\n" +

                        "</table>\n" +

                        "</td>\n" +
                        "</tr>\n" +
                        "</table>"+

                        "</body></html>"
                , true);
    }
}