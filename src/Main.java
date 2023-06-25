public class Main {
    public static void main(String[] args) {
        int money = 1000; //Сумма на счете
        int add = 1001; //Сумма пополнения
        int bonus; //Количество бонусов

        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Количество бонусов: " + bonus);
        System.out.println("Итоговая сумма на счете: " + (money + add + bonus) + " руб.");
    }
}
