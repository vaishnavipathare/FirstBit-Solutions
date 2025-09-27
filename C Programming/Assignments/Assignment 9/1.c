#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <stdlib.h>

int main() {
    printf("=== String Built-in Functions Demonstration ===\n\n");
    
    // Initialize strings for demonstration
    char str1[100] = "Hello World";
    char str2[100] = "Programming";
    char str3[100] = "C Language";
    char str4[100] = "   spaces   ";
    char str5[100] = "12345";
    char str6[100] = "HELLO";
    char str7[100] = "hello";
    char str8[100] = "test";
    char str9[100] = "This is a test string";
    char str10[100] = "apple,banana,cherry";
    char str11[100] = "Hello World!";
    char str12[100] = "123.45";
    char str13[100] = "   trim   ";
    char str14[100] = "Hello";
    char str15[100] = "World";
    char str16[100] = "Hello World";
    char str17[100] = "Programming";
    char str18[100] = "Hello World";
    char str19[100] = "Hello World";
    char str20[100] = "Hello World";
    char str21[100] = "Hello World";
    
    // 1. strlen() - Get string length
    printf("1. strlen(): Length of '%s' = %lu\n", str1, strlen(str1));
    
    // 2. strcpy() - Copy string
    char copy[100];
    strcpy(copy, str2);
    printf("2. strcpy(): Copied '%s' to copy = '%s'\n", str2, copy);
    
    // 3. strncpy() - Copy n characters
    char ncopy[100];
    strncpy(ncopy, str3, 5);
    ncopy[5] = '\0';
    printf("3. strncpy(): First 5 chars of '%s' = '%s'\n", str3, ncopy);
    
    // 4. strcat() - Concatenate strings
    char concat[200] = "Hello ";
    strcat(concat, str2);
    printf("4. strcat(): Concatenated = '%s'\n", concat);
    
    // 5. strncat() - Concatenate n characters
    char nconcat[200] = "Hello ";
    strncat(nconcat, str3, 3);
    printf("5. strncat(): Concatenated first 3 chars = '%s'\n", nconcat);
    
    // 6. strcmp() - Compare strings
    int cmp = strcmp(str6, str7);
    printf("6. strcmp(): Comparing '%s' and '%s' = %d\n", str6, str7, cmp);
    
    // 7. strncmp() - Compare n characters
    int ncmp = strncmp(str6, str7, 3);
    printf("7. strncmp(): First 3 chars comparison = %d\n", ncmp);
    
    // 8. strchr() - Find first occurrence of character
    char *found = strchr(str1, 'o');
    if (found) {
        printf("8. strchr(): Found 'o' in '%s' at position %ld\n", str1, found - str1);
    }
    
    // 9. strrchr() - Find last occurrence of character
    char *last = strrchr(str1, 'l');
    if (last) {
        printf("9. strrchr(): Last 'l' in '%s' at position %ld\n", str1, last - str1);
    }
    
    // 10. strstr() - Find substring
    char *sub = strstr(str9, "test");
    if (sub) {
        printf("10. strstr(): Found 'test' in '%s' at position %ld\n", str9, sub - str9);
    }
    
    // 11. strtok() - Tokenize string
    printf("11. strtok(): Tokenizing '%s':\n", str10);
    char *token = strtok(str10, ",");
    int token_count = 1;
    while (token != NULL) {
        printf("    Token %d: %s\n", token_count++, token);
        token = strtok(NULL, ",");
    }
    
    // 12. strspn() - Length of initial segment
    size_t span = strspn(str5, "1234567890");
    printf("12. strspn(): Digits in '%s' = %zu\n", str5, span);
    
    // 13. strcspn() - Length of initial segment not in set
    size_t cspan = strcspn(str1, " ");
    printf("13. strcspn(): Characters before space in '%s' = %zu\n", str1, cspan);
    
    // 14. strpbrk() - Find first character from set
    char *pbrk = strpbrk(str1, "aeiou");
    if (pbrk) {
        printf("14. strpbrk(): First vowel in '%s' = '%c'\n", str1, *pbrk);
    }
    
    // 15. strrev() - Reverse string (custom implementation)
    char rev[100];
    strcpy(rev, str8);
    int len = strlen(rev);
    for (int i = 0; i < len / 2; i++) {
        char temp = rev[i];
        rev[i] = rev[len - 1 - i];
        rev[len - 1 - i] = temp;
    }
    printf("15. strrev(): Reversed '%s' = '%s'\n", str8, rev);
    
    // 16. toupper() - Convert to uppercase
    char upper[100];
    strcpy(upper, str7);
    for (int i = 0; upper[i]; i++) {
        upper[i] = toupper(upper[i]);
    }
    printf("16. toupper(): '%s' -> '%s'\n", str7, upper);
    
    // 17. tolower() - Convert to lowercase
    char lower[100];
    strcpy(lower, str6);
    for (int i = 0; lower[i]; i++) {
        lower[i] = tolower(lower[i]);
    }
    printf("17. tolower(): '%s' -> '%s'\n", str6, lower);
    
    // 18. isalpha() - Check if character is alphabetic
    printf("18. isalpha(): Checking characters in '%s':\n", str1);
    for (int i = 0; str1[i]; i++) {
        printf("    '%c' is %s\n", str1[i], isalpha(str1[i]) ? "alphabetic" : "not alphabetic");
    }
    
    // 19. isdigit() - Check if character is digit
    printf("19. isdigit(): Checking characters in '%s':\n", str5);
    for (int i = 0; str5[i]; i++) {
        printf("    '%c' is %s\n", str5[i], isdigit(str5[i]) ? "digit" : "not digit");
    }
    
    // 20. isspace() - Check if character is whitespace
    printf("20. isspace(): Checking characters in '%s':\n", str4);
    for (int i = 0; str4[i]; i++) {
        printf("    '%c' is %s\n", str4[i], isspace(str4[i]) ? "whitespace" : "not whitespace");
    }
    
    // 21. memcpy() - Copy memory block
    char mem1[100] = "Memory copy test";
    char mem2[100];
    memcpy(mem2, mem1, strlen(mem1) + 1);
    printf("21. memcpy(): Copied '%s' to mem2 = '%s'\n", mem1, mem2);
    
    // 22. memset() - Fill memory with value
    char memset_test[100] = "Hello World";
    memset(memset_test + 5, '*', 5);
    printf("22. memset(): After filling 5 chars with '*' = '%s'\n", memset_test);
    
    // 23. memcmp() - Compare memory blocks
    char mem3[100] = "Hello";
    char mem4[100] = "Hello";
    int memcmp_result = memcmp(mem3, mem4, 5);
    printf("23. memcmp(): Comparing 'Hello' and 'Hello' = %d\n", memcmp_result);
    
    // 24. strcasecmp() - Case-insensitive string comparison
    char case1[100] = "HELLO";
    char case2[100] = "hello";
    int casecmp = strcasecmp(case1, case2);
    printf("24. strcasecmp(): Case-insensitive comparison of 'HELLO' and 'hello' = %d\n", casecmp);
    
    // 25. strncasecmp() - Case-insensitive comparison of n characters
    int ncasecmp = strncasecmp(case1, case2, 3);
    printf("25. strncasecmp(): Case-insensitive comparison of first 3 chars = %d\n", ncasecmp);
    
    printf("\n=== Program completed successfully! ===\n");
    printf("Total string functions demonstrated: 25\n");
    
    return 0;
}
