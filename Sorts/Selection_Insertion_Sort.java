package sorts;
import java.util.Arrays;
import java.util.*;

public class Selection_Insertion_Sort {

	public static int[] selectionSort(int[] list){
		
		for (int i=0; i< list.length; i++){
			int min = i;
			
			for (int j = i+1; j<list.length; j++){
				if (less(list[j], list[min])){
					min = j;
					exchange(list, i, min);
				}
			}
		}
		return list;
	}
	
	public static int[] InsertionSort(int[] list){
		
		for (int i=1; i<list.length; i++){
			
			for  (int j=i; j>0 && less(list[j], list[j-1]); j--){
				exchange(list, j, j-1);
			}
		}
		return list;
	}

	
	private static boolean less(int i, int j) {
		if (i < j){
			return true;
		}
		return false;
	}
	
	public static void exchange(int[] list, int i, int j){
		int t = list[i];
		list[i] = list[j];
		list[j] = t;
	}
	public static boolean checker(int[] a){
		for (int i=0; i< a.length-1; i++){
			if (less(a[i+1], a[i])){
				return false;
			}
		}
		return true;
	}

	public static void show(int[] a){
		for (int i=0; i<a.length; i++){
			System.out.print(a[i]);
			System.out.print(", ");
		}
	}
	
	public static void main(String[] args){
		int Max = 3;
		int[] arrList = new int[Max];
		Scanner scan = new Scanner(System.in);
		for (int i=0; i<arrList.length; i++){
			arrList[i] = scan.nextInt();			
		}
		
	    InsertionSort(arrList);
	    show(arrList);
		
		}
}