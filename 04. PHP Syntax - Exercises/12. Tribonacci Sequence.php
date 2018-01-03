<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>

</head>
<body>
<form>
    N: <input type="text" name="num" />
    <input type="submit" />
</form>
<?php
if (isset($_GET['num'])){
    $n = intval($_GET['num']);

    $f0 = 1;
    $f1 = 0;
    $f2 = 0;

    for ($i = 1; $i <= $n; $i++){
        $tribonacci = $f0 + $f1 + $f2;
        $f0 = $f1;
        $f1 = $f2;
        $f2 = $tribonacci;

        echo "$tribonacci ";
    }
}
?>
</body>
</html>