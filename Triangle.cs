using System;
namespace InverseFloyd {
    class Program {
        static void Main(string[] args) {
            int i, f=1, j, l, k=Convert.ToInt32(Console.ReadLine());
            Console.Write("\nFloyd's Triangle: \n");
            for(i=1; i<=k; i++){
                for(j=1; j<=i; j++)
                  Console.Write(f++ + " ");
                Console.Write("\n");
            }
            Console.Write("\nReverse Floyd's Triangle: \n");
            l=k*(k+1)/2;
            for(i=1; i<=k; i++){
              for(j=1; j<=k-i+1; j++){
                 Console.Write(l-- + " ");}
              Console.Write("\n"); 
            } 
        } 
     } 
}
