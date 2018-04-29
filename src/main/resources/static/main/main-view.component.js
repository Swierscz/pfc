angular.module('mainPageView', {
    templateUrl: 'main/main-view.template.html',

    controller: function RandomNumberController($http) {
        var self = this;
        $http.get('api/random').then(function (response) {
            self.randoms = response.data;
        });
    }

});