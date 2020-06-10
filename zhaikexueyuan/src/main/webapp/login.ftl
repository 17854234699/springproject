<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <style>
        .register-button{
            background-color: lightskyblue;
            width: 166px;
        }
        #getNum{
            width: 166px;
        }
        .goRegister{
            background-color: lightskyblue;
            width: 166px;
            text-align: center;
        }
        #loginBox{
            float: left;
        }
    </style>
</head>
<body>
<div id="loginBox">
    <div class="login-changeTab">
        <div class="login-register-box">
            <div class="login-register clearfix">
                <div class="register-button" align="center">短信验证码登录</div>
            </div>
            <div class="register-content">
                <div class="registerUsernameBox">
                    <input type="tel" class="Rusername"  maxlength="11" placeholder="请输入手机号" regex="^[1][3,4,5,7,8][0-9]{9}$"/>
                    <span></span>
                </div>
                <div class="registerPassword">
                    <input type="number" class="phone" maxlength="6" placeholder="请输机验证码"/>
                    <br />
                    <input type="button" id="getNum" value="获取验证码">
                    <span></span>
                </div>
                <div class="goRegister">登录</div>
            </div>
        </div>
    </div>
</div>
<#--<script type="text/javascript" src="js/login.js"></script>-->
获取访问数字:${nums}
</body>
</html>
