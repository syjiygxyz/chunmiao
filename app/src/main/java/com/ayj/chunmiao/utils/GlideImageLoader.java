package com.ayj.chunmiao.utils;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.ayj.chunmiao.R;
import com.squareup.picasso.Picasso;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by zht-pc-09 on 2017/6/10.
 * banner轮播图图片加载
 */
public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        /**
         注意：
         1.图片加载器由自己选择，这里不限制，只是提供几种使用方法
         2.返回的图片路径为Object类型，由于不能确定你到底使用的那种图片加载器，
         传输的到的是什么格式，那么这种就使用Object接收和返回，你只需要强转成你传输的类型就行，
         切记不要胡乱强转！
         */
        //Picasso 加载图片简单用法
        Uri uri = Uri.parse((String) path);
        Picasso.with(context).load(uri).placeholder(R.mipmap.banner_loading).error(
                R.mipmap.banner_error).into(imageView);

    }

//    //提供createImageView 方法，如果不用可以不重写这个方法，主要是方便自定义ImageView的创建
//    @Override
//    public ImageView createImageView(Context context) {
//        //使用fresco，需要创建它提供的ImageView，当然你也可以用自己自定义的具有图片加载功能的ImageView
//        SimpleDraweeView simpleDraweeView=new SimpleDraweeView(context);
//        return simpleDraweeView;
//    }
}
