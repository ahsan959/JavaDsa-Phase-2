package Heapc1;


class Heap 
{
    int heap[];
    int size;
    int capacity;

    public Heap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1]; // Adding 1 because index 0 will not be used
    }

    public void heapify(int arr[], int size, int i) {
        int index = i;
        int leftIndex = 2 * i;
        int rightIndex = 2 * i + 1;

        int largest = index;
        if (leftIndex <= size && arr[leftIndex] > arr[largest]) {
            largest = leftIndex;
        }
        if (rightIndex <= size && arr[rightIndex] > arr[largest]) {
            largest = rightIndex;
        }
        if (largest != index) {
            swap(arr, index, largest);
            heapify(arr, size, largest);
        }
    }

    public void swap(int arr[], int parent, int child) {
        int temp = arr[parent];
        arr[parent] = arr[child];
        arr[child] = temp;
    }

    public void heapSort(int arr[]) 
    {
        int n = arr.length - 1;

        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i - 1, 0);
        }
    }
}
public class Heapify 
{
    int arr[] = { 4, 10, 3, 5, 1 };
    int n = arr.length;

    Heap heapObj = new Heap(n);
    heapObj.heapSort(arr);

    System.out.println("Sorted Array:");
    for (int value : arr) {
        System.out.print(value + " ");
    }
    
}
