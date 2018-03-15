public class QuickSortTester{
	public static void main(String[] args){

		// random array

		for(int j = 50; j < 10001; j+=50){
		    long time = 0;

		    int[] arrMatey = new int[j];
		    for( int i = 0; i < arrMatey.length; i++ )
		    arrMatey[i] = (int)( 48 * Math.random() );

		    QuickSort.shuffle(arrMatey);   
		    //System.out.println("\narrMatey init'd " );

		    time = System.nanoTime();
		    QuickSort.qsort( arrMatey );
		    time = System.nanoTime() - time;

		    //System.out.println("time for " + j + "-element array:");
		    System.out.println(time);
  		}

  		// sorted array

  		for(int j = 50; j < 10001; j+=50){
		    long time = 0;

		    int[] arrMatey = new int[j];
		    for( int i = 0; i < arrMatey.length; i++ )
		    arrMatey[i] = i;

		    //System.out.println("\narrMatey init'd " );

		    time = System.nanoTime();
		    QuickSort.qsort( arrMatey );
		    time = System.nanoTime() - time;

		    //System.out.println("time for " + j + "-element array:");
		    System.out.println(time);
  		}

  		// reversed array

  		for(int j = 50; j < 10001; j+=50){
		    long time = 0;

		    int[] arrMatey = new int[j];
		    for( int i = 0; i < arrMatey.length; i++ )
		    arrMatey[i] = j - i;
		     
		    //System.out.println("\narrMatey init'd " );

		    time = System.nanoTime();
		    QuickSort.qsort( arrMatey );
		    time = System.nanoTime() - time;

		    //System.out.println("time for " + j + "-element array:");
		    System.out.println(time);
  		}
	}	
}