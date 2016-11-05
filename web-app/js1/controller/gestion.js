angular.module('Escuela').controller('gestionController',
        ['$scope', '$rootScope', '$http', '$sce', 'CONFIG_URL',
            function ($scope, $rootScope, $http, $sce, CONFIG_URL) {

                //lista de los grupos
                $scope.grupos = [];

                //lista de areas
                $scope.areas = [];

                //listaSexo
                $scope.sexos = [];

                //listar los estados civiles
                $scope.estadosCiviles = [];
                
                 $scope.tipoTelefonos = [];

                //objeto de la persona
                $scope.persona = {correoElectronicos: [], rfcs: {}, nacionalidad: [], telefono: {}};
                $scope.personas = [];

                //eliminar Correo
                $scope.eliminadas = [];


                $scope.grupo = {};
                $scope.area = {};

//seleccion de nacionalidades
                $scope.seleccionados = [];
//seleccion de nacionalidades
                $scope.accion = 0;
                $scope.indice = 0;


                $scope.dateOptions = {
                    formatYear: 'yy',
                    startingDay: 1
                };


//multicelect---------------
                $scope.isCollapsed = true;

//multicelect---------------



                $scope.hacerAccion = function () {
                    switch ($scope.accion) {
                        case 1:
                            $scope.agregarGrupo();
                            break;
                        case 2:
                            $scope.modificarGrupo();
                            break;
                        case 3:
                            $scope.agregarArea();
                            break;
                        case 4:
                            $scope.modificarArea();
                            break;
                        case 5:
                            $scope.agregarPersona();
                            break;


                        default:
                            break;
                    }
                    $rootScope.cambiarAccion(0);
                };




                $scope.eliminarCorreo = function (idCorreo, indiceListaCorreo) {
                    if (angular.isNumber(idCorreo)) {
                        $scope.eliminadas.push(idCorreo);
                    }
                    console.log($scope.eliminadas);
                    $scope.persona.correoElectronicos.splice(Number(indiceListaCorreo), 1);

                };




                $scope.generarCadena = function (n) {
                    var cadena = "";
                    var abc;

                    abc = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "u", "v", "w", "x", "y", "z"];

                    for (var i = 0; i < n; i++) {
                        cadena = cadena + abc[Math.floor(Math.random() * (25))];
                    }

                    return cadena;
                };




                $scope.verAccion = function (accion) {
                    return $scope.accion === accion;

                };

                $rootScope.cambiarAccion = function (accion) {
                    $scope.accion = accion;
                    if ($scope.accion === 0) {
                        $scope.grupo = {};
                    } else {
                        //$rootScope.modificar();
                    }
                };


                $scope.agregarPersona = function () {
                    console.log("apenas voy")
                    $http.get(CONFIG_URL.url + 'gestion/agregarPersona', {params: {persona: $scope.persona, selected: $scope.seleccionados}, headers: {'Per-Res': 'permres'}}).then(function (res) {
                        if (res.data.respuesta) {
                            $scope.personas.push(res.data.persona);
                        }
                    }, $rootScope.errorhttp);
                };

                $scope.toggle = function (item, list) {
                    var idx = list.indexOf(item);
                    if (idx > -1) {
                        list.splice(idx, 1);
                    } else {
                        list.push(item);
                    }
                    console.log(list);
                    console.log('nacionalidades ' + $scope.seleccionados);
                };


                this.listarSexos = function () {
                    $http.get(CONFIG_URL.url + 'gestion/listarSexo').then(function (res) {
                        if (res.data.respuesta) {
                            $scope.sexos = res.data.sexos;
                        }
                    }, $rootScope.errorhttp);
                };
                this.listarSexos();


                this.listarNacionalidades = function () {
                    $http.get(CONFIG_URL.url + 'gestion/listarNacionalidad').then(function (res) {
                        if (res.data.respuesta) {
                            $scope.nacionalidad = res.data.nacionalidades;
                        }
                    }, $rootScope.errorhttp);
                };
                this.listarNacionalidades();


                this.listarEstadoCivil = function () {
                    $http.get(CONFIG_URL.url + 'gestion/listarEstadoCivil').then(function (res) {
                        if (res.data.respuesta) {
                            $scope.estadosCiviles = res.data.estadosCiviles;
                        }
                    }, $rootScope.errorhttp);
                };
                this.listarEstadoCivil();



                this.listarGrupos = function () {
                    $http.get(CONFIG_URL.url + 'gestion/listarGruposAdministrativos').then(function (res) {
                        if (res.data.respuesta) {
                            $scope.grupos = res.data.grupos;
                        }
                    }, $rootScope.errorhttp);
                };
                this.listarGrupos();


                this.listarAreas = function () {
                    $http.get(CONFIG_URL.url + 'gestion/listarAreasAdministrativas').then(function (res) {
                        if (res.data.respuesta) {
                            $scope.areas = res.data.areas;
                        }
                    }, $rootScope.errorhttp);
                };
                this.listarAreas();




                $scope.agregarGrupo = function () {
                    console.log("apenas voy a registrar cursos");
                    $http.get(CONFIG_URL.url + 'gestion/agregarGrupo', {params: {grupo: $scope.grupo}}).then(function (res) {
                        console.log("pase una prueba");
                        if (res.data.respuesta) {
                            console.log("entre a lo de cursos");
                            $scope.grupos.push(res.data.grupo);

                        }
                    });
                };




                this.prepararGrupo = function (gru, i) {
                    angular.copy(gru, $scope.grupo);
                    $scope.cambiarAccion(2);
                    $scope.indice = Number(i);

                };


                $scope.modificarGrupo = function () {
                    console.log("amos empezando");
                    $http.get(CONFIG_URL.url + 'gestion/modificarGrupo', {params: {grupo: $scope.grupo}, headers: {'Per-Res': 'permres'}}).then(function (res) {
                        console.log("hay pedos antes");
                        if (res.data.respuesta) {
                            console.log("si entre");
                            $scope.grupos[$scope.indice] = res.data.grupo;
                        }
                        $scope.indicegrupo = 0;
                    }, $rootScope.errorhttp);
                };


                this.eliminarGrupo = function (id, i) {
                    if (confirm("¿Desea  eliminar el Grupo?")) {
                        $http.get(CONFIG_URL.url + 'gestion/eliminarGrupo', {params: {id: id}}).then(function (res) {
                            if (res.data.respuesta) {
                                $scope.grupos.splice(Number(i), 1);

                            }
                        }, $rootScope.errorhttp);
                    }
                };



///----------gestion de areas


                $scope.agregarArea = function () {
                    console.log("apenas voy a registrar cursos");
                    $http.get(CONFIG_URL.url + 'gestion/agregarArea', {params: {area: $scope.area}}).then(function (res) {
                        console.log("pase una prueba");
                        if (res.data.respuesta) {
                            console.log("entre a lo de cursos");
                            $scope.areas.push(res.data.area);

                        }
                    });
                };


                this.prepararArea = function (ar, i) {
                    angular.copy(ar, $scope.area);
                    $scope.cambiarAccion(4);
                    $scope.indice = Number(i);

                };


                $scope.modificarArea = function () {
                    console.log("amos empezando");
                    $http.get(CONFIG_URL.url + 'gestion/modificarArea', {params: {area: $scope.area}, headers: {'Per-Res': 'permres'}}).then(function (res) {
                        console.log("hay pedos antes");
                        if (res.data.respuesta) {
                            console.log("si entre");
                            $scope.areas[$scope.indice] = res.data.area;
                        }
                        $scope.indicegrupo = 0;
                    }, $rootScope.errorhttp);
                };


                this.eliminarArea = function (id, i) {
                    if (confirm("¿Desea  eliminar esta area?")) {
                        $http.get(CONFIG_URL.url + 'gestion/eliminarArea', {params: {id: id}}).then(function (res) {
                            if (res.data.respuesta) {
                                $scope.areas.splice(Number(i), 1);

                            }
                        }, $rootScope.errorhttp);
                    }
                };





                //CALENDARIO
                $scope.today = function () {
                    $scope.dt = new Date();
                };
                $scope.today();

                $scope.clear = function () {
                    $scope.dt = null;
                };

                $scope.inlineOptions = {
                    customClass: getDayClass,
                    minDate: new Date(),
                    showWeeks: true
                };

                $scope.dateOptions = {
                    dateDisabled: disabled,
                    formatYear: 'yy',
                    maxDate: new Date(2020, 5, 22),
                    minDate: new Date(),
                    startingDay: 1
                };

                // Disable weekend selection
                function disabled(data) {
                    var date = data.date,
                            mode = data.mode;
                    return mode === 'day' && (date.getDay() === 0 || date.getDay() === 6);
                }

                $scope.toggleMin = function () {
                    $scope.inlineOptions.minDate = $scope.inlineOptions.minDate ? null : new Date();
                    $scope.dateOptions.minDate = $scope.inlineOptions.minDate;
                };

                $scope.toggleMin();

                $scope.open1 = function () {
                    $scope.popup1.opened = true;
                };

                $scope.open2 = function () {
                    $scope.popup2.opened = true;
                };

                $scope.setDate = function (year, month, day) {
                    $scope.dt = new Date(year, month, day);
                };

                $scope.formats = ['dd-MMMM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
                $scope.format = $scope.formats[0];
                $scope.altInputFormats = ['M!/d!/yyyy'];

                $scope.popup1 = {
                    opened: false
                };

                $scope.popup2 = {
                    opened: false
                };

                var tomorrow = new Date();
                tomorrow.setDate(tomorrow.getDate() + 1);
                var afterTomorrow = new Date();
                afterTomorrow.setDate(tomorrow.getDate() + 1);
                $scope.events = [
                    {
                        date: tomorrow,
                        status: 'full'
                    },
                    {
                        date: afterTomorrow,
                        status: 'partially'
                    }
                ];

                function getDayClass(data) {
                    var date = data.date,
                            mode = data.mode;
                    if (mode === 'day') {
                        var dayToCheck = new Date(date).setHours(0, 0, 0, 0);

                        for (var i = 0; i < $scope.events.length; i++) {
                            var currentDay = new Date($scope.events[i].date).setHours(0, 0, 0, 0);

                            if (dayToCheck === currentDay) {
                                return $scope.events[i].status;
                            }
                        }
                    }

                    return '';
                }
                //------------


            }]);






