import java.util.*;
public class TestScores {
    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        Random ran = new Random();
        final int SIZE = ran.nextInt((10 - 3) + 1) + 3;

        int[] testScore = new int[SIZE];
        char[] letterGrade = new char[SIZE];

        System.out.println("Enter your " + SIZE + " test scores");

        for(int i = 0; i < testScore.length; i++){
            int test = i + 1;
            System.out.println("Enter test " + test + " score: ");
            testScore[i] = scnr.nextInt();
        }

        for(int i = 0; i < testScore.length; i++){
            int test = testScore[i];
            letterGrade[i] = getLetterGrade(test);
        }

        printGrades(testScore, letterGrade);
        printHighestScore(testScore);
        printLowestScore(testScore);
        printAverageScore(testScore);

        scnr.close();

    }

    public static char getLetterGrade(int testScore){
        char grade = 'F';
        if(testScore >= 90){
            grade = 'A';
        }else if(testScore >= 80){
            grade = 'B';
        }else if(testScore >=70){
            grade = 'C';
        }else if(testScore >= 60){
            grade = 'D';
        }else if(testScore < 50){
            grade = 'F';
        }

        return grade;
    }

    public static void printGrades(int[] testScore, char[] letterGrade){
        System.out.println("Score   Grade");
        for(int i = 0; i < testScore.length; i++){
            System.out.printf("%d       %s\n", testScore[i], letterGrade[i]);
        }
    }

    public static void printHighestScore(int[] testScore){
        int max = 0;
        for(int i = 0; i < testScore.length; i++){
            if(max < testScore[i]){
                max = testScore[i];
            }
        }
        System.out.println("The highest score is " + max );
    }

    public static void printLowestScore(int[] testScore){
        int low = testScore[0];
        for(int i = 0; i < testScore.length; i++){
            if(low > testScore[i]){
                low = testScore[i];
            }
        }
        System.out.println("The lowest score is " + low );
    }

    public static void printAverageScore(int[] testScore){
        double average = 0.0;
        int count = 0;
        for(int i = 0; i < testScore.length; i ++){
            average = average + testScore[i];
            count++;
        }
        average = average / count;
        System.out.println("Average Score is " + average);

    }

}
