<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Strona główna</title>
    <script

            src="https://code.jquery.com/jquery-2.2.4.min.js"

            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="

            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>

<body>
<%@ include file="/WEB-INF/navbar.jsp" %>
<div class="container">
<div class="row">
    <div class="col-xs-12col-md-12">
    <div class="jumbotron">
        <h1>Strona główna</h1>
        <h4>Menu podręczne</h4>



    <div class="col-xs-6 col-md-3">
        <a href="http://localhost:8080/users" class="thumbnail">
            <img src="http://icons.iconarchive.com/icons/paomedia/small-n-flat/256/user-male-icon.png" alt="Opis obrazka">
        </a>
        <div class="caption">
            <h3 align="center">Przeglądaj</h3>
    </div> </div>

    <div class="col-xs-6 col-md-3">
        <a href="http://localhost:8080/users/form" class="thumbnail">
            <img src="http://icons.iconarchive.com/icons/custom-icon-design/flatastic-4/256/Male-user-add-icon.png" alt="Opis obrazka">
        </a>
        <div class="caption">
            <h3 align="center" >Nowy+</h3>
    </div></div>

        <div class="col-xs-6 col-md-3">
            <a href="http://localhost:8080" class="thumbnail">
                <img src="http://icons.iconarchive.com/icons/hopstarter/button/256/Button-Close-icon.png" alt="Opis obrazka">
            </a>
            <div class="caption">
                <h3 align="center" >Wyjście z programu</h3>
            </div></div>

</div>
    </div>
</div>
</div>
</div>

    <body>

</body>
</html>