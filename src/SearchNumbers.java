import java.util.Random;

public class SearchNumbers {
	
	int[] array;
	
	public SearchNumbers() {
		
		array = new int[10];
		populateArray();
		
		int target = 15;
		int pos = linearSearch(target, array);
		System.out.println(printArray(array)); //*
		System.out.println(pos);
	}
	
	public void populateArray() {
		
		Random rd = new Random();
		for(int i = 0; i < array.length; i++) {
			
			array[i] = rd.nextInt(20);
		}
		
	}
	//para retornar a posicao que o numero esta 
	
	public int linearSearch(int target, int[] pool) {
		for(int i = 0; i < pool.length; i++) {
			
			if(pool[i] == target) {
				
				return i;
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

}
