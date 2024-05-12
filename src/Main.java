public class Main {
    public static void main(String[] args) {
        // переменные для начального счета
        int initialBalance = 50; // изначальный баланс пользователя
        int replenishment = 4000; // сумма, которую он пополняет

        // переменные для бонуса и итогового счета
        int bonus = 0;
        int finalBalance = initialBalance + replenishment;

        // проверяем, превышает ли сумма порог в 1000
        if (finalBalance > 1000) {
            bonus = replenishment / 100;
        }

        // выводим итоговый счет и бонусные рубли
        System.out.println("Итоговый счет: " + finalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
    }
}
