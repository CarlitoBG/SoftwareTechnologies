function solve(nums) {
    let num1 = Number(nums[0]);
    let num2 = Number(nums[1]);

    if (num1 <= num2){
        console.log(num1 * num2);
    }else {
        console.log(num1 / num2);
    }
}

solve(['3', '2']);