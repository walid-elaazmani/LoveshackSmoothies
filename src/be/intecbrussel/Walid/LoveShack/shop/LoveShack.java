package be.intecbrussel.Walid.LoveShack.shop;

import be.intecbrussel.Walid.LoveShack.*;
import be.intecbrussel.Walid.LoveShack.mixables.fruit.*;
import be.intecbrussel.Walid.LoveShack.mixables.vegetables.Celery;
import be.intecbrussel.Walid.LoveShack.mixables.vegetables.Spinach;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class LoveShack {
    Smoothies[] orders = new Smoothies[4];
    private double totalPrice;
    Orange orange = new Orange(6);
    Apple apple = new Apple(2);
    Banana banana = new Banana(9);
    Lemon lemon = new Lemon(5);
    StrawBerry strawberry = new StrawBerry(4);
    Spinach spinach = new Spinach(1);
    Celery celery = new Celery(3);

    LoveShack() {

    }




    void order() {
        Scanner sc = new Scanner(System.in);


      for (int i = 0; i < 4; i++) {

            System.out.println("Order or Compose:");
            String orderOrCompose = sc.nextLine();

            if (orderOrCompose.equals("order")) {

                System.out.println("choose from following: Citrus, StrawberryDream, BananaSlide or VeggieSlurry");

                String answer2 = sc.nextLine();
                answer2 = answer2.toUpperCase();

                orders[i] = Smoothies.valueOf(answer2);

            } else if (orderOrCompose.equals("compose")) {

                System.out.println("Choose ingedients: ");

                Food[] arrayOfIngedients = new Food[4];

                for (int j = 0; j < 4; j++) {

                    System.out.println("ingerdient: " + j);

                    String answer3 = sc.nextLine();

                    if (answer3.equals("confirm") && j > 1) {
                        break;
                    } else if (answer3.equals("confirm") && j < 1) {
                        System.out.println("you need to add items!");
                        j--;

                    } else {

                        switch (answer3) {

                            case "apple":
                                arrayOfIngedients[j] = apple;
                                break;
                            case "banana":
                                arrayOfIngedients[j] = banana;
                                break;
                            case "orange":
                                arrayOfIngedients[j] = orange;
                                break;
                            case "strawberry":
                                arrayOfIngedients[j] = strawberry;
                                break;
                            case "lemon":
                                arrayOfIngedients[j] = lemon;
                                break;
                            case "celery":
                                arrayOfIngedients[j] = celery;
                                break;
                            case "spinach":
                                arrayOfIngedients[j] = spinach;
                                break;
                            default:
                                j--;
                                System.out.println("not valid come again");

                        }
                    }
                }

                Food[] adjustedArrayOfIngredients = Arrays.stream(arrayOfIngedients).filter(Objects::nonNull).toArray(Food[]::new);
                Smoothies.CUSTOM.setRecipe(adjustedArrayOfIngredients);
                orders[i] = Smoothies.CUSTOM;

            } else if (orderOrCompose.equals("confirm") && i >= 1) {
                break;
            } else {
                System.out.println("not valid  input");
                i--;
            }
        }


        for (Smoothies order : orders) {

            if (order != null) {

                System.out.println("Preparing" + order);

                Arrays.stream(order.getRecipe())
                        .forEach(food -> {
                            if (food != null) {
                                food.mix();
                            }
                        });

                System.out.println();
            }
        }


        double orderFrormRecipeTP = orderFromSmoothieRecipe();
        double customOrderTP = customOrder();

        System.out.println(String.format("Receipt \nPrice of ordered smoothies = %8.1f| Price of custom order = %8.1f | total price %8.1f"
                , orderFrormRecipeTP
                , customOrderTP
                , (orderFrormRecipeTP + customOrderTP)));


    }

    double orderFromSmoothieRecipe() {

        Stream.of(orders)
                .filter(Objects::nonNull)
                .filter(p -> !(p.equals(Smoothies.CUSTOM)))
                .forEach(p -> totalPrice += p.getTotalPrice());

        return totalPrice;
    }


    double customOrder() {


        totalPrice = 0;

        Stream.of(orders)
                .filter(Objects::nonNull)
                .filter(p -> p.equals(Smoothies.CUSTOM))
                .forEach(p -> totalPrice += p.getTotalPrice());

        return totalPrice;
    }


}
