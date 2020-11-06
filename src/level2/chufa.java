package level2;

/**
 * @author lenovo
 */
public class chufa implements IComputer{
    @Override
    public double computer(double a, double b) {
        if(b==0){
            return -1;
        }else{
            return a/b;
        }
    }
}
