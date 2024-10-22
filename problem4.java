public class problem4 {
    public static void main(String[] args) {
        double marks[]={23,67,89};
        double sum=0;
        for(int i=0; i<marks.length; i++){
            sum+=marks[i];
        }
        double avg=sum/marks.length;
        System.out.println("average of three number"+avg);
    }
    
}
