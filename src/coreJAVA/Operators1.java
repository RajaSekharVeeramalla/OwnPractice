package coreJAVA;

public class Operators1 {
    public static void main(String[] args)
    {
        int a = 20, b = 10, c = 0;
 
        // a=b+++c is compiled as
        // b++ +c
        // a=b+c then b=b+1
        a = b++ + c;
        System.out.println("Value of a=(b+c), "
                           + " b=(b+1 as b++ oprator works), c = " + a + ", " + b
                           + ", " + c);
 
        // a=b+++++c is compiled as
        // b++ ++ +c
        // which gives error.
        // a=b+++++c;
        // System.out.println(b+++++c);
    }
}
