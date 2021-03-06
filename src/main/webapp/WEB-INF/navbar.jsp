<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<nav class="navbar navbar-inverse">

    <div class="container-fluid">

        <div class="navbar-header">

            <button type="button"

                    class="navbar-toggle collapsed"

                    data-toggle="collapse"

                    data-target="#bs-example-navbar-collapse-1"

                    aria-expanded="false">

                <span class="sr-only">Toggle navigation</span>

                <span class="icon-bar"></span>

                <span class="icon-bar"></span>

                <span class="icon-bar"></span>

            </button>

            <a class="navbar-brand" href="/"><span class="glyphicon glyphicon-home"></span></a>

        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

            <ul class="nav navbar-nav">

                <li><a href="<c:url value="/debts"/>">All debts</a></li>

                <li>

                    <a href="<c:url value="/debts/create"/>">New debts <span class="glyphicon glyphicon-plus"></span></a>

                </li>
<sec:authorize access="hasRole('ADMIN')">
                <li><a href="<c:url value="/user-list"/>">All users</a></li>
</sec:authorize>
            </ul>

            <ul class="nav navbar-nav navbar-right" >

                <li><a href="<c:url value="/logout"/>">Logout</a></li>



            </ul>

        </div>


    </div>

</nav>

