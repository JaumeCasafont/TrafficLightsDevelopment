package com.example.jaucr.trafficlightsdevelopment;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.SurfaceHolder;

/**
 * Created by jaucr on 06/06/2016.
 */
public class MainView extends GLSurfaceView {
    MainRenderer mRenderer;

    MainView ( Context context ) {
        super ( context );
        mRenderer = new MainRenderer(this);
        setEGLContextClientVersion ( 2 );
        setRenderer ( mRenderer );
        //setRenderMode ( GLSurfaceView.RENDERMODE_WHEN_DIRTY );
    }

    public void surfaceCreated ( SurfaceHolder holder ) {
        super.surfaceCreated ( holder );
    }

    public void surfaceDestroyed ( SurfaceHolder holder ) {
        super.surfaceDestroyed ( holder );
    }

    public void surfaceChanged ( SurfaceHolder holder, int format, int w, int h ) {
        super.surfaceChanged ( holder, format, w, h );
    }

    @Override
    public void onResume() {
        super.onResume();
        mRenderer.onResume();
    }

    @Override
    public void onPause() {
        mRenderer.onPause();
        super.onPause();
    }
}
