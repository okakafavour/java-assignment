public class TaskSeven{

public static void main(String[] args){

for (int count = 1; count <= 10; count ++){
     int number = 1;
     int total = 0;
     if(count%4==0){
		for(int counter = 0; counter < 5; counter++){
			number = number*count;
                         total += number;

            }
 	   System.out.print(total + " ");	
	}
		

      }        
   }

}