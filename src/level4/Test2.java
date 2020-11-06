package level4;

import java.lang.reflect.Method;

public class Test2 {
    public static void main(String[] args){
        Class<?>c1=null;
     try{
         c1=Class.forName("level4.Test2");
     } catch (ClassNotFoundException e) {
         e.printStackTrace();
     }
     try{
         Method met=c1.getMethod("sayHello",String.class,int.class);
         String rv=null;
         rv=(String)met.invoke(c1.newInstance(),"廖杰",18);
         System.out.println(rv);
     }catch(Exception e){
         e.printStackTrace();
     }
    }

}
