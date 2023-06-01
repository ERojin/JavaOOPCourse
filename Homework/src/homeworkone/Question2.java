/* Soru 2 - Parametresi ile aldığı int türden 3 sayıdan ortancasına geri dönen mid isimli metodu NumberUtil isimli sınıf içerisinde yazınız ve test ediniz.
Metot sayıların aynı olması durumunda da ortanca değere geri dönecektir. Örneğin sayılar 10, 10, 20 ise ortanca değer 10 olacaktır.
Açıklama: Üç tane sayının ortancası sayıların toplamından sayıların en küçüğünün ve en büyüğünün toplamını çıkartmakla bulunabilir.
Metot bu şekilde yazılmayacaktır. Yani metot içerisinde sayıların en büyüğünün ve en küçüğünün bulunmasına gerek yoktur */
package homeworkone;

public class Question2 {
	public static void main (String [] arg)
	{
		MidTest.run();
	}
}
class MidTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner (System.in);
		
		for (;;) {
			System.out.print("Birinci sayıyı giriniz:");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("İkinci sayıyı giriniz:");
			int b = Integer.parseInt(kb.nextLine());
			
			System.out.print("Üçüncü sayıyı giriniz:");
			int c = Integer.parseInt(kb.nextLine());
			
			System.out.printf("mid (%d, %d, %d), %d ", a, b, c , NumberUtil.FindMid(a, b, c));
			
			if (a == 0 && b == 0 && c == 0) {
				System.out.println("Tekrar yapıyor musunuz?");
				return;
			}
		}
	}
}
class NumberUtil {
	public static int FindMid (int a, int b, int c)
	{
		if (a < b && c < a)
			return a ;
		if (b < a && c < b)
			return b;
		else 
			return c;
	}
		
	
}


