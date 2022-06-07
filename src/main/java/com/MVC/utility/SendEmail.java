package com.MVC.utility;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {    

	private Properties props;  
	private Session session; 
	private Boolean ativarDebug;
	private Message remetente;
	private Address[] toUser;
	
	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Boolean getAtivarDebug() {
		return ativarDebug;
	}

	public void setAtivarDebug(Boolean ativarDebug) {
		this.ativarDebug = ativarDebug;
	}

	public Message getRemetente() {
		return remetente;
	}

	public void setRemetente(Message remetente) {
		this.remetente = remetente;
	}

	public Address[] getToUser() {
		return toUser;
	}

	public void setToUser(Address[] toUser) {
		this.toUser = toUser;
	}

	public SendEmail() {
		this.props = servidorEmail();
		this.session = sessão(props);
		this.ativarDebug = debugSession(session);
		this.remetente = remetente(session);
		this.toUser = destinatarios();
	} 

	
	public static void enviandoMesansagem(Message message, Address[] toUser, String subjectEmail, String text) {
		try {
			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject(subjectEmail);//Assunto
			message.setText(text);			
			Transport.send(message);
			System.out.println("Feito!!!");
		} catch (Exception e) {
			// TODO: handle exception
		}		

		
	}

	public static Address[] destinatarios()  {
		Address[] toUser = null;
		try {
			toUser = InternetAddress //Destinatário(s)
			           .parse("raphaelaraujo.ti@gmail.com");
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return toUser;
	}

	public static Message remetente(Session session) {
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("raphaelaraujo.ti@gmail.com"));
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return message;
	}

	public static Boolean debugSession(Session session) {		
		session.setDebug(true);
		return session.getDebug();
		
	}

	public static Session sessão(Properties props) {
		Session session = Session.getDefaultInstance(props,
	    	      new javax.mail.Authenticator() {
	    	           protected PasswordAuthentication getPasswordAuthentication()
	    	           {	
	    	                 return new PasswordAuthentication("raphaelaraujo.ti@gmail.com",
	    	                 "Fallarujo@033547166");
	    	           }
	    	      });
		return session;
	}

	public static Properties servidorEmail() {			    
		Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
		return props;
	}
	  }
