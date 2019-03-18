package com.tinkoff.controller.dto;

public class BillTransferForOneCustomerDTO {

    private Long customerID;

    private Long decreasedBillID;

    private Long increasedBillID;

    public Long getCustomerID() {
        return customerID;
    }

    public Long getDecreasedBillID() {
        return decreasedBillID;
    }

    public Long getIncreasedBillID() {
        return increasedBillID;
    }
}
