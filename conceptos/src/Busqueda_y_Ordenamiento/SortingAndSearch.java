package Busqueda_y_Ordenamiento;

public class SortingAndSearch<T extends Comparable<T>> {

    public int linearSearch(T[] data, int min, int max, T target) {
        for (int index = min; index <= max; index++) {
            if (data[index].compareTo(target) == 0) {
                return index; 
            }
        }
        return -1; 
    }

    public boolean binarySearch(T[] data, int min, int max, T target) {
        if (min > max) return false;

        int midpoint = (min + max) / 2;
        if (data[midpoint].compareTo(target) == 0) return true;
        else if (data[midpoint].compareTo(target) > 0) return binarySearch(data, min, midpoint - 1, target);
        else return binarySearch(data, midpoint + 1, max, target);
    }

    public void selectionSort(T[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            int minIndex = index;
            for (int scan = index + 1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[minIndex]) < 0) {
                    minIndex = scan;
                }
            }
            T temp = data[minIndex];
            data[minIndex] = data[index];
            data[index] = temp;
        }
    }

    public void insertionSort(T[] data) {
        for (int index = 1; index < data.length; index++) {
            T key = data[index];
            int position = index;
            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }
            data[position] = key;
        }
    }

    public void bubbleSort(T[] data) {
        for (int position = data.length - 1; position > 0; position--) {
            for (int scan = 0; scan < position; scan++) {
                if (data[scan].compareTo(data[scan + 1]) > 0) {
                    T temp = data[scan];
                    data[scan] = data[scan + 1];
                    data[scan + 1] = temp;
                }
            }
        }
    }

    public void quickSort(T[] data, int min, int max) {
        if (min < max) {
            int partitionIndex = findPartition(data, min, max);
            quickSort(data, min, partitionIndex - 1);
            quickSort(data, partitionIndex + 1, max);
        }
    }

    private int findPartition(T[] data, int min, int max) {
        T pivot = data[min];
        int left = min + 1;
        int right = max;

        while (left <= right) {
            while (left <= right && data[left].compareTo(pivot) <= 0) {
                left++;
            }
            while (left <= right && data[right].compareTo(pivot) > 0) {
                right--;
            }
            if (left < right) {
                T temp = data[left];
                data[left] = data[right];
                data[right] = temp;
            }
        }
        data[min] = data[right];
        data[right] = pivot;

        return right;
    }

    public void mergeSort(T[] data, int min, int max) {
        if (min < max) {
            int pivot = (min + max) / 2;
            mergeSort(data, min, pivot);
            mergeSort(data, pivot + 1, max);
            merge(data, min, pivot, max);
        }
    }

    private void merge(T[] data, int min, int pivot, int max) {
        int leftSize = pivot - min + 1;
        int rightSize = max - pivot;

        @SuppressWarnings("unchecked")
        T[] left = (T[]) new Comparable[leftSize];
        @SuppressWarnings("unchecked")
        T[] right = (T[]) new Comparable[rightSize];

        System.arraycopy(data, min, left, 0, leftSize);
        System.arraycopy(data, pivot + 1, right, 0, rightSize);

        int i = 0, j = 0, k = min;
        while (i < leftSize && j < rightSize) {
            if (left[i].compareTo(right[j]) <= 0) {
                data[k++] = left[i++];
            } else {
                data[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            data[k++] = left[i++];
        }
        while (j < rightSize) {
            data[k++] = right[j++];
        }
    }
}
