<?php

require ("../layout.php");

session_start();

$css = "../css/style.css";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
  require ("../config/connect_db.php");

  try {
    $conn = connect_db();
  } catch (Exception $e) {
    echo "Connection failed: " . $e -> getMessage();
  }

  $name = $_POST["name"];
  $email = $_POST["email"];
  $address = $_POST["address"];
  $gender = $_POST["gender"];
  $username = $_POST["username"];
  $password = $_POST["password"];

  $sql = "INSERT INTO `users` (
    `id`,
    `name`,
    `address`,
    `gender`,
    `username`,
    `email`,
    `password`
  ) VALUES (
    NULL,
    '$name',
    '$address',
    '$gender',
    '$username',
    '$email',
    '$password'
  );
";

  $result = mysqli_query($conn, $sql);

  if ($result) {
    render("<p>You have successfully registered!</p> <br /> <p>You will be redirected to login page in 2 seconds.</p>", $css);
    header("refresh:1; url=/login.php");
  } else {
    render("<p>Registration failed!<p/>", $css);
    header("refresh:1; url=/register.php");
  }
} else {
  render("<p>You are not allowed to access this page!</p>", $css);
  header("refresh:1; url=/login.php");
}

?>