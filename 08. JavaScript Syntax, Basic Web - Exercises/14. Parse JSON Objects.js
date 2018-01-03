function solve(lines) {

    let objects = lines.map(JSON.parse);

    for (let object of objects){
        console.log(
            `Name: ${object.name}\n`+
            `Age: ${object.age}\n`+
            `Date: ${object.date}`
        );
    }
}

solve(['{"name":"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}']);