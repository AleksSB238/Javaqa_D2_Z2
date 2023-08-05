public class Main {
    public static void main(String[] args) {
        System.out.println("Считаем бонусы за купленный билет.");

        int ticketPrice = 13676;
        int costOfMiles = 20;
        int totalMiles = ticketPrice / costOfMiles;

        System.out.println("Ваш бонус:  " + totalMiles + "  миль");
    }
}