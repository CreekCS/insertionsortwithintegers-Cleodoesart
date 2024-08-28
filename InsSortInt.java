import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class InsSortInt {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int[] sortedList;
        try {
            Scanner scanner = new Scanner(new FileReader("randInts.txt"));
            while (scanner.hasNextLine()) {
                array.add(Integer.parseInt(scanner.next()));
            }
            sortedList = new int[array.size()];
            for (int i = 0; i < sortedList.length; i++) {
                sortedList[i] = array.get(i);
            }
            System.out.println(sortedList);

            for(int i = 1; i < sortedList.length; i++){
                int hold = sortedList[i];
                for(int j = i - 1; j >= 0; j--){
                    if(sortedList[j] > hold){
                        sortedList[j + 1] = sortedList[j];
                        sortedList[j] = hold;
                    }
                    else break;
                }
            }
            // for(int k = 0; k < sortedList.length; k++){
            //     System.out.println(sortedList[k]);
            // }
            // System.out.println();
            System.out.println("smallest: " + sortedList[0]);
            System.out.println("largest : " + sortedList[sortedList.length - 1]);
        } catch (FileNotFoundException e) {
        }
    }
}
