import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		//Read file from "unsorted" file
		
		BufferedReader in = new BufferedReader(new FileReader("unsorted.txt"));
		
		String line;
		while((line = in.readLine()) != null)
		{
			//blah blah output split into array of strings
			
			
		    //System.out.println(line);
		    String[] words = line.split("\\s+");
		    System.out.println(Arrays.toString(words));
		    sort(words);
		    printArray(words);
		    PrintStream out1 = new PrintStream(new FileOutputStream("sorted.txt", true));
			System.setOut(out1);
			
			
			
		}
		
		in.close();
		
		}
		
		// Sort algorithm


		//Insertion Sort Algos
		String[] test = {"wing-ding", "apple", "speech", "hello", "hi", "when"};
		
		
	
	
	public static void printArray(String[] array){
		for(String element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
	
	public static void sort(String[] array){
		boolean swap = true;
	    int j = 0;
	    while (swap) {
	        swap = false;
	        j++;
	        for (int i = 0; i < array.length - j; i++) {
	            if (array[i].compareTo(array[i + 1]) > 0) {
	                String tmp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = tmp;
	                swap = true;

			}
			
		}
	    }
		
	}
	
	public static void swap(int[] array, int first, int second){
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;


	}
}