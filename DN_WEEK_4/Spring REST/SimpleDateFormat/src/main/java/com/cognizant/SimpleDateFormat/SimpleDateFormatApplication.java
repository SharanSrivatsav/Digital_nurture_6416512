package com.cognizant.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
@SpringBootApplication
public class SimpleDateFormatApplication {

	public static void main(String[] args) {
        SpringApplication.run(SimpleDateFormatApplication.class, args);
        displayDate();
    }

    public static void displayDate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        try {
            Date parsedDate = format.parse("31/12/2018");
            System.out.println("Parsed Date: " + parsedDate);
        } catch (ParseException e) {
            System.err.println("Invalid date format");
        }

        ((ClassPathXmlApplicationContext) context).close();
    }

}
