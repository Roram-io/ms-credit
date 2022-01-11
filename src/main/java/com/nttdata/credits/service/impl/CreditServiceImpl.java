package com.nttdata.credits.service.impl;

import com.nttdata.credits.model.Credit;
import com.nttdata.credits.repository.CreditRepository;
import com.nttdata.credits.service.CreditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CreditServiceImpl implements CreditService {

    Logger log = LoggerFactory.getLogger(CreditServiceImpl.class);

    @Autowired
    CreditRepository creditRepository;

    @Override
    public Flux<Credit> listCredits() {
        log.info("Calling repository for Find All");
        return creditRepository.findAll();
    }

    @Override
    public Mono<Credit> listByHolder(String id){
        log.info("Calling repository for Find by Holder "+id);
        return creditRepository.findCreditByHolder(id);
    }

    @Override
    public Mono<Credit> listById(String id) {
        log.info("Calling repository for Find by Id");
        return creditRepository.findById(id);
    }

    @Override
    public Mono<Void> removeCredit(String id) {
        log.info("Calling repository for Deleting "+ id);
        return creditRepository.deleteById(id);
    }

    @Override
    public Mono<Credit> saveCredit(Credit credit) {
        log.info("Calling repository for inserting Bank Account "+credit.getId());
        return creditRepository.insert(credit);
    }

    @Override
    public Mono<Credit> updateCredit(Credit credit) {
        log.info("Calling Repository for method Update "+ credit.getId());
        return creditRepository.save(credit);
    }
}
