package question2;
import java.util.*;
public class Backend {
	ArrayList<Integer> comparr = new ArrayList<Integer>();
	ArrayList<Integer> wait = new ArrayList<Integer>();
	ArrayList<Integer> ttt = new ArrayList<Integer>();
	//finding completion time of all process
	
	public void Completion(int[][]input) {
		comparr.add(input[0][0]+input[0][1]);
		System.out.println("Completion time of 1 process is "+comparr.get(0));
		for(int i=1;i<input.length;i++) {
			if(comparr.get(i-1)>input[i][0]) {
				comparr.add(comparr.get(i-1)+input[i][1]);
				System.out.println("Completion time of "+(i+1) +" process is "+comparr.get(i));}
			else {
				comparr.add(input[i][0]+input[i][1]);
				System.out.println("Completion time of "+(i+1) +" process is "+comparr.get(i));}
		}
	};
	//finding waiting time of all processes
	public void Waiting(int[][]input) {
		wait.add(input[0][0]);
		System.out.println("Waiting time of 1 process is "+wait.get(0));
		for(int i=1;i<input.length;i++) {
			if(comparr.get(i-1)>input[i][0]) {
				wait.add(comparr.get(i-1)-input[i][0]);
				System.out.println("Waiting time of "+(i+1) +" process is "+wait.get(i));}
			else {
				wait.add(0);
				System.out.println("Waiting time of "+(i+1) +" process is "+wait.get(i));}
		}
	};
	//finding turn around time of all process
	public void TurnAroundTime(int[][]input) {
		
		for(int i=0;i<input.length;i++) {
				ttt.add(input[i][1]+wait.get(i));
				System.out.println("Turn around time of "+(i+1) +" process is "+ttt.get(i));}
		
	};
	//finding average and maximum waiting time 
	public void AvgandMax() {
		int i=0,sum=0,max=Integer.MIN_VALUE;
		while(i<wait.size()) {
			sum=sum+wait.get(i);
			if(max<wait.get(i))
				max=wait.get(i);
			i++;
		}
		System.out.println("Average waiting time of the processes is "+sum/wait.size());
		System.out.println("Maximum waiting time period for a process in queue is "+max);
	}
}
