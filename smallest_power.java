//program to find the smallest power of x that is greater than y

import java.util.Scanner;
import java.lang.*;

class smallest_power{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		int x,y,power,smallest_power=0;

		System.out.println("enter the value for x:");
		x=scanner.nextInt();
		System.out.println("enter the value for y:");
		y=scanner.nextInt();
		
		for(power=0;power<y;power++){ //check each power of x until the value becomes greater than y
			if(Math.pow(x,power)>y){
				smallest_power=power;
				break;
			}
		}
		
		System.out.println("The smallest power of "+x+" that is greater than "+y+" is "+smallest_power);
	}
}
