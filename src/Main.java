import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas são ?");
		hora = sc.nextInt();
				
		if (hora > 0 && hora <= 12) {
			System.out.println("Bom dia !");
		} 
		if (hora > 12 && hora < 17 ) {
			System.out.println("Boa tarde !");
		} 
		else {
			if(hora > 17 && hora < 24) {
				System.out.println("Boa noite !");
			}								
		}
		
		
		
		
		// Expressão comparativa
		/*
		 * System.out.println(2>43);
		System.out.println(100>43);
		System.out.println(2==2 && 2==2);
		System.out.println(2==2 || 1==2);
		System.out.println(!(2==2 && 2!=2));
		System.out.println(!(2==1 || 2==2));
		 */
		
		/*
		 * double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
		 * */
		
		
		/* Variaveis em java = int > 25, double > 25.5, char > sexo, byte > /128 a 127, short >-322784
		 * 					   long > 64968764967984, float > 12.3f, boolean > true/false	
		 *
		 *
		 *String result = "resultado é :";
		
		double valorFloat = 654496846.61244631;
		System.out.println(valorFloat);
		System.out.printf("%.4f%n",valorFloat);
		System.out.printf("%.2f%n",valorFloat);
		System.out.printf("%.1f%n",valorFloat);
		System.out.printf("%.6f%n",valorFloat);
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		 * 
		 * 
		 */
		
		/*
		 * double b2, B2, h2, area2;
		b2 = 6.0;
		B2 = 8.0;
		h2 = 5.0;
		area2 = (b2 + B2) / 2.0 * h2;
		System.out.println(area2);
		
		float b, B, h, area;
		b = 6f;
		B = 8f;
		h = 5f;
		area = (b + B) / 2f * h;
		System.out.println(area);
		
		int a3, b3;
		double resultado;
		a3 = 5;
		b3 = 2;
		resultado = a3 / b3;
		System.out.println(resultado);
		
		
		
		int a4, b4;
		double resultado4;
		a4 = 5;
		b4 = 2;
		
		
		resultado4 = (double) a4 / b4;
		System.out.printf("convertido %.1f%n", resultado4);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		
		
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		 * 
		*/	
		
	}

}
