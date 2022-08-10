import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {

    public static void main(String[] args) {

//        I will use this part later to create the tokens:

//        HashMap <String, String> map = new HashMap<>();
//        map.put("x", "id");
//        map.put("1","literal integer");
//        map.put("=","assignment Operator");
//        map.put("<=","le_operator");
//        map.put("<","lt_operator ");
//        map.put(">=","ge_operator ");
//        map.put(">","gt_operator ");
//        map.put("==", "eq_operator ");
//        map.put("~=", "ne_operator ");
//        map.put("+", "add_operator ");
//        map.put("-", "sub_operator ");
//        map.put("*","mul_operator ");
//        map.put("/","div_operator ");
//        map.put("print", "print function");

        ArrayList<String> words = new ArrayList<String>();

        try {
            File myObj = new File("src/Test2.jl");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                words.add(data.trim());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        wordEditor(words); //removes unnecessary parts from file

        String[] arr = new String[words.size()]; //creating a new array with the size of the list

        arr = words.toArray(arr); // created an array by converting the list into an array by using the built function

        arrayPrinter(arr);

    }

    // This method takes care of erasing parts of the file that are not relevant to the program
    public static ArrayList<String> wordEditor(ArrayList<String> words){

        int i =0;

        while(!words.get(i).equals(words.get(3)) && i<words.size()){
            words.remove(i);
            i++;
        }

        return words;
    }

    //This method prints out array elements
    public static void arrayPrinter(String[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}