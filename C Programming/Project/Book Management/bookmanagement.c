#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Book {
    int id;
    char name[50];
    char author[50];
    char category[30];
    float price;
    float rating;
};

struct Book *library;
int count = 0;
int maxBooks;

void addBook() {
    if(count >= maxBooks) {
        printf("Library full! Cannot add more books.\n");
        return;
    }

    printf("Enter Book ID: "); scanf("%d", &library[count].id);
    printf("Enter Book Name: "); scanf(" %[^\n]", library[count].name);
    printf("Enter Author Name: "); scanf(" %[^\n]", library[count].author);
    printf("Enter Category: "); scanf(" %[^\n]", library[count].category);
    printf("Enter Price: "); scanf("%f", &library[count].price);
    printf("Enter Rating: "); scanf("%f", &library[count].rating);

    count++;
    printf("Book added successfully!\n");
}

void displayAllBooks() {
    if(count == 0) {
        printf("No books in library.\n");
        return;
    }

    printf("\nAll Books in Library:\n");
    for(int i=0; i<count; i++) {
        printf("ID=%d, Name=%s, Author=%s, Category=%s, Price=%.2f, Rating=%.1f\n",
            library[i].id, library[i].name, library[i].author,
            library[i].category, library[i].price, library[i].rating);
    }
}

int main() {
    int choice;

    printf("Enter maximum number of books for library: ");
    scanf("%d", &maxBooks);

    library = (struct Book*) malloc(maxBooks * sizeof(struct Book));
    if(library == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    do {
        printf("\n===== Book Management System =====\n");
        printf("1. Add Book\n");
        printf("2. Display All Books\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1: addBook(); break;
            case 2: displayAllBooks(); break;
            case 0: printf("Exiting...\n"); break;
            default: printf("Invalid choice! Try again.\n");
        }
    } while(choice != 0);

    free(library);
    return 0;
}
