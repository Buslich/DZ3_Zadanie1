public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 15000;
        int miles = service.calculate(ticketPrice);
        System.out.println("Начислено бонусных миль за купленный билет: " + miles);
    }
}
