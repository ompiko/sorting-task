/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author vicko
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  /**
   * public static void sort(int numb[]) { int n = numb.length;//inisialisasi
   * variable untuk menghitung jumlah element pada array for (int i = 0; i < n; i++) {
   * int key = numb[i]; //inisialisasi untuk manipulasi pergeseran nilai
   * int j = i - 1;
   * while ((j > -1) && (numb[j] > key)) { numb[j + 1] = numb[j]; j--; } numb[j
   * + 1] = key; // }
  }*
   */
  public static void insertionSort(int in[]) {
    int temp;
    for (int i = 1; i < in.length; i++) {
      for (int j = i; j > 0; j--) {
        if (in[j] < in[j - 1]) {
          temp = in[j];
          in[j] = in[j - 1];
          in[j - 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    // TODO code application logic here
    int number[] = {93, 27, 46, 21, 43, 99, 5};

    System.out.println("Before sort: ");
    for (int i : number) {
      System.out.print(i + ", ");
    }
    System.out.println("\n\n");
    insertionSort(number);//memanggil method static sort
    System.out.println("After sort: ");
    for (int i : number) { //iki ngunu perulangan namanya "For: element", 
      //jadi gunanya langsung mengulang 
      //semua element yang ada pada sebuah variable
      System.out.print(i + ", ");
    }
  }
}
