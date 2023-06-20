
import java.util.*;
class MinAndMAx{
    public static void main(String Args[]){
      Scanner sc=new Scanner(System.in);
      int max=-2147483648;
      int min=+2147483647;
      int sum=0;
      System.out.println("Total number of numbers");
      int numbers=sc.nextInt();
      System.out.println("numbers");
      for(int i=0;i<numbers;i++){
          int num=sc.nextInt();
          sum+=num;
          
          if(num>max){
              max=num;
          }
          if(num<min){
              min=num;
          }
      }
      System.out.println("output");
      System.out.println(max+"= MAX");
      System.out.println(min+"= MIN");
      System.out.println("sum="+sum);
    }
}

// output
Total number of numbers
3
numbers
1
2
3
output
3= MAX
1= MIN
sum=6