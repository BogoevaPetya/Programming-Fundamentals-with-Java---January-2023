package Fundamentals.Lists.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E10SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] inputData = input.split(":");
            String command = inputData[0];
            String lessonTitle = inputData[1];
            switch (command){
                case "Add":
                    if(!list.contains(lessonTitle)){
                        list.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(inputData[2]);
                    if (!list.contains(lessonTitle)){
                        list.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    if (list.contains(lessonTitle)){
                        list.remove(lessonTitle);
                    }
                    int indexLesson = list.indexOf(lessonTitle);
                    String exercise = lessonTitle  + "-Fundamentals.ObjectAndClasses.Fundamentals.ObjectAndClasses.Fundamentals.AssociativeArrays.Fundamentals.AssociativeArrays.Lab.Lab.Fundamentals.AssociativeArrays.Fundamentals.AssociativeArrays.Lab.Lab.Fundamentals.ObjectAndClasses.Fundamentals.ObjectAndClasses.Exercise";
                    if (list.get(indexLesson + 1).equals(exercise)){
                        list.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":
                    String lessonTitle2 = inputData[2];
                    String exerciseTitle = lessonTitle + "-Fundamentals.ObjectAndClasses.Fundamentals.ObjectAndClasses.Fundamentals.AssociativeArrays.Fundamentals.AssociativeArrays.Lab.Lab.Fundamentals.AssociativeArrays.Fundamentals.AssociativeArrays.Lab.Lab.Fundamentals.ObjectAndClasses.Fundamentals.ObjectAndClasses.Exercise";
                    String exerciseTitle2 = lessonTitle2 + "-Fundamentals.ObjectAndClasses.Fundamentals.ObjectAndClasses.Fundamentals.AssociativeArrays.Fundamentals.AssociativeArrays.Lab.Lab.Fundamentals.AssociativeArrays.Fundamentals.AssociativeArrays.Lab.Lab.Fundamentals.ObjectAndClasses.Fundamentals.ObjectAndClasses.Exercise";

                    if(list.contains(lessonTitle) && list.contains(lessonTitle2)){
                        int indexLesson1 = list.indexOf(lessonTitle);
                        int indexLesson2 = list.indexOf(lessonTitle2);

                        list.set(indexLesson1, lessonTitle2);
                        list.set(indexLesson2, lessonTitle);

                        if (list.contains(exerciseTitle)){
                            int indexExercise1 = list.indexOf(exerciseTitle);
                            list.remove(indexExercise1);
                            list.add(indexLesson2 + 1, exerciseTitle);
                        }

                        if (list.contains(exerciseTitle2)){
                            int indexExercise2 = list.indexOf(exerciseTitle2);
                            list.remove(indexExercise2);
                            list.add(indexLesson1 + 1, exerciseTitle2);
                        }
                    }
                    break;
                case "Exercise":
                    String exercises = lessonTitle + "-Fundamentals.ObjectAndClasses.Fundamentals.ObjectAndClasses.Fundamentals.AssociativeArrays.Fundamentals.AssociativeArrays.Lab.Lab.Fundamentals.AssociativeArrays.Fundamentals.AssociativeArrays.Lab.Lab.Fundamentals.ObjectAndClasses.Fundamentals.ObjectAndClasses.Exercise";
                    int indexLessonTitle = list.indexOf(lessonTitle);
                    if(list.contains(lessonTitle)){
                        list.add(indexLessonTitle + 1, exercises);
                    } else {
                        list.add(lessonTitle);
                        list.add(exercises);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        int counter = 1;
        for (String element : list) {
            System.out.println(counter + "." + element);
            counter++;
        }
    }
}
