<!<html>
    <head>
        <title><g:message code="springSecurity.login.title"/></title>
        <link rel="icon" href="${resource(dir: 'images', file: 'favicon.ico?v=2')}" type="image/x-icon" />
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'flatly.css')}" type="text/css">
        <link rel="stylesheet" href="${resource(dir: 'css', file: 'font-awesome.min.css')}" type="text/css">
        <script src="${resource(dir: 'js/ext', file: 'jquery-2.1.4.min.js')}" type="text/javascript" ></script>
        <style>
            .center-c{
            width: 100%;
            min-height: 100vh;
            position: relative;
            background: url(${resource(dir: 'images', file: 'f1.jpg')}),url(${resource(dir: 'images', file: 'f1.jpg')});
            background-position: center center, center center;
            background-size:auto, cover; 
            background-repeat: repeat, no-repeat;
            }


            .center-b{
            position: absolute!important;
            top: 50%;
            left: 50%;
            transform: translate(-50%,-50%);
            -webkit-transform:translate(-50%,-50%);
            }
            .bg-50{
            border: none;
            background-color: transparent;
            }
            .bg-50-blanco{
            border: none;
            border-bottom: 2px solid white;
            background-color: rgba(0,0,0,.3);
            }
            .bg-50-blanco:focus{
            background-color: rgba(0,0,0,.3);
            }
            .texto-blanco{
            color: #ffffff;
            }
        </style>
    </head>

    <body>
        <div class=" center-c">
            <div class="col-lg-3 col-xs-12 center-b text-center">
                <div class="panel panel-default bg-50">
                    <div class="panel-body">
                        <img class="img-responsive center-block" width="150" src="${resource(dir: 'images', file: 'bamx.png')}" alt="Logo" />
                        <h1 class="texto-blanco" style="margin-top: -20px;"><strong>BAMX</strong><br />
                            <small class="texto-blanco">Inicio de sesion</small></h1>
                        <br>
                        <g:if test='${flash.message}'>
                            <div class="alert alert-dismissible alert-danger">
                                <p>${flash.message}</p>
                            </div>
                        </g:if>

                        <form action='${postUrl}' method='POST' id='loginForm' class="form-horizontal" autocomplete='off'>
                            <div class="form-group form-group-lg">
                                <div class="col-lg-10 col-lg-offset-1">
                                    <input type='text' class="form-control bg-50-blanco" style="color: white;" placeholder="Usuario" name='j_username' id='username'/>
                                </div>
                            </div>


                            <div class="form-group form-group-lg">
                                <div class="col-lg-10 col-md-offset-1">
                                    <input type='password' class="form-control bg-50-blanco" style="color: white;" placeholder="Contraseña" name='j_password' id='password'/>
                                </div>
                            </div>
                            <div class="form-group">
                                <input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if>/>
                                <label for='remember_me'><g:message code="springSecurity.login.remember.me.label"/></label>
                            </div>
                            <div class="form-group">
                                <div class="col-lg-10 col-md-offset-1">
                                    <button type='submit' class="btn btn-danger btn-lg btn-block"  id="submit" ><i class="fa fa-sign-in"></i> Entrar </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script type='text/javascript'>
            (function() {
            document.forms['loginForm'].elements['j_username'].focus();
            window.localStorage.removeItem('iiinnn');
            })();
        </script>
    </body>
</html>