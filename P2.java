import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		
		//
		System.out.println("La serie de Fibonacci consiste en una serie de n�meros enteros positivos que inicia con los n�meros 0 y 1.");
		System.out.println("El siguiente n�mero corresponde a la suma de los 2 anteriores. Entonces la serie de Fibonacci es: 0,1,1,2,3,5,8,13,21,... ");
		System.out.println("Implemente un algoritmo que imprima la serie de Fibonacci");
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Este programa imprime los n�meros que desees visualizar de la serie de fibonacci. \n�Cu�ntos N�meros deseas revisar?");
				int n=scanner.nextInt();
				int i=3;
				double []cont= {0,1};
				double suma=0;
				System.out.println("Los primeros"+n+"numeros de la serie de Fibonacci son:");		
		switch (n) {
		case 1:
			System.out.println("1� N�mero = "+cont[0]);
			break;
		case 2:
			System.out.println("1� N�mero = "+cont[0]);
			System.out.println("2� N�mero = "+cont[1]);
			break;
		default:
			System.out.println("1� N�mero = 0");
			System.out.println("2� N�mero = 1");
			while (i<=n)
			{
				suma=cont[1]+cont[0];
				cont[0]=cont[1];
				cont[1]=suma;
				System.out.println((i)+"� N�mero = "+suma);
				i++;
			}
			break;
		
		
		
		}


	}

}
