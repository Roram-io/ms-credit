package com.nttdata.credits.repository;

import com.nttdata.credits.model.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CreditRepository extends ReactiveMongoRepository<Credit,String> {

    Flux<Credit> findCreditByHolder(String id);
}
