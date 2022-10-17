package question2;
import java.util.*;
public class DriverCode {
public static void main(String args[]) {
	Scanner sd=new Scanner(System.in);
	int total_number;
	System.out.println("Enter the total number of input_matrixs you want to enter");
	total_number=sd.nextInt();
	int[][]input_matrix=new int[total_number][2];
	int process_count=0;
	while(process_count<total_number) {
		int output_count=process_count+1;
		System.out.println("Enter the "+ output_count +" arrival time on seconds: ");
		input_matrix[process_count][0]=sd.nextInt();
		System.out.println("Enter the "+ output_count +" burst time in seconds: ");
		input_matrix[process_count][1]=sd.nextInt();
		process_count++;
	}
	
	Backend back=new Backend();
	System.out.println();
	System.out.println("Now completion of each process is ");
	back.Completion(input_matrix);//calling completion function
	System.out.println();
	System.out.println("Now waiting time of each process is");
	back.Waiting(input_matrix);//calling waiting function
	System.out.println();
	System.out.println("Now turn around time of each process is");
	back.TurnAroundTime(input_matrix);//calling turnaround function
	System.out.println();
	back.AvgandMax();
	
	sd.close();
}
}
