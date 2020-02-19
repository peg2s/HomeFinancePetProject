package main.SaveLoad;

import main.Exception.ModelException;
import model.Article;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import model.*;
import java.util.List;


    public final class SaveData {

        private static SaveData instance;
        private List<Article> articles = new ArrayList();
        private List<Currency> currencies = new ArrayList();
        private List<Account> accounts = new ArrayList();
        private List<Transaction> transactions = new ArrayList();
        private List<Transfer> transfers = new ArrayList();

        private Common oldCommon;
        private boolean saved = true;

        private SaveData() {

        }


        public void clear() {
            articles.clear();
            currencies.clear();
            accounts.clear();
            transactions.clear();
            transfers.clear();
        }

        private void sort() {
            this.articles.sort((Article a, Article a1) -> a.getTitle().compareToIgnoreCase(a1.getTitle()));
            this.accounts.sort((Account a, Account a1) -> a.getTitle().compareToIgnoreCase(a1.getTitle()));
            this.transactions.sort((Transaction t, Transaction t1) -> (int) (t1.getDate().compareTo(t.getDate())));
            this.transfers.sort((Transfer t, Transfer t1) -> (int) (t1.getDate().compareTo(t.getDate())));
            this.currencies.sort(new Comparator<Currency>() {
                @Override
                public int compare(Currency c, Currency c1) {
                    if (c.isBase()) return -1;
                    if (c1.isBase()) return 1;
                    if (c.isOn() ^ c1.isOn()) {
                        if (c1.isOn()) return 1;
                        else return -1;
                    }
                    return c.getTitle().compareToIgnoreCase(c1.getTitle());
                }
            });
        }

        public void save() {

        }

        public boolean isSaved() {
            return saved;
        }

        public static SaveData getInstance() {
            if (instance == null) instance = new SaveData();
            return instance;
        }



        public List<Article> getArticles() {
            return articles;
        }

        public List<Currency> getCurrencies() {
            return currencies;
        }

        public List<Account> getAccounts() {
            return accounts;
        }

        public List<Transaction> getTransactions() {
            return transactions;
        }

        public List<Transfer> getTransfers() {
            return transfers;
        }

        public void setArticles(List<Article> articles) {
            if (articles != null) this.articles = articles;
        }

        public void setCurrencies(List<Currency> currencies) {
            if (currencies != null) this.currencies = currencies;
        }

        public void setAccounts(List<Account> accounts) {
            if (accounts != null) this.accounts = accounts;
        }

        public void setTransactions(List<Transaction> transactions) {
            if (transactions != null) this.transactions = transactions;
        }

        public void setTransfers(List<Transfer> transfers) {
            if (transfers != null) this.transfers = transfers;
        }

        public Currency getBaseCurrency() {
            for (Currency c : currencies)
                if (c.isBase()) return c;
            return new Currency();
        }

        public ArrayList<Currency> getEnableCurrencies() {
            ArrayList<Currency> list = new ArrayList();
            for (Currency c : currencies)
                if (c.isOn()) list.add(c);
            return list;
        }



        public List<Transaction> getTransactionsOnCount(int count) {
            return new ArrayList(transactions.subList(0, Math.min(count, transactions.size())));
        }

    }


