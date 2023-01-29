package advancedJavaPractice.generics.methods;

import java.util.Arrays;

public class GenericMethods {

	public static void main(String[] args) {
		
		String[] stdList = {"ali", "veli", "kazim" };
		Double[] ponList = { 56.0, 55.0, 78.0};
		Character[] charLsit = {'A','B','C' };
		
		printArray(stdList);
		printArray(ponList);
		printArray(charLsit);
		
		System.out.println(Arrays.toString(orderArr(ponList)));
		
		System.out.println(Arrays.toString(orderArr(charLsit)));
		
		System.out.println(Arrays.toString(orderArr(stdList)));
		
			

	}
	
	// butun tipleri alabilmesi icin T[] ve <T> kullandik
	
	public static <T> void printArray(T[] array) {
		
		for (int i=0; i<array.length;i++) {
			System.out.print (array[i]+"  ");
		}
		System.out.println(" \n");
	}
	
	
	// karsilastirma yaptigimiz icin Comparable ekledik
	public static <T extends Comparable<T>> T[] orderArr (T[] array) {
		
		for(int i=0;i<array.length; i++) {
			
			for ( int j=i+1; j<array.length;j++) {
				
				if(array[i].compareTo(array[j])>0) {
					
					T temp =array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		}
		
		return array;
		
	}

}
