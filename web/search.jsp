<%@ page contentType="text/html; charset=Shift_JIS" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<!DOCTYPE html>
<html>
    <head>
        <link href="style.css" type="text/css" rel="stylesheet">
        <title>ê}èëåüçı</title>
    </head>
    <body>
        <h1>ê}èëåüçı</h1>
        
        <hr />
        
        <f:view>
            <h:form id="serachForm">
                <h:inputText id="searchWord" value="#{BookSeracher.word}" />
                <h:commandButton id="submit" action="#{BookSearcher.searchBooks}" value="Go!" />
            </h:form>
        </f:view>
    </body>
</html>
