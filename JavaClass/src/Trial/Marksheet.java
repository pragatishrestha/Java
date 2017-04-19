package Trial;

import java.util.Scanner;

public class Marksheet {
	
	public static void main (String [] args ){
		
	
		Scanner sMarks = new Scanner(System.in);
		System.out.println("Your Science Marks: ");
		double scienceMarks = sMarks.nextDouble();
		
		
		Scanner mMarks = new Scanner(System.in);
		System.out.println("Your Maths Marks: ");
		double mathMarks = mMarks.nextDouble();
		
		Scanner eMarks = new Scanner(System.in);
		System.out.println("Your English Marks: ");
		double englishMarks = eMarks.nextDouble();
		
		Scanner cMarks = new Scanner(System.in);
		System.out.println("Your Computer Marks: ");
		double computerMarks = cMarks.nextDouble();
		
		sMarks.close();
		mMarks.close();
		eMarks.close();
		cMarks.close();
	
		float total = ((float) Math.ceil (scienceMarks + mathMarks + englishMarks + computerMarks));
		System.out.println("Your Total Score is: " + total);
		
		float percentage = (total/400)*100;
		System.out.println("Your Percentage is: " + percentage+"%");
		
		if (percentage >=80){
			System.out.println("Congratulations, you got an A!!");
		}
			else if (percentage >= 70 && percentage <80)
			System.out.println("You got a B");
			else if (percentage >=60 && percentage <70)
			System.out.println("You got a C");
			else if (percentage >=50 && percentage <60)
			System.out.println("You got a D");
			else
				System.out.println("You have Failed the exam!!");
				

		
		
		double mark = 38.986756757;
		
		System.out.println(mark);
		int RoundedUp = (int) Math.ceil(mark);
		System.out.println(RoundedUp);
		
		//or
		int b = (int) Math.ceil( ((double)mark));
		System.out.println(b);

		
	}
	


}
