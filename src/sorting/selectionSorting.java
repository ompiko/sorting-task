package sorting;

/**
 *
 * @author vicko
 */
public class selectionSorting {

  //process sorting
  static void sortProcess(int numb[]) {
    for (int i = 0; i < numb.length - 1; i++) {
      int minimumIndex = i;
      for (int j = 0; j < numb.length; j++) {
        if (numb[j] < numb[minimumIndex]) {
          minimumIndex = j;
        }
      }
      int temp = numb[minimumIndex];
      numb[minimumIndex] = numb[i];
      numb[i] = temp;
      System.out.println(numb[i]);
    }
  }

  //display before sorting
  static void displayBeforeSort(int numb[]) {
    System.out.print("before sorting: ");
    for (int i = 0; i < numb.length; i++) {
      System.out.print(numb[i] + " ");
    }
  }

  public static void main(String[] args) {
    int numb[] = {93, 99, 27, 46, 26};
    selectionSorting.displayBeforeSort(numb);
    selectionSorting.sortProcess(numb);
  }
}
