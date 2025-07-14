package com.cognizant.LoadCountry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.LoadCountry.model.Country;

public class LoadCountryApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoadCountryApplication.class);

    public static void main(String[] args) {
        LOGGER.debug("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        System.out.println("Country: " + country);

        LOGGER.debug("END");
    }
}
