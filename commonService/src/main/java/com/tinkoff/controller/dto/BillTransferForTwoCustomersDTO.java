package com.tinkoff.controller.dto;

public class BillTransferForTwoCustomersDTO {

    private Long firstCustomerID;

    private Long secondCustomerID;

    private Long decreasedBillID;

    private Long increasedBillID;

    public Long getFirstCustomerID() {
        return firstCustomerID;
    }

    public Long getSecondCustomerID() {
        return secondCustomerID;
    }

    public Long getDecreasedBillID() {
        return decreasedBillID;
    }

    public Long getIncreasedBillID() {
        return increasedBillID;
    }
}
