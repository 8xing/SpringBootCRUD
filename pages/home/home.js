Page({
  data: {
    background: ['/images/aaa.jpg','/images/sakura.jpg','/images/a.jpg','/images/fish.jpg'],
    interval: 3000,
    duration: 700,
    indicatorColor:["rgba(24 ,255,0,0.5)"],
    activeColor:["rgba(255 ,0,0,0.5)"],
    noticeTitle:"公告:",
    noticeText:"网站一切都在建设中,各项功能加急开发中,如有使用问题或者建议请在我有建议处反馈,谢谢！",
    contents:[]
  },
  
  onShow: function () {
  },
  onLoad:function(e){
    var that=this;
    // wx.request({
    //   url: 'http://127.0.0.1:8080/zlys/index/info',
    //   success(res){
    //    if(res.data.state==1){
    //     that.setData({
    //       contents:res.data.data
    //     })
    //    }else{
    //     wx.showToast({
    //       title: res.data.message,
    //        icon:"seuess",
    //        image:"/images/x.png",
    //         duration:1000
          
    //     })
    //    }
    //   }
    // })
  },
  Oclick(){
    wx.navigateTo({
      url: '/pages/Plist/o/o',
    })
  }
})



