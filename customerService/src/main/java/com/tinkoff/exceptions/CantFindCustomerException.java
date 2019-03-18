package com.tinkoff.exceptions;

public class CantFindCustomerException extends Exception {

    public CantFindCustomerException(String message) {
        super(message);
    }
}
