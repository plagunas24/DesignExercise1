
public class main {
	public static void main(String[] args) {
		
		String diet1 = new String("vegetarian");
		String diet2 = new String("vegan");
		String diet3 = new String("non-vegetarian");
		String diet4 = new String("pescetarian");
		
		person a = new person("Jacob");
		person b = new person("Luisa");
		person c = new person("Roger");
		person d = new person("Alondra");
		
		a.addDiet(diet1);
		b.addDiet(diet2);
		c.addDiet(diet3);
		d.addDiet(diet4);
		
		System.out.println(a.getDiet());
		System.out.println(b.getDiet());
		System.out.println(c.getDiet());
		System.out.println(d.getDiet());
	}
}
