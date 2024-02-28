using System;
class Program{
  static string[] input = Console.ReadLine().Split(' ');
  static double N = double.Parse(input[0]);

  static bool isLarger(double x){
    double result = x * (x * (x + 1) + 2) + 3;
    return result > N;
  }

  static void Main(string[] args){
    double ans = 0;

    while (!isLarger(ans)){
      ans = ans + 0.01;   
    }

    Console.WriteLine(ans);
  }
}
