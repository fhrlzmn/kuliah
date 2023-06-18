<?php

session_start();

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

  echo $sql;

  $result = mysqli_query($conn, $sql);

  if ($result) {
    echo "You have successfully registered! <br />";
    echo "You will be redirected to login page in 2 seconds.";
    header("refresh:2; url=/login.php");
  } else {
    echo "Registration failed!";
    header("refresh:2; url=/register.php");
  }
} else {
  echo "You are not allowed to access this page!";
  header("refresh:2; url=/login.php");
}

?>