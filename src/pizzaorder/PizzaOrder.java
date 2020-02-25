package pizzaorder;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PizzaOrder {
    public static void main(String[] args) {
        String name,address,pizzaSize,pizzaType;
        int topping;
        double price=0, tax=0, total=0;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What's your name?");
        name = keyboard.nextLine();
        
        System.out.println("What's your address?");
        address = keyboard.nextLine();
        
        System.out.print("What's size do you like?\n"
                + "small(sm) 10 SAR\n"
                + "medium(md) 20 SAR\n"
                + "large(lg) 30 SAR\n");
        pizzaSize = keyboard.nextLine();
        switch(pizzaSize){
            case "sm":
                price += 10;
                pizzaSize = "small";
            break;
            case "md":
                price += 15;
                pizzaSize = "medium";
            break;
            case "lg":
                price += 20;
                pizzaSize = "large";
            break;
            default:
                System.out.println("Somthing wrong Plase try again :( ");
                System.exit(0);
        }
        
        System.out.println("What type of pizza do you like?\n"
                + "chicken(ck) or meet(mt) - add 5 SAR");
        pizzaType = keyboard.nextLine();
        if(pizzaType.equalsIgnoreCase("mt")){
            price += 5;
            pizzaType = "meet";
        }else if (pizzaType.equalsIgnoreCase("ck")){
            price += 0;
            pizzaType = "chicken";
        }else{
            System.out.println("Somthing wrong Plase try again :( ");
            System.exit(0);
        }
        
        System.out.println("How many topping do you like? - each topping for 2 SAR");
        topping = keyboard.nextInt();
        price += topping * 2;
        
        tax = price * 5 /100;
        
        total = tax + price;
        
        String order = "Your order is as follows:\n"
                + "Name: " + name
                + "\nAddress: " + address 
                + "\nPizza Size "+ pizzaSize 
                + "\nPizza Type "+ pizzaType
                + "\nToppings "+topping 
                + "\nPrice:SAR "+ price
                + "\nTax:SAR "+tax
                + "\nTotal:SAR "+ total
                + "\n\n\nYour order will be ready in 30 minutes";
        
        JOptionPane.showMessageDialog(null, order);
        System.out.print("Thank you :) come again");
    }
    
}
