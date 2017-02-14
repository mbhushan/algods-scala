
/**
 * https://www.hackerrank.com/challenges/solve-me-first
 */

object SolveMeFirst {
  
  def main(args: Array[String]) {
    
    for (line <- io.Source.stdin.getLines()) {
      if (line == null || line.isEmpty()) {
        return
      }
      val ans = line.split(" ").map(_.toInt).sum
      println(ans)
    }
  }
}