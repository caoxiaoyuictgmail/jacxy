package practiceEveryDay;

public class Day_1 {
	
	public static void main(String[] args) {
		System.out.println("Good hunter, welcome to this world !");
		
		
		//标识符 由字母，数字，下划线和美元符号$组成，第一个字符不能为数字，并且标识符区别大小写
		
		//8种基本数据类型，6种数值类型，另外两种是字符类型和布尔类型，其中整数类型有4种(byte, short, int, long)，2种是浮点类型(float, double)
		 byte a = 1;
		 System.out.println(a);
	
		 short b = 2000;
		 
		 int c = 2000000;
		 
		 long d =  10000000L;
		 
		 System.out.println("the byte a is:" + a + ", and the short b is:" + b + ", and the int c is:" + c + ", and the long d is:" + d);
		 
		 System.out.println("the two type of Integer sum is:" + (a+b+c+d));
		 
		 long a1, a2, a3, a4;
		 
		 float b1 = 3.12f;
		 
		 double b2 = 21.5;
		 
		 System.out.println("The float b1 is:" + b1 + ", and the double b2 is:" + b2);
		 
		 char c1 = 'a';
		 
		 // This is unicode which means a
		 char x = 97;
		 
		 // and the \ is zhuanyi code
		 
		 //As example, the \n is the key 'Enter'
		 //\r huiche \n huanhang \b tuige \f huanye
		 
		 char char1 = '\\';
		 char char2 = '\u2605';
		 
		 //This is wujiaoxin
		 System.out.println(char2);
		 	
		 boolean bool1 = true, bool2 = false, bool3;
		 
		 int 年龄 = 25;
		 
		 System.out.println(年龄);
		 
		 
		 //constant it always called final 
		 final boolean CXY1 = true;
		 final char CXY2 = 'b';
		 final double CXY3 = 21.55;
		 final double PI = 3.14;
		 
		 System.out.println("the CXY3 is lager than PI:" + (CXY3 > PI));
		 
		 System.out.println(46^a);
		 
		 System.out.println(46>>1);
		 
		 System.out.println(46&47);
		 
		 System.out.println("The sanmu result is:" +  (1>2? true : false));
	}
	
}
