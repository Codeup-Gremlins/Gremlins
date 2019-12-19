//Create a function that converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized.


function toCamelCase(str) {
    var string = '';
    var i;
    for (i = 0; i < str.length; i++) {
        if (str[i] === '-' || str[i] === '_') {
            continue;
        }
        if (str[i-1] === '-' || str[i-1] === '_') {
            string += str[i].toUpperCase();
        } else {
            string += str[i];
        }
    }
    return string;
}

console.log(toCamelCase("hey-there-friends"));

//Create a function that takes three integer arguments (a, b, c) and returns the number of equal values.


function equal(a, b, c) {
    if (a === b && a === c) {
        return 3;}
    if (a === b || a === c || b === c) {
        return 2;}
    return 0;
}

console.log(equal(1, 2,1));

