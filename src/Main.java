import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*
		 * Напишете програма, която чете от конзолата 2 числа от тип int и
		 * отпечатва тяхната сума.
		 */
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println(a + b);

		/*
		 * Напишете програма, която приема две цели числа - съответно страната и
		 * височината на триъгълник. Пресметнете лицето на дадения триъгълник и
		 * я изведете на конзолата.
		 */
		a = in.nextInt();
		int h = in.nextInt();
		System.out.println(a * h / 2.0);

		/*
		 * Напишете проргама която приема 2 целочислени числа за вход и извежда
		 * остатъка от делението на числата.
		 */
		a = in.nextInt();
		b = in.nextInt();
		System.out.println(a % b);

		/*
		 * Напишете програма, която приема 2 символни низа (string) като вход, и
		 * изведете като резултат конкатениран string със „_“ между двата входни
		 * низа.
		 */
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		System.out.println(str1 + "_" + str2);

		/*
		 * Напишете програма, която приема реално число като вход, и изкарва на
		 * конзолата резултата от делението му с цяло число.
		 */
		b = in.nextInt();
		double d = in.nextDouble();
		System.out.println(d / b);

		/*
		 * Напишете програма, която приема два стринга като вход. След това
		 * проверява дали 2рия стринг се съдържа в 1вия. Покажете резултата от
		 * проверката на конзолата.
		 */
		str1 = in.nextLine();
		str2 = in.nextLine();
		System.out.println(str1.contains(str2));

		/*
		 * Напишете програма, която приема стринг от конзолата, и извежда N-тия
		 * символ от стринга, като резултат.
		 */
		str1 = in.nextLine();
		int N = in.nextInt();
		System.out.println(str1.charAt(N));

		/*
		 * Напишете булев израз, който да проверява дали даден низ от символи
		 * (String) е равен на „Hello”. Отпечатайте в конзолата резултата от
		 * проверката.
		 */
		str2 = in.nextLine();
		System.out.println(str2.equals("Hello"));
	}
}
