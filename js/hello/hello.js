class Person1 {
    constructor(firstname, lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}

class Person2 {
    constructor(firstname, lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    equals(other) {
        if (this === other) return true;
        if (!(other instanceof Person2)) return false;
        return this.firstname === other.firstname && this.lastname === other.lastname;
    }
}

console.log("Hello, world!");

const p1 = new Person2("John", "Doe");
const p2 = new Person2("Pallavi", "Jain");
const p3 = new Person2("Pallavi", "Jain");
const p4 = p3;
let p5 = p1;

console.log(p1);
console.log(p2);
console.log(p3);
console.log(p4);

console.log(p1 == p2); // loose equality
console.log(p2 == p3);
console.log(p3 == p4);

console.log(p1 === p2); // strict equality
console.log(p2 === p3);
console.log(p3 === p4);

console.log(p1.equals(p2));
console.log(p2.equals(p3));

console.log(p5);

p5 = null;

console.log(p5);
