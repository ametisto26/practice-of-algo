object Main {
  import java.util._
  val sc = new Scanner(System.in)
  val n = sc.nextInt
  val arr0 = Array.fill(n)(sc.nextInt)

//   val arr = new Array[Int](n)
  val mat = Array.ofDim[Int](n, n)
  for (i <- 0 to n - 1){
    mat(0)(i) = arr0(i)
  }

  def main(args: Array[String]): Unit = {
    for (i1 <- 1 to n - 1){
        for (i2 <- 0 to n - 1){
            if (i2 == 0){
                mat(i1)(i2) = (mat(i1 - 1)(0) + mat(i1 - 1)(1)) % 100
            }
            else if (i2 == n - 1){
                mat(i1)(i2) = (mat(i1 - 1)(n - 2) + mat(i1 - 1)(n - 1)) % 100
            }
            else {
                mat(i1)(i2) = (mat(i1 - 1)(i2 - 1) + mat(i1 - 1)(i2) + mat(i1 - 1)(i2 + 1)) % 100
            }
        }
    }
    println(mat(n - 1)(n - 1))
  }
//   def aux(args: Array[Any]): Unit = {
//     for (j <- 1 to n - 1){ // n >= 2
//       for (i <- 0 to n - 1){
//         if (i == 0){
//           arr(i) = (arr0(i) + arr0(i + 1)) % 100
//         }
//         else if (i == n - 1){
//           arr(i) = (arr0(i - 1) + arr0(i)) % 100
//         }
//         else {
//           arr(i) = (arr0(i - 1) + arr0(i) + arr0(i + 1)) % 100
//         }
//         arr0(i) = arr(i)
//       }
//     }
//     println(arr(n - 1))
//   }
}
