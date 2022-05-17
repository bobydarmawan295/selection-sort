import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        int[] nilai = new int[10];
        String[] kata = new String[10];

        int i, imin,  j, k, m, n, temp;
        boolean isContinue = true;
        int jumlah = 0;
        String pilihan = null, pilihanUser;

        System.out.println("==========================");
        System.out.println("  PROGRAM SELECTION SORT  ");
        System.out.println("==========================");
        
        while(isContinue){
            System.out.println("\nJenis urutan:");
            System.out.println("1.Ascending");
            System.out.println("2.Descending");
            System.out.println("3.String");
            System.out.print("\nMasukkan pilihan : ");
            pilihan = input.next();
        
            switch (pilihan) {
            case "1":
                System.out.println("\n============================");
                System.out.println("  SELECTION SORT ASCENDING  ");
                System.out.println("============================");
                System.out.print("Masukkan jumlah elemen : ");
                try {
                    jumlah = input.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println(e);
                }
        
                for(m = 0; m < jumlah; m++){
                    System.out.print("Masukkan elemen ke-" + (m+1) + ": ");
                    nilai[m] = input.nextInt();
                }
                
                System.out.println("\n==========================");
                System.out.println("Data sebelum diurut");
                System.out.println("==========================");
                n = 0;
                while(n < jumlah){
                    System.out.println(nilai[n]);
                    n++;
                }
                System.out.println();
        
                for(i = 0; i < n - 1; i++){
                    imin = i;
                    for(j = i+1; j < n; j++){
                        if( nilai[j] > nilai[imin] ){
                        imin=j;
                        }
                        temp = nilai[imin];
                        nilai[imin] = nilai[j];
                        nilai[j] = temp;
                    }
        
                    System.out.println("Langkah ke " + (i+1));
                    System.out.println("-----------------------");
                    for (int x=0;x<jumlah;x++){
                        System.out.println(nilai[x]);
                    }
                }
        
                
                System.out.println("\n========================");
                System.out.println("Data setelah diurut");
                System.out.println("==========================");
                for(k = 0; k <= i; k++){
                    System.out.println(nilai[k] + " ");
                }
                break;
            case "2":
                System.out.println("\n============================");
                System.out.println("  SELECTION SORT DESCENDING ");
                System.out.println("============================");
                System.out.print("Masukkan jumlah elemen : ");
                try {
                    jumlah = input.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println(e);
                }
                System.out.println();
        
                for(m = 0; m < jumlah; m++){
                    System.out.print("Masukkan elemen ke-" + (m+1) + ": ");
                    nilai[m] = input.nextInt();
                }
                
                System.out.println("\n==========================");
                System.out.println("Data sebelum diurut");
                System.out.println("==========================");
                n = 0;
                while(n < jumlah){
                    System.out.println(nilai[n]);
                    n++;
                }
                System.out.println();
        
                for(i = 0; i < n - 1; i++){
                    imin = i;
                    for(j = i+1; j < n; j++){
                        if( nilai[j] < nilai[imin] ){
                        imin=j;
                        }
                        temp = nilai[imin];
                        nilai[imin] = nilai[j];
                        nilai[j] = temp;
                    }
        
                    System.out.println("Langkah ke " + (i+1));
                    System.out.println("-----------------------");
                    for (int x=0;x<jumlah;x++){
                        System.out.println(nilai[x]);
                    }
                }
        
                
                System.out.println("\n========================");
                System.out.println("Data setelah diurut");
                System.out.println("==========================");
                for(k = 0; k <= i; k++){
                    System.out.println(nilai[k] + " ");
                }
                break;
            case "3":
                System.out.println("\n============================");
                System.out.println("  SELECTION SORT STRING  ");
                System.out.println("============================");
                System.out.print("Masukkan jumlah elemen : ");
                try {
                    jumlah = input.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println(e);
                }
                System.out.println();
        
                for(m = 0; m < jumlah; m++){
                    System.out.print("Masukkan elemen ke-" + (m+1) + ": ");
                    kata[m] = input.next();
                }
                
                System.out.println("\n==========================");
                System.out.println("Data sebelum diurut");
                System.out.println("==========================");
                n = 0;
                while(n < jumlah){
                    System.out.println(kata[n]);
                    n++;
                }
                System.out.println();
        
                for(i = 0; i < n - 1; i++){
                    imin = i;
                    for(j = i+1; j < n; j++){
                        if( kata[j].compareTo(kata[imin]) > 0 ){
                            imin=j;
                        }
                        String temp2 = kata[imin];
                        kata[imin] = kata[j];
                        kata[j] = temp2;
                    }
        
                    System.out.println("Langkah ke " + (i+1));
                    System.out.println("-----------------------");
                    for (int x=0;x<jumlah;x++){
                        System.out.println(kata[x]);
                    }
                }
        
                System.out.println("\n========================");
                System.out.println("Data setelah diurut");
                System.out.println("==========================");
                for(k = 0; k <= i; k++){
                    System.out.println(kata[k] + " ");
                }
                break;
            case "4":
                System.out.println("Terima kasih (> <)");
                isContinue = false;
            default:
                break;
            }
            System.out.print("\nApakah Anda ingin melanjutkan [y/n]? ");
            pilihanUser = input.next();
            isContinue = pilihanUser.equalsIgnoreCase("y");

        }

        

        

    }
}
