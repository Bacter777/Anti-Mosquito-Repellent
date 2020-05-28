package com.bacter.antimosquito;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {
    private int mWidth,mHeight;
    private int mPressedColor,mUnPressedColor;
    private int mShapeType;
    private Paint mPaint;
    private RectF mRectF;
    private int mRoundRadius,mBtnRadius;
    private static int HALF_ALPHA=127;
    public CustomButton(Context context) {
        super (context);
    }

    public CustomButton(Context context,AttributeSet attrs) {
        super (context,attrs);
        init(context, attrs);
    }
    private void init(final Context context,final AttributeSet attrs){
        if (isInEditMode ()){
            return;
        }
        final TypedArray typedArray=context.obtainStyledAttributes (attrs,R.styleable.CustomButton);
        mPressedColor=typedArray.getColor(R.styleable.CustomButton_pressed_color,getResources ().getColor (R.color.colorAccent));
        mUnPressedColor=typedArray.getColor (R.styleable.CustomButton_unpressed_color,getResources ().getColor (R.color.colorAccent));
        mShapeType=typedArray.getInt (R.styleable.CustomButton_shape_type,1);
        mRoundRadius=typedArray.getDimensionPixelSize (R.styleable.CustomButton_round_radius,getResources ().getDimensionPixelSize (R.dimen.round_radius));

        typedArray.recycle ();
        mPaint=new Paint();
        mPaint.setColor (mUnPressedColor);
        mPaint.setStyle (Paint.Style.FILL);
        mPaint.setAntiAlias (true);
        this.setWillNotDraw (false);
        this.setDrawingCacheEnabled (true);
        this.setClickable (true);
        this.setBackgroundColor (getResources ().getColor (R.color.transparent));
        mRectF=new RectF();
    }
    @Override
    protected void onSizeChanged(int w,int h,int oldw,int oldh){
        super.onSizeChanged (w,h,oldw,oldh);
        mWidth=w;
        mHeight=h;
        mBtnRadius=mWidth/2;
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw (canvas);
        if (mPaint==null){
            return;
        }
        mPaint.setAlpha (HALF_ALPHA);
        if (mShapeType==1){
            canvas.drawCircle (mWidth/2,mHeight/2,mBtnRadius,mPaint);
        }else {
            mRectF.set (0,0,mWidth,mHeight);
        }
    }
    public CustomButton(Context context,AttributeSet attrs,int defStyleAttr) {
        super (context,attrs,defStyleAttr);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch (event.getAction ()){
            case MotionEvent.ACTION_DOWN:
                mPaint.setColor (mPressedColor);
                invalidate ();
                break;
            case MotionEvent.ACTION_UP:
                mPaint.setColor (mUnPressedColor);
                invalidate ();
                break;
        }
        return super.onTouchEvent (event);
    }
}
