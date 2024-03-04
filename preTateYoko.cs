using System;
class Program{
  static string[] input = Console.ReadLine().Split(' ');
  static int H = int.Parse(input[0]);
  static int W = int.Parse(input[1]);
  static string[] l = new string[H];
  static string[,] mat = new string[H, W];
  static int p = 0;
  static int q = 0;

  static void Main(string[] args){
    for (int i = 0; i <= H; i++){
        if(i == H){
            string[] pos = Console.ReadLine().Split(' ');
            p = int.Parse(pos[0]);
            q = int.Parse(pos[1]);            
        }
        else {
            l[i] = Console.ReadLine();
        }
    }

    for (int i = 0; i < H; i++){
        for (int j = 0; j < W; j++){
            mat[i,j] = l[i][j].ToString();
        }
    }

    
    int result = 0;
    if(mat[p,q] == "#"){
        result = -1;
    }
    else{
        ;
    }

    for(int i = 0; i < H; i++){
        if(mat[i,q] == "#"){
            result += 1;
        }
        else {
            ;// 
        }
    }

    for(int j = 0; j < W; j++){
        if(mat[p,j] == "#"){
            result += 1;
        }
        else {
            ;// 
        }
    }


    Console.WriteLine(result);
  }
}