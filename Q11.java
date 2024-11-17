

class Num{
    int n1;
    public Num(int n1){
        this.n1= n1;
    }
    public void showNum(){
        System.out.println(" Number in decimal :"+n1);
    }
}
class HexNum extends Num {
    public HexNum(int n1){
        super(n1);
    }

    @Override
    public void showNum(){
        System.out.println(" Number in hexdecimal :"+Integer.toHexString(n1));
        System.out.println(" Number in Octal :"+Integer.toOctalString(n1));
    }
}
public class Q11 {
    public static void main(String[] args) {
        Num num = new Num(101);
        num.showNum();
        HexNum h1 = new HexNum(101);
        h1.showNum();
        
    }
    
}
