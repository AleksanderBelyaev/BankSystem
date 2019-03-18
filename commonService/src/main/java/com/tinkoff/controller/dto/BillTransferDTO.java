package com.tinkoff.controller.dto;

public class BillTransferDTO {

    private final BillDTO decreasedBill;
    private final BillDTO increasedBill;

    public BillTransferDTO(BillDTO decreasedBill, BillDTO increasedBill) {
        this.decreasedBill = decreasedBill;
        this.increasedBill = increasedBill;
    }

    public BillDTO getDecreasedBill() {
        return decreasedBill;
    }

    public BillDTO getIncreasedBill() {
        return increasedBill;
    }
}
