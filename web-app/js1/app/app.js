/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

angular.module('Escuela', ['ui.bootstrap', 'angular-loading-bar', 'ngTouch', 'ngAnimate', 'ngMaterial', 'ngMessages'])

        .constant('CONFIG_URL', {
            url: window.location.origin + "/Escuela/"
    
        })//se tiene que inyectar la configuracion de la url
        .controller('principal', ['$rootScope', '$scope', '$http','$sce', 'CONFIG_URL', '$uibModal',
            function ($rootScope, $scope, $http, $sce, CONFIG_URL, $uibModal) {
                console.log(CONFIG_URL);
                $rootScope.info = {}; //maneja indormacion
                $rootScope.notificaciones = []; //maneja una lista
                $scope.isCollapsed = true; //expander el menu
                this.curl=CONFIG_URL; //guardar en la variable
                //
                //se crea la funcion de cargara informacion
                $scope.cargarInformacion = function () {
                    
                    if (window.localStorage.getItem("iiinnn")) { //almacenar informacion en el navegador
                        $rootScope.info = JSON.parse(window.localStorage.getItem("iiinnn"));
                    } else {
                        $http.get('obtenerPersona', {
                            headers: {'Per-Res': 'permres'}})
                                .then(function (res) {
                                    window.localStorage.setItem("iiinnn", JSON.stringify(res.data.perfil));
                                    $rootScope.info = res.data.perfil;
                                }, $rootScope.errorhttp); //captura los errores es por si lo hace mal
                    }
                };
                $rootScope.errorhttp = function (res) {
                    switch (Number(res.status)) {
                        case 403:
                            $rootScope.notificacion("danger", "No tienes permisos para realizar esto");
                            break;
                        case 500:
                            $rootScope.notificacion("danger", "Problemas en el servidor, revise al admin");
                            break;
                        default:
                            $rootScope.notificacion("danger", "Ocurrio un problema")
                    }
                };

                $rootScope.notificacion = function (tipo, mensaje) {
                    $rootScope.notificaciones.push({tipo: tipo, mensaje: mensaje});
                };
                //funcion que devuelva una cadena de letras aleatorias indicando el numero de letras
               
                $scope.cargarInformacion();
            }]);





