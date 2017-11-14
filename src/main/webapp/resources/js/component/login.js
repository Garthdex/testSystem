$(document).ready(function(){
    $('.registerLink').click(function(e){
        e.preventDefault();
        $('.loginDiv').hide();
        $('.loginDiv').prop("disabled", true);
        $('.registerDiv').show();
        $('.registerDiv').prop("disabled", false);
    });

    $('.loginLink').click(function(e){
        e.preventDefault();
        $('.registerDiv').hide();
        $('.registerDiv').prop("disabled", true);
        $('.loginDiv').show();
        $('.loginDiv').prop("disabled", false);
    });
});