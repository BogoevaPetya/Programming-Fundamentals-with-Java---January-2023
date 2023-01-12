package Fundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08AnonymousThreat {
    public static void main(String[] asrgs) {
        Scanner scanner = new Scanner(System.in);

        List<String> texts = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("3:1")){
            if (command.contains("merge")){
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > texts.size() - 1) {
                    endIndex = texts.size() - 1;
                }
                boolean isValidIndexes = startIndex <= texts.size() - 1 && endIndex >= 0 && endIndex > startIndex;

                if (isValidIndexes) {
                    String resultMerge = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String currentText = texts.get(index);
                        resultMerge += currentText;
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        texts.remove(startIndex);
                    }
                    texts.add(startIndex, resultMerge);
                }

            } else if (command.contains("divide")){
                //divide {index} {partitions}
                //divide 2 3
                //{abcdef, ghi, jkl}
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                String elementForDivide = texts.get(index); //abcdef
                texts.remove(index);

                int partSize = elementForDivide.length() / parts; //2
                int beginOfIndex = 0;
                for (int i = 1; i < parts; i++) {
                    texts.add(index, elementForDivide.substring(beginOfIndex, beginOfIndex + partSize));
                    beginOfIndex += partSize;
                    index++;
                }
                texts.add(index, elementForDivide.substring(beginOfIndex));

            }

            command = scanner.nextLine();
        }

        System.out.print(String.join(" ", texts));

    }
}
