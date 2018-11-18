<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="<c:url value="/resources/css/bootstrap.min.css" />">
<title>Goods form</title>
</head>
<body>
	<div class="container pt-5 pb-5">
		<s:form action="save" namespace="/goods">
			<s:hidden name="goodsBean.id" />

			<div class="form-row">
				<div class="form-group col-md-2">
					<label>Mã hàng hóa</label>
					<s:textfield name="goodsBean.code"
						class="form-control form-control-sm" />
				</div>
				<div class="form-group col-md-4">
					<label>Phân loại</label>
					<s:select list="{'A','B','C'}" class="form-control form-control-sm" />
				</div>
				<div class="form-group col-md-3">
					<label>Hãng sản xuất</label>
					<s:select list="{'A','B','C'}" class="form-control form-control-sm" />
				</div>
				<div class="form-group col-md-3">
					<label>Nhà cung cấp</label>
					<s:select list="{'A','B','C'}" class="form-control form-control-sm" />
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-6">
					<label>Tên hàng hóa</label>
					<s:textfield name="goodsBean.name"
						class="form-control form-control-sm" />
				</div>
				<div class="form-group col-md-4">
					<label>Đặc tính</label>
					<s:textfield class="form-control form-control-sm" />
				</div>
				<div class="form-group col-md-2">
					<label>Số lô</label>
					<s:textfield name="goodsBean.name"
						class="form-control form-control-sm" />
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-md-2">
					<label>Hạn sử dụng</label>
					<s:textfield class="form-control form-control-sm" />
				</div>

				<div class="form-group col-md-2">
					<label>Giá nhập</label>
					<s:textfield class="form-control form-control-sm" />
				</div>

				<div class="form-group col-md-2">
					<label>Giá bán</label>
					<s:textfield class="form-control form-control-sm" />
				</div>

				<div class="form-group col-md-2">
					<label>Đơn vị tính</label>
					<s:textfield class="form-control form-control-sm" />
				</div>

				<div class="form-group col-md-4">
					<label>Số lượng tồn kho</label>
					<s:textfield class="form-control form-control-sm" />
				</div>

			</div>

			<div class="form-group">
				<s:checkbox name="goodsBean.newBrand" id="newBrand" />
				<label for="newBrand">Nhãn hàng mới</label>
			</div>

			<s:submit value="Lưu" class="btn btn-primary pr-4 pl-4" />
		</s:form>
	</div>

	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/js/popper.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>