package com.mybank.accountservice.entity;

import org.springframework.data.relational.core.mapping.Table;

public enum AccountStatus {

    OPEN("Open"),
    PENDING_APPROVAL("Pending Approval"),
    BLOCKED("Blocked"),
    REJECTED("Rejected");

    private String accountStatus;

    AccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

}
