package Mail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Properties;

public class Automailer {
    public static void main(String[] args)  {

        // Recipient's email ID needs to be mentioned.
        // String to = "vaibhav.a@isentia.com";
        String to="kamleshkumar.p@ninestars.in";
        String bcc="vaibhav.a@isentia.com";
        String cc="rajesh.k@ninestars.in";

        // Sender's email ID needs to be mentioned
        String from = "kamlesh.kumar@isentia.com";

        // Assuming you are sending email from through gmails smtp
        String host = "smtp.gmail.com";


        // Get system properties
        Properties properties = System.getProperties();

        //Setup mail server
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        //  prop.put("mail.smtp.auth", true);
        //  prop.put("mail.smtp.starttls.enable", "true");
        // prop.put("mail.smtp.host", "smtp.mailtrap.io");
        //  prop.put("mail.smtp.port", "25");
        //  prop.put("mail.smtp.ssl.trust", "smtp.mailtrap.io");
        // Get the Session object.// and pass username and password
        Session session = Session.getInstance(properties, new Authenticator() {

            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                // TODO Auto-generated method stub
                return new javax.mail.PasswordAuthentication("kamlesh.kumar@isentia.com", "ykdyqchssvbikrcw");
            }


        });

        // Used to debug SMTP issues
        session.setDebug(true);

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(from);

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO , new InternetAddress(to));
            message.addRecipient(Message.RecipientType.BCC , new InternetAddress(bcc));
            message.addRecipient(Message.RecipientType.CC , new InternetAddress(cc));

            // Set Subject: header field
            message.setSubject("Regarding Leave");
            String path="/home/kamlesh/Downloads/TokenFile.csv";
            MimeMultipart mimemultipart=new MimeMultipart();

            MimeBodyPart textMime= new MimeBodyPart();
            MimeBodyPart fileMime= new MimeBodyPart();


            try {
                textMime.setText("Hello vaibhav i m taking leave tomorrow");
                File file=new File(path);
                fileMime.attachFile(file);
                mimemultipart.addBodyPart(textMime);
                mimemultipart.addBodyPart(fileMime);
            }catch(Exception e)
            {
                System.out.println(e);
            }



            message.setContent(mimemultipart);
            // Now set the actual message
            //   message.setText("This is actual message");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }

    }



}

