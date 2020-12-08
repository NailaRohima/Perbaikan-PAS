package perbaikanpas;
import java.util.Scanner;
public class PerbaikanPAS {

    //fungsi identitas siswa
    public static void identitas(){
        //deklarasi variabel
        String nama, kelas;
        int noAbsen;
        
        //input identitas siswa
        Scanner input = new Scanner (System.in);
        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Kelas : ");
        kelas = input.nextLine();
        System.out.print("No absen : ");
        noAbsen = input.nextInt();
    }
    //fungsi kop raport siswa
    public static void kop(){
        System.out.println("-----------------------------------------------");
        System.out.println("           Rapor Siswa Semester Gasal          ");
        System.out.println("               SMK TELKOM MALANG               ");
        System.out.println("-----------------------------------------------");
    }
    //fungsi utama
    public static void main(String[] args) {
        //pemanggilan fungsi identitas dan kop raport siswa        
        identitas();
        kop();
        //deklarasi ariabel
        String jawab;
        int mtk, bIndo, fisika, kimia, ddg, proRPL, bIng, jumlahNilai, rataRata;
        //input nilai 
        Scanner input = new Scanner (System.in);
        System.out.println("Input Nilai Matematika : ");
        mtk = input.nextInt();
        System.out.println("Input Nilai Bahasa Indonesia : ");
        bIndo = input.nextInt();
        System.out.println("Input Nilai Fisika : ");
        fisika = input.nextInt();
        System.out.println("Input Nilai Kimia : ");
        kimia = input.nextInt();
        System.out.println("Input Nilai DDG : ");
        ddg = input.nextInt();
        System.out.println("Input Nilai Produktif RPL : ");
        proRPL = input.nextInt();
        System.out.println("Input Nilai Bahasa Inggris : ");
        bIng = input.nextInt();
        //operator aritmatika untuk mencari rata-rata nilai
        jumlahNilai = mtk + bIndo + fisika + kimia + ddg + proRPL + bIng;
        rataRata = jumlahNilai / 7;
        //percabangan kondisi untuk menentukan grade dan lulus tidaknya siswa        
        if (rataRata <= 100 && rataRata >= 0){
            if (rataRata >= 81){
                System.out.println("Grade A");
                System.out.println("LULUS");
            
            }else if (rataRata >= 71){
                System.out.println("Grade B");
                System.out.println("LULUS");
            }else if (rataRata >= 61){
                System.out.println("Grade C");
                System.out.println("LULUS");
            }else if (rataRata >= 51){
                System.out.println("Grade D");
                System.out.println(" TIDAK LULUS");
            }else{
                System.out.println("Grade E");
                System.out.println("TIDAK LULUS");
            }
        }else{
            System.out.println("Anda salah menginputkan nilai");
        }
        //perulangan untuk menanyakan apakah user ingin keluar dari program
        do{
            System.out.println("Apakah anda ingin keluar dari program ini?");
            System.out.println("Ketik 'ya' jika anda ingin keluar ");
            jawab = input.nextLine();
        }while (jawab.equals("tidak"));
        
        
    }
}
