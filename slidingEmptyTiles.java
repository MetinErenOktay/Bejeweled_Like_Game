import java.util.ArrayList;

public class slidingEmptyTiles{
    public slidingEmptyTiles(ArrayList<ArrayList<String>> gameGridListofLists){
        //This method slides down the element in a column if the space below this element is empty
        for(int x3 = gameGridListofLists.size()-1; x3 > -1; x3-=1){
            for(int y3 = gameGridListofLists.get(x3).size()-1; y3 > -1; y3-=1){
                if(x3 != 0){
                    if(gameGridListofLists.get(x3).get(y3).equals(" ")){
                        gameGridListofLists.get(x3).set(y3, gameGridListofLists.get(x3-1).get(y3));
                        gameGridListofLists.get(x3-1).set(y3, " ");
                    }
                }
            }
        }
        for(int x3 = gameGridListofLists.size()-1; x3 > -1; x3-=1){
            for(int y3 = gameGridListofLists.get(x3).size()-1; y3 > -1; y3-=1){
                if(x3 != 0){
                    if(gameGridListofLists.get(x3).get(y3).equals(" ")){
                        gameGridListofLists.get(x3).set(y3, gameGridListofLists.get(x3-1).get(y3));
                        gameGridListofLists.get(x3-1).set(y3, " ");
                    }
                }
            }
        }
        for(int x3 = gameGridListofLists.size()-1; x3 > -1; x3-=1){
            for(int y3 = gameGridListofLists.get(x3).size()-1; y3 > -1; y3-=1){
                if(x3 != 0){
                    if(gameGridListofLists.get(x3).get(y3).equals(" ")){
                        gameGridListofLists.get(x3).set(y3, gameGridListofLists.get(x3-1).get(y3));
                        gameGridListofLists.get(x3-1).set(y3, " ");
                    }
                }
            }
        }
    }
}
