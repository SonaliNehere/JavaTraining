
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class TicTakToe{
	static ArrayList<Integer> playerPosition = new ArrayList<Integer>();
	static ArrayList<Integer> cpuPosition = new ArrayList<Integer>();
	
	void display(char board[][]) {
		for(char[] row : board) {
			System.out.println(row);
		}
	}
	
	void insertPosition(int pos, char board[][], String p) {
		char c;
		if(p.equals("player")) {
			c='X';
			playerPosition.add(pos);
		}
		else {
			c='O';
			cpuPosition.add(pos);
		}
		switch(pos) {
			case 1:board[0][0]=c;
			break;
			case 2:board[0][2]=c;
			break;
			case 3:board[0][4]=c;
			break;
			case 4:board[2][0]=c;
			break;
			case 5:board[2][2]=c;
			break;
			case 6:board[2][4]=c;
			break;
			case 7:board[4][0]=c;
			break;
			case 8:board[4][2]=c;
			break;
			case 9:board[4][4]=c;
			break;
			default:System.out.println("Invalid position");
		}
	}
	
	void winningCondition() {
		List topRow = Arrays.asList(1,2,3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List firstCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List lastCol = Arrays.asList(3, 6, 9);
		List diag1 = Arrays.asList(1, 5, 9);
		List diag2 = Arrays.asList(3, 5, 7);
		
		ArrayList<List> winningCondition = new ArrayList<List>();
		winningCondition.add(topRow);
		winningCondition.add(midRow);
		winningCondition.add(botRow);
		winningCondition.add(firstCol);
		winningCondition.add(midCol);
		winningCondition.add(lastCol);
		winningCondition.add(diag1);
		winningCondition.add(diag2);
		
		for(List x : winningCondition) {
			if(playerPosition.containsAll(x)) {
				System.out.println("Player has won");
				System.exit(0);
			}
			else if(cpuPosition.containsAll(x)){
				System.out.println("CPU has won");
				System.exit(0);
			}
			else if((playerPosition.size()+cpuPosition.size())==9) {
				System.out.println("It is a draw");
				System.exit(0);
			}
		}
	}
}



public class Launch {
	public static void main(String[] args) {
		char board[][]= {{' ', '|', ' ', '|', ' '},
				      {'-', '+', '-', '+', '-'},
				      {' ', '|', ' ', '|', ' '},
				      {'-', '+', '-', '+', '-'},
				      {' ', '|', ' ', '|', ' '}
							  };
		TicTakToe t = new TicTakToe();
		t.display(board);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter the position between(1-9)");
			int ppos = scan.nextInt();
			while(TicTakToe.playerPosition.contains(ppos)||TicTakToe.cpuPosition.contains(ppos)) {
				System.out.println("Position occupied. Re-enter the position");
				ppos = scan.nextInt();
			}
			t.insertPosition(ppos, board, "player");
			t.display(board);
			t.winningCondition();
			
			Random rand = new Random();
			int cpos = rand.nextInt(9)+1;
			while(TicTakToe.playerPosition.contains(cpos)||TicTakToe.cpuPosition.contains(cpos)) {
				System.out.println("Position occupied. Re-enter the position");
				cpos =  rand.nextInt(9)+1;
			}
			t.insertPosition(cpos, board, "cpu");
			t.display(board);
			t.winningCondition();
		}
	}
}

