package Heapc1;

public class MaxHeap 
{
    int heap[];
    int size;
    int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1]; // Adding 1 because index 0 will not be used
    }

    public void swap(int parent, int child) {
        int temp = heap[parent];
        heap[parent] = heap[child];
        heap[child] = temp;
    }

    public void insert(int value) {
        // Step 1: Value ko last may add karo
        size++;
        int index = size;
        heap[index] = value;

        // Step 2: Is value ko sahi position par la jao
        while (index > 1) 
        {
            // Find parent
            int parentIndex = index / 2;

            if (heap[index] > heap[parentIndex]) {
                swap(parentIndex, index);
                // Shift index
                index = parentIndex;
            } else {
                break;
            }
        }
    }
    public void delete() 
    {
    	
    	heap[1] = heap[size];
    	
    	size--;
    	
    	//place root value to its Correct Position 
    	
    	int index = 1;
    	
    	if(index<size)
    	{
    		int left = 2*index;
    		int right=2*index+1;
    		
    		int largest = index;
    		
    		
    		//find the Largest Index
    		//agar Left Say ata Ha Largest ko Update 
    		//kar dia
    		if(left<size&&heap[largest]<heap[left])
    		{
    			largest = left;
    		}
    		//agar right Say ata Ha Largest ko Update 
    		//kar dia
    		if(right<size&&heap[largest]<heap[right])
    		{
    			largest = right;
    		}
    		//agar Currect Index Hi Largest Ha
    		if(largest==index)
    		{
    			//value is at Correct Position
    			return;
    		}
    		else {
    			swap(heap[index], heap[largest]);
    			index=largest;
    			
    		}
    		
    		
    		
    	}
    	
		
	}
    
    public void printHeap() 
    {
        for (int i = 1; i <= size; i++) 
        {
            System.out.print(heap[i] + " ");
        }
        
        System.out.println();
    }
}

public class HeapImplementation 
{
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(6);

        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(25);
        maxHeap.insert(15);

        System.out.println("Max element: " + maxHeap.heap[1]); // Printing the root of the heap
        System.out.println("Printing the Heap...");
        maxHeap.printHeap();
    }    
    
}
