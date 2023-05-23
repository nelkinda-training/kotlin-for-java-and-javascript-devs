hello = () => console.log('Hello, world!');
hello = function() { console.log('Hello, world!'); };
function hello() {
    console.log("The other hello");
}
console.log(hello);
console.log(hello());
