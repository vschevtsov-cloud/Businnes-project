import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Нужна техническая деталь?(Да/Нет)");
        String answer = sc.nextLine();
        System.out.println("Нужна внешняя деталь?(Да/нет)");
        String answer2 = sc.nextLine();
        String techDetailInfo = null;
        if (answer.equalsIgnoreCase("Да")) {
            System.out.print("Техническая деталь какая и от какой марки и модели: ");
            techDetailInfo = sc.nextLine();
        }
        String extDetailInfo = null;
        if (answer2.equalsIgnoreCase("Да")) {
            System.out.print("Внешняя деталь какая и на какую марку и модель: ");
            extDetailInfo = sc.nextLine();
        }
        System.out.println("\nОформление заказа:");
        System.out.println("Техническая деталь: " + (techDetailInfo != null ? techDetailInfo : "Не требуется"));
        System.out.println("Внешняя деталь: " + (extDetailInfo != null ? extDetailInfo : "Не требуется"));
        System.out.println("\nВыставление счёта...");
        double totalAmount = 0;
        if (answer.equalsIgnoreCase("Да")) {
            totalAmount += 50000;
        }
        if (answer2.equalsIgnoreCase("Да")) {
            totalAmount += 20000;
        }
        System.out.println("Общая сумма к оплате: " + totalAmount + " Тенге");

        // Шаг 7: Оформление доставки
        System.out.print("\nОформление доставки. На какой адрес нужно отправить заказ? ");
        String deliveryAddress = sc.nextLine();

        // Шаг 8: Отправка
        System.out.println("\nОтправка заказа...");
        System.out.println("Детали заказа:");
        System.out.println("Адрес доставки: " + deliveryAddress);
        System.out.println("Счёт на сумму: " + totalAmount + " Тенге");
        System.out.println("Заказ успешно оформлен и будет отправлен на указанный адрес.");
    }
}