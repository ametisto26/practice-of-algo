object Main {
  import java.util._
  val sc = new Scanner(System.in)
  val N = sc.nextInt
  val M = sc.nextInt
  val arrOfDice = Array.fill(M)(sc.nextInt)

  val arr = new Array[Boolean](N+1)
  arr(0) = true

  def main(args: Array[String]): Unit = {
    for (loc <- 1 to N){
      for (i <- 0 to M-1){
        if ((loc - arrOfDice(i) >= 0)){
          arr(loc) = arr(loc) || arr(loc - arrOfDice(i))
        }
      }
    }
    println(if (arr(N)) "Yes" else "No")
  }
}
