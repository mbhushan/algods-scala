
/**
 * https://www.hackerrank.com/challenges/simple-array-sum
 */

object ArraySum {
  
  def main(args: Array[String]) {
    var x = readLine()
//    var n = io.Source.stdin.getLines().toString
//    var text = io.Source.stdin.getLines().toList
    var line = readLine()
    
    var total = 0
    var arr = line.split(" ").map(_.toInt)
    
    for (i <- arr) {
      //println(i)
      total += i
    }
    
    println("array sum: " + total)
  }
}