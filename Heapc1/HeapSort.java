
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
    

