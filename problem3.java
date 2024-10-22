public class problem3 {
    public static void main(String[] args) {
        int arr[][]={
          {72,5},
        {345,10},
        {345,100}
      };
          for(int[] array:arr){
            int dividend=array[0];
            int divisor=array[1];
            int quotient=dividend/divisor;
            int remainder=dividend%divisor;
            System.out.println("dividend "+dividend +", divisor:"+divisor+ "= quotient:"+quotient+"remainder :"+ remainder);
          }
    
}
}
