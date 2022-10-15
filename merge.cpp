#include <iostream>
#include <bits/stdc++.h>

using namespace std;

void merge(int arr[],int low,int mid,int high){
    int size_arr1 = mid-low+1;
    int size_arr2 = high-mid;
    int arr1[size_arr1];
    int arr2[size_arr2];
    for(int i=0;i<size_arr1;i++){
        arr1[i]=arr[i+low];
    }
    for(int i=0;i<size_arr2;i++){
        arr2[i]=arr[i+mid+1];
    }
    
    int pointer1 = 0;
    int pointer2 = 0;
    int pointer = low;
    while(pointer1<size_arr1 && pointer2<size_arr2){
        if(arr1[pointer1]<arr2[pointer2]){
            arr[pointer]=arr1[pointer1];
            pointer1++;
        }
        if(arr2[pointer2]<arr1[pointer1]){
            arr[pointer]=arr2[pointer2];
            pointer2++;
        }
        pointer++;
    }

    while(pointer1<size_arr1){
        arr[pointer]=arr1[pointer1];
        pointer1++;
        pointer++;
    }

    while(pointer2<size_arr2){
        arr[pointer]=arr2[pointer2];
        pointer2++;
        pointer++;
    }
}

void print(int arr[],int size){
    for(int i=0;i<size;i++){
        cout << arr[i] << " ";
    }
    cout << endl;
}

void mergeSort(int arr[],int low,int high){

    if(low>=high){
        return;
    }
    int mid = (low+high)/2;
    mergeSort(arr,low,mid);
    mergeSort(arr,mid+1,high);
    merge(arr,low,mid,high);
}
int main(){
    int n;
    cout << "Enter the value of size of array" << endl;
    cin >> n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int low=0;
    int size=n;
    int high=size-1;
    print(arr,size);
    mergeSort(arr,low,high);
    print(arr,size);
    return 0;
}