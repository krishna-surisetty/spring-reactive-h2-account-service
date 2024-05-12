package com.mybank.accountservice.repository;

import com.mybank.accountservice.entity.AccountServiceDto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountServiceRepository extends R2dbcRepository<AccountServiceDto, Long> {
}
