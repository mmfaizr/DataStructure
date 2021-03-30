package ds_lab2;
import java.util.Scanner;
public class DS_Lab2 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System. in );
 char c[] = {
 'A', 'B', 'C', 'D', 'E', 'F',
 'G', 'H', 'I', 'J', 'K', 'L',
 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
 };
 System.out.println("Enter character to search (Between A to Z): ");
 char letter = sc.next().charAt(0);
 if (letter >= 'A' && letter <= 'Z') {
 binarySearch(c, letter);
 if (binarySearch(c, letter) == -27)
System.out.println("Small letter entered! Please enter a capital letter.");
 else {
 System.out.println(letter + " Alphabet Found! Location in Array: " + binarySearch(c,letter));
 System.out.println("Previous alphabet in Array: " + (Character.toString((char)(letter -
1))));
 System.out.println("Next alphabet in Array:" + (Character.toString((char)(letter + 1))));
 }
 }
 else System.out.println("Wrong Input! Please enter a capital letter between A and Z");
 }
 static int binarySearch(char[] c, char letter) {
 int low = 0;
 int high = c.length - 1;
 while (low <= high) {
 int mid = (low + high) >>> 1;
 char midVal = c[mid];
 if (midVal < letter) low = mid + 1;
 else if (midVal > letter) high = mid - 1;
 else return mid + 1; // key found
 }
 return - (low + 1); // key not found.
 }
}