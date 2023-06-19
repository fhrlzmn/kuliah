<?php

session_start();

if (!isset($_SESSION["username"])) {
  header("Location: login.php");
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Hello, <?php echo $_SESSION["username"] ?>!</title>
  <link rel="stylesheet" href="./css/style.css">
  <style>
    h2 span {
      text-decoration: underline;
    }

    p {
      text-align: center;
    }
  </style>
</head>
<body>
  <main>
    <div class="wrapper">
      <h2>Hello, <span><?php echo $_SESSION["username"] ?>!</span></h2>
      <p><a href="logout.php">Logout</a></p>
    </div>
  </main>
</body>
</html>