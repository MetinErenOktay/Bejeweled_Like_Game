import java.util.ArrayList;

public class rightDiagonalMath{
    public rightDiagonalMath(ArrayList<ArrayList<String>> gameGridListofLists, int x2, int y2, ArrayList<String> scoreList, ArrayList<String> totalScoreList){
        int x5 = 0;
        int conditionChecker = 0;
        int conditionChecker2 = 0;
        int conditionChecker3 = 0;
        int conditionChecker4 = 0;
        int conditionChecker5 = 0;
        if (gameGridListofLists.get(x2).get(y2).equals("/") || gameGridListofLists.get(x2).get(y2).equals("-") || gameGridListofLists.get(x2).get(y2).equals("+") || gameGridListofLists.get(x2).get(y2).equals("\\") || gameGridListofLists.get(x2).get(y2).equals("|")) {
            conditionChecker = 1;
        }
        if (x2>1 && y2<gameGridListofLists.get(0).size()-2) {
            if (gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("/") || gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("-") || gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("+") || gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("\\")|| gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("|")) {
                conditionChecker2 = 1;
            }
            if (gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("/") || gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("-") || gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("+") || gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("\\")|| gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("|")) {
                conditionChecker3 = 1;
            }
        }
        if (x2<gameGridListofLists.size()-2 && y2>1) {
            if (gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("/") || gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("-") || gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("+") || gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("\\")|| gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("|")) {
                conditionChecker4 = 1;
            }
            if (gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("/") || gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("-") || gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("+") || gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("\\")|| gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("|")) {
                conditionChecker5 = 1;
            }
        }
        //"y2>1" and "y2<gameGridListofLists.get(0).size()-2" expressions is used for eliminating list index out of bounds problem
        if (y2>1 && conditionChecker == 1 && conditionChecker2 == 1 && conditionChecker3 == 1) {
            x5 = x5+60;
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2-1).set(y2+1, " ");
            gameGridListofLists.get(x2-2).set(y2+2, " ");
        }
        else if (y2<gameGridListofLists.get(0).size()-2 && conditionChecker == 1 && conditionChecker4 == 1 && conditionChecker5 == 1) {
            x5 = x5+60;
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2+1).set(y2-1, " ");
            gameGridListofLists.get(x2+2).set(y2-2, " ");
        }
        new slidingEmptyTiles(gameGridListofLists);
        scoreList.set(0, String.valueOf(x5));
        totalScoreList.set(0, String.valueOf(Integer.parseInt(totalScoreList.get(0))  + x5));
        System.out.println(x5);
    }
}
