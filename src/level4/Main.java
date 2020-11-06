package level4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author lenovo
 */
public class Main {
     public Object getProperty(Object obj)throws IllegalAccessException {
         Field[] field = obj.getClass().getDeclaredFields();
         for (int i = 0; i < field.length; i++) {
             Field f = field[i];
             f.setAccessible(true);
             String key = f.getName();
             String name = field[i].getName();
             name = name.substring(0, 1).toUpperCase() + name.substring(1);
             String type = field[i].getGenericType().toString();
             Method method = null;
             try {
                 try {
                     if ("class java.lang.String".equals(type)) {
                         method = obj.getClass().getMethod("set" + name, String.class);
                         method.invoke(obj, "");
                     }
                     if ("class java.lang.Integer".equals(type)) {
                         method = obj.getClass().getMethod("set" + name, Integer.class);
                         method.invoke(obj, 1);
                     }
                     if ("int".equals(type)) {
                         method = obj.getClass().getMethod("set" + name, int.class);
                         method.invoke(obj, 2);
                     }
                 } catch (InvocationTargetException e) {
                     e.printStackTrace();
                 }
             } catch (NoSuchMethodException e) {
                 e.printStackTrace();
             }
         }
         return obj;
     }
}
