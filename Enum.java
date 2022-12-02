enum Pizza{
	SMALL, MEDIUM, LARGE ;
}
public class Enum {
	enum Meal{
		BREAKFAST(10),
		LUNCH(20),
		DINNER(15);
		private int value;
		private Meal(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p = Pizza.SMALL;
		Pizza p1 = Pizza.MEDIUM;
		Pizza p2 = Pizza.LARGE;
		
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println();
		
		switch(p.toString()) {
		case "SMALL" : System.out.println("Eat small pizza "); break;
		case "MEDIUM" : System.out.println("Eat medium pizza "); break;
		case "LARGE" : System.out.println("Eat large pizza "); break;
		default: System.out.println("other ");
		}
		System.out.println();
		
		System.out.println(p.ordinal());
		System.out.println(p1.ordinal());
		System.out.println(p2.ordinal());
		System.out.println();
		
		for(Meal m : Meal.values()) {
			System.out.println(m + " " + m.value);
		}
		System.out.println();
		
		Meal m = Meal.LUNCH;
		System.out.println(m.getValue());
		System.out.println();
		
		
	}

}
