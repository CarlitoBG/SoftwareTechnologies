function solve(args) {
    let N = Number(args[0]);
    let arr = [];

    for(let i = 0; i < N; i++){
        arr[i] = 0;
    }

    for(let i = 1; i < args.length; i++){
        let indexValuePair = args[i].split(' - ').map(Number);
        let index = indexValuePair[0];
        let value = indexValuePair[1];

        arr[index] = value;
    }

    for (let value of arr){
        console.log(value);
    }
}

solve([
    "5",
    "0 - 3",
    "3 - -1",
    "4 - 2"
]);