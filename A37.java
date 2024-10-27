import java.util.*;
public class A37 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int M=sc.nextInt();
        String Month;
        switch(M){
            case 1: Month="january"; break;
            case 2: Month="february"; break;
            case 3: Month="March"; break;
            case 4: Month="April"; break;
            case 5: Month="May"; break;
            case 6: Month="june"; break;
            case 7: Month="july"; break;
            case 8: Month="August"; break;
            case 9: Month="september"; break;
            case 10: Month="october"; break;
            case 11: Month="November"; break;
            case 12: Month="december"; break;
            default:Month="invalid month"; break;
        }
        System.out.println(Month);
    }
    
}
