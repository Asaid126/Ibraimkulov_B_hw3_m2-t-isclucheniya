public class Main {
    public static void main(String[] args) {
 BankAccount Optima=new BankAccount();
 Optima.deposit(15000.0);
       while (true) {
           try {
               Optima.withDraw(6000);
           } catch (LimitException e) {
               System.out.println(e.getMessage());
               System.out.println(e.getRemainingAmount());
               try {
                   if(e.getRemainingAmount()>0) {
                       Optima.withDraw((int) e.getRemainingAmount());
                   }
                   // break;  работает и тут и и ниже (на исход не влияет),
                   // есть ли какое нибудь правило или какая нибудь разница?
               } catch (LimitException ex) {

               }
               break;
           }

       }


    }
}
