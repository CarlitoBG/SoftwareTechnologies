function solve(args) {
    let arr = [];

    for(let line of args){
        let elements = line.split(' ');
        let command = elements[0];
        let argument = Number(elements[1]);

        if(command === 'add'){
            arr.push(argument);
        }else{
            arr.splice(argument, 1);
        }
    }

    console.log(arr.join('\n'))
}

solve([
    'add 3',
    'add 5',
    'remove 2',
    'remove 0',
    'add 7'
]);