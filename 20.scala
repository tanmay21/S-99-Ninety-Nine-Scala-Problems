//Remove the Kth element from a list.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_20{
	def main(args:Array[String]){
		var list=scala.collection.mutable.ListBuffer(5,5,5,7,7,7,3,3,3,3)
                                                  //> list  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(5, 5, 5, 7, 7, 
                                                  //| 7, 3, 3, 3, 3)
	    val k=3                                     //> k  : Int = 3
	    val a=list(k)                               //> a  : Int = 7
	    list-=a                                     //> res0: scala.collection.mutable.ListBuffer[Int] = ListBuffer(5, 5, 5, 7, 7, 3
	                                                  //| , 3, 3, 3)
	    val t=(a,list)                              //> t  : (Int, scala.collection.mutable.ListBuffer[Int]) = (7,ListBuffer(5, 5, 5
	                                                  //| , 7, 7, 3, 3, 3, 3))
	    print(t)
	}
}