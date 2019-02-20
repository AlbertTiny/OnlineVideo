//用于打开视频选择界面
function showTecentList(pn) {
    //用于打开卡通模态框
    //此处弹出模态框
    var currentPageNumber;
    var allPages;
    var searchValue;
    var selectValue;
    $.ajax({
        url: "http://localhost:1234/zhiyi/getTecent",
        data: "pn=" + pn,
        type: "get",
        success: function(data) {
            console.log(data)
            currentPageNumber = data.cartoons.pageNum;
            allPages = data.cartoons.pages;
            $("#right").empty();
            $("#right").append("<form class='form-inline' id='form_Search'></form>");
            $("#form_Search").append("<div class='form-group' id='div1'></div>");
            $("#div1").append("<label class='sr-only' for='exampleInputAmount'>Amount (in dollars)</label>");
            $("#div1").append("<div class='input-group' id='div2'></div>");
            $("#div2").append("<div class='input-group-addon'>$</div>");
            $("#div2").append("<input type='text' class='form-control' id='exampleInputAmount' placeholder='Amount'>");
            $("#div2").append("<div class='input-group-addon' id='selectDiv'></div>");
            $("#selectDiv").append("<select id='select'></select>");
            $("#select").append("<option value ='other'>选择查询方式</option>");
            $("#select").append("<option value ='pnSearch'>页码查询</option>");
            $("#select").append("<option value ='nameSearch'>视频名查询</option>");
            $("#form_Search").append("<button type='submit' class='btn btn-primary' id='btnSearch'>点击查询</button>");
            $("#right").append("<table class='table table-hover' id='table'></table>");
            $("#table").append("<thead id='thead_Score'></thead>");
            $("#thead_Score").append("<tr id='th_tr'></tr>");
            $("#th_tr").append("<th style='text-align:center'><span style='color:red'>视频名</span></th>");
            $("#th_tr").append("<th style='text-align:center'><span style='color:red'>       </span></th>");
            $("#th_tr").append("<th style='text-align:center'><span style='color:red'>点击播放</span></th>");
            $("#table").append("<tbody id='tbody_Score'></tbody>");
            $.each(data.cartoons.list, function(index, data) {

                $("#tbody_Score").append("<tr id=tr_Cartton" + index + "><tr>");
                $("#tr_Cartton" + index).append("<td style='color:gray'>" + data.name + "<td>")
                $("#tr_Cartton" + index).append("<td><a href='" + data.url + "' class='btn btn -default youtube' type='submit' id='" + data.url + "' target='_blank'>点击观看</a><td>");

            });
            var currentPageNu = data.cartoons.pageNum; //获取当前页码数
            $("#right").append("<nav aria-label='Page navigation' id='pageNav'></nav>");
            $("#pageNav").append("<ul class='pagination'></ul>");
            if (data.cartoons.isFirstPage) {
                $(".pagination").append("<li  class='disabled'><a href='#' aria-label='revious' id='previous'><span aria-hidden='true'>&laquo;</span></a></li>");
            } else {
                $(".pagination").append("<li><a href='#' aria-label='revious' id='previous'><span aria-hidden='true'>&laquo;</span></a></li>");
            }


            $.each(data.cartoons.navigatepageNums, function(index, item) {
                var pnNu = item;
                if (pnNu == currentPageNu) {
                    $(".pagination").append("<li class='active'><a href='#' id='pnNu' data-pn=" + pnNu + ">" + pnNu + "</a></li>");
                } else {
                    $(".pagination").append("<li><a href='#' id='pnNu' data-pn=" + pnNu + ">" + pnNu + "</a></li>");
                }

            })
            if (data.cartoons.isLastPage) {
                $(".pagination").append("<li class='disabled'><a href='#' aria-label='Next' id='next'><span aria-hidden='true'>&raquo;</span></a></li>");
            } else {
                $(".pagination").append("<li><a href='#' aria-label='Next' id='next'><span aria-hidden='true'>&raquo;</span></a></li>");
            }

        }
    });
    $(document).on("click", "#pnNu", function() {
        var pn = $(this).attr("data-pn");
        showTecentList(pn)
    })
    $(document).on("click", "#previous", function() {
        var pn = currentPageNumber - 1;
        if (pn <= 0) {
            return false;
        } else {
            showTecentList(pn)
        }
    })
    $(document).on("click", "#next", function() {
            var pn = currentPageNumber + 1;
            if (pn > allPages) {
                return false;
            } else {
                showTecentList(pn)
            }
        })
        //获取输入框中的值
    $(document).on("change", "#exampleInputAmount", function() {
        searchValue = this.value;
        console.log("searchValue=" + searchValue)
    })
    $(document).on("change", "#select", function() {
            selectValue = $(this).val();
            if (selectValue == 'pnSearch') {
                $(document).on("click", "#btnSearch", function() {
                    showTecentList(searchValue);
                })
            } else if (selectValue == 'nameSearch') {
                $(document).on("click", "#btnSearch", function() {
                    $.ajax({
                        url: "http://localhost:1234/zhiyi/getTecentByName",
                        data: "name=" + searchValue,
                        type: "get",
                        success: function(data) {
                            $("#right").empty();
                            $("#right").append("<ol class='breadcrumb '>  <li><a href='#' id='searchHome'>Home</a></li><li class='active'>查询结果</li></ol>");
                            $("#right").append("<table class='table table-hover' id='table'></table>");
                            $("#table").append("<thead id='thead_Score'></thead>");
                            $("#thead_Score").append("<tr id='th_tr'></tr>");
                            $("#th_tr").append("<th style='text-align:center'><span style='color:red'>视频名</span></th>");
                            $("#th_tr").append("<th style='text-align:center'><span style='color:red'>       </span></th>");
                            $("#th_tr").append("<th style='text-align:center'><span style='color:red'>点击播放</span></th>");
                            $("#table").append("<tbody id='tbody_Score'></tbody>");
                            $.each(data.cartoons, function(index, item) {
                                $("#tbody_Score").append("<tr id=tr_Cartton" + index + "><tr>");
                                $("#tr_Cartton" + index).append("<td style='color:gray'>" + item.name + "<td>")
                                $("#tr_Cartton" + index).append("<td><a href='" + item.url + "' class='btn btn -default youtube' type='submit' id='" + item.url + "' target='_blank'>点击观看</a><td>");

                            })
                        }
                    });
                })

            }
        })
        //返回原来界面
    $(document).on("click", "#searchHome", function() {
        showTecentList(1)
    })
}