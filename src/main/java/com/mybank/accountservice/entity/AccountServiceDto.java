package com.mybank.accountservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(name = "ACCOUNTS", schema = "mybank")
public class AccountServiceDto {

    @Column("account_holder_name")
    private String userName;
    @Id
    @Column("account_number")
    private Long accountNumber;
    //@Column("account_type_id")
    private AccountType accountType;
    //@Column("account_status_id")
    private AccountStatus accountStatus;
    @Column("account_balance_amount")
    private Double balanceAmount;

}
