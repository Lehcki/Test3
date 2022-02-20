import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {
	public static void main(String[] args) {
		System.out.print("Insira uma senha");
		Scanner scan = new Scanner(System.in);
		String senha1 = scan.next();
		int n = 0;
		int ma = 0;
		int mi = 0;
		int esp = 0;
		int f = 0;
		Pattern regex = Pattern.compile("[!@#$%^&*()+-]");
		Matcher matcher = regex.matcher(senha1);
		if(matcher.find()) {
			esp++;}
		for(int numv = 0; numv <senha1.length(); numv++) {
			if (Character.isDigit(senha1.charAt(numv))==true) {
				n++;}
			if (Character.isUpperCase(senha1.charAt(numv))==true) {
				ma++;}
			if (Character.isLowerCase(senha1.charAt(numv))==true) {
				mi++;}
		}
				if(n >= 1) {
					} else {
						f++;
					}
				if(ma >= 1) {
					} else {
						f++;
					}
				if(mi >= 1) {
					} else {
						f++;
					}
				if(esp >= 1) {
					} else {
						f++;
					 
					}
				int fin = senha1.length()+f;
				if(f != 0) {
					
				if(fin >=6) {
				System.out.println(f); }
				else {
					System.out.println(6- fin + f);}
				} else {
					System.out.println("Sua senha é Forte");}
				}
				
		
		}