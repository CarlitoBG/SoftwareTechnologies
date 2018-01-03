function solve(input) {
    let text = input.join(",");
    console.log(text
        .split(/\W+/)
        .filter(e => !e.match(/\W+/))
        .filter(e => e === e.toUpperCase())
        .filter(e => e)
        .join(", "));
}