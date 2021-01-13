// pages/Plist/feedback/feedback.js
Page({
  data:{
    contents:[]
  },
  OKsubmit:function(e){
    var uid=e.detail.value.uid
    var account=e.detail.value.account
    var password=e.detail.value.password
    var phone=e.detail.value.phone
    var email=e.detail.value.email
    var gitee=e.detail.value.gitee
    var github=e.detail.value.github
    console.log(uid)
    console.log(account)
    console.log(password)
    console.log(phone)
    console.log(email)
    console.log(gitee)
    console.log(github)
    wx.request({
      method:"POST",
      url: 'http://localhost/website/modifiyAccount',
      data:{
        uid:uid,
        account:account,
        password:password,
        phone:phone,
        email:email,
        gitee:gitee,
        github:github
      },
      header:{
        'content-type': 'application/x-www-form-urlencoded'
      },
      success(res){
        wx.showToast({
          title: '修改成功！',
        })
        }
    })
  },
  /**
   * 页面的初始数据
   */
  data: {
   

  },


  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
console.log(options)
var that=this
wx.request({

  method:"GET",
  url: 'http://127.0.0.1:80/website/findAll/'+options.id,
  success(res){
   if(res.data.code==200){
     console.log(res.data.data)
    that.setData({
      contents:res.data.data
    })
   }
  }
})
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