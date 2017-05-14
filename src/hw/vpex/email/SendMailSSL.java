package hw.vpex.email;

/**
 * Vadim Voronov
 * Created: 13-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SendMailSSL {


//    static final Logger userLogger = LogManager.getLogger(MySessionListener.class);
//
//    public void sendEMail(String mess, String subj, String toEmail) {
//        Properties props = System.getProperties();
//        // Properties props = System.getProperties();
//
//        //   props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.host", "smtp.gmail.com");
//        props.put("mail.defaultEncoding", "UTF-8");
//        props.put("mail.mime-type","text/plain;charset=UTF-8");
//        props.put("mail.mime.charset", "UTF-8");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.socketFactory.port", "465");
//        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.port", "465");
//        Session session = Session.getDefaultInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication("mymail@gmail.com", "password");
//                    }
//                });
//
//        try {
//
//            MimeMessage message = new MimeMessage(session);
//
//            message.setFrom(new InternetAddress("mymail@gmail.com"));
//            message.setDataHandler(new DataHandler(mess, "text/plain"));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
//            message.setSubject(subj, "UTF-8");
//            message.setText(mess, "UTF-8");
//
//            Transport.send(message);
//
//            userLogger.debug("Письмо отправлено");
//
//        } catch (MessagingException e) {
//            throw new RuntimeException(e);
//        }
//    }


}
