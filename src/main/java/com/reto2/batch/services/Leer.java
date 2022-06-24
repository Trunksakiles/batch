package com.reto2.batch.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.reto2.batch.dto.Customer;

public class Leer implements FieldSetMapper<Customer> {

    private static final Logger LOGGER = LoggerFactory.getLogger(Leer.class);


    @Override
    public Customer mapFieldSet(FieldSet fieldSet) throws BindException {

        Customer oCustomer = new Customer();
        oCustomer.setNombres(fieldSet.readString("nombres"));
        oCustomer.setApellidoPaterno(fieldSet.readString("apellido paterno"));
        oCustomer.setApellidoMaterno(fieldSet.readString("apellido materno"));
        oCustomer.setCelular(fieldSet.readString("celular"));


        LOGGER.info("==>READER :" + oCustomer.toString());

        return oCustomer;

    }
}