package com.example.lin.BennyNav;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.webkit.WebView;


public class WebVW extends ActionBarActivity  {
GestureDetector gestureDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_vw);
        WebView WV1=(WebView) findViewById(R.id.webV1);
        WV1.getSettings().setJavaScriptEnabled(true);
        WV1.loadUrl("http://www.baidu.com");
//        gestureDetector = new GestureDetector(new GestureDetector.OnGestureListener() {
//
//            @Override
//            public boolean onSingleTapUp(MotionEvent e) {
//                // TODO Auto-generated method stub
//                Toast.makeText(getApplicationContext(), "1111",
//                        Toast.LENGTH_SHORT).show();
//                return false;
//            }
//
//            @Override
//            public void onShowPress(MotionEvent e) {
//                // TODO Auto-generated method stub
//
//            }
//
//            @Override
//            public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
//                                    float distanceY) {
//                // TODO Auto-generated method stub
//                return false;
//            }
//
//            @Override
//            public void onLongPress(MotionEvent e) {
//                // TODO Auto-generated method stub
//
//            }
//
//            @Override
//            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
//                                   float velocityY) {
//                if (velocityX > 0) {
//                    //                    viewFlipper.showNext();
//                    Toast.makeText(getApplicationContext(), "1111",
//                            Toast.LENGTH_SHORT).show();
//                } else {
//                    //                    viewFlipper.showPrevious();
//                    Toast.makeText(getApplicationContext(), "222",
//                            Toast.LENGTH_SHORT).show();
//                }
//                return false;
//            }
//
//            @Override
//            public boolean onDown(MotionEvent e) {
//                // TODO Auto-generated method stub
//                return false;
//            }
//        });
//        Log.d("111", "onDoubleTap: " + event.toString());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_web_vw, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.BackMN) {
            Intent GoVW = new Intent(WebVW.this,MainActivity.class);
            startActivity(GoVW);
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
