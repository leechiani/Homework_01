package hw4;

//算出每位同學考最高分的次數
//(提示：二維陣列)
public class Hw4_4 {
    public static void main(String[] args) {

        int[][] scores = {
                { 10, 35, 40, 100, 90, 85, 75, 70 },
                { 37, 75, 77, 89, 64, 75, 70, 95 },
                { 100, 70, 79, 90, 75, 70, 79, 90 },
                { 77, 95, 70, 89, 60, 75, 85, 89 },
                { 98, 70, 89, 90, 75, 90, 89, 90 },
                { 90, 80, 100, 75, 50, 20, 99, 75 }
        };
        int[] countHighestScore = new int[8]; // 統計每個人的高分次數

        for (int i = 0; i < scores.length; i++) { // 第i+1次考試
            int maxScore = 0; // 最高分，起始值為0
            int maxIndex = 0; // 最高分的位置
            for (int j = 0; j < scores[i].length; j++) { // j+1號同學
                if (scores[i][j] > maxScore) {
                    maxScore = scores[i][j];
                    maxIndex = j; // 最高分的位置在index j
                }
            }
            countHighestScore[maxIndex]++; // 統計陣列的index j號位次數+1
        }

        for (int i = 0; i < countHighestScore.length; i++) {
            System.out.println((i + 1) + "號同學考最高分的次數為" + countHighestScore[i] + "次");
        }
    }
}