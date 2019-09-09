// Created by Justine Ogaraku

public class Program
{
  static void bubbleSort(int[ ] lst){
    boolean swapped;
    int space = lst.length;
    //a do-while loop to prevent futher itration after the list is sorted.
    do{
      swapped=false;
      //BubbleSort😊
      for(int i=0;i<space-1;i++){
        if(lst[i+1]<lst[i]){
           int first=lst[i];
           lst[i]=lst[i+1];
           lst[i+1]=first;
           swapped = true;
          }
      }
    //   displays list after every sort
      System.out.print("==> ");
      for(int i=0; i<space;i++){
           System.out.print(lst[i]+" ");
      }
      System.out.print("\n");
    }while(swapped==true);
     
    //displays the fully bubbleSorted list.
    System.out.print("\nFinally: ");
   for(int each:lst){
       System.out.print(each+" ");
     }
    }
    public static void main(String[] args) {
        int[] nums ={3,4,1,6,0,2,8};
        bubbleSort(nums);
    }
}