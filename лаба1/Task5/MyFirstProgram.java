import myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] s) {
        MyFirstPackage test = new MyFirstPackage();
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                test.setA(i);
                test.setB(j);
                System.out.print(test.multiplication());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}