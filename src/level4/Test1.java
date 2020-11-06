package level4;

import java.lang.reflect.Method;

/**
 * @author lenovo
 */
public class Test1 {
    public static void main(String[] args){
        Class<?>c1=null;
        Object obj=null;
        try{
            c1=Class.forName("level4.Test1");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            assert c1 != null;
            obj=c1.newInstance();
        }catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        setter(obj,"String","123",String.class);
        setter(obj,"int",123,int.class);
        System.out.println("浮点型：");
        getter(obj,"String");

        System.out.println("整型：");
        getter(obj,"int");
    }
    private static void setter(Object obj, String att, Object value, Class<?> type) {
        try{
            Method met=obj.getClass().
getMethod("set"+initStr(att),type);
            met.invoke(obj,value);
        }catch(Exception e){
            e.printStackTrace();
        }
    }



    private static void getter(Object obj, String att) {
        try{
            Method met=obj.getClass().
           getMethod("get"+initStr(att));
            System.out.println(met.invoke(obj));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private static String initStr(String old) {

        return old.substring(0,1).toUpperCase()+old.substring(1);
    }

}

