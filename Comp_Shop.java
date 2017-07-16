package Task1;

public class Comp_Shop {
	public static void main(String[] args) {

		Computer comp1 = new Computer(2015, 999, 500, 200);
		comp1.name = "Comp1";
		
		Computer comp2 = new Computer(2016, 1_249, false, 1_000, 500, "Windows 10");
		comp2.name = "Comp2";
		
		Computer comp3 = new Computer();
		comp3.name = "Comp3";
		comp3.price = 600;
		
		comparison(comp1, comp2);
		comparison(comp2, comp3);
		comparison(comp1, comp3);		
		
	}
	
	static void comparison(Computer c1, Computer c2){
		if(c1.comparePrice(c2) == -1){
			System.out.println(c1.name+" is мore expensive than "+c2.name);
		}
		else if(c1.comparePrice(c2) == 1){
			System.out.println(c2.name+" is мore expensive than "+c1.name);
		}
		else {
			System.out.println(c1.name+" and "+c2.name+" have the same prices");
		}
	}
	
}
