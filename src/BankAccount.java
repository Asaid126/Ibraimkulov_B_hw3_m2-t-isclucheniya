public class BankAccount {
    private double amount;  // Остаток на счете

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) { //положить деньгина на счет // Почемунужно писать без static?
        amount += sum;                                             // со статик не видит переменную amount
        System.out.println("На вашсчет поступило: " + sum + "сом");
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Вы превысили лимит, в данный момен вам достуно: ", amount);
        }

            amount -= sum;
            System.out.println("С вашего счета списано: " + sum + "сом , остаток на счете :"+amount);


    }
}

