package ex02;

public class Metodos {

    public int test01(int a) {
        return (a > 0) ? 1 : -1;
    }

    public int test03(int a) {
        if (a > 10 || a < -10)
            return 0;
        else
            return 1;
    }

    public int test02(int a) {
        switch (a) {
            case 1: return 1;
            case 2:
                return 2;
            default:
                return 0;
        }
    }
}
