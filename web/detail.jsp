<%@ page contentType="text/html; charset=Shift_JIS" %>
<%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>

<html>
<head>
<title>Ú×•\Ž¦</title>
</head>
<body>

<h1>Ú×•\Ž¦</h1>

<f:view>
<ul>
<li><h:outputText value="#{BookSearcher.bookData.ndc}" />
<li><h:outputText value="#{BookSearcher.bookData.tyosya_hyouji}" />
<li><h:outputText value="#{BookSearcher.bookData.id}" />
<li><h:outputText value="#{BookSearcher.bookData.title}" />
<li><h:outputText value="#{BookSearcher.bookData.author}" />
<li><h:outputText value="#{BookSearcher.bookData.publisher}" />
</ul>
</f:view>

</body>
</html>