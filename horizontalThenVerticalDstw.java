import java.util.ArrayList;
public class horizontalThenVerticalDstw {
    public horizontalThenVerticalDstw(ArrayList<ArrayList<String>> gameGridListofLists, int x2, int y2, ArrayList<String> scoreList, ArrayList<String> totalScoreList){
        int x5 = 0;
        if (y2>1 && (gameGridListofLists.get(x2).get(y2).equals(gameGridListofLists.get(x2).get(y2-1)) || gameGridListofLists.get(x2).get(y2).equals(gameGridListofLists.get(x2).get(y2-2)) || gameGridListofLists.get(x2).get(y2-1).equals(gameGridListofLists.get(x2).get(y2-2)))) {
            switch (gameGridListofLists.get(x2).get(y2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            switch (gameGridListofLists.get(x2).get(y2-1)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            switch (gameGridListofLists.get(x2).get(y2-2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2).set(y2-1, " ");
            gameGridListofLists.get(x2).set(y2-2, " ");
        }
        else if (y2<gameGridListofLists.get(0).size()-2 && (gameGridListofLists.get(x2).get(y2).equals(gameGridListofLists.get(x2).get(y2+1)) || gameGridListofLists.get(x2).get(y2).equals(gameGridListofLists.get(x2).get(y2+2)) || gameGridListofLists.get(x2).get(y2+1).equals(gameGridListofLists.get(x2).get(y2+2)))) {
            switch (gameGridListofLists.get(x2).get(y2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            switch (gameGridListofLists.get(x2).get(y2+1)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            switch (gameGridListofLists.get(x2).get(y2+2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2).set(y2+1, " ");
            gameGridListofLists.get(x2).set(y2+2, " ");
        }
        else if (x2>1 && (gameGridListofLists.get(x2).get(y2).equals(gameGridListofLists.get(x2-1).get(y2)) || gameGridListofLists.get(x2).get(y2).equals(gameGridListofLists.get(x2-2).get(y2)) || gameGridListofLists.get(x2-1).get(y2).equals(gameGridListofLists.get(x2-2).get(y2)))) {
            switch (gameGridListofLists.get(x2).get(y2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            switch (gameGridListofLists.get(x2-1).get(y2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            switch (gameGridListofLists.get(x2-2).get(y2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2-1).set(y2, " ");
            gameGridListofLists.get(x2-2).set(y2, " ");
        }
        else if (x2<gameGridListofLists.size()-2 && (gameGridListofLists.get(x2).get(y2).equals(gameGridListofLists.get(x2+1).get(y2)) || gameGridListofLists.get(x2).get(y2).equals(gameGridListofLists.get(x2+2).get(y2)) || gameGridListofLists.get(x2+1).get(y2).equals(gameGridListofLists.get(x2+2).get(y2)))) {
            switch (gameGridListofLists.get(x2).get(y2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            switch (gameGridListofLists.get(x2+1).get(y2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            switch (gameGridListofLists.get(x2+2).get(y2)){
                case "D": x5 = x5 + 30; break;
                case "S": x5 = x5 + 15; break;
                case "T": x5 = x5 + 15; break;
                case "W": x5 = x5 + 10; break;
            }
            gameGridListofLists.get(x2).set(y2, " ");
            gameGridListofLists.get(x2+1).set(y2, " ");
            gameGridListofLists.get(x2+2).set(y2, " ");
        }
        new slidingEmptyTiles(gameGridListofLists);
        scoreList.set(0, String.valueOf(x5));
        totalScoreList.set(0, String.valueOf(Integer.parseInt(totalScoreList.get(0))  + x5));
        System.out.println(x5);
    }
}
