
/*
 https://www.hackerrank.com/challenges/compare-the-triplets
 */

object Triplets {
  
   def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt();
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();
        
        if (a0 != b0) {
            print("1 ")
        }
         if (a1 != b1) {
            print("1 ")
        }
         if (a2 != b2) {
            print("1")
        }
        
    }
}