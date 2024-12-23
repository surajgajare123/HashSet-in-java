import java.util.HashSet;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		HashSet<Integer> ad2 = new HashSet<>(10, 0.5f);
		ad2.add(12);
		ad2.add(34);
		ad2.add(23);
		ad2.add(23);
		System.out.println(ad2);
	}
}
