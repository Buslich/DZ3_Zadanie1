public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int milesPerRub = 20; // Количество миль за каждые 20 рублей стоимости билета
        int miles = ticketPrice / milesPerRub; // Расчет количества миль
        return miles;
    }
}
