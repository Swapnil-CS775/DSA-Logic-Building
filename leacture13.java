//Linear search
//problem 1 - Find specific charactor from string
package Swapnil.com;

public class FindCharacterInString {
    public static void main(String[] args) {
        String str="swapnil";
        char [] arr=str.toCharArray();
        for (char c : arr) {
            if (c == 'a') {
                System.out.println("found");
                return;
            }
        }
        System.out.println("not found");
    }
}
