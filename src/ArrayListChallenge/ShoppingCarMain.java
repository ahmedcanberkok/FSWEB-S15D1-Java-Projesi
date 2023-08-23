package ArrayListChallenge;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCarMain {
    public static void main(String[] args) {
        List<String> shoplist = new LinkedList<>();
        startShopping(shoplist);

    }

    public static void startShopping(List<String> shoppingList) {
        Scanner scanner = new Scanner(System.in);
                while ( true) {
                    try {
                        System.out.println("Yapmak istediğiniz işlemi seçin.");
                        System.out.println("1-Eklenmesini istediğiniz elemanları giriniz.");
                        System.out.println("2-Cıkarılmasını istediğiniz elemanları giriniz.");
                        int process = scanner.nextInt();
                        if (process < 0 || process > 2) {
                            System.out.println("Process mut be between 0 to 2");
                        }
                        if(process == 0){
                            System.exit(0);
                        }

                        if(process == 1){
                           ShoppingCar.addItem(shoppingList);
                        }

                        if(process == 2){
                            ShoppingCar.removeItems(shoppingList);
                        }

                    } catch (Exception ex) {
                        System.out.println("Invalid process: " + ex.getMessage());
                        break;
                    }
                }

    }
}
