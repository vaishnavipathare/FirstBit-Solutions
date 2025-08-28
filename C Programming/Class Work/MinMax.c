#include<stdio.h>
void minmax(int*, int);
void main(){
    int arr[5] = {1, 4, 5, 9, 3};
    
    minmax(arr, 5 );
    
}

void minmax(int* arr, int n){
    int min = arr[0];
    int max = arr[0];
    for(int i=0; i<n; i++){
        if(arr[i] < min){
            min = arr[i];
        }
        if(arr[i] > max ){
            max = arr[i];
            
        }
    }
    printf("\nMin array is %d", min);
    printf("\nmax array is %d", max);
    
}