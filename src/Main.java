public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int deposit = 1100;

        int bonus = 0;
        if (deposit > 1000) {
            bonus = deposit / 100;
            amount = amount + deposit + bonus;
        } else {
            amount = amount + deposit;
        }
        System.out.println("Итоговая сумма= " + amount + "\nКоличество бонусных рублей= " + bonus);

    }
}