<html>
<head>

<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Movies entry</title>

<style>
* {
	margin: 0px;
	padding: 0px;
	box-sizing: border-box;
}

body, html {
	height: 100%;
	font-family: Poppins-Regular, sans-serif;
}

h1, h2, h3, h4, h5, h6 {
	margin: 0px;
}

.bg-contact3 {
	width: 100%;
	background-repeat: no-repeat;
	background-position: center center;
	background-size: cover;
}

input {
	outline: none;
	border: none;
}

input::-webkit-input-placeholder {
	color: rgba(255, 255, 255, 0.8);
}

input:-moz-placeholder {
	color: rgba(255, 255, 255, 0.8);
}

input::-moz-placeholder {
	color: rgba(255, 255, 255, 0.8);
}

input:-ms-input-placeholder {
	color: rgba(255, 255, 255, 0.8);
}

button {
	outline: none !important;
	border: none;
	background: transparent;
}

button:hover {
	cursor: pointer;
}

iframe {
	border: none !important;
}

.container-contact3 {
	width: 100%;
	min-height: 100vh;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	flex-wrap: wrap;
	justify-content: center;
	align-items: center;
	padding: 15px;
	background: rgba(0, 204, 153, 0);
}

.wrap-contact3 {
	width: 500px;
	background: #ff0000;
	background: linear-gradient(45deg, #000000, #000000);
	border-radius: 10px;
	overflow: hidden;
	padding: 72px 55px 65px 55px;
}

/*------------------------------------------------------------------
[  ]*/
.contact3-form {
	width: 100%;
}

.contact3-form-title {
	display: block;
	font-family: Poppins-Bold;
	font-size: 39px;
	color: #fff;
	line-height: 1.2;
	text-align: center;
	text-transform: uppercase;
	padding-bottom: 70px;
}

/*------------------------------------------------------------------
[  ]*/
.wrap-input3 {
	width: 100%;
	position: relative;
	border-bottom: 2px solid rgba(255, 255, 255, 0.24);
	margin-bottom: 27px;
}

.input3 {
	display: block;
	width: 100%;
	background: transparent;
	font-family: Poppins-Regular;
	font-size: 15px;
	color: #fff;
	line-height: 1.2;
	padding: 0 5px;
}

.focus-input3 {
	position: absolute;
	display: block;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	pointer-events: none;
}

.focus-input3::before {
	content: "";
	display: block;
	position: absolute;
	bottom: -2px;
	left: 0;
	width: 0;
	height: 2px;
	-webkit-transition: all 0.4s;
	-o-transition: all 0.4s;
	-moz-transition: all 0.4s;
	transition: all 0.4s;
	background: #fff;
}

/*---------------------------------------------*/
input.input3 {
	height: 45px;
}

.input3:focus+.focus-input3::before {
	width: 100%;
}

.container-contact3-form-btn {
	padding-top: 23px;
}

.contact3-form-btn {
	font-family: Poppins-Medium;
	font-size: 16px;
	color: #555555;
	line-height: 1.2;
	text-transform: uppercase;
	display: -webkit-box;
	display: -webkit-flex;
	display: -moz-box;
	display: -ms-flexbox;
	display: flex;
	justify-content: center;
	align-items: center;
	padding: 0 15px;
	min-width: 120px;
	height: 50px;
	border-radius: 2px;
	position: relative;
	z-index: 1;
	background: #80c64a;
	background: -webkit-linear-gradient(-135deg, #56ab2f, #a8e063);
	background: -o-linear-gradient(-135deg, #56ab2f, #a8e063);
	background: -moz-linear-gradient(-135deg, #56ab2f, #a8e063);
	background: linear-gradient(-135deg, #56ab2f, #a8e063);
	-webkit-transition: all 0.4s;
	-o-transition: all 0.4s;
	-moz-transition: all 0.4s;
	transition: all 0.4s;
}

.contact3-form-btn::before {
	content: "";
	display: block;
	position: absolute;
	z-index: -1;
	border-radius: 2px;
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	background: #fff;
	opacity: 1;
	-webkit-transition: all 0.4s;
	-o-transition: all 0.4s;
	-moz-transition: all 0.4s;
	transition: all 0.4s;
}

.contact3-form-btn:hover {
	color: #fff;
}

.contact3-form-btn:hover:before {
	opacity: 0;
}

.footer {
	position: relative;
	bottom: 20px;
	right: 0px;
	width: 100%;
	color: #AAAAAA;
	z-index: 4;
	text-align: right;
	margin-top: 50px;
}

.container {
	padding-right: 15px;
	padding-left: 15px;
	margin-right: auto;
	margin-left: auto;
}

@media ( max-width : 576px) {
	.wrap-contact3 {
		padding: 72px 15px 65px 15px;
	}
}
</style>

</head>
<body>

	<div class="bg-contact3"
		style="background-image: url('https://www.aquaroyal.asia/wp-content/uploads/2020/08/comming-soon-miin.jpg');">
		<div class="container-contact3">
			<div class="wrap-contact3">
				<form class="contact3-form validate-form" action = "wpr" method="post">
					<span class="contact3-form-title"> ENTER WATER PURIFIER DETAILS </span>



					<div class="wrap-input3 validate-input"
						data-validate="Name is required">
						<input class="input3" type="text" name="wpName"
							placeholder="Enter waterpurifier Name" required> <span
							class="focus-input3"></span>
					</div>


					<div class="wrap-input3 validate-input">
						<input class="input3" type="text" name="wpType"
							placeholder="Enter Waterpurifier Type" required> <span
							class="focus-input3"></span>
					</div>
					<div class="wrap-input3 validate-input">
						<input class="input3" type="text" name="wpOrderd"
							placeholder="Enter Number of purifiers ordered" required> <span
							class="focus-input3"></span>
					</div>

					<div class="wrap-input3 validate-input">
						<input class="input3" type="text" name="wpPrice"
							placeholder="Enter waterpurifier Price per purifier" required> <span
							class="focus-input3"></span>
					</div>


					<div class="container-contact3-form-btn">
						<button class="contact3-form-btn">Submit</button>
					</div>
				</form>


			</div>
			<div class="footer">
				<div class="container" style="color: white;">Copyright@Sanjay Kumar BR -2021</div>
			</div>
		</div>
	</div>






</body>
</html>