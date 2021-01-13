// pages/Plist/feedback/feedback.js
Page({
  data:{
    contents:[]
  },
  OKsubmit:function(e){
    var id=e.detail.value.id
    var name=e.detail.value.name
    var sex=e.detail.value.sex
    var age=e.detail.value.age
    var address=e.detail.value.address
    console.log(name)
    console.log(sex)
    console.log(age)
    console.log(address)
    wx.request({
      method:"POST",
      url: 'http://localhost/website/modifiyUser',
      data:{
        id:id,
        name:name,
        sex:sex,
        age:age,
        address:address
      },
      header:{
        'content-type': 'application/x-www-form-urlencoded'
      },
      success(res){
        wx.showToast({
          title: '修改成功！',
          icon:"success",
          duration:400
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
console.log(options+":::::::")
var that=this
wx.request({

  method:"GET",
  url: 'http://127.0.0.1:80/website/details/'+options.id,
  success(res){
   if(res.data.code==200){
     console.log(res.data.data.user)
    that.setData({
      contents:res.data.data.user
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