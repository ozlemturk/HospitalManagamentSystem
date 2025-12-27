# TASK 1 - REPORT

In this project , we use singly linked list to create a patient management system.
This system supports add, remove, find and print operations. 

## addPatient
In real life, when a new patient arrive at to the hospital, he/she will be added to the end of the list because this is similar to real life hospital registration.Therefore, addPatient method adding new patient to the end of the list.
To add a patient to the end of the list we are moving through the entire list until we find the last node. 
The worst case in this method, will be going through the end of the list for adding a new node, so the time complexity is O(n).


## removePatient
This method removes a patient by id. Firstly, we are looking if the list is empty or not.If the patient exists, then we check is the patient equals to head? If the answer yes then , we jump head to head.next, Else, we search the list to find the matching id and then deleting it. If patient doesn’t exist, we are doing nothing.Also, the worst case, remove the node who  end of the list. So we are searching all the nodes from this list. Therefore ,time complexity is O(n).


## findPatient
In this method, we search the list from the head to the null until we find the key(id).if we find the node then we are exit the list and return that data.
In the worst case, will be the finding the node in the end of the list. Therefore, we can search all the nodes for finding.So the time complexity will be O(n)



## LinkedList vs ArrayList
### ArrayList:
-	Fast access by the index (O(1))
-	Insertion/Deletion takes more time to execute
-	Resizable

### LinkedList:
-	Dynamic size
-	Insertion/Deletion is easier after finding the position
-	Searching takes more time because there is no direct access.

<img width="585" height="198" alt="Ekran Resmi 2025-12-27 21 16 32" src="https://github.com/user-attachments/assets/3cb9f9eb-7a6c-49c2-bbe4-39cdeb3ddef9" />




# TASK 2 - REPORT

## 1-	Why is a Queue suitable for managing treatment requests?

A Queue is suitable for managing treatment request because it uses FIFO principle. FIFO means, First in First Out. In hospital, patients are registered when they arrive at the hospital. The first patient, he/she is placed at the front of the queue and he/she is treated firstly before the other patients.
Also, last patient when is registered and already the other patients get in a queue before this patient. Our last patient will be rear of the queue and waits for others. This hospital structure, provides fairness, because no patient is treated before someone who comes earlier.Therefore, Queue is suitable for our problem because it is represents real-life hospital waiting system.


## 2-	What issues would occur if a Stack were used instead?

A stack uses LIFO, LIFO means Last in First Out. If a Stack were used in a hospital system, the last patient in a line, would be treated first.This is a problem for patients who arrived earlier because the would wait to much in a line.
This is unfair for hospital system.Also, it can create anger and confusion between patients.


## 3-	Comparing their time complexities?
### in Queue
-enqueue(adding node to the rear) ‘s time complexity is O(1)
-dequeue(deleting the node from the front) ‘s time complexity is O(1)

### in Stack
-push(Adding node from the beginning) ‘ s time complexity is O(1)
-pop(Deleting node from the beginning) ‘s time complexity is O(1)

Actually, their time complexities are similar but their behaviors are different. Queue is       
suitable for treatment management because the order is same as hospital but Stack is 
not suitable for this problem.




# TASK 3 - REPORT

## 1-	Why is a Stack suitable for managing discharge records?

Stack is suitable for managing discharge records because a Stack uses LIFO principle and LIFO mean, “Last In-First Out”. In hospital discharge process, the last discharge record must be shown at the top because generally in hopsital system checks the last process and it retrieves or changes for the last process. For example, if a patient has a lack of test or realiazing that patient discharged early, patient is recalled and checked the last operation for this person. Therefore, when we use stack, we can directly accessing with pop or peek methods.
Also, time complexity of Stack is O(1) for push,pop and peek method and this is show to us, adding / display / retrieve a new discharge record is very efficient.Therefore, we use a stack for this task.


## 2-	What would happen if you replaced it with a Queue? Discuss Big O Comparisons.

Queue uses FIFO principle and FIFO principle means “First In – First Out”. Using a Queue for the hospital discharge procedure in hospital system means that record of the first patient discharged appears at the top of system but for analyzing or fixing the discharge records we must use the look the last person on the queue and this process would be very inefficient.

## Time Complexity of Queue and Stack
### Stack : push(), pop(), peek() methods time complexities are O(1)
### Queue : enqueue(), dequeue() methods time complexities are O(1)

These two structure have same time complexities but their logic are very different. Stack is suitable for our problem. On the other hand, Queue is suitable for queues(like waiting in a line for triage) but Queue is not suitable for recording discharge process.


# TASK 4 - REPORT


## 1-	Explaining The Big O Complexity of Your Priority and Sorting Mechanisims

### -	Priority Mechanism
In our system, we use 2 queues(priority queue and normal queue).
The enqueue method, always adds a new node to the end of the list and this method has a time complexity and it is -> O(1)
The dequeue method, always removes the node from the beginning of the list and this method has a time complexity and it is -> O(1)

When a new patient come to the hospital and if the patient has a priority. The patient is added to the priority queue; otherwise, the patient is added to the normal queue.

Queue structure has a FIFO principle and patients with the same queue are processed in the order they arrive.This ensures that priority patients protect their own order.

This approaches will be perfect for small datasets because it will be very fast by enqueue and dequeue operations.



### -	Sorting Mechanism
In our system, we used Insertion Sort algorithm to sort the patients with their severity levels.
First, the linked list of patients is converted into an array. This process has a time complexity of O(n).
In insertion sort worst-case and average-case time complexities are -> O(n^2)
But the best -case time complexity is -> O(n) this is perfect for small data sets.Therefore, insertion sort is suitable for small datasets.

In our system, insertion sort is effective because the datasets are small.Therefore, we don’t need to use another algorithms beucause insertion sort does the same thing but if our system has a big data sets, the system should use another algorithm.
Also, insertion sort, sorts with patients with their severity levels but if we 






## 2-	How Would Using a Heap - Based Priority Queue Improve Performance?
If our system were used heap based with priortiy, adding a new patient to the system would be time complexity is -> O(logn) and removing the patient with the highest priortiy would also take -> O(logn) time.

### Advantages:
- Don’t need to divide queue by two.(in insertion sort we divide the queue for two separate queues.)
- The priority order would sort autimatically in heap.
- Would be fast in big data sets.

Current system, is efficient for small data sets.Using a heap based priority queue would improve performance for big data sets.

