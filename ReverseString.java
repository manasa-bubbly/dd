public class Main{
public static String reverse(String str){
if(str.isEmpty()){
return str;
}
else{
return reverse(str.substring(1))+str.charAt(0);
}
}
public static void main(String[] args){
String s="manasa";
System.out.println("Reversed String:" + reverse(s));
}
}