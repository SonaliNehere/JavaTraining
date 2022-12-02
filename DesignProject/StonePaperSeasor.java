package DesignProject;
import java.util.*;
import java.io.*;

public class StonePaperSeasor {
	static int s1, s2;
	static int c1=0, c2=0;
	public static void game() {
		Scanner sc = new Scanner(System.in);
		System.out.println("    ***** WELCOME TO THE STONE PAPER SCISSORS GAME *****    ");
		System.out.println();
		System.out.println("    Players will get the five chances to win . Let's start the game..  ");
		System.out.println();
		int i=1, flag=1;
		while(i<=5) {
			System.out.println("    User will play   ");
			System.out.print("    1. Stone   2. Paper   3. Scissor     ");
			s1 = sc.nextInt();
			if(s1>3 || s1<1) {
				System.out.println("\n" + "    User entered wrong input . Computer is winner "); 
				flag = 0;
				break;
			}
			
			System.out.println();
			System.out.println("    Computer will play ");
			System.out.print("    1. Stone   2. Paper   3. Scissor     ");
			Random rand = new Random();
			s2 = rand.nextInt(1, 4);
			System.out.print(s2 + "\n\n");
			
			if(s1 == s2 ) {
				c1++;
				c2++;
			}
			else if(s1 == 1) {
				if(s2 == 2) 
					c2++;
				else if(s2 == 3) 
					c1++;
			}
			else if(s1 == 2) {
				if(s2 == 1) 
					c1++;
				else if(s2 == 3) 
					c2++;
			}
			else if(s1 == 3) {
				if(s2 == 1) 
					c2++;
				else if(s2 == 2) 
					c1++;
			}
			i++;
		}
		System.out.println();
		
		if(flag==1) {
			if(c1>c2) 
				System.out.println("     Congratulations.. User is winner ");
			else if(c1<c2) 
				System.out.println("     Congratulations.. Computer is winner ");
			else if(c1==c2 && c1!=0 && c2!=0 )
				System.out.println("     Congratulations.. User and Computer both are winner ");
		}
		
	}
	
	public static void main(String[] args) {
		StonePaperSeasor.game();
		
	}

}
