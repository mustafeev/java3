public class Main {
    public static void main(String[] args) {

        int account = 100;
        int client = 1100;
        // System.out.println("Бонус:" + (account + client + client / 100));
        System.out.println("Счет:" + (account + client + client / 100));
        int bonus = client;
        if (bonus <= 1000) {
            //bonus = (client/client);
            System.out.println("Не достаточно денег для начисления бонусов:");
        } else {
            bonus = (client/100);
            System.out.println("Бонусы:" + bonus);
        }
    }
}