package exercice1;

import java.util.ArrayList;

public class Customer {
    private String firstName ;
    private String lastName ;
    private ArrayList<BankAccount> accounts ;
    public Customer(String firstName , String lastName ){
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.accounts = new ArrayList() ;
    }
    public void addAccount(BankAccount compte){
        if(this.accounts.contains(compte)){
            System.out.println("ce compte existe deja !");
        }
        else {
            this.accounts.add(compte);
        }
    }
    public void removeAccount(BankAccount compte){
        if(this.accounts.contains(compte)){
            this.accounts.remove(compte);
        }
        else {
            System.out.println("ce compte n'existe pas !");
        }
    }
    public Double getTotalAccountBalance(){
        Double TotalBalance = 0.0 ;
        for(BankAccount compte : this.accounts){
            TotalBalance += compte.getBalance() ;
        }
        return TotalBalance ;
    }
    public void transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, Double montant){
        if(sourceAccount.getBalance() > montant){
            sourceAccount.withdraw(montant);
            destinationAccount.deposit(montant);
        }
        else {
            System.out.println("Echec de l'operation ... solde insuffisant !");
        }
    }

    
    
}
