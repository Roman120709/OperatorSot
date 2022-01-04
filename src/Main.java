public class Main {
    public static void main(String[] args) {
        int firstSum = 100;
        int deposit = 1500;
        int totalSum = firstSum + deposit;
        int bonus;
        if (deposit > 1000) bonus = deposit / 100;
        else bonus = 0;
        System.out.println("сумма бонусов=" + bonus);
    }
}


