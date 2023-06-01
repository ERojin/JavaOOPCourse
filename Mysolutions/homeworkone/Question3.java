/* Parametresi ile aldığı int türden bir sayının negatif mi, 0(sıfır) mı, pozitif mi olduğunu test eden signum isimli 
metodu yazınız ve test ediniz. Metot pozitif için 1(bir), negatif için -1(eksi bir) ve sıfır için 0(sıfır) döndürecektir
Açıklama: Math sınıfının signum metodu kullanılmayacaktır. */
package homeworkone;

class Question3 {
	public static void main(String [] args)
	{
		SignumTest.run();
	}
}
class SignumTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner (System.in);
		
		for (;;) {
			System.out.print("Bir sayı giriniz:");
			int a = kb.nextInt();
			
			System.out.printf ("signum(%d) = %d%n", a, NumberUtil3.Signum(a));
		
		if (a == 0) {
			System.out.println("Tekrar yapıyor musunuz?");
			return;
		}
		
	}
	}
}
class NumberUtil3 {
	public static int Signum(int a)
	{		
		if (a < 0)
			return -1;
		if (a == 0)
			return 0;
		return 1;
		
	}
}