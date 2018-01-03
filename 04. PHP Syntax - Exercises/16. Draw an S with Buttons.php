<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>First Steps Into PHP</title>
</head>
<body>
<?php
for ($rows = 1; $rows <= 9; $rows++) {
    for ($cols = 1; $cols <= 5; $cols++) {
        if (($rows == 1 || $rows == 5 || $rows == 9)
            || ($rows >= 2 && $rows <= 4 && $cols == 1)
            || ($rows >= 6 && $rows <= 8 && $cols == 5)){ ?>

            <button style="background-color: blue">1</button>

        <?php } else { ?>

            <button>0</button>

        <?php }
    } ?>
    <br>
<?php } ?>
</body>
</html>