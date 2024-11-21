import java.util.Scanner;
public class rekapJualan19 {
    static Scanner sc = new Scanner(System.in);
    static String menu[] = {"Kopi","Teh","Es Degan","Roti Bakar","Gorengan"}; 
        static int[][] inputData(int x,int y){ 
            int penjualanArr [][] = new int[x][y]; 
            for (int i = 0; i < penjualanArr.length; i++) { 
                System.out.printf("Input Penjualan menu %s\n",menu[i]); 
                for (int j = 0; j < penjualanArr[i].length; j++) 
    { 
                    System.out.printf("Masukkan Penjualan hari ke-%s: ",j+1); 
                    penjualanArr[i][j] = sc.nextInt(); 
                } 
                
    System.out.println("========================================="); 
            } 
            return penjualanArr; 
        } 
        static void printArr(int arr[][] ){ 
            
    System.out.println("========================================="); 
            for (int i = 0; i < arr.length; i++) { 
                System.out.println("Hasil Penjualan menu "+menu[i]+" : "); 
                for (int j = 0; j < arr[i].length; j++) { 
                    System.out.println("Hari ke-"+(j+1)+" : "+arr[i][j]); 
                } 
                
    System.out.println("========================================="); 
    } 
} 
static void penjualanTertinggi(int arr[][]){ 
    int tertinggi = 0; 
    int indexMenu=0; 
    int indexHari=0; 
    for (int i = 0; i < arr.length; i++) { 
        for (int j = 0; j < arr[i].length; j++) { 
            if (arr[i][j]>tertinggi) { 
                tertinggi = arr[i][j]; 
                indexMenu = i; 
                indexHari = j; 
            } 
        } 
    } 
    System.out.println("Menu dengan penjualan paling tinggi yaitu: "+menu[indexMenu]); 
    System.out.println("Dengan jumlah penjualan: "+arr[indexMenu][indexHari]+" pada hari ke-"+(indexHari+1)); 
    
System.out.println("========================================="); 
}
static void rataPenjualan(int arr [][]){ 
    for (int i = 0; i < arr.length; i++) { 
        double total = 0; 
        double rata =0; 
        for (int j = 0; j < arr[i].length; j++) { 
            total += arr[i][j]; 
        } 
        rata = total / arr[i].length; 
        System.out.println("Rata-rata penjualan pada menu "+menu[i]+" : "+rata); 
        
System.out.println("========================================="); 
    } 
} 
public static void main(String[] args) { 
    System.out.println("================= Menu =================="); 
    for (int i = 0; i < menu.length; i++) { 
        System.out.println((i+1)+". "+menu[i]); 
    } 
    
System.out.println("========================================="); 
    int dataPenjualan[][] = inputData(5, 7); 
    printArr(dataPenjualan); 
    penjualanTertinggi(dataPenjualan); 
    rataPenjualan(dataPenjualan); 
    } 
}
