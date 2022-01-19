package com.nttdata.credits.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "Credit")
public class Credit {
    @Id
    private String id= UUID.randomUUID().toString();
    private String holder;
    private double maxCred;
    private double currentAmount;



}
