package finalKeyword;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        final int[] arr = {10,29,44};
        arr[0] = 144;
        System.out.println(Arrays.toString(arr));

        Parent ch1 = new Child();
        ch1.fun1();
        ch1.fun2();
    }
}

