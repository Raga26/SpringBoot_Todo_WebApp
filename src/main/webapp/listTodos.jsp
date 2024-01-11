<html>

	<head>
		<title>List Todos Page</title>
	</head>

	<body>
		<div>your todos are
                     <%
                         List<Todo> todos = (List<Todo>) request.getAttribute("todos");
                         for (Todo todo : todos) {
                             out.println(todo); // Assuming Todo class has a proper toString method
                         }
                     %></div>
	</body>

</html>