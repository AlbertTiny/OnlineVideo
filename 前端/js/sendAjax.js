//用于发送ajax请求
function sendAjax(btnName, url, tbodyName, modelName) {
    $("#" + btnName).click(function() {
        //此处弹出模态框
        $.ajax({
            url: url,
            type: "get",
            success: function(data) {
                $("#" + tbodyName).text(" ");
                $.each(data.cartoons, function(index, data) {
                    console.log(data)
                    $("#" + tbodyName).append("<tr id=" + tbodyName + index + "><tr>");
                    $("#" + tbodyName + index).append("<td>" + data.name + "<td>")
                    $("#" + tbodyName + index).append("<td><button class='btn btn -default detail' type='submit' id='" + data.url + "' data-sig='" + modelName + "'>点击观看</button><td>")
                });
            }
        });
        $('#' + modelName).modal({
            backdrop: "static"
        })
    })
}