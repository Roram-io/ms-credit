package com.nttdata.credits.service;

import com.nttdata.credits.model.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {
    Flux<Credit> listCredits();

    Mono<Credit> listById(String id);

    Flux<Credit> listByHolder(String id);

    Mono<Void> removeCredit(String id);

    Mono<Credit> saveCredit(Credit credit);

    Mono<Credit> updateCredit(Credit credit);
}
