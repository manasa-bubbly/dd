import java.util.*;
public class CountReturnsToOrigin{
    public static int countReturnsToOrigin(int[]A,int N){
        int position=0 ,count=0;
        for(int i=0;i<N;i++){
            position+=A[i];
            if(position==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int result=countReturnsToOrigin(A,N);
        System.out.println(result);
    }
}
        