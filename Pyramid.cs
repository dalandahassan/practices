using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SoloLearn
{
  class Program
  {
    static void DrawPyramid(int n)
    {
      for (int i=1; i<=n; i++)//draw a space five times, after the space the asterisk is show
      {
        for (int j=i; j<=n; j++)//
        {
          Console.Write("  ");
        }
        for (int k=1; k<=2*i-1; k++)//this is loop for pyramid
        {
          Console.Write("*"+" ");
        }
        Console.WriteLine();
      }
    }
    static void Main(string[] args)
    {
      DrawPyramid(5);
    }
  }
}