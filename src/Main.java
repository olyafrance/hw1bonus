public class Main {
    public static void main(String[] args) {
        int m = 1000; //Сумма на счете
        int a = 1001; //Сумма пополнения
        int b; //Количество бонусов



        if (a > 1000) {
            b = a / 100;
        } else {
            b = 0;
        }


        System.out.println("Количество бонусов: " + b);
        System.out.println("Итоговая сумма на счете: " + ( m + a + b ) + " руб.");
    }
}
