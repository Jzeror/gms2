<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<jsp:include page="../common/header.jsp" />
<body>
	<div id="wrapper">
		<div id="header">
		<관리자 페이지>
		</div>
		<div id="content">
			<jsp:include page="../member/search.jsp" />
		</div>
		<jsp:include page="../common/footer.jsp"></jsp:include>
	</div>
<script >
	admin.main('${context}');
</script>
</body>
</html>
