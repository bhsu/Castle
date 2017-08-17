
public class Castle {

	public static void main(String[] args){
		
		int[] A1={2,6,6,6}; //2
		int[] A2={6,1,4}; //3
		int[] A3={2,6,8,7}; //3
		int[] A4={2,6,6,6,3,6,1,4}; //6
		int[] A5={2,2}; //1
		int[] A6={2}; //1
		int[] A7={}; //0
		int[] A8={2,6,9,8,7}; //3
		int[] A9={2,6,8,9,7}; //3
		
		System.out.println("Need " + countCastles(A9) + " castle(s)");
		
		
		
	}
	
	
	// assumes all int numbers are positive
	public static int countCastles(int[] array){
		int castles = 0, peak = 0, valley = 0;
		System.out.println("array length " + array.length);
		// base cases
		if(array.length == 0){
			return 0;
		}
		if(array.length == 1){
			return castles  + 1;
		}
		
		
		for(int i = 0; i <= array.length; i++){
			if(i+1 < array.length && array[i+1] > array[i]){
				
				peak++;
				if(i+2 < array.length && array[i+2] > array[i+1]){
					peak--;
					continue;
				}
				
			}else if(i+1 < array.length && array[i+1] < array[i]){
		
				valley++;
				if(i+2 < array.length && array[i+2] < array[i+1]){
					valley--;
					continue;
				}
			
			}else if(i+1 < array.length && array[i+1] == array[i]){
				
				continue;
			}
		}
		
		// plus one for first element
		castles = peak + valley + 1;
		return castles;
		
	}
}
