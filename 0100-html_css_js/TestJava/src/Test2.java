
class Bird{
	int legs=2;
	void move(){};
}

class Maque extends Bird{
	void move(){
		System.out.println("麻雀飞");
	}
}
class Hen   extends Bird{
	void move(){
		System.out.println("母鸡走");
	}
}
public class Test2 {
	public static void main(String args[]){
		Bird m=new Maque();
		m.move();
		Bird h=new Hen();
		h.move();
		System.out.println(m instanceof Bird);
		System.out.println(m instanceof Maque);
		System.out.println(m.getClass().getName());
	}
}
