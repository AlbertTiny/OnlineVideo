//用于添加视频dom结点
function addVideo() {
    $("#right").empty();

    $("#right").append("<video id='my-video' class=' video - js vjs -default -skin vjs - big - play - centered vjs - fluid fill' controls preload='auto' poster='img / Poster1.jpg' data-setup='{}''></video>");
    $("#my-video").append("<source src='http://media.w3.org/2010/05/sintel/trailer.mp4' type='video/mp4'>");
    $("#my-video").append("<source src='http://media.w3.org/2010/05/sintel/trailer.mp4' type='video/mp4'>");
    $("#my-video").append("<source src='http://sf.sycdn.kuwo.cn/resource/n2/35/0/169146886.mp3' type='audio/mpeg'>");
    $("#my-video").append("<source src='OggAudio' type='audio/ogg'>");
    $("#my-video").append("<source src='OggAudio' type='video/mkv'>");
    $("#my-video").append("<p class='vjs-no-js'>To view this video please enable JavaScript, and consider upgrading to a web browser that <a href='https://videojs.com/html5-video-support/' target='_blank'>supports HTML5 video</a></p>");

}
//用于实现弹出视频
function showVideo(btnName) {
    $("#" + btnName).click(function() {
        addVideo();
    })
}
//用于打开视频选择界面
function openSelectMovies(btnName, url) {
    //用于打开卡通模态框
    $("#" + btnName).click(function() {
        //此处弹出模态框
        $.ajax({
            url: url,
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
                    $("#tr_Cartton" + index).append("<td><button class='btn btn -default detail' type='submit' id='" + data.url + "'>点击观看</button><td>");

                });
            }
        });
    })
}
//用于实现播放按钮
function playvideo(btName) {

    $(document).on("click", "." + btName, function() {
        addVideo()
        var video = document.getElementById("my-video");
        console.log(video)
        var url = $(this).attr("id");
        var mediaType = $(this).attr("data-mediaType");
        console.log(url);
        var isSupp = video.canPlayType(mediaType);
        if (isSupp == "") {
            video.src = url;
        } else {
            video.src = url;
        }
        video.load();
        video.play();
    })
}

function speed(spe) {
    var video = document.getElementById('my-video');
    video.playbackRate = spe;
    video.play();
}

//用于通过文件名设置文件属性
function judgeType(fileName, videoType) {

    if (fileName.match(".mp3") != null) {
        videoType = "audio/mpeg";
    } else if (fileName.match(".ogg") != null || fileName.match(".Ogg") != null) {
        videoType = "audio/ogg";
    } else if (fileName.match(".Wav") != null || fileName.match(".wav") != null) {
        videoType = "audio/wav";
    } else if (fileName.match(".MP4") != null || fileName.match(".mp4") != null) {
        videoType = "video/mp4";
    } else if (fileName.match(".MP4") != null || fileName.match(".mp4") != null) {
        videoType = "video/mp4";
    } else {
        alert("暂不支持改音频格式");
        return false;
    }
}