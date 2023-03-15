import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class dstwPart {
    public dstwPart(PrintWriter pw, String inputTileContent, ArrayList<ArrayList<String>> gameGridListofLists, int totalScore, ArrayList<String> totalScoreList, ArrayList<String> scoreList, int x, int y){
        switch (inputTileContent) {
            case "D":
                new leftThenRightDiagonalDstw(gameGridListofLists, x, y, scoreList, totalScoreList);
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
            case "S":
                new horizontalDstw(gameGridListofLists, x, y, scoreList, totalScoreList);
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
            case "T":
                new verticalDstw(gameGridListofLists, x, y, scoreList, totalScoreList);
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
            case "W":
                new verticalThenHorizontalThenLeftThenRightDiagonalDstw(gameGridListofLists, x, y, scoreList, totalScoreList);
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