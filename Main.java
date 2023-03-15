import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("monitoring.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Game grid: ");
        pw.println("");

        //This part writes the content of gameGrid.txt file in a list of lists
        Scanner scanGameGrid = null;

        try {
            scanGameGrid = new Scanner(new File(args[0]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> preGameGridList = new ArrayList<String>();
        while (scanGameGrid.hasNextLine()) {
            preGameGridList.add(scanGameGrid.nextLine());
        }
        scanGameGrid.close();
        

        ArrayList<ArrayList<String>> gameGridListofLists = new ArrayList<ArrayList<String>>();
        for(int i=0; i<preGameGridList.size(); i+=1){
            ArrayList<String> gameGridList = new ArrayList<String>();
            String preCoordinateString = preGameGridList.get(i);
            String[] coordinateString = preCoordinateString.split(" ", -2);

            for (String a : coordinateString){
                gameGridList.add(a);
            }
            gameGridListofLists.add(gameGridList);
            
        }
        for(int i= 0; i<gameGridListofLists.size(); i+=1){
            String gridWithoutBrackets = Arrays.toString(gameGridListofLists.get(i).toArray()).replace("[", "").replace("]", "").replace(", ", " ");
            pw.println(gridWithoutBrackets);
        }
        pw.println("");

        int totalScore = 0;
        ArrayList<String> totalScoreList = new ArrayList<String>();
        totalScoreList.add("0");

        Scanner scanCommand = null;
        {
            try {
                scanCommand = new Scanner(new File(args[1]));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            ArrayList<String> commandList = new ArrayList<String>();
            while (scanCommand.hasNextLine()) {
                String cdStr = scanCommand.nextLine();
                commandList.add(cdStr);

                if (cdStr.contains(" ")){
                    ArrayList<String> coordinateList = new ArrayList<String>();
                    String preCoordinateString = cdStr;
                    String[] coordinateString = preCoordinateString.split(" ", 2);
                    int x;
                    int y;
                    for (String a : coordinateString)
                        coordinateList.add(a);
                    x = Integer.parseInt(coordinateList.get(0));
                    y = Integer.parseInt(coordinateList.get(1));
                    if (!gameGridListofLists.get(x).get(y).equals(" ")) {
                        String inputTileContent = gameGridListofLists.get(x).get(y);
                        ArrayList<String> scoreList = new ArrayList<String>();

                        scoreList.add("");
                        //calls dstwPart class if the content of the index that is given by user equals to one of these strings: “D”, “S”, “T”, “W”
                        if (gameGridListofLists.get(x).get(y).equals("D") || gameGridListofLists.get(x).get(y).equals("S") || gameGridListofLists.get(x).get(y).equals("T") || gameGridListofLists.get(x).get(y).equals("W"))
                        {
                            new dstwPart(pw, inputTileContent, gameGridListofLists, totalScore, totalScoreList, scoreList, x, y);
                        }
                        //calls mathSymbolsPart class if the content of the index that is given by user equals to one of these strings: “/”, “-”, “+”, “\”, “|”
                        else if (gameGridListofLists.get(x).get(y).equals("/") || gameGridListofLists.get(x).get(y).equals("-") || gameGridListofLists.get(x).get(y).equals("+") || gameGridListofLists.get(x).get(y).equals("\\") || gameGridListofLists.get(x).get(y).equals("|"))
                        {
                            new mathSymbolsPart(pw, inputTileContent, gameGridListofLists, totalScore, totalScoreList, scoreList, x, y);
                        }

                    }
                    else{

                        pw.println("Please enter a valid coordinate\n");

                    }
                }
                else if(cdStr.contains("E")){
                    pw.println("Select coordinate or enter E to end the game: E\n" );
                    pw.print("Total Score: " + Arrays.toString(totalScoreList.toArray()).replace("[", "").replace("]", "") + " ");

                    pw.println("points\n");
                    System.out.println("daaaaamn");
                }
                else{
                    pw.print("Enter name: ");
                    pw.println(cdStr + "\n");
                    pw.println("Your rank is" + " X" + ", " + "your score is" + " X " + "points higher than" + " X " + "\n");
                    pw.println("Good Bye!");
                }
            }
            pw.close();
            scanCommand.close();
            for(int i=0; i<commandList.size(); i+=1){
            }
        }
    }
}