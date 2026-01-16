function processString() {
    let str = document.getElementById("inputString").value;
    let lowerStr = str.toLowerCase();

    // Reverse string
    let reversed = lowerStr.split("").reverse().join("");
    document.getElementById("reverse").innerText = reversed;

    // Count vowels
    let count = 0;
    for (let ch of lowerStr) {
        if ("aeiou".includes(ch)) {
            count++;
        }
    }
    document.getElementById("vowels").innerText = count;

    // Palindrome check
    if (lowerStr === reversed) {
        document.getElementById("palindrome").innerText = "Yes";
    } else {
        document.getElementById("palindrome").innerText = "No";
    }
}
