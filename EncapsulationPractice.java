
class Doggy{
	private String name;
	private String breed;
	private int id;
	
	/*public void setData(String dName, String dBreed, int dId) {
		name = dName;
		breed = dBreed;
		id = dId;
	} */
	public void setName(String dName) {
		name = dName;
	}
	public String getName() {
		return name;
	}
	
	public void setBreed(String dBreed) {
		breed = dBreed;
	} 
	public String getBreed() {
		return breed;
	}
	
	public void setId(int dId) {
		id = dId;
	} 
	public int getId() {
		return id;
	}
}


public class EncapsulationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doggy d = new Doggy();
		d.setName("Rocky");
		d.setBreed("Boxer");
		d.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d.getName());
		System.out.println(d.getBreed());
		System.out.println(d.getId());

		Doggy d1 = new Doggy();
		d1.setName("Rocky");
		d1.setBreed("Boxer");
		d1.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d1.getName());
		System.out.println(d1.getBreed());
		System.out.println(d1.getId());
		
		Doggy d2 = new Doggy();
		d2.setName("Rocky");
		d2.setBreed("Boxer");
		d2.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d2.getName());
		System.out.println(d2.getBreed());
		System.out.println(d2.getId());
		
		Doggy d3 = new Doggy();
		d3.setName("Rocky");
		d3.setBreed("Boxer");
		d3.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d3.getName());
		System.out.println(d3.getBreed());
		System.out.println(d3.getId());
		
		Doggy d4 = new Doggy();
		d4.setName("Rocky");
		d4.setBreed("Boxer");
		d4.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d4.getName());
		System.out.println(d4.getBreed());
		System.out.println(d4.getId());
		
		Doggy d5 = new Doggy();
		d5.setName("Rocky");
		d5.setBreed("Boxer");
		d5.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d5.getName());
		System.out.println(d5.getBreed());
		System.out.println(d5.getId());
		
		Doggy d6 = new Doggy();
		d6.setName("Rocky");
		d6.setBreed("Boxer");
		d6.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d6.getName());
		System.out.println(d6.getBreed());
		System.out.println(d6.getId());
		
		Doggy d8 = new Doggy();
		d8.setName("Rocky");
		d8.setBreed("Boxer");
		d8.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d8.getName());
		System.out.println(d8.getBreed());
		System.out.println(d8.getId());
		
		Doggy d9 = new Doggy();
		d9.setName("Rocky");
		d9.setBreed("Boxer");
		d.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d9.getName());
		System.out.println(d9.getBreed());
		System.out.println(d9.getId());
		
		Doggy d10 = new Doggy();
		d10.setName("Rocky");
		d10.setBreed("Boxer");
		d10.setId(123);
		//d.setData("Rocky", "Boxer", 123);
		System.out.println(d10.getName());
		System.out.println(d10.getBreed());
		System.out.println(d10.getId());
	}

}
