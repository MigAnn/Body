public class Body {
    public static void main(String[] args) {
        double height = 1.72;
        double weight = 94.0;


        Characteristic characteristic = new Characteristic();

        double characteristic1 = characteristic.calculate(1.72, 94.0);

        System.out.println("OP: 31.77 , ФР: "+ characteristic1);
        }
}
