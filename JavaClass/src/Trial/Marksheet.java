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
	
		float average = (((float) Math.ceil (scienceMarks + mathMarks + englishMarks + computerMarks))/4);
		System.out.println(average+"%");
		
		if (average >=80){
			System.out.println("Congratulations, you got an A!!");
		}
			else if (average >= 70 && average <80)
			System.out.println("You got a B");
			else if (average >=60 && average <70)
			System.out.println("You got a C");
			else if (average >=50 && average <60)
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
