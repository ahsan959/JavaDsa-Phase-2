package HeapClass1Rev;

import Heapc1.MaxHeap;

class maxHeap {
    int arr[];
    int size;
    int capacity;

    public maxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public void swap(int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void Insert(int value) 
    {
        //Insert Element in last 
        int index = size;
        arr[size] = value;
        size++;

        //place it to the Correct position 

        while(index>1)
        {
            //find parentIndex
            int parentIndex = (index - 1)/2;

            if(arr[index]>arr[parentIndex])
            {
                swap(arr[index],arr[parentIndex]);
                index=parentIndex;
            }
            else {
                break;
            }
        }
      }

      public void printHeap(int arr[])
      {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }
      }
}

public class HeapInsertion 
{
    public static void main(String[] args) 
    {
        MaxHeap mx = new MaxHeap(10);

        mx.insert(1);
        mx.insert(45);
        mx.insert(4);

        mx.printHeap();



    }

}
