//Insert an element at a given position into a list.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_21{
	def main(args:Array[String]){
		var list=List(1,2,3,4,5,6)        //> list  : List[Int] = List(1, 2, 3, 4, 5, 6)
      	val k=3                                     //> k  : Int = 3
     	val value=5                                 //> value  : Int = 5
      	var ans=list.slice(0,k)                     //> ans  : List[Int] = List(1, 2, 3)
      	ans:+=value
     	ans=ans:::list.slice(k,list.length)
      	print(ans)
	}
}