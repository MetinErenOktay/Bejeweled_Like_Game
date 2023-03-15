import java.util.ArrayList;

public class verticalThenHorizontalThenLeftThenRightDiagonalMath{
    public verticalThenHorizontalThenLeftThenRightDiagonalMath(ArrayList<ArrayList<String>> gameGridListofLists, int x2, int y2, ArrayList<String> scoreList, ArrayList<String> totalScoreList){
        int x5 = 0;
        int conditionChecker = 0;
        int conditionChecker2 = 0;
        int conditionChecker3 = 0;
        int conditionChecker4 = 0;
        int conditionChecker5 = 0;
        int conditionChecker6 = 0;
        int conditionChecker7 = 0;
        int conditionChecker8 = 0;
        int conditionChecker9 = 0;
        int conditionChecker10 = 0;
        int conditionChecker11 = 0;
        int conditionChecker12 = 0;
        int conditionChecker13 = 0;
        int conditionChecker14 = 0;
        int conditionChecker15 = 0;
        int conditionChecker16 = 0;
        int conditionChecker17 = 0;
        if (gameGridListofLists.get(x2).get(y2).equals("/") || gameGridListofLists.get(x2).get(y2).equals("-") || gameGridListofLists.get(x2).get(y2).equals("+") || gameGridListofLists.get(x2).get(y2).equals("\\") || gameGridListofLists.get(x2).get(y2).equals("|")) {
            conditionChecker = 1;
        }
        if (x2>1) {
            if (gameGridListofLists.get(x2 - 1).get(y2).equals("/") || gameGridListofLists.get(x2 - 1).get(y2).equals("-") || gameGridListofLists.get(x2 - 1).get(y2).equals("+") || gameGridListofLists.get(x2 - 1).get(y2).equals("\\")|| gameGridListofLists.get(x2 - 1).get(y2).equals("|")) {
                conditionChecker2 = 1;
            }
            if (gameGridListofLists.get(x2 - 2).get(y2).equals("/") || gameGridListofLists.get(x2 - 2).get(y2).equals("-") || gameGridListofLists.get(x2 - 2).get(y2).equals("+") || gameGridListofLists.get(x2 - 2).get(y2).equals("\\")|| gameGridListofLists.get(x2 - 2).get(y2).equals("|")) {
                conditionChecker3 = 1;
            }
        }
        if (x2<gameGridListofLists.size()-2) {
            if (gameGridListofLists.get(x2 + 1).get(y2).equals("/") || gameGridListofLists.get(x2 + 1).get(y2).equals("-") || gameGridListofLists.get(x2 + 1).get(y2).equals("+") || gameGridListofLists.get(x2 + 1).get(y2).equals("\\")|| gameGridListofLists.get(x2 + 1).get(y2).equals("|")) {
                conditionChecker4 = 1;
            }
            if (gameGridListofLists.get(x2 + 2).get(y2).equals("/") || gameGridListofLists.get(x2 + 2).get(y2).equals("-") || gameGridListofLists.get(x2 + 2).get(y2).equals("+") || gameGridListofLists.get(x2 + 2).get(y2).equals("\\")|| gameGridListofLists.get(x2 + 2).get(y2).equals("|")) {
                conditionChecker5 = 1;
            }
        }
        if (y2>1) {
            if (gameGridListofLists.get(x2).get(y2 - 1).equals("/") || gameGridListofLists.get(x2).get(y2 - 1).equals("-") || gameGridListofLists.get(x2).get(y2 - 1).equals("+") || gameGridListofLists.get(x2).get(y2 - 1).equals("\\") || gameGridListofLists.get(x2).get(y2 - 1).equals("|")) {
                conditionChecker6 = 1;
            }
            if (gameGridListofLists.get(x2).get(y2 - 2).equals("/") || gameGridListofLists.get(x2).get(y2 - 2).equals("-") || gameGridListofLists.get(x2).get(y2 - 2).equals("+") || gameGridListofLists.get(x2).get(y2 - 2).equals("\\") || gameGridListofLists.get(x2).get(y2 - 2).equals("|")) {
                conditionChecker7 = 1;
            }
        }
        if (y2<gameGridListofLists.get(0).size()-2) {
            if (gameGridListofLists.get(x2).get(y2 + 1).equals("/") || gameGridListofLists.get(x2).get(y2 + 1).equals("-") || gameGridListofLists.get(x2).get(y2 + 1).equals("+") || gameGridListofLists.get(x2).get(y2 + 1).equals("\\") || gameGridListofLists.get(x2).get(y2 + 1).equals("|")) {
                conditionChecker8 = 1;
            }
            if (gameGridListofLists.get(x2).get(y2 + 2).equals("/") || gameGridListofLists.get(x2).get(y2 + 2).equals("-") || gameGridListofLists.get(x2).get(y2 + 2).equals("+") || gameGridListofLists.get(x2).get(y2 + 2).equals("\\") || gameGridListofLists.get(x2).get(y2 + 2).equals("|")) {
                conditionChecker9 = 1;
            }
        }



        if (x2>1 && y2>1) {
            if (gameGridListofLists.get(x2 - 1).get(y2 - 1).equals("/") || gameGridListofLists.get(x2 - 1).get(y2 - 1).equals("-") || gameGridListofLists.get(x2 - 1).get(y2 - 1).equals("+") || gameGridListofLists.get(x2 - 1).get(y2 - 1).equals("\\") || gameGridListofLists.get(x2 - 1).get(y2 - 1).equals("|")) {
                conditionChecker10 = 1;
            }
            if (gameGridListofLists.get(x2 - 2).get(y2 - 2).equals("/") || gameGridListofLists.get(x2 - 2).get(y2 - 2).equals("-") || gameGridListofLists.get(x2 - 2).get(y2 - 2).equals("+") || gameGridListofLists.get(x2 - 2).get(y2 - 2).equals("\\") || gameGridListofLists.get(x2 - 2).get(y2 - 2).equals("|")) {
                conditionChecker11 = 1;
            }
        }
        if (x2<gameGridListofLists.size()-2 && y2<gameGridListofLists.get(0).size()-2) {
            if (gameGridListofLists.get(x2 + 1).get(y2 + 1).equals("/") || gameGridListofLists.get(x2 + 1).get(y2 + 1).equals("-") || gameGridListofLists.get(x2 + 1).get(y2 + 1).equals("+") || gameGridListofLists.get(x2 + 1).get(y2 + 1).equals("\\") || gameGridListofLists.get(x2 + 1).get(y2 + 1).equals("|")) {
                conditionChecker12 = 1;
            }
            if (gameGridListofLists.get(x2 + 2).get(y2 + 2).equals("/") || gameGridListofLists.get(x2 + 2).get(y2 + 2).equals("-") || gameGridListofLists.get(x2 + 2).get(y2 + 2).equals("+") || gameGridListofLists.get(x2 + 2).get(y2 + 2).equals("\\") || gameGridListofLists.get(x2 + 2).get(y2 + 2).equals("|")) {
                conditionChecker13 = 1;
            }
        }
        if (x2>1 && y2<gameGridListofLists.get(0).size()-2) {
            if (gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("/") || gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("-") || gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("+") || gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("\\")|| gameGridListofLists.get(x2 - 1).get(y2 + 1).equals("|")) {
                conditionChecker14 = 1;
            }
            if (gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("/") || gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("-") || gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("+") || gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("\\")|| gameGridListofLists.get(x2 - 2).get(y2 + 2).equals("|")) {
                conditionChecker15 = 1;
            }
        }
        if (x2<gameGridListofLists.size()-2 && y2>1) {
            if (gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("/") || gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("-") || gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("+") || gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("\\")|| gameGridListofLists.get(x2 + 1).get(y2 - 1).equals("|")) {
                conditionChecker16 = 1;
            }
            if (gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("/") || gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("-") || gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("+") || gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("\\")|| gameGridListofLists.get(x2 + 2).get(y2 - 2).equals("|")) {
                conditionChecker17 = 1;
            }
        }


        //"y2>1" and "y2<gameGridListofLists.get(0).size()-2" expressions is used for eliminating list index out of bounds problem
        if (y2>1 && conditionChecker == 1 && conditionChecker2 == 1 && conditionChecker3 == 1) {
            x5 = x5+60;
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2-1).set(y2, " ");
            gameGridListofLists.get(x2-2).set(y2, " ");
        }
        else if (y2<gameGridListofLists.get(0).size()-2 && conditionChecker == 1 && conditionChecker4 == 1 && conditionChecker5 == 1) {
            x5 = x5+60;
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2+1).set(y2, " ");
            gameGridListofLists.get(x2+2).set(y2, " ");
        }
        else if (y2>1 && conditionChecker == 1 && conditionChecker6 == 1 && conditionChecker7 == 1) {
            x5 = x5+60;
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2).set(y2-1, " ");
            gameGridListofLists.get(x2).set(y2-2, " ");
        }
        else if (y2<gameGridListofLists.get(0).size()-2 && conditionChecker == 1 && conditionChecker8 == 1 && conditionChecker9 == 1) {
            x5 = x5+60;
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2).set(y2+1, " ");
            gameGridListofLists.get(x2).set(y2+2, " ");
        }
        else if (y2>1 && conditionChecker == 1 && conditionChecker10 == 1 && conditionChecker11 == 1) {
            x5 = x5+60;
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2-1).set(y2-1, " ");
            gameGridListofLists.get(x2-2).set(y2-2, " ");
        }
        else if (y2<gameGridListofLists.get(0).size()-2 && conditionChecker == 1 && conditionChecker12 == 1 && conditionChecker13 == 1) {
            x5 = x5+60;
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2+1).set(y2+1, " ");
            gameGridListofLists.get(x2+2).set(y2+2, " ");
        }
        else if (y2>1 && conditionChecker == 1 && conditionChecker14 == 1 && conditionChecker15 == 1) {
            x5 = x5+60;
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2-1).set(y2+1, " ");
            gameGridListofLists.get(x2-2).set(y2+2, " ");
        }
        else if (y2<gameGridListofLists.get(0).size()-2 && conditionChecker == 1 && conditionChecker16 == 1 && conditionChecker17 == 1) {
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
