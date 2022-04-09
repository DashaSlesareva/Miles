public class Main {
    public static void main(String[] args) {

        //входные данные
        int ticketPrice = 1_020;
        int mileFor = 20;

        //логика программы
        int mileAmount;
        mileAmount = ticketPrice/mileFor;
        System.out.println("Количество бонусных миль - " + mileAmount);

    }
}
