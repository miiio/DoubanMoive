package cn.boji9.starbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import cn.boji9.doubanmoive.R;

/**
 * Created by wax on 2017/9/2.
 */

public class StarBar extends View {

    private Bitmap star;
    private Bitmap starfill;
    private double score = 6.8; //1~10
    private Paint starPaint;
    private Paint starfillPaint;
    private float starWidth;
    private float starHeight;

    public StarBar(Context context) {
        super(context);
    }

    public StarBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initRes();
        starPaint = new Paint();
        starPaint.setAntiAlias(true);
        starPaint.setShader(new BitmapShader(star, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));

        starfillPaint = new Paint();
        starfillPaint.setAntiAlias(true);
        starfillPaint.setShader(new BitmapShader(starfill, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
    }

    private void initRes(){
        star = BitmapFactory.decodeResource(getResources(), R.mipmap.star1);
        starfill = BitmapFactory.decodeResource(getResources(), R.mipmap.star2);
        starWidth = star.getWidth();
        starHeight = star.getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        double starNum = score*5/10;
        for(int i = 1; i<=5; i++){
            if(i<=(int)starNum){
                drawStar(i,true,canvas,1);
            }else {
                drawStar(i, false, canvas, 1);
            }
        }
        drawStar(((int)starNum)+1,true,canvas, starNum-(int)starNum);
    }

    private void drawStar(int position,boolean fill,Canvas canvas,double width){
        float left = (position - 1f) * starWidth;
        canvas.translate(left,0);
        if(fill){
            canvas.drawRect(0,0, (float) (width*starWidth),starHeight,starfillPaint);
        }else{
            canvas.drawRect(0,0, (float) (width*starWidth),starHeight,starPaint);
        }
        canvas.translate(-left,0);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension((int)(starWidth*5+1),(int)(starHeight+1));
    }



    public void setScore(float score){
        this.score = score;
        invalidate();
    }
}
