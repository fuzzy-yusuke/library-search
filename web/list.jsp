<%@ page contentType="text/html; charset=Shift_JIS" %>
<%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>

<!DOCTYPE html>
<html>
    <head>
        <title>åüçıåãâ </title>
    </head>
    <body>
        <h1>åüçıåãâ </h1>

        <f:view>
            <h:form id="listForm">
                <h:dataTable id="table" border="1" value="#{BookSearcher.bookList}" var="book">
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="É^ÉCÉgÉã"/>
                        </f:facet>
                        <h:commandLink id="detail" action="#{BookSearcher.searchBookDetail}">
                            <h:outputText id="bookTitle" value="#{book.title}"/>
                        </h:commandLink>
                    </h:column>
                    <h:column>
                        <f:facet name="header">
                            <h:outputText value="íòé“"/>
                        </f:facet>
                        <h:outputText id="bookAuthor" value="#{book.author}"/>
                    </h:column>
                </h:dataTable>
            </h:form>
        </f:view>
    </body>
</html>
