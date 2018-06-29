//Determine the prime factors of a given positive integer (2).
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_36{
	def main(args:Array[String]){
		var n=315                                 
		var i=2                                   
		var num=scala.collection.mutable.Map[Int,Int]()
	                                                 
		while(n>1){
			var count=0
			while(n%i==0){
				n/=i
				count+=1
			}
			if(count!=0){
				num(i)=count
			}
			i+=1
		}
		print(num)
	}
}