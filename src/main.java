import java.util.Scanner;

public class PlayingCard {
    public static void main(String[] args) {

        int cardsPerPlayer = 5; // Инициализация переменных
        int players = 0 ;
        String[] SUITS_LIST = {
                "Пик", "Бубен", "Черв", "Треф"
        };
        String[] RANK_LIST = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Королева", "Король", "Туз"
        };
        int n = SUITS_LIST.length * RANK_LIST.length; // Кол-во карт

        for(;;){	// Ввод с консоли
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите кол-во игроков: ");
            if(sc.hasNextInt()){
                players = sc.nextInt();
                if(cardsPerPlayer * players <= n){
                    break;
                } else {
                    if (players ==0){
                        System.out.println("Игра окончена!");
                        break;
                    } else if (players<0){
                        System.out.println("Число игроков не может быть < 0!");
                    } else{
                        System.out.println("Слишком много игроков!");
                    }
                }

            }
    }
}