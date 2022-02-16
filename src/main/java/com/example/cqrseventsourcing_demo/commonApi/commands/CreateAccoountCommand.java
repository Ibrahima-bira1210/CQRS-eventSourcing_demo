package com.example.cqrseventsourcing_demo.commonApi.commands;

import lombok.Getter;

public class CreateAccoountCommand extends BaseCommand<String>{
    @Getter  private double initialBalance;
    @Getter  private String currency;

    public CreateAccoountCommand(String id, double initialBalance, String currency) {
        super(id);
        this.initialBalance = initialBalance;
        this.currency = currency;
    }

}
