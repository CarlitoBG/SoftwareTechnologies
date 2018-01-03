function solve(input) {
    let output = {};

    for(let i = 0; i < input.length - 1; i++){
        let elements = input[i].split(' ');
        let key = elements[0];
        let value = elements[1];

        if (output[key] === undefined){
            output[key] = [];
        }
        output[key].push(value);
    }

    let lastElement = input.pop();

    if(output[lastElement] === undefined){
        console.log('None');
    } else {
        output[lastElement].forEach(x => console.log(x));
    }
}

solve([
    'key value',
    'key eulav',
    'test tset',
    'key'
]);