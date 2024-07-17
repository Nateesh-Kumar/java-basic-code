public class bankMain {
  
        public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount(1000.0);
    
            Depositor depositor1 = new Depositor(bankAccount, 500.0);
            Depositor depositor2 = new Depositor(bankAccount, 300.0);
            Withdrawor withdrawor1 = new Withdrawor(bankAccount, 200.0);
            Withdrawor withdrawor2 = new Withdrawor(bankAccount, 400.0);
    
            depositor1.start();
            depositor2.start();
            withdrawor1.start();
            withdrawor2.start();
        }
 }
    

