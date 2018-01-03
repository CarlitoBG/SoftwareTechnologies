<?php if (isset($_GET['person'])) :
    $person = htmlspecialchars($_GET['person']);
    echo "Hello, $person!"; ?>
<?php else: ?>
    <form>
        Name: <input type="text" name="person" />
        <input type="submit" />
    </form>
<?php endif; ?>
