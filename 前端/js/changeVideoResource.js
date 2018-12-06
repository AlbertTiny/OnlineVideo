function chageVideoResource(video_id, videoType, url1, url2) {
    var myVid = document.getElementById(video_id);
    var isSupp = myVid.canPlayType(videoType);
    if (isSupp == "") {
        myVid.src = url1;
    } else {
        myVid.src = url2;
    }
    myVid.load();
}