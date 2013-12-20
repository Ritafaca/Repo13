import java.io.*;
import java.util.Scanner;


public class Jurusan {
			static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
		
		        try {
				int nem1;
				int nem2;
				int nem3;
				String nama;
				
				System.out.println("Masukkan Nama anda : ");
				nama = input.nextLine();
				
				System.out.println("Masukkan NEM Matematika  : ");
				nem1 = input.nextInt();
				
				System.out.println("Masukkan NEM Bahasa Indonesia  : ");
				nem2 = input.nextInt();				
				
				System.out.println("Masukkan NEM Bahasa Inggris  : ");
				nem3 = input.nextInt();
				
				int rata = ((nem1+nem2+nem3)/3);
				int jumlah = (nem1+nem2+nem3);
				
                        System.out.println("Program hitung [1-3] " + "\n\t1.) Hitung Rata-rata" + "\n\t2.) Hitung jumlah total" + "\n\t3.) Sarankan jurusan kuliah");
                        System.out.print("Masukkan Pilihan Anda  : ");
                        int choose = input.nextInt();
                        if(choose==1){
                               System.out.println("Hai " + nama +"Nilai rata-rata NEM anda adalah"+rata);
                        } 
						else if(choose==2){
                                System.out.println("Hai " + nama +"Nilai rata-rata NEM anda adalah"+jumlah);
                        } 
						else if(choose==3){
                                if(nem1>nem2 && nem1>nem3){
									System.out.println("Hai  "+nama +"Jurusan yang tepat untuk anda adalah Matematika, Komputer, dan Akutansi");
								}
								
								else if(nem2>nem1 && nem2>nem3){
									System.out.println("Hai  "+nama +"Jurusan yang tepat untuk anda adalah Sastra Bahasa Indonesia");
								}
								
								else if(nem3>nem1 && nem3>nem2){
									System.out.println("Hai  "+nama +"Jurusan yang tepat untuk anda adalah Sastra Bahasa Inggris");
								}
								
								else if(nem1 + nem2 > nem3){
									System.out.println("Hai  "+nama +"Jurusan yang tepat untuk anda adalah Matematika, Komputer, Akutansi, Sastra Bahasa Indonesia");
								}
								
								else if(nem1 > nem2 && nem3 > nem2){
									System.out.println("Hai  "+nama +"Jurusan yang tepat untuk anda adalah Matematika, Komputer, Akutansi, Sastra Bahasa Inggris");
								}
								
								else if(nem2 > nem1 && nem2 > nem1){
									System.out.println("Hai  "+nama +"Jurusan yang tepat untuk anda adalah Sastra Bahasa Inggris dan Sastra Bahasa Indonesia");
								}
								
								else if(nem1 == nem3 && nem1 == nem2 && nem2 == nem3){
									System.out.println("Hai  "+nama +"Jurusan yang tepat untuk anda adalah Matematika, Komputer, Akuntansi, Sastra Indonesia, dan Sastra Inggris");
								}
                        }					
						else {
                                throw new Exception("pilihan anda tidak ada !");
                        }
                } 
				catch (Exception e) {
                System.out.println(e.getMessage());
                }
        }
}