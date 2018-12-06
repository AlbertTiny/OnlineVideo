function playAllKindOfvideoAndCoseModel(btnName) {
    $(document).on("click", "." + btnName, function() {
        var url = $(this).attr("id");
        var mediaType = $(this).attr("data-mediaType");
        console.log(url);
        $("#" + changeVideoModel_Common).modal("hide");

        chageVideoResource("my-video", mediaType, url, url);
    })
}