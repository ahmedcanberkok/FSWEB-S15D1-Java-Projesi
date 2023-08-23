package ArrayListChallenge;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShoppingCar {

   private static String  getInput () {
       Scanner scanner = new Scanner(System.in);
       return scanner.nextLine();

   }
   public static  void  addItem (List<String> shoppingList) {
       System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
       String input = getInput();
       if (input.contains(",")) {
           String[] elements = input.split(",");
           for(String element: elements){
               if(element != null && !element.trim().isEmpty()){
                   if(!checkItemsInList(shoppingList, element)){
                       shoppingList.add(element.trim());
                   }
               }
           }
       }
            printSorted(shoppingList);
   }
    public static void removeItems(List<String> shoppingList){
        System.out.println("Cıkarılmasını istediğiniz elemanları giriniz:");
        String input = getInput();
        if(input.contains(",")){
            String[] elements = input.split(",");
            for(String element: elements){
                if(element != null && !element.trim().isEmpty()){
                    if(checkItemsInList(shoppingList, element)){
                        shoppingList.remove(element.trim());
                    }
                }
            }
        } else {
            if(input != null && !input.isEmpty()){
                shoppingList.remove(input);
            }
        }
        printSorted(shoppingList);
    }

    public static boolean checkItemsInList(List<String> products, String product){
           return products.contains(product.trim());
       }
       public static void printSorted(List<String> products){
           Collections.sort(products);
           System.out.println(products);
           for(String product: products){
               System.out.println(product);
           }
   }
   }


