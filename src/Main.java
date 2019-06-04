public class Main {

    public static void main(String[] args) {

        SilnikBenzynowy silnikFurki = new SilnikBenzynowy();
        SamochodOsobowy furka = new SamochodOsobowy("Fiat", "Punto", "NOE78EJ", "niebieski",
                150.00, 6.5, silnikFurki.getRodzaj(), 12, 14500, 5, true, 5);

        System.out.println(furka.info());
        furka.jedz(15);
        furka.tankuj(10);
        System.out.println(furka.ilePaliwa());
        silnikFurki.wlacz();
        System.out.println(silnikFurki.uruchomiony);
        silnikFurki.wylacz();
        System.out.println(silnikFurki.uruchomiony);

        System.out.println("");

        SilnikBenzynowy silnikMotorku = new SilnikBenzynowy();
        Motor motorek = new Motor("Suzuki", "gn125", "BI1234", "czarny", 15000,
                3.4, silnikMotorku.getRodzaj(), 14.0, 2000,
                true, 2, 1);
        System.out.println(motorek.info());
        motorek.jedz(100);
        motorek.tankuj(14);
        System.out.println(motorek.ilePaliwa());
        silnikMotorku.wlacz();
        System.out.println(silnikMotorku.uruchomiony);
        silnikMotorku.wylacz();
        System.out.println(silnikMotorku.uruchomiony);

        System.out.println("");

        SilnikDiesla silnikDostawczaka = new SilnikDiesla();
        SamochodDostawczy dostawczak = new SamochodDostawczy("Renault", "Master", "BI123415",
                "biały", 80.000, 8.8, silnikDostawczaka.getRodzaj(), 40,
                150000, 2, true, 2, 15);

        System.out.println(dostawczak.info());
        dostawczak.jedz(1500);
        dostawczak.tankuj(14);
        System.out.println(dostawczak.ilePaliwa());
        silnikDostawczaka.wlacz();
        System.out.println(silnikDostawczaka.uruchomiony);
        silnikDostawczaka.wylacz();
        System.out.println(silnikDostawczaka.uruchomiony);
    }
}
