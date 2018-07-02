//Drop every Nth element from a list.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_16{
	def main(args:Array[String]){
		var list=scala.collection.mutable.ListBuffer(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
                                                
        val n=3                           
 		var j=2                          
 		
 		while(j<list.length){
 			list-=list(j)
 			j+=2
 		}
 		print(list)
	}
}