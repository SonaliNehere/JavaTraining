import java.util.Scanner;
class TicTacToe{
	void display(char board[][]) {
		for(char row[] : board) {
			for(char i : row) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	/* void insertPos(int pos, char[][] board) {
		switch(pos) {
		case 1 : board[0][0] = 'x';
		break;
		case 2 : board[0][2] = 'x';
		break;
		case 3 : board[0][4] = 'x';
		break;
		case 4 : board[2][0] = 'x';
		break;
		case 5 : board[2][2] = 'x';
		break;
		case 6 : board[2][4] = 'x';
		break;
		case 7 : board[4][0] = 'x';
		break;
		case 8 : board[4][2] = 'x';
		break;
		case 9 : board[4][4] = 'x';
		break;
		default : System.out.println("Please enter valid value ");;
		break;
		}
	} */
	
	void insertPosX(int pos, char[][] board) {
		switch(pos) {
		case 1 : board[0][0] = 'x';
		break;
		case 2 : board[0][2] = 'x';
		break;
		case 3 : board[0][4] = 'x';
		break;
		case 4 : board[2][0] = 'x';
		break;
		case 5 : board[2][2] = 'x';
		break;
		case 6 : board[2][4] = 'x';
		break;
		case 7 : board[4][0] = 'x';
		break;
		case 8 : board[4][2] = 'x';
		break;
		case 9 : board[4][4] = 'x';
		break;
		default : System.out.println("Please enter valid value ");;
		break;
		}
	} 
	void insertPos0(int pos, char[][] board) {
		switch(pos) {
		case 1 : board[0][0] = 'o';
		break;
		case 2 : board[0][2] = 'o';
		break;
		case 3 : board[0][4] = 'o';
		break;
		case 4 : board[2][0] = 'o';
		break;
		case 5 : board[2][2] = 'o';
		break;
		case 6 : board[2][4] = 'o';
		break;
		case 7 : board[4][0] = 'o';
		break;
		case 8 : board[4][2] = 'o';
		break;
		case 9 : board[4][4] = 'o';
		break;
		default : System.out.println("Please enter valid value ");;
		break;
		}
	} 
	
	int checkX(char[][] board) {
		if((board[0][0]=='x' && board[0][2]=='x' && board[0][4]=='x') || (board[2][0]=='x' && board[2][2]=='x' && board[2][4]=='x')
		||	(board[4][0] =='x' && board[4][2]=='x' && board[4][4]=='x') || ( board[0][0]=='x' && board[2][0]=='x'&& board[4][0]=='x')
		|| (board[0][2]=='x' && board[2][2]=='x' && board[4][2]=='x') ||(board[0][4]=='x' &&   board[2][4]=='x' && board[4][4]=='x')
		|| (board[0][0]=='x' && board[2][2]=='x' &&  board[4][4]=='x') || (board[0][4]=='x' && board[2][2]=='x' &&  board[4][0]=='x')
		 ){
			return 1;
		}
		else
			return 0;
	}
	
	int check0(char[][] board) {
		if((board[0][0]=='o' && board[0][2]=='o' && board[0][4]=='o') || (board[2][0]=='o' && board[2][2]=='o' && board[2][4]=='o')
		|| (board[4][0] =='o' && board[4][2]=='o' && board[4][4]=='o') || ( board[0][0]=='o' && board[2][0]=='o'&& board[4][0]=='o')
		|| (board[0][2]=='o' && board[2][2]=='o' && board[4][2]=='o') ||(board[0][4]=='o' &&   board[2][4]=='o' && board[4][4]=='o')
		|| (board[0][0]=='o' && board[2][2]=='o' &&  board[4][4]=='o') || (board[0][4]=='o' && board[2][2]=='o' &&  board[4][0]=='o')
		 ){
			return 1;
		}
		else return 0;
	}
	
	int duplicacy(String str, int i) {
		if(str.contains(Integer.toString(i))) {
			return 1;
		}
		else
			return 0;
	}
}
public class TicTac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char board[][] = {
				{' ', '|',' ', '|', ' '},
				{'-', '+','-', '+', '-' },
				{' ', '|',' ', '|', ' '},
				{'-', '+','-', '+', '-' },
				{' ', '|',' ', '|', ' '}
				
		};
		int duplicate[] = new int[9];
		TicTacToe t = new TicTacToe();
		t.display(board);
		/* System.out.println("Enter the position of x ");
		int i = sc.nextInt();
		t.insertPos(i, board); 
		t.display(board); */
		int k=1;
		int flag = 0;
		String s = new String();
		for(int j=1; j<=9; j++) {
			if(j%2 != 0) {
				System.out.println("Enter the position of x ");
				int i = sc.nextInt();
				while(t.duplicacy(s, i) == 1) {
					System.out.println("Re-enter the position of x as this position already filled ");
					i = sc.nextInt();
				}
				if(t.duplicacy(s, i) == 0)	
					s = s+Integer.toString(i);
			
				t.insertPosX(i, board);
				t.display(board);
				if(t.checkX(board) == 1) {
					System.out.println("x win ");
					break;
				}
			}
			else {
				System.out.println("Enter the position of 0 ");
				int i = sc.nextInt();
				while(t.duplicacy(s, i) == 1) {
					System.out.println("Re-enter the position of 0 as this position already filled ");
					i = sc.nextInt();
				}
				if(t.duplicacy(s, i) == 0)	
					s = s+Integer.toString(i);
				
				t.insertPos0(i, board);
				t.display(board);
				if(t.check0(board) == 1) {
					System.out.println("o win ");
				}
			}
		}
		
	}

}
