<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>moviedetail</title>
<style>
body {
    background: #363636;
}
.inline {
    float: left;
}

#Information {
    color: white;
    width : 100%;
    
}
/* story 보드 및 전체 포함(이미지뺴고) */
#summary {
    color: white;
    width : 66%;
   
}

.inline{

}

div {
    border: 1px;
    box-sizing: border-box;
}

p {
    color: white;
    text-align: center;

}

#wrapper {
    width: 1190px;
    height: 1400px;
    margin: auto;
    border: 1px solid white;
}

#header {
    width: 100%;
    height: 10%;
    border: 1px solid white;
}

#content {
    width: 100%;
    height: 80%;
}

#footer {
    background-color: rgb(24, 24, 24);
    width: 100%;
    height: 10%;
    border: 1px solid white;
}

.header {
    float: left;
    border: 1px solid white;
}

#header-menu {
    width: 5%;
    height: 100%;
    position: relative;
}

#header1 {
    width: 15%;
    height: 100%;
}

#header2 {
    width: 55%;
    height: 100%;
    position: relative;
}

#header2 > #search-form {
    width: 70%;
    height: 40%;

    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    position: absolute;
    margin: auto;
}

#search-text-area {
    height: 100%;
    width: 85%;
    float: left;
}

#search-btn-area {
    height: 100%;
    width: 15%;
    float: left;
}

#search-input {
    width: 100%;
    height: 100%;
    box-sizing: border-box;
    border-top-right-radius: 10px;
    border-bottom-right-radius: 10px;
}

#search-btn {
    width: 100%;
    height: 100%;
    box-sizing: border-box;
    border-top-left-radius: 10px;
    border-bottom-left-radius: 10px;
}

#header3 {
    width: 25%;
    height: 100%;
    padding: 6px 8px 6px 16px;
    position: relative;
}

#header3 a {
    text-decoration: none;
    font-size: 18px;
    color: #a49e9e;
    display: block;
    font-weight: bold;
    float: left;
    margin: 0 8px;
    top: 0;
    bottom: 0;
    position: absolute; 

}

#logform {
    width: 60%;
    height: 20%;

    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    margin: auto;
    position: absolute; 
}

#loginform {
    height: 100%;
    width: 50%;
    float: left;
}

#joinform {
    height: 100%;
    width: 50%;
    float: left;
}

#header3 a:hover {
    color: #f1f1f1;
}

#content1 {
    width: 100%;
    height: 35%;
}

#content2 {
    width: 100%;
    height: 32.5%;
}

#content3 {
    width: 100%;
    height: 32.5%;
}

html.open { 
    overflow: hidden; 
} 

.btn { 
    width: 100%; 
    height: 100%; 
    position: absolute; 
    left: 0px; 
    top: 0px; 
    z-index: 1; 
    background-size: 50%; 
    background-repeat: no-repeat; 
    background-position: center; 
    cursor: pointer; 
} 

.close { 
    width: 50px; 
    height: 50px; 
    position: absolute; 
    right: 0px; 
    top: 0px; 
    background-size: 50%; 
    background-repeat: no-repeat; 
    background-position: center; 
    cursor: pointer; 
}

#menu a {
    padding: 10px 40px 10px 20px;
    text-decoration: none;
    font-size: 25px;
    color: #818181;
    display: block;
    font-weight: bold;
    float: left;
} 

#menu a:hover {
    color: #f1f1f1;
} 

#menu { 
    width: 250px; 
    height: 100%; 
    position: fixed; 
    top: 0px; 
    left: -252px; 
    z-index: 10; 
    background-color: black; 
    text-align: center; 
    transition: All 0.2s ease; 
    -webkit-transition: All 0.2s ease; 
    -moz-transition: All 0.2s ease; 
    -o-transition: All 0.2s ease; 
}

#menu.open { 
    left: 0px; 
} 

.page_cover.open { 
    display: block; 
} 

.page_cover { 
    width: 100%; 
    height: 100%; 
    position: fixed; 
    top: 0px; 
    left: 0px; 
    background-color: rgba(0,0,0,0.4); 
    z-index: 4; 
    display: none; 
}

/*=============별점============*/
.star_rating {font-size:0; letter-spacing:-4px;}
.star_rating a {
    font-size:30px;
    letter-spacing:0;
    display:inline-block;
    margin-left:5px;
    color:#ccc;
    text-decoration:none;
}
.star_rating a:first-child {margin-left:0;}
.star_rating a.on {color:yellow;}
/*==============   상세페이지 전체=======================*/
#Information{
    

}
#Average{
   

}
#story{
    
     margin-top: -7%;
}
.star_rating{
   

}
#detail{

}
.Attention{
    

}
#comment-input{
    margin-top: 12%;
    
}


/*====================리뷰 전체페이지==================*/
#form-commentInfo{ width: 100%; 
} 
  #comment-count{ margin-bottom: 10px; }

  #comment-input{     width: 100%; height: 100px;
}  
  #submit{ background-color: rgb(0, 128,255); width: 5.5em; height: 3.3em;; font-size: 15px; font-weight: bold; color: aliceblue; 
}
   #comments{ margin-top: 10px;
    } 


  
   </style>
</head>
<body>

    <div id="wrapper">
        <div id="header">
            <div class="header" id="header-menu">
                <div class="btn">
                    <svg xmlns="http://www.w3.org/2000/svg" width="100%" height="100%" fill="currentColor"
                        class="bi bi-justify" viewBox="0 0 16 16">
                        <path fill-rule="evenodd"
                            d="M2 12.5a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5zm0-3a.5.5 0 0 1 .5-.5h11a.5.5 0 0 1 0 1h-11a.5.5 0 0 1-.5-.5z">
                        </path>
                    </svg>
                </div>
            </div>
            <div class="header" id="header1">
                <p>로고</p>
            </div>
            <div class="header" id="header2">
                <form id="search-form">
                    <section id="search-btn-area">
                        <button type="submit" id="search-btn"><svg xmlns="http://www.w3.org/2000/svg" width="16"
                                height="16" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
                                <path
                                    d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z">
                                </path>
                            </svg></button>
                    </section>
                    <section id="search-text-area">
                        <input type="text" id="search-input" name="search-input" placeholder="  보고싶은 영화를 검색해보세요.">
                    </section>

                </form>
            </div>
            <div class="header" id="header3">

                <form id="logform">
                    <section id="loginform">
                        <a href="#">로그인</a>
                    </section>
                    <section id="joinform">
                        <a href="#">회원가입</a>
                    </section>
                </form>
            </div>
        </div>
        <div onclick="history.back();" class="page_cover"></div>
        <div id="menu" class="">
            <div onclick="history.back();" class="close">
                <svg xmlns="http://www.w3.org/2000/svg" width="100%" height="100%" fill="white" class="bi bi-x-circle"
                    viewBox="0 0 16 16">
                    <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"></path>
                    <path
                        d="M4.646 4.646a.5.5 0 0 1 .708 0L8 7.293l2.646-2.647a.5.5 0 0 1 .708.708L8.707 8l2.647 2.646a.5.5 0 0 1-.708.708L8 8.707l-2.646 2.647a.5.5 0 0 1-.708-.708L7.293 8 4.646 5.354a.5.5 0 0 1 0-.708z">
                    </path>
                </svg>
            </div>
            <br><br><br><br>
            <a href="#">마이페이지</a><br>
            <a href="#">관심 영화</a><br>
            <a href="#">Watcha Party</a><br>
            <a href="#">Netflix Party</a><br>
            <a href="#">Q&amp;A</a><br>
            <a href="#">STORE - Goods</a><br>
            <a href="#">STORE - Ticket</a><br>
            <!-- ==================================여기서부터 바디내용 시작-======================================-->
        </div>
        <!-- 이미지-->
        <div class="moviemain">
            <div id="movieimg" class="inline">
                <img src="https://nujhrcqkiwag1408085.cdn.ntruss.com/static/upload/movie_poster_images/movie_436_1556125945.jpg
            " style width="400px" height="500px">
            </div>

 </div>   <div id="summary" class="inline">
    <div id="Information">
        <br>
        <h2>블레이드 러너 2049</h2> 
        <h3>2017 미국/캐나다/ 액션</h3>
        <h4> 감독: 드니 빌뇌브 15</h4> 
        <div id="Average">
            <h3>평균:</h3> </div>

        
    </div>
    <br><br>
    <div id=" story">
    <h2>기본정보</h2> 
    <br>
    인간과 리플리컨트가 혼재된 2049년. 인간의 통제를 벗어난 리플리컨트를 쫓는 블레이드 러너 K는 임무 수행 도중 약 30년 전 여자 리플리컨트의 유골을 발견하고 충격적으로 출산의
    흔적까지 찾아낸다. 리플리컨트가 출산까지 가능하다는 사실이 알려지면 사회에 큰 혼란이 야기되므로 이를 덮으려는 경찰 조직과,
    그 비밀의 단서를 찾아내 더욱 완벽한 리플리컨트를
    거느리고 세상을 장악하기 위해 K를 쫓는 니안더
    월레스. 리플리컨트의 숨겨진 진실에 접근할수록
    점차 정체성의 혼란을 겪게 되는 K는 과거 블레이드 러너
    였던 릭 데커드를 만나 전혀 상상치 못한
    진실을 마주하게 되는데.. 
</div>
           <!--  별점 -->
           <div class="star_rating" >
            <a href="#" class="on">★</a>
            <a href="#" class="on">★</a>
            <a href="#" class="on">★</a>
            <a href="#">★</a>
            <a href="#">★</a>
        </div>

        <!--    버튼-->      
        <div class="Attention">
            <button class="button">관심목록</button>
        </div>
    <details id="detail">
        <summary><h3>더보기</h3></summary>
        <p> 시간남으면 유투브 리소스로 영화예고편 or 영화 주연배우들 넣을 계획</p>
      </details>
</div>

<!-- -->
    <div id="form-commentInfo">
           
    <input id="comment-input" placeholder="댓글을 입력해 주세요.">
    <button id="submit">등록</button>
    <div id="comment-count">댓글 <span id="count">0</span></div> 
   <div class="score">
       <ul>
           <li>
               
              <div class="star_score">★★★★★ <em>별점점수</em></div> 
              <span class="st_on"></span>
              
              <div class="score_reple">
                    <p id="score">
                    <!-- 스포일러 컨텐츠로 처리되는지 여부 -->
                 <h3>wwwww</h3>>
    </p>
    <dl>
        <dt>
            <em>
                <a href="#" onclick="javascript:showPointListByNid(16402064);return false;">
                    <span>베베(alfn****)    yy/mm/dd</span> 
                </a>
                <!--줄바꿈-->
                <hr>
            </em>
       
        </dt>
        
    </dl>
    </div>
    
    </li>
    <li>
               
        <div class="star_score">★★★★★<em>별점점수</em></div> 
        <span class="st_on"></span>
        
        <div class="score_reple">
              <p id="score">
              <!-- 스포일러 컨텐츠로 처리되는지 여부 -->
           <h3>wwwww</h3>>
</p>
<dl>
  <dt>
      <em>
          <a href="#" onclick="javascript:showPointListByNid(16402064);return false;">
              <span>베베(alfn****)    yy/mm/dd</span> 
          </a>
          <!--줄바꿈-->
          <hr>
      </em>
 
  </dt>
  
</dl>
</div>

</li>
    </ul>
    </div>
    </div>
   
            </div>

 
    <div id="footer">
        <p>
            © 2021 MOVIEJAVA | 요금제 및 소개 : NETFLIX(넷플릭스) | 왓챠플레이<br>
            Data &amp; Content Image Based On Netflix.inc , Watcha.inc, TVNNG<br>
            <br><br>
            Copyright© 2021, Moviejava , All Rights Reserved.
        </p>
    </div>
    </div>
   <script>

        $(".btn").click(function () {
            $("#menu,.page_cover,html").addClass("open");
            window.location.hash = "#open";
        });

        window.onhashchange = function () {
            if (location.hash != "#open") {
                $("#menu,.page_cover,html").removeClass("open");
            }
        };
    </script>
    <script>
        // html dom 이 다 로딩된 후 실행된다.
        $(document).ready(function () {
            // menu 클래스 바로 하위에 있는 a 태그를 클릭했을때
            $(".menu>a").click(function () {
                var submenu = $(this).next("ul");

                // submenu 가 화면상에 보일때는 위로 보드랍게 접고 아니면 아래로 보드랍게 펼치기
                if (submenu.is(":visible")) {
                    submenu.slideUp();
                } else {
                    submenu.slideDown();
                }
            });
        });
    </script>
    
    <!--  별점 기능 -->
    <script>
        $(".star_rating a").click(function () {
            $(this).parent().children("a").removeClass("on");
            $(this).addClass("on").prevAll("a").addClass("on");
            return false;
        });


    </script>
    <!-- 댓글 150자이상 금지 -->
<script>
    $(document).ready(function(){
        // textarea에서 keyup 이벤트 발생했을 경우
        $("textarea").keyup(function(){
            // textarea의 길이 값 저장
            var inputLength = $(this).val().length;
            $("#counter").html(inputLength);

            var remain = 150 - inputLength;

            if(remain >= 0)
                $("#counter").css("color", "black");
            else
                $("#counter").css("color", "red");
        });
    });
</script>

</body>
</html>