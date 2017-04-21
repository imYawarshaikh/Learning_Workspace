package com.mail.test;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Demo {

	public static void main(String[] args) throws AddressException, MessagingException {
		// TODO Auto-generated method stub

		MailCode  mail= new MailCode();
		mail.confMail1("sanjay94335@gmail.com", "Test", "HI");
	}

}
