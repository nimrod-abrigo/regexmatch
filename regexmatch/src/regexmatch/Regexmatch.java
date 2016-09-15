package regexmatch;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Regexmatch {

    public static boolean isTrue(String str) {
        return str.matches("[Tt]rue");
    }
    
    public static boolean containsFalse(String str){
        return str.matches(".*false.*");
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(isTrue("true"));
        System.out.println(containsFalse("lkgfalsesh"));
        Scanner sc = new Scanner(new FileReader("input.txt"));
        
        while(sc.hasNext()){
            System.out.println(isTrue(sc.nextLine()));
        }
    }

}
