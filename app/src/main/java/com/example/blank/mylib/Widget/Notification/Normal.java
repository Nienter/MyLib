//package com.example.blank.mylib.Widget.Notification;
//
//import android.app.Activity;
//import android.app.Notification;
//import android.app.PendingIntent;
//import android.content.Context;
//import android.content.Intent;
//import android.net.Uri;
//import android.widget.RemoteViews;
//
///**
// * Created by blank on 2018/7/31.
// * 总共有3种通知
// * 1普通
// * 2折叠式 用来显示长文本和一些自定义的布局场景。他有两种状态 一种是普通的状态 一种是展开状态下的试图。与普通的通知不同，我们需要自定义
// * 视图，而这个视图显示的进程和我们创建的进程不再同一个进程所以需要使用RemoteViews.
// * 3悬挂式
// */
//
//public class Normal {
//    //普通
//    Notification.Builder builder = new Notification.Builder(this);
//    Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blog.niu.com"));
//    PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, mIntent, 0);
//    //折叠
//    //首先使用remoteview创建自定义的通知视图
//    RemoteViews remoteViews = new RemoteViews(getPackageName, R.layout.view_fold);
//    //然后创建自定义的布局文件fold
//    //前一部分与创建普通通知相同
//    Notification notification = builder.build();
//    notification.bigContentView =remoteViews;
//    notificationManager.nitify(1,notification);
//    //悬挂式 不需要下拉就可以显示，焦点不变，不会打断用户操作，他需要调用setFullScreenIntent来将Notification 变为悬挂式的
//    PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, hangIntent, PendingIntent.FLAG_CANCEL_CURRENT);
//    builder.setFullScreenIntent(hangPendingIntent,true);
//
//    //其中Intent hangIntent = new Intent();
//    hnagIntent.setFlag =(Intent.FLAG_ACTIVITY_NEW_TASK);
//    hangIntent.setClass(this,My.class);
//    notificationManager.nitify(1,notification);
//
//}

