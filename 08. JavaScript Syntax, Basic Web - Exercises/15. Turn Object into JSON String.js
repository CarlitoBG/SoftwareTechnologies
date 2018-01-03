function solve(lines) {
    let object = {};

    for(let line of lines){
        let tokens = line.split(' -> ');
        let key = tokens[0];
        let value = tokens[1];

        if(key === 'age' || key === 'grade'){
            value = Number(value);
        }
        object[key] = value;
    }

    console.log(JSON.stringify(object));
}

solve(['name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia'
]);