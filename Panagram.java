class Panagram{
public static boolean checkPanagram(String s){
for(char ch='a';ch<='z';ch++){
boolean found=false;
for (int i=0;i<s.length();i++){
if(ch==Character.toLowerCase(s.charAt(i))){
found=true;
break;
}
}
if(found==false)
return false;
}
return true;
}
public static void main(String[] args){
String s="The quick brown for jumps over the lazy dog";
if(checkPanagram(s)==true)
System.out.println("true");
else
System.out.println("false");
}
}