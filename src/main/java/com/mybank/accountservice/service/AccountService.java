package com.mybank.accountservice.service;

import com.mybank.accountservice.entity.AccountServiceRequest;
import com.mybank.accountservice.entity.AccountServiceDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {
    Flux<AccountServiceDto> findAllAccountDetails();
    Mono<AccountServiceDto> findAccountDetailByAccountNumber(Long accountNumber);
    Mono<AccountServiceDto> createAccount(AccountServiceRequest accountServiceRequest);
    Mono<Void> deleteAccount(Long accountNumber);

    default AccountServiceDto populateAccountInfoForNewAccount(AccountServiceRequest accountServiceRequest) {
        AccountServiceDto newAccountToBeCreated = new AccountServiceDto();
        newAccountToBeCreated.setUserName(accountServiceRequest.getUserName());
        newAccountToBeCreated.setAccountType(accountServiceRequest.getAccountType());
        return newAccountToBeCreated;
    }
}
