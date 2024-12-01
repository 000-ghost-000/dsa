[DSA](https://www.youtube.com/watch?v=8hly31xKli0&list=WL&index=6)

### an algorithm is a set of steps or instruction need to complete a task

* linear search
	* this method is used to search the number (target) in a linear manner this takes the n iteration to complete 
	* n being the target
	* [linear_search.java](./linear_search.java)
	* o(n) time complexity
	* o(1) space complexity
* binary search
	* this method starts checking from mid of the array and checks if the target is greater than or less than the mid term if greater the algorithm rejects all the terms less than the mid term and assign a new mid term keeping the old mid term as the first term
	* [binary_search.java](./binary_search.java)
	* o(log n) time complexity
	* 
* time complexity
	* the amount of time an algorithm takes to complete a task
	* big o is the mathematical term that tell us about worst case scenario of the algorithm
	* ![[Pasted image 20241201205724.png]]
	* [big o](https://en.wikipedia.org/wiki/Big_O_notation)
* space complexity
	* the amount of memory the algorithm utilise while running 
* big o
	* it denotes the worst case scenario
	* $$o(1)$$
		* this complexity tells us that the snippet takes a constant amount of time to perform the operation
		* also known as constant
	* $$o(n)$$
		* this complexity tells us that the snippet takes n iterations to do the task 
	* $$o(log (n))$$
		* this complexity tells us that the snippet takes log n time to do a operation
		* also known as logarithmic 
	* $$o(n^2)$$
		* this complexity denotes that the code snippet takes $n^{2}$ time to complete the process
		* also known as quadratic 
	* $$o(n^3)$$
		* this complexity denotes that the code snippet takes $n^3$ time to complete the process
		* also known as cubic
	* $$o(n(log(n)))$$
		* also known as quasi-linear 
		* merge sort use this time complexity
	* polynomial runtime
		* this type of runtime is denoted by $o(n^a)$ where `a` is any number 
		* these runtime are better for use 
	* exponential runtime
		* these runtime are expensive to use cause the time complexity are too high when performing for big data
		* $o(x^n)$
		* $o(n!)$
			* also known as factorial runtime or combinatorial runtime
			* 