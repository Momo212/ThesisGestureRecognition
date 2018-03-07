package com.example.matthew.tv_gesture_prototype;

import android.app.Activity;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainPage extends Activity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener{
//C:\Users\Matthew\.p2\Desktop\TV_Gesture_Prototype\openCVLibrary340\src\main\java\org\opencv\android\JavaCameraView.java
    private TextView gestureText;
    private GestureDetectorCompat gDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        gestureText = (TextView) findViewById(R.id.gestureText);
        this.gDetector = new GestureDetectorCompat(this,this);
        gDetector.setOnDoubleTapListener(this);

    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        this.gDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    @Override
    public boolean onDown(MotionEvent event){
        gestureText.setText("onDown");
        return true;
    }

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY){
        gestureText.setText("onFling");
        return true;
    }
    @Override
    public void onLongPress(MotionEvent event){
        gestureText.setText("onLongPress");
    }
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY){
        gestureText.setText("onScroll");
        return true;
    }
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        gestureText.setText("onSingleTapConfirmed");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        gestureText.setText("onShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        gestureText.setText("onSingleTapUp");
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        gestureText.setText("onPointerCaptureChanged");
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        gestureText.setText("onDoubleTap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        gestureText.setText("onDoubleTapEvent");
        return true;
    }
}
