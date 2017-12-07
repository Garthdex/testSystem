$(document).ready(function(){

    var answers = [];
    $(".saveAnswers").on("click", function (e) {
        $.each($("input:radio"), function( index, value ) {
            if (value.checked) {
                answers.push(value.id);
            }
        });
        $.ajax({
            type: "POST",
            url: window.location.origin + "/testSystem/main/test/done",
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: JSON.stringify(answers),
            cache: false,
            success: function () {
                document.location.replace(document.location.origin + "/testSystem/main");
            },
            error: function (e) {
                alert(e.responseText);
            }
        });
    });
});