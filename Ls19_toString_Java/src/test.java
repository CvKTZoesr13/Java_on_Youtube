
public class test {
	public static void main(String[] args) {
		Example md1 = new Example(12, 6, 2002);
		Example md2 = new Example(12, 6, 2002);
		Example md3 = new Example(13, 11, 2022);

		System.out.println(md2);
		System.out.println(md1);
		System.out.println(md3);
		System.out.println("md1 = md2: " + md1.equals(md2));
		System.out.println(md1.hashCode());
		System.out.println(md2.hashCode());
		
	}
}
