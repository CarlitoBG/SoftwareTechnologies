function solve(arr) {
    for(let line of arr){
        if(line === 'Stop'){
            break;
        }

        console.log(line);
    }
}

solve([
    'Line 1',
    'Line 2',
    'Line 3',
    'Stop',
    '11'
]);