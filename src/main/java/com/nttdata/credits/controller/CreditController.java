package com.nttdata.credits.controller;

import com.nttdata.credits.model.Credit;
import com.nttdata.credits.service.CreditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/credit")

public class CreditController {

    Logger log = LoggerFactory.getLogger(CreditController.class);

    @Autowired
    CreditService creditService;

    @GetMapping
    public Flux<Credit> getCredits(){
        log.info("Listing all BankAccounts: ");
        return creditService.listCredits();
    }

    @GetMapping("/{id}")
    public Mono<Credit> getCreditById(@PathVariable("id") String id){
        log.info("Searching BankAccount with Id "+id);
        return creditService.listById(id);
    }

    @GetMapping("/holder/{id}")
    public Mono<Credit> getCreditByHolder(@PathVariable("id") String id){
        log.info("Searching BankAccount with holder with Id "+id);
        return creditService.listByHolder(id);
    }

    @PostMapping("/save")
    public Mono<Credit> saveCredit(@RequestBody Credit credit){
        log.info("Inserting a new creditService");
        return creditService.saveCredit(credit);
    }

    @PutMapping("/update")
    public Mono<Credit> updateCredit(@RequestBody Credit credit){
        log.info("Updating the following Id: "+credit.getId());
        return creditService.updateCredit(credit);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> removeCredit(@PathVariable("id") String id){
        log.info("Removing the following Credit: "+ id);
        return creditService.removeCredit(id);
    }


}
