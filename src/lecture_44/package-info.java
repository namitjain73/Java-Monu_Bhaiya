package lecture_44;
//Basically heap and priority are the same things
//Queue :- Fifo
//there is two types of priory that is
//like marks which is the best with high marks
//like rank less rank means it is the best

//A heap is a :-
//1.it is a complete binary tree
//complete binary tree :- if the tree has level is l and l-1 level are fully filled and the last level is filled complete left to right
//2.and associated some priority
//mark = max heap(larger value is max heap)
//rank = min heap(min value is min heap) 
//in heap parent ki priority > child ki 
//so in min heap the valuee of parent is less then both child
// in max heap the value of parent is greater then both child 
//#      sorted Array  UnsortedArray   Heap
//Add       O(n)          O(1)          log(n)
//minRemove O(n)          O(n)          log(n)
//getmin    O(1)          O(n)            O(1)

//left child index = 2* parentIndex + 1
//right child index = 2 * parentIndex + 2
//parent index = (left  childIndex - 1) / 2
//parent index = (right childIndex - 2) / 2
//ArrayList capacity in starting = 10
// upheapify is a process that rearrange the elements to  

//in min heap why the add element cost is log(n)
//because the high is h and the elements is 2^h so we go to till peak or parent 

//in priorityQueue heap is created min heap