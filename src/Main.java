public class Main {
    public static void main(String[] args) {
        System.out.println("Считаем бонусы за купленный билет.");

        int ticket_price = 13676;
        int cost_of_miles = 20;
        int total_miles = ticket_price / cost_of_miles;

        System.out.println("Ваш бонус:  " + total_miles + "  миль");
    }
}