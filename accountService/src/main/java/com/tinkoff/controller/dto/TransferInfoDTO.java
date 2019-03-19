package com.tinkoff.controller.dto;

import java.math.BigDecimal;

public class TransferInfoDTO {

    private Long decreasedBillID;

    private BigDecimal decreasedSum;

    private Long increasedBillID;

    private BigDecimal increasedSum;

    public void setDecreasedBillID(Long decreasedBillID) {
        this.decreasedBillID = decreasedBillID;
    }

    public void setDecreasedSum(BigDecimal decreasedSum) {
        this.decreasedSum = decreasedSum;
    }

    public void setIncreasedBillID(Long increasedBillID) {
        this.increasedBillID = increasedBillID;
    }

    public void setIncreasedSum(BigDecimal increasedSum) {
        this.increasedSum = increasedSum;
    }
}
