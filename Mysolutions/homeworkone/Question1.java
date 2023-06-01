/* 1. Klavyeden alınan int türden üç sayı arasındaki büyüklük-küçüklük ilişkisini küçükten büyüğe doğru < ve = sembolleriyle gösteren programı yazınız:
Açıklama:
- Program içerisinde dizi kullanılmayacaktır. Zaten gerek de yoktur.
- Bir sıralama algoritmasına ihtiyacınız yoktur.
- Program üç tane int türden sayı isteyecektir, aralarındaki ilişkiyi ekranda gösterecektir. */

package homeworkone;

public class Question1 {
	public static void main (String [] arg)
	{
		PrintRelationApp.run();
	}
}

class PrintRelationApp {
	public static void PrintRelationApp (int a, int b, int c)
	{
	
		int min = Math.min(Math.min(a, b) , c );
		int max = Math.max(Math.max(a, b), c);
		int mid = a + b + c - max - min;
		
		if (min < mid)
			System.out.printf("%d < %d", min , mid);
		else
			System.out.printf("%d = %d", min = mid);
		if (mid < max)
			System.out.printf(" < %d", max);
		else 
			System.out.printf(" = %d", max);
		
	}
	
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner (System.in);
		
		System.out.println ("3 sayı giriniz:");
		
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		
		PrintRelationApp(a, b, c);

		
	}
}
