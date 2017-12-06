$(document).ready(function(){
    $(".saveAnswers").on("click", function (e) {
        $.each($("input:radio"), function( index, value ) {
            if (value.checked) {
                alert(value.id);
            }
        });
    });
});