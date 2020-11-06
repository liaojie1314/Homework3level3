package level3;

/**
 * @author lenovo
 */
public class Zhangsan implements Salesclerk{

    public Zhangsan() {
    }

    public static void lisi() {
    }

    @Override
    public void sentExpress() {
        System.out.println("京东店铺已收到订单。");
        System.out.println("订单发送中...");
        try{
            Thread.sleep(3000);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        Express expressForLisi=new Express("电脑桌");
        System.out.println("李四的"+expressForLisi.name+"已到货");
        Consumer.getExpress();
        System.out.println("李四得到了"+expressForLisi.name);
    }
}
