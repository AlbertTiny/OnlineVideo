function opencommonModel(btnName, url) {
    $("#" + btnName).click(function() {
        //此处弹出模态框

        $.ajax({
            url: url,
            type: "get",
            success: function(data) {
                $("#tbody_Common").text(" ");
                $("#myModalLabel_Common").text(data.cartoons[0].type);
                $.each(data.cartoons, function(index, data) {
                    console.log(data)
                    $("#tbody_Common").append("<tr id=tbody_Common" + index + "><tr>");
                    $("#tbody_Common" + index).append("<td>" + data.name + "<td>");
                    $("#tbody_Common" + index).append("<td><button class='btn btn -default detail' type='submit' id='" + data.url + "' data-mediaType='"+data.mediaType+"'>点击观看</button><td>")

                });
            }
        });
        $('#changeVideoModel_Common').modal({
            backdrop: "static"
        })
    })
}