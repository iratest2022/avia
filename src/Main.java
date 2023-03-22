public class Main {
    public static void main(String[] args) {

        System.out.println("Здравствуйте!");
        int amountTicket = 12000;
        System.out.println("Стоимость билета: " + amountTicket + "руб.");
        System.out.println("Вам предоставлена бонусная программа, где за каждые 20 руб." + "потраченные за билет, будет начислена 1 миля");
        int amountOneMiles = 20;
        int bonusMiles = amountTicket / amountOneMiles;
        System.out.println("Поздравляем!" + "Ваш бонус составляет: " + bonusMiles + "миль");

    }
}