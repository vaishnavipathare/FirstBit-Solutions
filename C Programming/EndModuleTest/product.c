#include <stdio.h>
#include <string.h>
typedef struct {
    int id;
    char name[50];
    float price;
    float discount;   
} Product;

void takeDetails(Product *p) {
    printf("Enter Product ID: ");
    scanf("%d", &p->id);

    printf("Enter Product Name: ");
    scanf("%s", p->name);

    printf("Enter Product Price: ");
    scanf("%f", &p->price);
}
float calculateFinalPrice(Product *p) {
    if (p->price > 500) {
        p->discount = 0.20 * p->price;
    } else {
        p->discount = 0.05 * p->price; 
    }
    return p->price - p->discount;
}

void displayDetails(Product *p) {
    float finalPrice = calculateFinalPrice(p);

    printf("\n--- Product Details ---\n");
    printf("ID : %d\n", p->id);
    printf("Name : %s\n", p->name);
    printf("Price : %.2f\n", p->price);
    printf("Discount : %.2f\n", p->discount);
    printf("Final Price after discount: %.2f\n", finalPrice);
}

int main() {
    Product p;

    takeDetails(&p);
    displayDetails(&p);

    return 0;
}
