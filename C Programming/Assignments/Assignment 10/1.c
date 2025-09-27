#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Function prototypes
char* mystrcpy(char* dest, const char* src);
size_t mystrlen(const char* str);
int mystrcmp(const char* str1, const char* str2);
char* mystrcat(char* dest, const char* src);
char* mystrncpy(char* dest, const char* src, size_t n);
char* mystrupper(char* str);
char* mystrlower(char* str);
char* mystrrev(char* str);
char* mystrstr(const char* haystack, const char* needle);
int mystrcasecmp(const char* str1, const char* str2);
char* mystrchr(const char* str, int c);
char* mystrrchr(const char* str, int c);
int mystrncmp(const char* str1, const char* str2, size_t n);
char* mystrnstr(const char* haystack, const char* needle, size_t n);
char* mystrncat(char* dest, const char* src, size_t n);
int mystrncasecmp(const char* str1, const char* str2, size_t n);

int main() {
    printf("=== User Defined String Functions Demonstration ===\n\n");
    
    // Test strings
    char str1[100] = "Hello";
    char str2[100] = "World";
    char str3[100] = "Programming";
    char str4[100] = "C Language";
    char str5[100] = "Test String";
    char str6[100] = "hello world";
    char str7[100] = "HELLO WORLD";
    char str8[100] = "This is a test";
    char str9[100] = "Hello World";
    char str10[100] = "Programming";
    char result[200];
    
    // a. mystrcpy - Copy string
    printf("a. mystrcpy(): Copying '%s' to result\n", str1);
    mystrcpy(result, str1);
    printf("   Result: '%s'\n\n", result);
    
    // b. mystrlen - Get string length
    printf("b. mystrlen(): Length of '%s' = %zu\n\n", str1, mystrlen(str1));
    
    // c. mystrcmp - Compare strings
    printf("c. mystrcmp(): Comparing '%s' and '%s' = %d\n", str1, str2, mystrcmp(str1, str2));
    printf("   Comparing '%s' and '%s' = %d\n\n", str1, str1, mystrcmp(str1, str1));
    
    // d. mystrcat - Concatenate strings
    printf("d. mystrcat(): Concatenating '%s' and '%s'\n", str1, str2);
    mystrcpy(result, str1);
    mystrcat(result, str2);
    printf("   Result: '%s'\n\n", result);
    
    // e. mystrncpy - Copy n characters
    printf("e. mystrncpy(): Copying first 5 chars of '%s'\n", str3);
    mystrncpy(result, str3, 5);
    result[5] = '\0';
    printf("   Result: '%s'\n\n", result);
    
    // f. mystrupper - Convert to uppercase
    printf("f. mystrupper(): Converting '%s' to uppercase\n", str6);
    mystrupper(str6);
    printf("   Result: '%s'\n\n", str6);
    
    // g. mystrlower - Convert to lowercase
    printf("g. mystrlower(): Converting '%s' to lowercase\n", str7);
    mystrlower(str7);
    printf("   Result: '%s'\n\n", str7);
    
    // h. mystrrev - Reverse string
    printf("h. mystrrev(): Reversing '%s'\n", str5);
    mystrrev(str5);
    printf("   Result: '%s'\n\n", str5);
    
    // i. mystrstr - Find substring
    printf("i. mystrstr(): Finding 'test' in '%s'\n", str8);
    char* found = mystrstr(str8, "test");
    if (found) {
        printf("   Found at position: %ld\n\n", found - str8);
    } else {
        printf("   Not found\n\n");
    }
    
    // j. mystrcasecmp - Case-insensitive comparison
    printf("j. mystrcasecmp(): Case-insensitive comparison of '%s' and '%s' = %d\n", 
           "Hello", "hello", mystrcasecmp("Hello", "hello"));
    printf("   Case-insensitive comparison of '%s' and '%s' = %d\n\n", 
           "Hello", "World", mystrcasecmp("Hello", "World"));
    
    // k. mystrchr - Find first occurrence of character
    printf("k. mystrchr(): Finding 'l' in '%s'\n", str9);
    char* chr = mystrchr(str9, 'l');
    if (chr) {
        printf("   Found at position: %ld\n\n", chr - str9);
    } else {
        printf("   Not found\n\n");
    }
    
    // l. mystrrchr - Find last occurrence of character
    printf("l. mystrrchr(): Finding last 'l' in '%s'\n", str9);
    char* rchr = mystrrchr(str9, 'l');
    if (rchr) {
        printf("   Found at position: %ld\n\n", rchr - str9);
    } else {
        printf("   Not found\n\n");
    }
    
    // m. mystrncmp - Compare n characters
    printf("m. mystrncmp(): Comparing first 3 chars of '%s' and '%s' = %d\n", 
           "Hello", "Help", mystrncmp("Hello", "Help", 3));
    printf("   Comparing first 3 chars of '%s' and '%s' = %d\n\n", 
           "Hello", "Hello", mystrncmp("Hello", "Hello", 3));
    
    // n. mystrnstr - Find substring with length limit
    printf("n. mystrnstr(): Finding 'test' in first 10 chars of '%s'\n", str8);
    char* nfound = mystrnstr(str8, "test", 10);
    if (nfound) {
        printf("   Found at position: %ld\n\n", nfound - str8);
    } else {
        printf("   Not found in first 10 characters\n\n");
    }
    
    // o. mystrncat - Concatenate n characters
    printf("o. mystrncat(): Concatenating first 3 chars of '%s' to '%s'\n", str2, str1);
    mystrcpy(result, str1);
    mystrncat(result, str2, 3);
    printf("   Result: '%s'\n\n", result);
    
    // p. mystrncasecmp - Case-insensitive comparison of n characters
    printf("p. mystrncasecmp(): Case-insensitive comparison of first 3 chars of '%s' and '%s' = %d\n", 
           "Hello", "help", mystrncasecmp("Hello", "help", 3));
    printf("   Case-insensitive comparison of first 3 chars of '%s' and '%s' = %d\n\n", 
           "Hello", "Hello", mystrncasecmp("Hello", "Hello", 3));
    
    printf("=== All 16 user-defined string functions demonstrated successfully! ===\n");
    
    return 0;
}

// a. mystrcpy - Copy string
char* mystrcpy(char* dest, const char* src) {
    char* original_dest = dest;
    while ((*dest++ = *src++));
    return original_dest;
}

// b. mystrlen - Get string length
size_t mystrlen(const char* str) {
    size_t len = 0;
    while (str[len] != '\0') {
        len++;
    }
    return len;
}

// c. mystrcmp - Compare strings
int mystrcmp(const char* str1, const char* str2) {
    while (*str1 && (*str1 == *str2)) {
        str1++;
        str2++;
    }
    return *(unsigned char*)str1 - *(unsigned char*)str2;
}

// d. mystrcat - Concatenate strings
char* mystrcat(char* dest, const char* src) {
    char* original_dest = dest;
    while (*dest) {
        dest++;
    }
    while ((*dest++ = *src++));
    return original_dest;
}

// e. mystrncpy - Copy n characters
char* mystrncpy(char* dest, const char* src, size_t n) {
    char* original_dest = dest;
    size_t i;
    for (i = 0; i < n && src[i] != '\0'; i++) {
        dest[i] = src[i];
    }
    for (; i < n; i++) {
        dest[i] = '\0';
    }
    return original_dest;
}

// f. mystrupper - Convert to uppercase
char* mystrupper(char* str) {
    char* original_str = str;
    while (*str) {
        if (*str >= 'a' && *str <= 'z') {
            *str = *str - 'a' + 'A';
        }
        str++;
    }
    return original_str;
}

// g. mystrlower - Convert to lowercase
char* mystrlower(char* str) {
    char* original_str = str;
    while (*str) {
        if (*str >= 'A' && *str <= 'Z') {
            *str = *str - 'A' + 'a';
        }
        str++;
    }
    return original_str;
}

// h. mystrrev - Reverse string
char* mystrrev(char* str) {
    char* original_str = str;
    size_t len = mystrlen(str);
    for (size_t i = 0; i < len / 2; i++) {
        char temp = str[i];
        str[i] = str[len - 1 - i];
        str[len - 1 - i] = temp;
    }
    return original_str;
}

// i. mystrstr - Find substring
char* mystrstr(const char* haystack, const char* needle) {
    if (*needle == '\0') {
        return (char*)haystack;
    }
    
    for (; *haystack; haystack++) {
        const char* h = haystack;
        const char* n = needle;
        while (*h && *n && (*h == *n)) {
            h++;
            n++;
        }
        if (*n == '\0') {
            return (char*)haystack;
        }
    }
    return NULL;
}

// j. mystrcasecmp - Case-insensitive comparison
int mystrcasecmp(const char* str1, const char* str2) {
    while (*str1 && *str2) {
        char c1 = (*str1 >= 'A' && *str1 <= 'Z') ? *str1 + 'a' - 'A' : *str1;
        char c2 = (*str2 >= 'A' && *str2 <= 'Z') ? *str2 + 'a' - 'A' : *str2;
        
        if (c1 != c2) {
            return c1 - c2;
        }
        str1++;
        str2++;
    }
    return *str1 - *str2;
}

// k. mystrchr - Find first occurrence of character
char* mystrchr(const char* str, int c) {
    while (*str) {
        if (*str == c) {
            return (char*)str;
        }
        str++;
    }
    if (c == '\0') {
        return (char*)str;
    }
    return NULL;
}

// l. mystrrchr - Find last occurrence of character
char* mystrrchr(const char* str, int c) {
    char* last = NULL;
    while (*str) {
        if (*str == c) {
            last = (char*)str;
        }
        str++;
    }
    if (c == '\0') {
        return (char*)str;
    }
    return last;
}

// m. mystrncmp - Compare n characters
int mystrncmp(const char* str1, const char* str2, size_t n) {
    for (size_t i = 0; i < n; i++) {
        if (str1[i] != str2[i]) {
            return str1[i] - str2[i];
        }
        if (str1[i] == '\0') {
            return 0;
        }
    }
    return 0;
}

// n. mystrnstr - Find substring with length limit
char* mystrnstr(const char* haystack, const char* needle, size_t n) {
    if (*needle == '\0') {
        return (char*)haystack;
    }
    
    size_t needle_len = mystrlen(needle);
    if (needle_len > n) {
        return NULL;
    }
    
    for (size_t i = 0; i <= n - needle_len; i++) {
        size_t j;
        for (j = 0; j < needle_len; j++) {
            if (haystack[i + j] != needle[j]) {
                break;
            }
        }
        if (j == needle_len) {
            return (char*)(haystack + i);
        }
    }
    return NULL;
}

// o. mystrncat - Concatenate n characters
char* mystrncat(char* dest, const char* src, size_t n) {
    char* original_dest = dest;
    while (*dest) {
        dest++;
    }
    size_t i;
    for (i = 0; i < n && src[i] != '\0'; i++) {
        *dest++ = src[i];
    }
    *dest = '\0';
    return original_dest;
}

// p. mystrncasecmp - Case-insensitive comparison of n characters
int mystrncasecmp(const char* str1, const char* str2, size_t n) {
    for (size_t i = 0; i < n; i++) {
        char c1 = (str1[i] >= 'A' && str1[i] <= 'Z') ? str1[i] + 'a' - 'A' : str1[i];
        char c2 = (str2[i] >= 'A' && str2[i] <= 'Z') ? str2[i] + 'a' - 'A' : str2[i];
        
        if (c1 != c2) {
            return c1 - c2;
        }
        if (str1[i] == '\0') {
            return 0;
        }
    }
    return 0;
}
