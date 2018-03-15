# Team HanSolo
### Bill Ni
 

## Hypothesis
**QuickSort** is linear-logarithmic time : **O(nlog(n))**

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
 
## Conclusions