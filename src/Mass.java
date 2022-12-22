import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;

import java.util.Scanner;

public class Mass   {
    int[] intArray;
    int n;
    static Scanner in;
    public static int[] intArray(int n){
        int arr[] = new int[n];
        for (int i=0; i<arr.length; i++){
        }
        return arr;
    }
    public Mass(int N)
    {
        n=N;
        intArray=new int[n];
    }
    public void readArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vvedite elementy: ");

        for (int i=0; i< intArray.length; i++)


        {
            System.out.println("intArray[] = " + i);
        }
    }
    public void printArray()
    {
        System.out.println("Vyvod elementov: ");
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println("intArray[] = "+i+intArray[i]);
        }
    }
}