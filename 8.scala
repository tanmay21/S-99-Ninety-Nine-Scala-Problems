//Eliminate consecutive duplicates of list elements.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_8{
	def main(args:Array[String]){
		var list=scala.collection.mutable.ListBuffer(5,7,3,3,3,3,5,5,9,9,8,7,7,7,1,1,1)
                                                  
                                                
		var i = 0                         
		var l = list.length-1            
		
		while(i<l){
			if(list(i)==list(i+1)){
				list.remove(i+1)
				i-=1
				l-=1
			}
			i+=1
		}
	}
}