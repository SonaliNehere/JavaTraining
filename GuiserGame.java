import java.util.Scanner;

class Player{
	Scanner sc = new Scanner(System.in);
	int p1, p2, p3;
	void player1() {
		System.out.println("Player 1 guise the number ");
		p1 = sc.nextInt();
	}
	 void player2() {
		System.out.println("Player 2 guise the number  ");
		p2 = sc.nextInt();
	}
	void player3() {
		System.out.println("Player 3 guise the number ");
		p3 = sc.nextInt();
	}
}

class Guisser{
	Scanner sc = new Scanner(System.in);
	int g;
	void guise() {
		System.out.println("Guisser guise the number  ");
		g = sc.nextInt();
	}
}

class Humpier{
	Humpier(){

	Player p = new Player();
	Guisser gs = new Guisser();
	gs.guise();
	p.player1();
	p.player2();
	p.player3();
	
	if(p.p1 == gs.g) {
		System.out.println("Player 1 is winner");
	}
	if(p.p2 == gs.g){
		System.out.println("Player 2 is winner ");
	}
	if(p.p3 == gs.g){
		System.out.println("Player 3 is winner ");
	}
	if(p.p1!=gs.g && p.p2!=gs.g && p.p3!=gs.g){
		System.out.println("Game lost try again");
		System.out.println();
		Humpier h1 = new Humpier();
	}
	
	
	
	}
}
public class GuiserGame {

	public static void main(String[] args) {
		Humpier h = new Humpier();
		
		
	}

}
