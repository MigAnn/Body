public class Characteristic {
    public double calculate (double height, double weight) {

        double square = height * height;
        double index = weight/square;

        System.out.println("Ваш индекс массы тела равен "+ index);

        return index;

    }
}
