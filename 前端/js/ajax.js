function ajax(url, data) {
    $.ajax({
        url: url,
        data: data,
        type: "get",
        success: function(data) {
            return data;
        },
        error: function() {
            console.log("请求失败");
            return "request fail"
        }
    });
}