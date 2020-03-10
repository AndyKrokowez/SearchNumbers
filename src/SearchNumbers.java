import java.util.Arrays;
import java.util.Random;

public class SearchNumbers {
	
	int[] array;
	
	
	public SearchNumbers() {
		
		
		
		array = new int[10];
		populateArray();
		
		int target = 15; // numero que quero achar na lista de numeros
		
		int pos = linearSearch(target, array);
		System.out.println(printArray(array)); //*
		System.out.println(pos);
		
		pos = binarySearch(target, array);
		String result = printArray(array);
		result = printArray(array);
		System.out.println(result);
		System.out.println(pos);
		
	}
	
	public void populateArray() {
		
		Random rd = new Random();
		for(int i = 0; i < array.length; i++) {
			
			array[i] = rd.nextInt(20);
		}
		
	} //Linear Search
	//para retornar a posicao que o numero esta 
	
	public int linearSearch(int target, int[] pool) {
		for(int i = 0; i < pool.length; i++) {
			
			if(pool[i] == target) {
				
				return i + 1; //+1 para comecar a contar do 1 (java conta 0 como primeiro numero)
			}
			
		}
		
		return -1;
		
	}
	//*   para imprimir a lista de numeros que o sistema criou
	public String printArray(int[]pool) {
		String toReturn = "";
		for (int i = 0; i < pool.length; i++) {
			toReturn += pool[i] + " ";
		}
		
		return toReturn;
	} 

	
	//Binary Search - continua usando a lista de numeros criadas para o exercicio anterior
	
	public int binarySearch(int target, int[]pool) {
		
		Arrays.sort(pool);
		
		int low = 0;
		int high = pool.length -1;
		//int mid = 0;		
		
		while (low <= high) {
			
			int mid = (low + high) /2;
			
		if(pool[mid] == target) {
			
			return mid;
			
		} 
		
		else if(pool[mid] > target) {
			//look on the left
			high = mid -1;
			
		}
		
		else if(pool[mid] < target) {
			//look on the right
			low = mid +1;
		}
		
	}
		
		return -1;
	}
	
	
}
