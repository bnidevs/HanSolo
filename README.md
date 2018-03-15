# Team HanSolo
### Bill Ni
 

## Hypothesis

**Best case**: **QuickSort** picks the median as the split value "*c*" (see [**Background**](https://github.com/bnidevs/HanSolo#background)) always, and it will perform like **MergeSort**

**MergeSort**

Precondition: takes an array of integers *arr*

Function: if *arr* is 1 element, then return *arr*  
			else, make recursive call with 1st half and 2nd half  
				when recursive call finishes, **merge** the two received arrays

Postcondition: *arr* is sorted

**Merge**

Precondition: takes two sorted arrays of integers *arr1*, *arr2*

Function: if either array is empty, proceed by putting all elements in the other array into the returned array  
			else, compares 1st element of both arrays and places the smaller in the returned array first

Postcondition: returns a sorted array of integers *arr* that is the combination of *arr1* and *arr2*

Since **MergeSort** is linear-logarithmic time, **O(nlog(n))**, the best case of **QuickSort** will have the same runtime as **MergeSort**: **O(nlog(n))**

**Average case**: **QuickSort** picks a tertile/quartile as the split value "*c*" (see [**Background**](https://github.com/bnidevs/HanSolo#background)) most of the time, which will result in a runtime greater than the best case, but less than the worst case.

**Worst case**: **QuickSort** picks the largest/smallest element as the split value "*c*" (see [**Background**](https://github.com/bnidevs/HanSolo#background)) always, making it similar in operation to **SelectionSort**

**SelectionSort**

Precondition: takes one array of integers *arr*

Function: finds maximum of *arr*  
			removes found element from *arr* and places it into the front of a new array *rtrnArr*  
			repeat until *arr* is empty

Postcondition: *arr*/*rtrnArr* is sorted

Since **SelectionSort** is quadratic time, **O(n^2)**, the worst case of **QuickSort** will have the same runtime as **SelectionSort**: **O(n^2)**

## Background
**QuickSort** is a sorting method based on the function **partition**
 
**partition**
 
Precondition: takes an array of integers *arr* and three integer parameters *a*, *b*, *c*
 
Function: splits the range *a*, *b* of *arr* into an upper and lower portion  
			the upper portion consists of numbers > *arr*[*c*]  
			the lower portion consists of numbers < *arr*[*c*]
 
Postcondition: all indices < *c* have values < *arr*[*c*]  
				all indices > *c* have values > *arr*[*c*]
  
**QuickSort**

Precondition: takes an array of integers *arr*

Function: repeatedly partitions *arr* with different *c* values  
			after each partition, the recursive call only occurs on a half of *arr* (upper or lower portion)

Postcondition: *arr* is sorted
 
## Methodology
1. Surround QuickSort function **ONLY** with timing operation
2. Record/write to file time for randomly generated 50-element array
3. Repeat step **2** for 100, 150, 200,..., 10000-element arrays

## Results

[Excel sheet](https://github.com/bnidevs/HanSolo/blob/master/QuickSortTimeData.xlsx)

[CSV file](https://github.com/bnidevs/HanSolo/blob/master/rawData.csv)

![alt text][graph]

[graph]: https://raw.githubusercontent.com/bnidevs/HanSolo/master/avgTimeGraph.png
 
## Conclusions

Through my hypothesis, I anticipated some variation in the data, but expected that it would lean towards a linear-logarithmic time: **O(nlog(n))**. By the graph, however, I am unable to conclude whether it is leaning more towards a quadratic runtime, or a linear-logarithmic runtime. Either way, both were predicted in my hypothesis.