import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TT{
	 static String name="asd";
	 
}

public class Test {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			System.out.println(i);
		}
		TT t=new TT();
		System.out.println(t.name);
		System.out.println(TT.name);
		
/*		int a=10;
		int b=a;
		a=20;
		System.out.println("b:"+b);
		System.out.println("a:"+a);
		
		Integer a1=new Integer(10);
		Integer b1=a1;
		a1=new Integer(20);
		System.out.println("b1:"+b1);
		System.out.println("a1:"+a1);*/
		
		//console.log("123-00-1234 匹配结果:"+p.test("123-00-1234"));
		//console.log("aaa-00-1234 匹配结果:"+p.test("aaa-00-1234"));
		//console.log("1234-00-1234 匹配结果:"+p.test("1234-00-1234"));
		//console.log("123456-00-123432 匹配结果:"+p.test("123456-00-123432"));
		//console.log("123-000-1234 匹配结果:"+p.test("123-000-1234"));
		/*Pattern p = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
		System.out.println("123-00-1234 匹配结果:"+p.matcher("123-00-1234").matches());
		System.out.println("aaa-00-1234 匹配结果:"+p.matcher("aaa-00-1234").matches());
		System.out.println("1234-00-1234 匹配结果:"+p.matcher("1234-00-1234").matches());
		System.out.println("123456-00-123432 匹配结果:"+p.matcher("123456-00-123432").matches());
		System.out.println("123-000-1234 匹配结果:"+p.matcher("123-000-1234").matches());
		
		Pattern p2 = Pattern.compile("(\\d+;)(\\d+)");
		String s = "123;456-34;345";
		Matcher m = p2.matcher(s);
		while (m.find()) {
			System.out.println("m.group():" + m.group()); // 打印一个大组
			System.out.println("m.group(1):" + m.group(1)); // 打印组1
			System.out.println("m.group(2):" + m.group(2)); // 打印组2
			System.out.println();
		}
		System.out.println("捕获个数:groupCount()=" + m.groupCount());*/
	}


}
