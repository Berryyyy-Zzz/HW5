$(function(){
    //菜单点击
    J_iframe
    $("#side-menu").on('click','li .J_menuItem',function(){
        var url = $(this).attr('href');
        $("#J_iframe").attr('src',url);
        return false;
    });
});