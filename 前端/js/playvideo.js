//用于将视频源解析并进行播放
function playVideo(model_Name) {
    $(document).on("click", ".detail", function() {
        var url = $(this).attr("id");
        console.log(url);
        $("#" + model_Name).modal("hide");
        changeVideo(url);
        play();
    })
}