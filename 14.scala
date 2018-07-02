//Duplicate the elements of a list.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_14{
	def main(args:Array[String]){
		var list=List(5,5,6,9,8,7)  
		val n=3      
		var ans=List[Int]()              
		for (i <- list){
			ans:+=i
			ans:+=i
		}
		print(ans)
	}
}