public class Demo{
public static int Fibonacci(int n){
if(n==0){
return 0;
} else if(n==1){
return 1;
} else{
return(Fibonacci(n-1)+Fibonacci(n-2));
}
}
public static void main(String[] args){
int terms=8;
System.out.println("Fibonacci series:");
for(int i=0;i<terms;i++){
System.out.println(Fibonacci(i) + " ");
}
}
}