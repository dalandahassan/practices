using System;

namespace SoloLearn {
class Program {
    static int search(int[] arr, int x) {
        for (int k = 0; k < arr.Length; k++) {
            if (arr[k] == x)
                return k;
        }
        return -1;
        
    }
    static void Main(string[] args) {
        int[] arr =  {4, 2, 6, 42};
        int age = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine(search(arr, age));
    }
}
}