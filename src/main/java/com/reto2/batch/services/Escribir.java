package com.reto2.batch.services;

//import com.bbva.papx.dto.customer.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;

import com.reto2.batch.dto.Customer;

import java.util.List;

public class Escribir implements ItemWriter<Customer> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Escribir.class);

    @Override
    public void write(List<? extends Customer> listCustomerProcess) throws Exception{

        for(Customer oRowCustomer:listCustomerProcess) {
            LOGGER.info("==>WRITER: " + oRowCustomer.toString());
        }
    }
}
