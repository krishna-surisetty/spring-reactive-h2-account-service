package com.mybank.accountservice.service;

import com.mybank.accountservice.entity.AccountServiceDto;
import com.mybank.accountservice.entity.AccountServiceRequest;
import com.mybank.accountservice.repository.AccountServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountServiceRepository accountServiceRepository;

    // will be accessed based on privilege
    @Override
    public Flux<AccountServiceDto> findAllAccountDetails() {
        return accountServiceRepository.findAll();
    }

    @Override
    public Mono<AccountServiceDto> findAccountDetailByAccountNumber(Long accountNumber) {
        return accountServiceRepository.findById(accountNumber);
    }

    @Override
    public Mono<AccountServiceDto> createAccount(AccountServiceRequest accountServiceRequest) {
        AccountServiceDto newAccountToBeCreated = populateAccountInfoForNewAccount(accountServiceRequest);
        return accountServiceRepository.save(newAccountToBeCreated);
    }

    @Override
    public Mono<Void> deleteAccount(Long accountNumber) {
        return accountServiceRepository.deleteById(accountNumber);
    }

}
