try {
    //例外が発生する可能性のあるコード
    notFunction()
} catch (error) {
    //例外が発生した場合の処理
    console.log('--- output error ---');
    console.log(error.name)
    console.log(error.message)
} finally {
    //例外の有無に関わらず、必ず実行されるコード
    console.log('end!');
}

let name = "Alice";
let age = 30;

console.log("Name: ", name);
console.log("Age: ", age);

let person = {
    name: "Bob",
    age: 25,
    city: "New York",  
};

let numbers = [1, 2, 3, 4, 5];

console.log("Person: ", person);
console.log("Numbers: ", numbers);

let score = 85;
if (score >= 80) {
    console.log("Great job! You passed!");
} else {
    console.log("Sorry, you did not pass.");
}

for (let i = 0; i < numbers.length; i++) {
    console.log("Number: ", numbers[i]);
}

function add(a, b) {
    let sum = a + b;
    console.log("Sum of", a, "and", b, "is:", sum);
    return sum;
}

let result = add(10, 20);

function calculate(x, y) {
    if (x === 0) {
        console.log("Error: cannot be zero");
        return y/x;
    }
}
let result = calculate(0, 5);

function divide(a, b) {
    if (b === 0) {
        throw new Error("Division by zero is not allowed");
    }
    return a / b;
}

try {
    let result = divide(10, 0);
    console.log("Result: ", result);
} catch (error) {
    console.log("Caught an error: ", error.message);
}

