// среднее арифметическое всех целых чисел от 1 до 1000
public class Main {
    public static void main(String[] args) {
        double res = 0;
        double sum = 0;
        for (int i = 0; i <= 1000 ; i++) {
            sum += i;
            res = sum/1000;
        }
        System.out.println("среднее арифметическое всех целых чисел от 1 до 1000: " + res);
    }
}