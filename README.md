# OnlineVideo
<<<<<<< HEAD
使用分离的前端+springBoot框架来实现在线视频播放功能（文档稍后会补充）
=======
使用分离的前端+springBoot框架来实现在线视频播放功能
### 1.先讲一下用到的技术
> [video.js](https://videojs.com/)
> [springBoot](http://spring.io/projects/spring-boot)
### 2.里面遇到的主要麻烦：     
* 1.跨域
> 由于前后端完全分离，这时候使用ajax调用后端就会被限制，此时需要打开这个限制，详情请参考 [vue解决跨域问题](https://blog.csdn.net/zhiyikeji/article/details/84865865)
* 2.video.js设置倍速     
实现的代码：
```js
 var video = document.getElementById('my-video');
 video.playbackRate = spe;//此处spe就是播放速度（比如0.5,2.0等）
 video.play();
```
这些技术都是封装好的，可以参考官方的api去研究，也可以clone我的项目，里面有前后端以及数据库的详细代码
>>>>>>> 0167904a9b9f3be7de0f41f0496cea4a8ca045ef
