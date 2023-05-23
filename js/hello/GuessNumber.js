const readline = require('readline');



const MAX = 3;

const s = readline.createInterface({ input: process.stdin, output: process.stdout, terminal: false });
const number = parseInt(Math.random() * MAX + 1);
process.stdout.write(`Guess my number (it is between 1 and ${MAX})`);
s.on('line', (guess) => {
     process.stdout.write(guess == number ?
         "You guessed correctly!\n" :
         "Haha, wrong!\n");
}
);
