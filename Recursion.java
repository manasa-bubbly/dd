public class Recursion{
public static int SumNaturalNumbers(int n){
if(n==1){
return 1;
} else{
return n+SumNaturalNumbers(n-1);
}
}
public static void main(String[] args){
int number=19;
int result=SumNaturalNumbers(number);
System.out.println(result);
}
}
