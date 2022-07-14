package by.mtereshchenko.Lesson15.part2;

class Seasons {
    public static final Seasons WINTER = new Seasons();
    public static final Seasons SPLRING = new Seasons();
    public static final Seasons SUMMER = new Seasons();
    public static final Seasons AUTUMN = new Seasons();
}

//public enum Season {
//    WINTER, SPRING, SUMMER, AUTUMN
//}
class EnumUsage {
    public static void main(String[] args) {
        Seasons currentSeasons = Seasons.SUMMER;
//        System.out.println(currentSeasons);
        if (currentSeasons == Seasons.WINTER) {
            System.out.println("Одеваемся теплее");
        } else if (currentSeasons == Seasons.SUMMER) {
            System.out.println("Ура, идём купаться");
        }
    }
}
