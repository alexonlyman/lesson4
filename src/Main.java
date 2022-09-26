public class Main {
    public static void main(String[] args) {



        byte homeTemperiture = 24;
        int speedOflight = 299792458;
        short area = 4045;
        long computerTine = 183775737123747713L;
        double headHans = 0.777;
        float homeMade = 3;
        System.out.println("значение переменной homeTemperiture c типом byte равно 24 ");
        System.out.println("значение переменной speedOflight c типом int равно 299792458 ");
        System.out.println("значение переменной area c типом short равно 4045 ");
        System.out.println("значение переменной computerTine c типом long равно 183775737123747713L ");
        System.out.println("значение переменной headHans c типом double равно 0.777 ");
        System.out.println("значение переменной homeMade c типом float равно 3 ");

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short papper = 480;
        byte allStudents = (byte) (teacher1 + teacher2 + teacher3);
        System.out.println(allStudents);
        int papperForall = papper / allStudents;
        System.out.println("На каждого ученика рассчитано " + papperForall + " листов бумаги!");




    }
}