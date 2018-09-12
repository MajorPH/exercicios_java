package atividadeaula5;

import java.util.Scanner;

public class AtividadeAula5 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int i, a;
        
        while(true){
            
            a = scanner.nextInt();
            
            if(a<1){
                break;
            }
        
            for (i=0; i<=a; i++) {
                System.out.printf("%d\n", i);
            }
        }
    }
}
