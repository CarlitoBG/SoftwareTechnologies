function solve(arr) {
    console.log(arr.map(Number)
        .sort((a, b) => b - a)
        .slice(0,3)
        .join("\r\n"));
}