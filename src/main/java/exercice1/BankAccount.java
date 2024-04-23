package exercice1;

public class BankAccount {
    protected Integer accountNumber ;
    protected Double balance ;
    public BankAccount(Integer accountNumber){
        this.balance = 0.0 ;
        this.accountNumber = accountNumber ;
    }
    public BankAccount(Integer accountNumber , Double balance){
        this.accountNumber = accountNumber ;
        this.balance = balance ;
    }
    public void deposit(Double montant){
        this.balance += montant ;
    }
    public void withdraw(Double montant){
        if(montant > this.balance){
            System.out.println("Echec de l'operation ... solde insuffisant !");
        }
        else {
            this.balance -= montant ;
        }
    }
    public Double getBalance(){
        return this.balance ;
    }
    
    
}
