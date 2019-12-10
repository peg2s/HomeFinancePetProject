package model;

import java.util.Date;

public class Transfer extends Common{

    private Account fromAccount;
    private Account toAccount;
    private double fromAmount;
    private double toAmount;
    private String notice;
    private Date date;

    public Transfer() {
    }

    public Transfer(Account fromAccount, Account toAccount, double fromAmount, double toAmount, String notice, Date date) {
        
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.fromAmount = fromAmount;
        this.toAmount = toAmount;
        this.notice = notice;
        this.date = date;
    }
}
