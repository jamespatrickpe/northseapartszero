<%@include file="../templates/header.jsp" %>

<div class="row">
 <div class="large-12 columns text-center">
	 <div style="height:15%">
	 </div>
 </div>
</div> 

<div class="row">
	<div class="large-4 columns">
	<br>
	</div>
	<div class="large-4 columns">
	<h1> Please Sign In </h1>
	<form method="POST" action="processlogin">
		<div class="row">
		<input type="text" placeholder="Username or Email" />
		<input type="text" placeholder="Password" />
		</div>
		<div class="row text-right">
		Remember Me: <input type="checkbox" /> <br>
		<input type="reset" class="button" value="Reset" >
		<input type="submit" class="button" value="Sign In">
		</div>
	</form>
	</div>
	<div class="large-4 columns">
	<br>
	</div>
</div>

<div class="row">
 <div class="large-12 columns text-center">
	 <div style="height:15%">
	 </div>
 </div>
</div> 

<%@include file="../templates/footer.jsp" %>