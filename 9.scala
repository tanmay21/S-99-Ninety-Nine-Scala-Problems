//Determine the greatest common divisor of two positive integer numbers.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_9{
	def main(args:Array[String]){
		var l = List(1,1,1,2,2,3,5,5,7,8)        
		var ans = List()                         
		var temp = List()                        
		for (i <- 0 to l.length-2){
			temp:+ i
			print(temp)
			if(l(i)!=l(i+1)){
				temp = List()
			}
		}
	}
}