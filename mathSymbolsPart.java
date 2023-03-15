import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class mathSymbolsPart {
    public mathSymbolsPart(PrintWriter pw, String inputTileContent, ArrayList<ArrayList<String>> gameGridListofLists, int totalScore, ArrayList<String> totalScoreList, ArrayList<String> scoreList, int x, int y){
        switch (inputTileContent) {
            case "/":
                new rightDiagonalMath(gameGridListofLists, x, y, scoreList, totalScoreList);
                System.out.println(gameGridListofLists);
                pw.println("Select coordinate or enter E to end the game:\n");
                for(int i= 0; i<gameGridListofLists.size(); i+=1){
                    String gridWithoutBrackets = Arrays.toString(gameGridListofLists.get(i).toArray()).replace("[", "").replace("]", "").replace(", ", " ");
                    pw.println(gridWithoutBrackets);
                }
                pw.println("");
                pw.println("Score: " + Arrays.toString(scoreList.toArray()).replace("[", "").replace("]", "")+ " points\n");
                totalScore = totalScore + Integer.parseInt((Arrays.toString(scoreList.toArray()).replace("[", "").replace("]", "")));
                break;
            case "-":
                new horizontalMath(gameGridListofLists, x, y, scoreList, totalScoreList);
                System.out.println(gameGridListofLists);
                pw.println("Select coordinate or enter E to end the game:\n");
                for(int i= 0; i<gameGridListofLists.size(); i+=1){
                    String gridWithoutBrackets = Arrays.toString(gameGridListofLists.get(i).toArray()).replace("[", "").replace("]", "").replace(", ", " ");
                    pw.println(gridWithoutBrackets);
                }
                pw.println("");
                pw.println("Score: " + Arrays.toString(scoreList.toArray()).replace("[", "").replace("]", "")+ " points\n");
                totalScore = totalScore + Integer.parseInt((Arrays.toString(totalScoreList.toArray()).replace("[", "").replace("]", "")));
                break;
            case "+":
                new horizontalThenVerticalMath(gameGridListofLists, x, y, scoreList, totalScoreList);
                System.out.println(gameGridListofLists);
                pw.println("Select coordinate or enter E to end the game:\n");
                for(int i= 0; i<gameGridListofLists.size(); i+=1){
                    String gridWithoutBrackets = Arrays.toString(gameGridListofLists.get(i).toArray()).replace("[", "").replace("]", "").replace(", ", " ");
                    pw.println(gridWithoutBrackets);
                }
                pw.println("");
                pw.println("Score: " + Arrays.toString(scoreList.toArray()).replace("[", "").replace("]", "")+ " points\n");
                totalScore = totalScore + Integer.parseInt((Arrays.toString(totalScoreList.toArray()).replace("[", "").replace("]", "")));
                break;
            case "\\":
                new leftDiagonalMath(gameGridListofLists, x, y, scoreList, totalScoreList);
                System.out.println(gameGridListofLists);
                pw.println("Select coordinate or enter E to end the game:\n");
                for(int i= 0; i<gameGridListofLists.size(); i+=1){
                    String gridWithoutBrackets = Arrays.toString(gameGridListofLists.get(i).toArray()).replace("[", "").replace("]", "").replace(", ", " ");
                    pw.println(gridWithoutBrackets);
                }
                pw.println("");
                pw.println("Score: " + Arrays.toString(scoreList.toArray()).replace("[", "").replace("]", "")+ " points\n");
                totalScore = totalScore + Integer.parseInt((Arrays.toString(totalScoreList.toArray()).replace("[", "").replace("]", "")));
                break;
            case "|":
                new verticalMath(gameGridListofLists, x, y, scoreList, totalScoreList);
                System.out.println(gameGridListofLists);
                pw.println("Select coordinate or enter E to end the game:\n");
                for(int i= 0; i<gameGridListofLists.size(); i+=1){
                    String gridWithoutBrackets = Arrays.toString(gameGridListofLists.get(i).toArray()).replace("[", "").replace("]", "").replace(", ", " ");
                    pw.println(gridWithoutBrackets);
                }
                pw.println("");
                pw.println("Score: " + Arrays.toString(scoreList.toArray()).replace("[", "").replace("]", "")+ " points\n");
                totalScore = totalScore + Integer.parseInt((Arrays.toString(totalScoreList.toArray()).replace("[", "").replace("]", "")));
                break;
        }
    }
}