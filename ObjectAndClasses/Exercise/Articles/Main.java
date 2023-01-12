package Fundamentals.ObjectAndClasses.Exercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine(); // "{title}, {content}, {author}"
        String title = input.split(", ")[0];
        String content = input.split(", ")[1];
        String author = input.split(", ")[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.contains("Edit")){
                String newContent = command.split(": ")[1];
                article.editContent(newContent);
            } else if (command.contains("ChangeAuthor")){
                String newAuthor = command.split(": ")[1];
                article.changeAuthor(newAuthor);
            } else if (command.contains("Rename")){
                String newTitle = command.split(": ")[1];
                article.renameTitle(newTitle);
            }
        }

        System.out.print(article.toString());
    }
}
