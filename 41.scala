//A list of Goldbach compositions.
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_41{
	def main(args:Array[String]){
		def prime(n:Int):Boolean={
			for (i <- 2 to n-1){
				if(n%i==0) return false
			}
			true
		} 
		def goldbatch(n:Int):Unit={ 
			var i=2                       
			var key=true                      
			while(key){
				if(prime(i) && prime(n-i)){
					println(f"$n = $i + ${n-i}")
					key=false
				}
				i+=1
			}
		}
		val a = 9
		val b = 20

		for (i <- a to b){
			if(i%2==0)
				goldbatch(i)
		}

	}
}