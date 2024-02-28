object Main { // すごろくの問題
  import java.util._
  val sc = new Scanner(System.in)
  val N = sc.nextInt
  val M = sc.nextInt
  val arrOfDice = Array.fill(M)(sc.nextInt)
  // var seq: new Seq[Int]

  val arr = new Array[Boolean](N+1)
  arr(0) = true

  def isContain(n: Int): Boolean = {
    var ans = false
    for (i <- arrOfDice){
      ans = ans || (n == i)
    }
    ans
  }

  def main(args: Array[String]): Unit = {
    for (loc <- 1 to N){
      for (i <- 0 to M-1){
        if ((loc - arrOfDice(i) >= 0)){
          arr(loc) = arr(loc) || arr(loc - arrOfDice(i))
        }
      }
    }
    if (arr(N)) println("Yes")
    else println("No")
  }
}
