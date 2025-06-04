import java.util.*;
public class CupCakes{
public static int Manasa(int N,int[] A){
int sum=0;
for(int i=0;i<N;i++){
if (A[i]>=5){
sum+=A[i];
}
}
return sum;
}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements:");
int N=sc.nextInt();
int[] A=new int[N];
System.out.println("Enter" + N + "integers:");
for(int i=0;i<N;i++){
A[i]=sc.nextInt();
}
int result=Manasa(N,A);
System.out.println("Result:" +result);
}
}
