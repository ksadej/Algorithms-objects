import static java.lang.Math.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.util.Scanner;
public class mclass {
	
//	Tasks from:
//	https://javastart.pl/baza-wiedzy/java-zadania	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("xd");
//		Auto auto = new Auto();
//		String mess;
//		mess = auto.setAutoMessage();
//		System.out.println(mess);
//		auto.setAutoMessage2();
//		System.out.println("---------");
//		
//		Opel opel = new Opel();
//		opel.setAutoMessage2();
//		System.out.println("---------");
//		
//		Auto auto1 = new Opel();
//		auto1.setName("name");
//		System.out.println(auto1.getName());
		
		
//		Auto auto = new Auto();
//		auto.setName("Auto Max");
//		System.out.println(auto.getName());
//		
//		Auto auto1 = new Opel();
//		auto1.setName("Auto Max 2");
//		System.out.println(auto1.getName());
		
		////
		
//		final String x1 = "Ala";
//		final int x2 = 22;
//		final char x3 = '1';
//		
//		System.out.println(x1);
//		System.out.println(x2);
//		System.out.println(x3);
//		
//		String y1 = "Ala";
//		String y2 = "ma";
//		String y3 = "kota";
//		String y4 = y1 + y2 + y3;
//		System.out.println(y4);
//		System.out.println(y4.substring(3));
		
		////
		
//		double a = 10;
//		double b = 14;
//		double c = 22;
//		
//		a++;
//		b++;
//		c++;
//		
//		System.out.println((a+b)*c);
//		System.out.println(a-b/c);
//		System.out.println((a+b)>c);
//		System.out.println(a==b);
		
		////
		
//		char a = 'a';
//		int b = a;
//		char c = 101;
//		System.out.println(a + " " + b + " " + c);
		
		////
		
//		int a = -12;
//		int b = 11;
//		System.out.println(pow(a, b));
//		System.out.println(abs(a));
//		System.out.println(sqrt(pow(a,b)));

		////
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Podaj liczbê");
//		int dat;
//		
//		for(dat = scan.nextInt(); dat > -1; dat--) {
//			System.out.println(dat);	
//			if(dat== 0) {
//				System.out.println("BUM");
//			}
//		}
		
		////
		
//		String[] name = new String[5];
//		Scanner scan = new Scanner(System.in);
//		for(int i=0 ; i<name.length; i++) {
//			System.out.println("Podaj imie nr: ");
//			String nam = scan.nextLine();
//			name[i] = nam;
//		}
//		System.out.println("Dziêkujê, oto podana lista imion: ");
//		
//		for(int i=0 ; i<name.length; i++) {
//			System.out.println(name[i]);
//		}
		
		////
		
//		System.out.println("Ile liczb chcesz wprowadziæ?");
//		Scanner scan = new Scanner(System.in);
//		int nu = scan.nextInt();
//		System.out.println("Wprowadz "+ nu +" liczb");
//		int[] num = new int[nu];
//		
//		for(int i=0; i< num.length; i++) {
//			System.out.println("Podaj liczbe: ");
//			int numb = scan.nextInt();
//			num[i] = numb;
//		}
//		
//		for(int i=0; i< num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		////	
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Podaj kolejno dwie liczby: ");
//		double a = scan.nextDouble();
//		double b = scan.nextDouble();
//		
//		System.out.println("Dodawanie: "+ (a+b));
//		System.out.println("Odejmowanie: "+ (a-b));
//		System.out.println("Mno¿enie: "+ (a*b));
//		System.out.println("Dzielenie: "+ (a/b));
		
		////
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Podaj pierwsz¹ liczbê: ");
//		int a = scan.nextInt();
//		
//		System.out.println("Podaj drug¹ liczbê: ");
//		int b = scan.nextInt();
//		
//		if(a==b) {
//			System.out.println("Liczba: "+ a +" jest równa liczbie "+ b);
//		}
//		else if(a>b) {
//			System.out.println("Liczba: "+ a +" jest wiêksza liczbie "+ b);
//		}else {
//			System.out.println("Liczba: "+ a +" jest mniejsza liczbie "+ b);
//		}
		
		////
		//Rozwi¹zanie 1.10
		
//		String path ="C:/Users/Krzysiek/Desktop/test.txt";
//		File file = new File(path);
//		
//		if(!file.exists()) {
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		Scanner scan = new Scanner(System.in);
//		String name;
//		System.out.println("Podaj imiê: ");
//		name = scan.nextLine();
//		try {
//			PrintWriter writer = new PrintWriter("writer.txt");
//			writer.print("ddd");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			PrintWriter  fileWriter = new PrintWriter("C:/Users/Krzysiek/Desktop/test.txt");
//			fileWriter.write("fff");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		////
		//Zadanie 2.1
		
//		Scanner scn = new Scanner(System.in);
//		System.out.println("Podaj imie: ");
//		String name = scn.nextLine();
//		
//		System.out.println("Podaj nazwisko: ");
//		String lName = scn.nextLine();
//		
//		System.out.println("Podaj wiek: ");
//		int age = scn.nextInt();
//		
//		Pracownik pr = new Pracownik(name, lName, age);
//		
//		System.out.println("Podano nastepujace dane: ");
//		System.out.println(pr.getName());
//		System.out.println(pr.getlName());
//		System.out.println(pr.getAge());
		
		////
		//Rozwi¹zanie 2.3
		
//		Punkt pkt = new Punkt();
//		pkt.setA(5);
//		pkt.setB(7);
//		
//		pkt.increaseA();
//		pkt.increaseB();
//		
//		System.out.println(pkt.getA());
//		System.out.println(pkt.getB());
		
		
		
	}
}
