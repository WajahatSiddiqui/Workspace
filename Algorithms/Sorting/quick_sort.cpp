#include<iostream>
using namespace std;

// Best case: O(nlogn)
// Avg. case: O(nlogn)
// Worst case: O(nlogn)
void quick_sort(int A[], int low, int high);
void merge(int A[], int low, int mid, int high);

int main() {
	int A[] = {5, 6, 8, 1, -1, 0, 11, 100, -5, 0, 1, 0, 6, 1, 2, 3, 5, 10000};
	int size = sizeof(A)/sizeof(int);
	cout<<"Size = "<<size<<endl;
	cout<<"Input Array: \n";
	for (int i = 0; i < size; i++) {
		cout<<A[i]<<" ";
	}
	quick_sort(A, 0, size-1);
	cout<<"\nQuick Sorted Array: \n";
	for (int i = 0; i < size; i++) {
		cout<<A[i]<<" ";
	}
	cout<<endl;
	return 0;
}

// low represents starting index
// high represents size-1, ending index
void quick_sort(int A[], int low, int high) {
    int pivot;
    if (low >= high) return;
    // Partition the array based on some pivot
    pivot = partition(A, low, high);
    // Decompose and sort recursively
    quick_sort(A, low, pivot);
    quick_sort(A, pivot+1, high);
}

int partition(int A[], int low, int high) {
    int pivot = A[0];
    // ToDo(wajahat) Re-arrange the elements based on pivot in array
}
