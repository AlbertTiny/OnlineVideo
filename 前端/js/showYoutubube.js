//用于打开视频选择界面
function showYoutubeList() {
    //用于打开卡通模态框
    //此处弹出模态框
    $.ajax({
        url: "http://localhost:1234/zhiyi/getYoutube",
        type: "get",
        success: function(data) {
            $("#right").empty();
            $("#right").append("<table class='table table-hover' id='table'></table>");
            $("#table").append("<thead id='thead_Score'></thead>");
            $("#thead_Score").append("<tr id='th_tr'></tr>");
            $("#th_tr").append("<th style='text-align:center'><span style='color:red'>视频名</span></th>");
            $("#th_tr").append("<th style='text-align:center'><span style='color:red'>       </span></th>");
            $("#th_tr").append("<th style='text-align:center'><span style='color:red'>点击播放</span></th>");
            $("#table").append("<tbody id='tbody_Score'></tbody>");
            $.each(data.cartoons, function(index, data) {
                console.log(data);
                $("#tbody_Score").append("<tr id=tr_Cartton" + index + "><tr>");
                $("#tr_Cartton" + index).append("<td style='color:gray'>" + data.name + "<td>")
                $("#tr_Cartton" + index).append("<td><a href='" + data.url + "' class='btn btn -default youtube' type='submit' id='" + data.url + "' target='_blank'>点击观看</a><td>");

            });
        }
    });

}