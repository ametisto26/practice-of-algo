using System;
class Program{
  static string[] input = Console.ReadLine().Split(' ');
  static double N = double.Parse(input[0]);
  static double M = double.Parse(input[1]);

  static bool isLarger(double x){
    double result = (N + 1) * Math.Pow(x, 5) + Math.Pow(x, 4) + Math.Pow(x, 3) + Math.Pow(x, 2) + Math.Pow(x, 1) + 1;
    return result > M;
  }

  static void Main(string[] args){
    double left = 0;
    double right = 100000;
    double mid = (left + right) / 2;
    while (right - left > 0.01){
      if(isLarger(mid)){
        right = mid;
      }
      else{
        left = mid;
      }
      mid = (left + right) / 2;   
    }

    Console.WriteLine(mid);
  }
}