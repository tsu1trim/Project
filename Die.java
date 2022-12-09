import java.util.Random;
public class Die {
    private int numsides;
    private int value;

    public Die(){
        numsides = 0;
        value=0;
    }
    public Die(int sides){
        numsides = sides; 

    }
    public int roll(){
    
    Random r = new Random();
    value = r.nextInt(numsides)+1;

    return value;  // just to be available for even 4 sided die- instead of settingupper bound to 6
    }
}
