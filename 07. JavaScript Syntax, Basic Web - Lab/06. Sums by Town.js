function solve(input) {
    let allTowns = {};

    for(let json of input){
        let obj = JSON.parse(json);
        if(!(obj.town in allTowns)){
            allTowns[obj.town] = 0;
        }
        allTowns[obj.town] += obj.income;
    }

    for(let town of Object.keys(allTowns).sort()){
        console.log(`${town} -> ${allTowns[town]}`);
    }
}