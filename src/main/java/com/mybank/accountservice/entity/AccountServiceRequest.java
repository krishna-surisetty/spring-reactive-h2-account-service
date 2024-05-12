package com.mybank.accountservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class AccountServiceRequest {
    private String userName;
    private AccountType accountType;
}
