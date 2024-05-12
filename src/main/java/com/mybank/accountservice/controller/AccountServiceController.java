package com.mybank.accountservice.controller;

import com.mybank.accountservice.entity.AccountServiceDto;
import com.mybank.accountservice.entity.AccountServiceRequest;
import com.mybank.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/mybank/accounts/")
public class AccountServiceController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public Flux<AccountServiceDto> getAllAccountDetails() {
        return accountService.findAllAccountDetails();
    }

    @GetMapping("/{accountNumber}")
    public Mono<AccountServiceDto> getAccountDetailsByAccountNumber(Long accountNumber) {
        return accountService.findAccountDetailByAccountNumber(accountNumber);
    }

    @PostMapping("/")
    public Mono<AccountServiceDto> createAccount(@RequestBody AccountServiceRequest accountServiceRequest) {
        return accountService.createAccount(accountServiceRequest);
    }

}
