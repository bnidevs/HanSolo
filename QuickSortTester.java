//Clyde "Thluffy" Sinclair
//APCS2 pd0
//HW18 -- QuickSort
//2018-03-13t
  
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 *
 * 2a. Worst pivot choice and associated runtime: 
 *
 * 2b. Best pivot choice and associated runtime:
 *
 * 3. Approach to handling duplicate values in array:
 *
 *****************************************************/

public class QuickSortTester
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o ) {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array 
  public static void printArr( int[] a ) {
    for ( int o : a )
	    System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d ) {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal ) {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }

  public static int partition(int[] arr, int a, int b){
    int pvtPos = b;
    int v = arr[pvtPos];

    swap(pvtPos, b, arr);
    int s = a;

    for(int i = a; i < b; i++){
      if(arr[i] <= v){
        swap(i, s, arr);
        s++;
      }
    }

    swap(s, b, arr);

    return s;
  }
  //--------------^  HELPER METHODS  ^--------------



  /*****************************************************
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   *****************************************************/
  public static void qsort( int[] d )
  { 
      helper(d, 0, d.length - 1);
  }

  public static void helper(int[] arr, int left, int right){
      if (left < right){
          int pvtPos = partition(arr,left,right);
          helper(arr, left, pvtPos - 1);
          helper(arr, pvtPos + 1, right);
      }
  }


  //main method for testing
  public static void main( String[] args )
  {
    for(int j = 50; j < 10001; j+=50){
      long time = 0;

      int[] arrMatey = new int[j];
      for( int i = 0; i < arrMatey.length; i++ )
      arrMatey[i] = (int)( 48 * Math.random() );

      shuffle(arrMatey);   
      //System.out.println("\narrMatey init'd " );

      time = System.nanoTime();
      qsort( arrMatey );
      time = System.nanoTime() - time;

      //System.out.println("time for " + j + "-element array:");
      System.out.println(time);
    }

  }//end main

}//end class QuickSort