//Calculate Euler's totient function phi(m) (improved).
import scala.io.StdIn
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object test_37{
	def main(args:Array[String]){
		var n=10                                 
		var i=2                                   
		var num=scala.collection.mutable.Map[Double,Double]()
	                                                 
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
		def totient(n:Double,m:Double):Double={
			(n-1)*pow(n,m-1)
		}
		var ans:Double=1
		for ((k,v) <- num){
			ans*=totient(k,v)
		}
		print(ans)
	}
}