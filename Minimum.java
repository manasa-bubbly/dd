class Minimum{
public static int minDelRecur(int i,int j,String s){
if(i>=j) return 0;
if(s.charAt(i)==s.charAt(j)){
return minDelRecur(i+1,j-1,s);
}
return 1+ Math.min(minDelRecur(i+1,j,s),minDelRecur(i,j-1,s));
}
public static int minDeletions(String s){
int n=s.length();
return minDelRecur(0,n-1,s);
}
public static void main(String[] args){
String s="aebcbda";
System.out.println(minDeletions(s));
}
}