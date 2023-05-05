package day1;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionInterface {

    public static void main(String[] args) {


        Supplier<String > returnTesttechno = () -> "Testtechno";

        System.out.println(returnTesttechno.get());

        System.out.println("-------------------");

        Supplier<int[]> returnIntArray = () -> {
            int[] array = new  int[5];
            for (int i = 0; i < array.length; i++) {
                array[i]= new Random().nextInt(2000);
            }
            return array;
        };

        int[] arr = returnIntArray.get();

        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------");


        Supplier<Double> returnDecimal = () ->{
            return new Random().nextDouble();
        };

        System.out.println(returnDecimal.get());
    }
}
