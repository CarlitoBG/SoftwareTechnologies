function solve(nums) {
    let numbers = nums.map(Number);
    let negativeNumbers = numbers.filter(num => num < 0);

    if (negativeNumbers.length % 2 == 0 || numbers.includes(0)){
        console.log("Positive");
    }else{
        console.log("Negative");
    }
}

solve(['-3', '0', '5']);