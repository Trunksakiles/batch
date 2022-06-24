package com.reto2.batch.services;

//import com.bbva.papx.dto.customer.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.reto2.batch.dto.Customer;

import java.util.Locale;


public class Procesar implements ItemProcessor<Customer, Customer> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Procesar.class);

    @Override
    public Customer process (Customer customereader) throws Exception{

        Customer oCustomerProccess = new Customer();
        oCustomerProccess.setNombres(customereader.getNombres());
        oCustomerProccess.setApellidoPaterno(customereader.getApellidoPaterno());
        oCustomerProccess.setApellidoMaterno(customereader.getApellidoMaterno());
        oCustomerProccess.setCelular(customereader.getCelular());

        LOGGER.info("==>PROCCESS: " + oCustomerProccess.toString());

        return oCustomerProccess;
    }
}