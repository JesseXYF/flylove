<?php
// Free html5 templates : www.zerotheme.com

$text = "<span style='color:red; font-size: 35px; line-height: 40px; magin: 10px;'>Error! Please try again.</span>";

if(isset($_POST['name']))
{
	$name=$_POST['name'];
	$email=$_POST['email'];
	$message=$_POST['message'];

	$to = "youremail@gmail.com";
	$subject = "Zerotheme - Testing Contact Form";
	$message = " Name: " . $name ."\r\n Email: " . $email . "\r\n Message:\r\n" . $message;
	 
	$from = "Zerotheme";
	$headers = "From:" . $from . "\r\n";
	$headers .= "Content-type: text/plain; charset=UTF-8" . "\r\n"; 
	 
	if(@mail($to,$subject,$message,$headers))
	{
	  $text = "<span style='color:blue; font-size: 35px; line-height: 40px; margin: 10px;'>Your Message was sent successfully !</span>";
	}
}
?>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<head>

    <!-- Basic Page Needs
  ================================================== -->
	<meta charset="utf-8">
	<title>zLoveStory | Free Html5 Templates</title>
	<meta name="description" content="Free Responsive Html5 Css3 Templates | zerotheme.com">
	<meta name="author" content="www.zerotheme.com">
	
    <!-- Mobile Specific Metas
  ================================================== -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    
    <!-- CSS
  ================================================== -->
  	<link rel="stylesheet" href="css/zerogrid.css">
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="css/responsive.css">
	<link rel="stylesheet" href="css/slider.css">
	<!--  Resource style -->
	<link href="css/mb-comingsoon-iceberg.css" rel="stylesheet" />
	<!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<!--[if lt IE 8]>
       <div style=' clear: both; text-align:center; position: relative;'>
         <a href="http://windows.microsoft.com/en-US/internet-explorer/products/ie/home?ocid=ie6_countdown_bannercode">
           <img src="http://storage.ie6countdown.com/assets/100/images/banners/warning_bar_0000_us.jpg" border="0" height="42" width="820" alt="You are using an outdated browser. For a faster, safer browsing experience, upgrade for free today." />
        </a>
      </div>
    <![endif]-->
    <!--[if lt IE 9]>
		<script src="js/html5.js"></script>
		<script src="js/css3-mediaqueries.js"></script>
	<![endif]-->
    
</head>
<body>
<div class="zerogrid wrap-body">
	
	<!--////////////////////////////////////Top-->
	
	<div id="top" >
		<div class="zerogrid">
			<h1 id="logo"><a href="index.html"><div class="name t-right">David <span> Satrovsky  </span></div><div class="and">&amp;</div><div class="name t-left"> Teresa <span> Angela</span></div></a></h1>
		</div>
	</div>
	
	<!--////////////////////////////////////Header-->
	<div class="wrap-header zerogrid">
		<div class="ribbon">
			<div class="ribbon-stitches-top"></div>
			<strong class="ribbon-content"><h1>The Story Of Us</h1></strong>
			<div class="ribbon-stitches-bottom"></div>
		</div>
		<header>
			<div class="clearfix">
				<div class="cd-slider-wrapper cd-container">
					<ul class="cd-slider">
						<li>
							<div class="wrap-img"></div>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
						</li>
						<li>
							<div class="wrap-img"></div>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Necessitatibus ea, perferendis error repudiandae numquam dolor fuga temporibus. Unde omnis, consequuntur.</p>
						</li>
					</ul> <!-- cd-slider -->
				</div> <!-- cd-slider-wrapper -->
			</div>
		</header>
	</div>


<!--////////////////////////////////////Container-->
<section id="container">
	<div class="wrap-container">
		<div class="back">
			<!--Warning-->
			<center><?php echo $text;?></center>
			<!---->
			<a class="button button02" href="index.html">Back To Home</a>
		</div>
	</div>
</section>

<!--////////////////////////////////////Footer-->
<footer>
	<div class="wrap-footer">
		<div class="zerogrid">
			<h3>Thank You!</h3>
		</div>
	</div>
	<div class="bottom-footer">
		<div class="zerogrid">
			<div class="wrap-bottom">
				<div class="row">
					<div class="col-1-3">
						<div class="wrap-col">
							<p>Copyright 2015 - More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
						</div>
					</div>
					<div class="col-1-3">
						<div class="wrap-col">
							<ul class="social-buttons">
								<li><a href="#"><i class="fa fa-twitter"></i></a>
								</li>
								<li><a href="#"><i class="fa fa-facebook"></i></a>
								</li>
								<li><a href="#"><i class="fa fa-linkedin"></i></a>
								</li>
							</ul>
						</div>
					</div>
					<div class="col-1-3">
						<div class="wrap-col">
							<ul class="quick-link">
								<li><a href="#">Privacy Policy</a></li>
								<li><a href="#">Terms of Use</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</footer>

	<!-- Resource jQuery -->
	<script src="js/jquery-2.1.1.js"></script>
	<!-- Slider -->
	<script src="js/jquery.flexslider-min.js"></script>
	<script src="js/main.js"></script> 
	<!-- Countdown -->
	<script src="js/jquery.mb-comingsoon.min.js"></script>
	<script type="text/javascript">
		$(function () {
			$('#myCounter').mbComingsoon({ expiryDate: new Date(2016, 0, 1, 9, 30), speed:100 });
			setTimeout(function () {
				$(window).resize();
			}, 200);
		});
	</script>
</div>
</body></html>