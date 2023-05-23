const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

numbers.forEach(function(it) {
    console.log(it);
});

numbers.forEach(it =>
    console.log(it)
);

function foo(arg) {
    console.log(arg);
}

hello = () => console.log('Hello, world!');
function hello() {
    console.log("The other hello");
}
console.log(hello);
console.log(hello());
