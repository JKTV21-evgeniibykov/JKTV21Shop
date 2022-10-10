
import entity.Buyer;
import entity.Product;
import entity.Sell;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pupil
 */
public class App {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        do {
            System.out.println("0.exit | 1.add product | 2.remove product | 3.add buyer | 4.sell");
            System.out.print("> ");
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    System.out.print("add product");
                    Product product = new Product();
                    break;
                case 2:
                    System.out.print("remove product");
                    break;
                case 3:
                    System.out.print("add buyer");
                    Buyer buyer = new Buyer();
                    break;
                case 4:
                    System.out.print("sell");
                    Sell sell = new Sell();
                    break;
                default:
            }
        } while (repeat);
        System.out.println("exit");
    }
    
}
