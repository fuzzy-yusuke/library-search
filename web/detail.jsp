<%@ page contentType="text/html; charset=Shift_JIS" %>
<%@ taglib uri="http://java.sun.com/jsf/html"  prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core"  prefix="f" %>

<html>
<head>
<title>詳細表示</title>
</head>
<body>

<h1>詳細表示</h1>

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