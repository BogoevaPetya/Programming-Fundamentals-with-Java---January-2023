package Fundamentals.Lists.Lab;

import java.util.*;

public class L06ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> productList = new ArrayList<>();
        for (int i = 0; i <= n - 1; i++) {
            String product = scanner.nextLine();
            productList.add(product);
        }

        Collections.sort(productList);

        for (int i = 0; i <= productList.size() - 1; i++) {
            System.out.println(1 + i + "." + productList.get(i));
        }
    }
}
