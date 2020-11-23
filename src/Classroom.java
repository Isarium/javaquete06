
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wilder person1 = new Wilder ("Jean", true);
		Wilder person2 = new Wilder ("Claude", false);
		Wilder person3 = new Wilder ("Pierre", true);
		
		System.out.println(person1.whoAmI());
		System.out.println(person2.whoAmI());
		System.out.println(person3.whoAmI());
		
	}

}
