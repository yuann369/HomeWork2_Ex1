public class Main {
    public static void main(String[] args) {

        int costTicket = 9536;
        int expense = 20;

        int bonusMiles;
        bonusMiles = costTicket / 20;

        System.out.println("Стоимость билета: " + costTicket);
        System.out.println("Количество рублей для одной бонусной мили: " + expense);
        System.out.println("Начислено бонусных миль: " + bonusMiles);
    }
}
