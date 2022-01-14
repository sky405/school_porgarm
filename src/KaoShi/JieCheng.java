package KaoShi;

/**
 * 阶层问题
 */
public class JieCheng {

    public int d(int i){

        if(i==0) return 1;
        return i * d(i - 1);
    }


    public static void main(String[] args) {
        int sum = new JieCheng().d(4);
        System.out.println(sum);
    }
}
