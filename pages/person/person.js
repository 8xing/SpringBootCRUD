// pages/Plist/feedback/feedback.js
Page({
  OKsubmit:function(e){
    var account=e.detail.value.account
    var password=e.detail.value.password
    console.log(account)
    console.log(password)
    wx.request({
      
      method:"GET",
      url: 'http://localhost/website/login?account='+account+"&password="+password,
      header:{
        'content-type': 'application/x-www-form-urlencoded'
      },
      success(res){
        console.log(res.data)
        if(res.data.code==200){
          wx.showToast({
            title: res.data.msg,
            duration:400,
            mask:true,
          })
          wx.switchTab({
            url: '/pages/home/home',
          })


        }else{
          wx.showToast({
            title: res.data.msg,
            duration:400,
            mask:true,
          })
        }
        
      }
      
    })
  },
  /**
   * 页面的初始数据
   */
  data: {
   

  },
  oo(){
    wx.navigateTo({
      url: '/pages/Plist/o/o',
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

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

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})