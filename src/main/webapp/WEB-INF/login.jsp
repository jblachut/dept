<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<head>

    <meta charset="UTF-8">

    <title>Dodawanie użytkownika</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"

          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">



    <script

            src="https://code.jquery.com/jquery-2.2.4.min.js"

            integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="

            crossorigin="anonymous"></script>



    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"

            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"

            crossorigin="anonymous"></script>

</head>

<body>


<div class="container">



    <div class="row">

        <div class="col-sm-offset-3 col-sm-6 col-xs-12">

            <form method="post"

                  action="<c:url value="/login"/>"

                  class="form-horizontal">

                <div class="form-group">

                    <label for="email" class="col-sm-2 control-label">emial: </label>

                    <div class="col-sm-10">

                        <input id="email"

                               type="email"

                               name="email"

                               class="form-control"

                               value="${userDao.email}"

                               placeholder="Enter email">

                    </div>

                </div>






                <div class="form-group">

                    <label for="password" class="col-sm-2 control-label">password: </label>

                    <div class="col-sm-10">

                        <input id="password"

                               type="password"

                               name="password"

                               class="form-control"

                               value="${user.password}"

                               placeholder="Enter password">

                    </div>

                </div>



                <div class="form-group">

                    <div class="col-sm-offset-2 col-sm-10">

                        <button type="submit" class="btn btn-primary">Login</button>

                    </div>

                </div>

            </form>

        </div>

    </div>



</div>



</body>
</html>
