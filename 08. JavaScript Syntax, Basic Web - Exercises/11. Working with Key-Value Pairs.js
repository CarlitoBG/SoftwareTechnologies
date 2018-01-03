function solve(input) {
    let output = {};

    for(let i = 0; i < input.length - 1; i++){
        let elements = input[i].split(' ');
        let key = elements[0];
        let value = elements[1];

        output[key] = value;
    }

    let lastElement = input[input.length - 1];

    console.log(output[lastElement] || 'None');
}

solve([
    'key value',
    'key eulav',
    'test tset',
    'key'
]);