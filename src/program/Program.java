
package program;


public class Program {

    
  
    public static void main(String[] args) {
         System.out.println(getReverse(14678));
    
    }
        static public int getReverse(int value) {
        int resultNumber = 0;
        for (int i = value; i !=0; i /= 10) {
            resultNumber=resultNumber * 10 +  i % 10;
        }
        return resultNumber;        
    
    } 
}
