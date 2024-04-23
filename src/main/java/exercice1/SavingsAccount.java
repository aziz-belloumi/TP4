package exercice1;

class SavingsAccount extends BankAccount {
    private Double interestRate;

    public SavingsAccount(Integer accountNumber,Double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }
    public SavingsAccount(Integer accountNumber, Double balance, Double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        Double interest = balance * interestRate;
        deposit(interest);
    }

    public Double getInterestRate() {
        return interestRate;
    }
    @Override
    public void withdraw(Double montant){
        final int montantMaximal = 1000 ;
        final double penalityRate = 0.05 ;
        if(super.getBalance() >= montant && montant <= montantMaximal ){
            super.withdraw(montant);
        }
        else if(super.getBalance() >= montant && montant > montantMaximal){
            Double penality = montant * penalityRate ;
            super.withdraw(montant + penality);
        }
        else{
            System.out.println("Echec de l'operation ... solde insuffisant !");
        }
    }
    
}
