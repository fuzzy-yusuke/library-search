<%@ page contentType="text/html; charset=Shift_JIS" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
<head>
<link href="style.css" type="text/css" rel="stylesheet" />
<title>}‘ŒŸõ</title>
</head>
<body>

<h1>}‘ŒŸõ</h1>

<hr />

<f:view>
    <h:form id="searchForm">
        <h:inputText id="searchWord" value="#{BookSearcher.word}" />
        <h:commandButton id="submit"
             action="#{BookSearcher.searchBooks}" value="Go!" />
    </h:form>
</f:view>

</body>
</html>