$(document).ready(function(){
    $.each($("button:submit"), function( index, value ) {
        content = '';
        $.ajax({
            type: "POST",
            url: window.location.origin + "/testSystem/main/getCompleteTest",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: {
                'idTest' : value.id,
                'idUser': $(".welcome").data("id")
                },
            cache: false,
            success: function (s) {
                content += '<div class="alert alert-success">\n' +
                    'The test was passed on' + s.percent + '\n' +
                    '</div>\n';
                $(".completedArea").html(content);
                $(".test").prop("disabled", true);
            },
            error: function (e) {
                content += '<div class="alert alert-info">\n' +
                    'The test not yet passed' + '\n' +
                    '</div>\n';
                $(".completedArea").html(content);
            }
        });
    });

});