package HeapClass1Rev;

class maxHeap {
    int arr[];
    int size;
    int capacity;

    public maxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public void Insert(int value) 
    {
        //Insert Element in last 
        arr[size] = value;
        size++;

    }
}

public class HeapInsertion {
    public static void main(String[] args) {

    }

}
