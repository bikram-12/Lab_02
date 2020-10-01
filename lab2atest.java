public class lab2atest{
	public static void main(String[] args) {
		lab2a obj1=new lab2a();
		obj1.push(1);
		obj1.push(2);
		obj1.push(3);
		
		System.out.println(obj1.isEmpty());
		System.out.println(obj1.size());
		System.out.println(obj1.top());
		System.out.println(obj1.pop());
	}
}