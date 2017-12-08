$(document).ready(function(){
    $.each($(".testBlock"), function( index, value ) {
        var content = '';
        var result = {
            'idCompletedTest' : value.id,
            'idCompletedUser': $(".welcome").data("id"),
        };
        $.ajax({
            type: "POST",
            url: window.location.origin + "/testSystem/main/getCompleteTest",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: JSON.stringify(result),
            cache: false,
            success: function (s) {
                content += '<div class="alert alert-success">\n' +
                    'The test was passed on ' + s.percent + '%' + '\n' +
                    '</div>\n';
                $(value).children(".completedArea").html(content);
                $(value).children(".test").prop("disabled", true);
            },
            error: function (e) {
                content += '<div class="alert alert-info">\n' +
                    'The test not yet passed' + '\n' +
                    '</div>\n';
                $(value).children(".completedArea").html(content);
            }
        });
    });

});