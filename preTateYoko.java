import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static int H = sc.nextInt();
    static int W = sc.nextInt();
    static String[] arr = new String[H];
    static char[][] mat = new char[H][W];

  public static void main(String[] args){
    for(int i = 0; i < H; i++){
        arr[i] = sc.next();
    }

    for(int i = 0; i < H; i++){
        for(int j = 0; j < W; j++){
            mat[i][j] = arr[i].charAt(j);
        }
    }
    final int p = sc.nextInt();
    final int q = sc.nextInt();

    int result = 0;
    if(mat[p][q] == '#'){
        result = -1;
    }
    else {
        // result = 0;
    }
    

    for(int i = 0; i < H; i++){
        if(mat[i][q] == '#'){
            result += 1;
        }
        else {
            // 
        }
    }

    for(int j = 0; j < W; j++){
        if(mat[p][j] == '#'){
            result += 1;
        }
        else {
            // 
        }
    }

    System.out.println(result);

  }
}