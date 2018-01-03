function solve(input) {
    for(let line of input) {
        let tokens = line.split(' -> ');
        let [name, age, grade] = tokens.map(a => !isNaN(a) ? Number(a) : a);
        let obj = {name: name, age: age, grade: grade};

        console.log(
            `Name: ${obj.name}\n`+
            `Age: ${obj.age}\n`+
            `Grade: ${obj.grade.toFixed(2)}`
        );
    }
}

solve([
    'Pesho -> 13 -> 6.00',
    'Ivan -> 12 -> 5.57',
    'Toni -> 13 -> 4.90'
]);