//Duplicate the elements of a list a given number of times.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_15{
	def main(args:Array[String]){
		var list=List(5,5,6,9,8,7)  
		val n=3      
		var ans=List[Int]()              
		for (i <- list){
			for (j <- 1 to n)
				ans:+=i
		}
		print(ans)
	}
}