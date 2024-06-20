import java.util.*;

public class TextAdventureGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Text-based Adventure Game!");
        System.out.println("------------GAME STARTS NOW--------------");
        System.out.println("You found yourself in a dark cave.\n There are two paths ahead");
        System.out.println("Which path will you choose?");
        String path = scanner.next().toLowerCase();
        if (path.equals("left")){
            System.out.print("You have encountered a scary monster.\n Will you run or fight?: ");
            String action = scanner.next().toLowerCase();
            if(action.equals("run")){
                System.out.println("You have manage to escape from the cave. Congratulations!");
            }
            else{
                System.out.println("You tried to fight the monster but unfortunately,\n It was too strong. GAME OVER!");
            }
        }
        else if(path.equals("right")){
            System.out.println("You found a treasure chest full of gold. You win!");
        }
        else{
            System.out.println("Invalid choice. You have stumbled and got lost in the dark cave. GAME OVER!");
        }
        scanner.close();
    }
}
