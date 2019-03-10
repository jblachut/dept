<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>

<html lang="en">

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

<%@ include file="/WEB-INF/navbar.jsp" %>

<div class="container">



    <div class="row">

        <div class="col-sm-offset-3 col-sm-6 col-xs-12">

            <form method="post"

                  action="<c:url value="/debts/create"/>"

                  class="form-horizontal">

                <input type="hidden" name="id" value="${debt.id}">

                <div class="form-group">

                    <label for="debtorId" class="col-sm-2 control-label">Debtor: </label>

                    <div class="col-sm-9">

                        <select id="debtorId" name="debtorId"

                                class="form-control">

                            <option value="">-- select debtor --</option>

                            <c:forEach var="debtor" items="${debtors}">

                                <option value="${debtor.id}">${debtor.firstName} ${debtor.lastName}</option>

                            </c:forEach>

                        </select>

                    </div>

                    <div class="col-sm-1">

                        <button type="button" class="btn btn-default" data-toggle="modal" data-target="#deptor-create">

                            <span class="glyphicon glyphicon-plus"></span>

                        </button>

                    </div>

                </div>



                <div class="form-group">

                    <label for="amount" class="col-sm-2 control-label">Amount: </label>

                    <div class="col-sm-10">

                        <input id="amount"

                               type="text"

                               name="amount"

                               class="form-control"

                               value=""

                               placeholder="Enter amount">

                    </div>

                </div>



                <div class="form-group">

                    <div class="col-sm-offset-2 col-sm-10">

                        <button type="submit" class="btn btn-primary">Save</button>

                    </div>

                </div>

            </form>

        </div>

    </div>



</div>

<div id="deptor-create" class="modal fade" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Add debtor</h4>
            </div>
            <div class="modal-body">

                <div class="container">

<%--formularz--%>

                    <div class="row">

                        <div class="col-sm-offset-1 col-sm-6 col-xs-12">

                            <form method="post"

                                  action="<c:url value="/debtor/create"/>"

                                  class="form-horizontal">


                                <div class="form-group">

                                    <label for="firstName"
                                           class="col-sm-1 control-label">Name: </label>

                                    <div class="col-sm-8">

                                        <input id="firstName"

                                               type="text"

                                               name="firstName"

                                               class="form-control"

                                               value=""

                                               placeholder="Enter Name Debtor">

                                    </div>

                                </div>

                                    <label for="lastName" class="col-sm-1 control-label">Last Name: </label>

                                    <div class="col-sm-8">

                                        <input id="lastName"

                                               type="text"

                                               name="lastName"

                                               class="form-control"

                                               value=""

                                               placeholder="Enter Last Name debtor">

                                    </div>



                                    <label for="email" class="col-sm-1 control-label">Email: </label>

                                    <div class="col-sm-8">

                                        <input id="email"

                                               type="text"

                                               name="email"

                                               class="form-control"

                                               value=""

                                               placeholder="Enter email">

                                    </div>


    <div class="col-sm-8">

                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="submit" class="btn btn-primary">Save changes</button>
    </div> </form>
                        </div>
                    </div>

        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</div>
        </form>

    </div>

</div>
</body>

</html>