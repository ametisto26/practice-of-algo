import kotlin.math.*
fun main() {
  val (N, M) = readLine()!!.split(" ").map{it.toInt()}

  fun isLarger(x: Double): Boolean {
    var result = (N + 1) * x.pow(5) + x.pow(4) + x.pow(3) + x.pow(2) + x.pow(1) + 1
    return result > M
  }

  var left = 1.0
  var right = 100000.0
  var mid = (left + right) / 2  

  while(right - left > 0.01){        
    if(isLarger(mid)) right = mid
    else left = mid
    mid = (left + right) / 2    
  }

    println(mid)
}