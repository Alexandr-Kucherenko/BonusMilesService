public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int mil = price / bonus;
        return mil;
    }

}
