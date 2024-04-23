package exercice1;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> clients ;
    public Bank(){
        this.clients = new ArrayList();
    }
    public void addCustomer(Customer client){
        if(this.clients.contains(client)){
            System.out.println("ce client deja existe !");
        }
        else {
            this.clients.add(client);
        }
    }
    public void removeCustomer(Customer client){
        if(this.clients.contains(client)){
            this.clients.remove(client);
        }
        else {
            System.out.println("ce client n'existe pas !");
        }
    }
    public Double getTotalBalance(){
        Double totalBankBalance = 0.0 ;
        for(Customer client : this.clients){
            totalBankBalance += client.getTotalAccountBalance() ;
        }
        return totalBankBalance ;
    }
    
    
}
