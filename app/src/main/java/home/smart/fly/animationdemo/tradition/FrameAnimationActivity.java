package home.smart.fly.animationdemo.tradition;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import home.smart.fly.animationdemo.R;
import home.smart.fly.animationdemo.utils.BaseActivity;

/**
 * Created by co-mall on 2016/8/8.
 */
public class FrameAnimationActivity extends BaseActivity {
    private ImageView animationImg1, animationImg2;
    //
    private AnimationDrawable animationDrawable1, animationDrawable2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
        animationImg1 = (ImageView) findViewById(R.id.animation1);
        animationImg1.setImageResource(R.drawable.frame_anim1);
        animationDrawable1 = (AnimationDrawable) animationImg1.getDrawable();
        animationDrawable1.start();

        animationImg2 = (ImageView) findViewById(R.id.animation2);
        animationImg2.setImageResource(R.drawable.frame_anim2);
        animationDrawable2 = (AnimationDrawable) animationImg2.getDrawable();
        animationDrawable2.start();


    }
}
