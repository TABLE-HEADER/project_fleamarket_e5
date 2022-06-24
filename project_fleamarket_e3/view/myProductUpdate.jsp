<%--
機能名：出品内容更新機能
作成者：中西りりな
作成日：2022/06/23
--%>
<%@page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*,bean.Product,util.MyFormat,util.ImageConvert"%>
<%
	Product oldProduct = (Product) request.getAttribute("oldProduct");
	MyFormat format = new MyFormat();
%>
<html>
<head>
<title>出品内容変更</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Style-Type" content="text/css">
<style type="text/css">
#wrapper {
	max-width: 970px;
	margin: 10px auto 0px;
	text-align: center;
	font-family: "游ゴシック Medium", "Yu Gothic Medium";
	font-weight: bold;
	color: #464646;
}

.footer {
	position: absolute;
	bottom: 10px;
	width: 970px;
	font-size: small;
}

.copyright {
	font-size: small;
	height: 25px;
}

.hr {
	clear: both;
	height: 2px;
	background-color: orange;
}

.bottom_button_right, .bottom_button_left {
	float: right;
	height: 25px;
	width: 150px;
	padding: 3px 5px 1px;
	margin: 10px 0px 0px 1px;
	border-top: 2px solid orange;
	border-right: 2px solid orange;
	border-left: 2px solid orange;
	border-radius: 8px 8px 0 0;
	background-color: #ffff0054;
	color: #464646;
	font-size: medium;
}

.footer_a {
	text-decoration: none;
}

.bottom_button_right:hover, .bottom_button_left:hover {
	cursor: pointer;
	background-color: #ffb70054;
}

.bottom_button_right:active, .bottom_button_left:active {
	border-top: 2px inset #ff6800;
	border-right: 2px inset #ff6800;
	border-left: 2px inset #ff6800;
}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body id="wrapper">
	<!-- header -->
	<header>
		<%@include file="/common/header.jsp"%>
	</header>

	<br>
	<h2 align="center">出品内容変更</h2>

	<!-- contents -->
	<form action="<%=request.getContextPath()%>/myProductUpdate" method="post">
		<table border=0 align="center" summary="出品内容変更画面">
			<tr>
				<td></td>
				<td>＜＜変更前情報＞＞</td>
				<td>＜＜変更後情報＞＞</td>
			</tr>
			<tr>
				<th style="background-color: #99FF66; width: 100">カテゴリ</th>
				<td style="background-color: #CCFF66; width: 200"><%=oldProduct.getCategory()%></td>
				<td><select name="category">
				<option value="レディース">レディース</option>
				<option value="メンズ">メンズ</option>
				<option value="ベビー・キッズ">ベビー・キッズ</option>
				<option value="インテリア・住まい・小物">インテリア・住まい・小物</option>
				<option value="本・音楽・ゲーム">本・音楽・ゲーム</option>
				<option value="おもちゃ・ホビー・グッズ">おもちゃ・ホビー・グッズ</option>
				<option value="コスメ・香水・美容">コスメ・香水・美容</option>
				<option value="家電・スマホ・カメラ">家電・スマホ・カメラ</option>
				<option value="スポーツ・レジャー">スポーツ・レジャー</option>
				<option value="ハンドメイド">ハンドメイド</option>
				<option value="チケット">チケット</option>
				<option value="自動車・オートバイ">自動車・オートバイ</option>
				<option value="その他">その他</option>
				</select></td>
			</tr>
			<tr>
				<th style="background-color: #99FF66; width: 100">商品名</th>
				<td style="background-color: #CCFF66; width: 100"><%=oldProduct.getProductname()%></td>
				<td><input type="text" name="productname" ></td>
			</tr>
			<tr>
				<th style="background-color: #99FF66; width: 100">個数</th>
				<td style="background-color: #CCFF66; width: 100"><%=oldProduct.getStock()%></td>
				<td><input type="text" name="stock" ></td>
			</tr>
			<tr>
				<th style="background-color: #99FF66; width: 100">価格</th>
				<td style="background-color: #CCFF66; width: 100"><%=oldProduct.getPrice()%></td>
				<td><input type="text" name="price" ></td>
			</tr>
			<tr>
				<th style="background-color: #99FF66; width: 100">出品地域</th>
				<td style="background-color: #CCFF66; width: 100"><%=oldProduct.getAddress_level1()%></td>
				<td><input type="text" name="address_level1"
					></td>
			</tr>
			<tr>
				<th style="background-color: #99FF66; width: 100">商品画像</th>
				<td valign="top">
					<%byte[] image = oldProduct.getImage(); %>
					<img id='thumbnail' <%= image != null ? "src='data:image/png;base64," + ImageConvert.writeImage(ImageConvert.byteToImage(image), request, response) + "' width='64' height='64' align=top" : "" %> alt='イメージ'>
					<br>
					<input type="file" id="uploadImg" accept=".png, .jpg, .jpeg, .bmp"><br>
					<font color="grey" size="2">画像は64*64に縮小表示されます。</font>
					<input type="hidden" id="image" name="image" value="">
				</td>
			</tr>
			<tr>
				<th style="background-color: #99FF66; width: 100">備考</th>
				<td style="background-color: #CCFF66; width: 100"><%=oldProduct.getRemark()%></td>
				<td><textarea name="remark" rows="5" cols="23"></textarea></td>
			</tr>

			<tr>
				<td colspan=3 style="text-align: center">
				<input type = "hidden" name="productid" value=<%=oldProduct.getProductid() %>>
						<input type="submit" value="変更完了">
				</td>
				</form>
			</tr>

		</table>


		<!-- footer -->
		<footer class="footer">
			<a href="#" class="footer_a"><div class="bottom_button_right">ページトップへ</div></a>
			<a href="<%=request.getContextPath()%>/view/homePage.jsp"
				class="footer_a">
				<div class="bottom_button_right">ホームへ</div>
			</a>
			<hr class="hr" />
			<p class="copyright">Copyright(C)2022 All Rights Reserved.</p>
		</footer>

		<script type="text/javascript">
			const uploadImg = document.getElementById("uploadImg");

			if(uploadImg !== null){
				uploadImg.addEventListener('change', function(){
					if (this.files.length > 0) {
						// 選択されたファイル情報を取得
						var file = this.files[0];

						// readerのresultプロパティに、データURLとしてエンコードされたファイルデータを格納
						var reader = new FileReader();
						reader.readAsDataURL(file);

						reader.onload = function() {
							$('#thumbnail').attr('src', reader.result);
							$('#image').attr('value', reader.result.split(',')[1]);
						}

					}
				});
			}
		</script>

</body>
</html>