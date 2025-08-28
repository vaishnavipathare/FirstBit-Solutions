#include<stdio.h>
int SearchN(int*, int, int);
void main(){
    int arr[5];
    int ele;
    printf("Enter the array elements");
    for(int i=0;i<5;i++)
    {
    scanf("%d", &arr[i]);
    }
    printf("Enter the element you want to search");
    scanf("%d", &ele);

    int result;
    result = SearchN(arr, ele, 5);
    if(result==-1){
        printf("Element not found");
    }
    else{
        printf("Element found at index %d", result);
    }
}
int SearchN(int* ptr, int ele, int n){
    for(int i=0; i<n; i++){
        if(ptr[i] == ele){
            return i;
        }
    }
    return -1;
}

