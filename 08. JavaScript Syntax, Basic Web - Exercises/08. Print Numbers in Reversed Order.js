function solve(nums) {
    let numbers = nums.map(Number);
    console.log(numbers.reverse().join('\n'));
}

solve([
    '10',
    '15',
    '20'
]);