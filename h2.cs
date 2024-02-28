using System;
class Program{
  static string[] input = Console.ReadLine().Split(' ');
  static double N = double.Parse(input[0]);

  static bool isLarger(double x){
    double result = x * (x * (x + 1) + 2) + 3;
    return result > N;
  }

  static void Main(string[] args){
    double left = 0;
    double right = 100;
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
