Page({
  data: {
    background: ['/images/sakura.jpg','/images/a.jpg','/images/fish.jpg'],
    interval: 3000,
    duration: 700,
    indicatorColor:["rgba(24 ,255,0,0.5)"],
    activeColor:["rgba(255 ,0,0,0.5)"],
    noticeTitle:"公告:",
    noticeText:"网站一切都在建设中,各项功能加急开发中,如有使用问题或者建议请在我有建议处反馈,谢谢！",
    contents:[]
  },
    /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
    wx.showToast({
      title: '刷新中...',
      duration:400,
      icon:"loading",
      mask:true
    })
  },
  user:function(e){
    console.log(e.target.id)
    wx.navigateTo({
      url: '/pages/user/user?id='+e.target.id,
    })
    },
  account:function(e){
    console.log(e.target.id)//uid
    wx.navigateTo({
      url: '/pages/account/account?id='+e.target.id,
    })
      },
  delete:function(e){
    console.log(e.target.id)
    wx.showModal({
      title: '提示',
      content: '确认要删除吗？',
      success: function (res) {
        if (res.confirm) {//这里是点击了确定以后
          wx.request({
            method:"GET",
            url: 'http://127.0.0.1:80/website/delete/'+e.target.id,
            success(res){
              wx.showToast({
                title: "删除成功",
                 icon:"seuess",
                  duration:400
              })
              wx.navigateTo({
                url: '/pages/feedback/feedback',
              })
            }
          })
        } else {//这里是点击了取消以后
          console.log('用户点击取消')
        }

      }
    })
 },
  onShow: function () {
  },
  onLoad:function(e){
    var that=this;
 
    wx.request({
      method:"GET",
      url: 'http://127.0.0.1:80/website/details/'+e.uid,
      success(res){
       if(res.data.code==200){
         console.log(res.data.data)
        that.setData({
          contents:res.data.data
        })
       }else{
        wx.showToast({
          title: res.data.message,
           icon:"seuess",
           image:"/images/x.png",
            duration:1000
          
        })
       }
      }
    })
  },
  Oclick(){
    wx.navigateTo({
      url: '/pages/Plist/o/o',
    })
  }
})



