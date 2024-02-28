using System;
class Program{
  static string[] input = Console.ReadLine().Split(' ');
  static double N = double.Parse(input[0]);

  static double f(double x){
    double result = x * (x * (x + 1) + 2) + 3 - N;
    return result;
  }

  static double fp(double x){
    return  3 * x * x  + 2 * x + 2;
  }

  static void Main(string[] args){
    double ans = 0;
    double next = ans - f(ans) / fp(ans);

    while (next - ans >= 0.01 || ans - next >= 0.01){
      ans = next;
      next = ans - f(ans) / fp(ans);
    }

    Console.WriteLine(ans);
  }
}
