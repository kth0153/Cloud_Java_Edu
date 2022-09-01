<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <script >
	function Javascript() {
		var id = document.getElementById("divid"); //div 공간 id 값 입력
		id.innerHTML = "<hr><br><h1>안녕하세요</h1>"; // div 공간 id 에 html 테그 입력
		
		var divclass = document.getElementsByClassName("divclass"); //div 공간 class 값 입력
		
		divclass[0].innerHTML="<h2>안녕하세요</h2>"; // div 공간 class에 html 테그 입력
		
	}
	
	function JavascriptLession_1(){
// 		var : object -> 모든 타입을 받을 수 있다.
// 		var string 문자열 int number
		// 싱글쿼터 -> 문자열
		// ctrl shift f 들여쓰기
		
		var name ='김현호';
		
		var divid = document.getElementById("divid");
		divid.innerText=name;
		
		
	}
	
 	function JavascriptLession_2(){
 		// 정수형 : 10
 		var intvalue = 10;
		
 		var result=intvalue+10;
 		alert(result);
		
 	}
	
	function JavascriptLession_3(){
		
		var divclass = document.getElementsByClassName("divclass");
		// class 저장
		
		var name = '김현호';
		
		if(name == '김현호'){
		divclass[0].innerText="맞습니다."; // class 값은 배열로 정렬된다.
			
		}else {
			
			divclass[0].innerText="틀립니다.";
			
		}
	}
		
		function JavascriptLession_4() {
			var max = 10;
			var result = 0;
			
			var one = 0;
			var two = 0;
			
			
			
			for(var i = 1; i<=max;i++){
				result = result + i;
// 				console.log(i); // 콘솔 출력
				if(i%2==0){
					two=two+i;
				}else{
					one=one+i;
				}
			console.log('짝수'+two);
			console.log('홀수'+one);
			}
		}
		
		function JavascriptLession_5() {
			var max =10;
			var init =0;
			
			var one = 0;
			var two = 0;
			
			// 3,6,9 을 뺀 짝수 홀수 합을 구해서 출력하시오
			// alert, id, class, console, for, while, do while
				
// 			for(var i = 1; i<=max; i++){
// 				if(i%3 !=0){
					
// 					if(i%2==0){
						
// 						two=two+i;
// 					}else{
						
// 						one=one+i;
// 					}
// 				}
// 			}
			
			var i = 0;
			while(++i<=max){
					if(i%3 !=0){
					
					if(i%2==0){
						
						two=two+i;
					}else{
						
						one=one+i;
					}
				}
				
			}
			
				console.log('짝수 합 :'+two);
				console.log('홀수 합 :'+one);
				var divclass = document.getElementsByClassName("divclass");
				divclass[0].innerText = two;
			
// 			while(++init <= max){
// 				console.log(init);
// 			}
		}
		
		
	
</script>
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onload="Javascript()">

	<!--div:테이블 웹표준  -->
	<form action="">
	
	<div id="divid">
		
	
	</div>
	<div class ="divclass">
	
	
	</div>
	
	<input type="button" value="lession1" onclick="JavascriptLession_1()">
	<input type="button" value="lession2" onclick="JavascriptLession_2()">
	<input type="button" value="lession3" onclick="JavascriptLession_3()">
	<input type="button" value="lession4" onclick="JavascriptLession_4()">
	<input type="button" value="lession5" onclick="JavascriptLession_5()">
	</form>

</body>
</html>