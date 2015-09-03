package com.jmlb0003.samplear;

import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

import edu.dhbw.andar.ARObject;
import edu.dhbw.andar.pub.SimpleBox;
import edu.dhbw.andar.util.GraphicsUtil;

public class CustomObject4 extends ARObject {

    private SimpleBox mBox = new SimpleBox();
    private FloatBuffer mFlash;
    private FloatBuffer mAmbient;
    private FloatBuffer mShiny;
    private FloatBuffer mDiffuse;

    public CustomObject4(String name, String patternName, double markerWidth, double[] markerCenter) {
        super(name, patternName, markerWidth, markerCenter);

        float mat_ambientf[] = {1.0f, 0f, 1.0f, 1.0f};
        float mat_flashf[] = {1.0f, 0f, 1.0f, 1.0f};
        float mat_diffusef[] = {1.0f, 0f, 1.0f, 1.0f};
        float mat_flash_shinyf[] = {50.0f};

        mAmbient = GraphicsUtil.makeFloatBuffer(mat_ambientf);
        mFlash = GraphicsUtil.makeFloatBuffer(mat_flashf);
        mShiny = GraphicsUtil.makeFloatBuffer(mat_flash_shinyf);
        mDiffuse = GraphicsUtil.makeFloatBuffer(mat_diffusef);
    }


    @Override
    public final void draw(GL10 gl) {
        super.draw(gl);

        gl.glMaterialfv(GL10.GL_FRONT_AND_BACK, GL10.GL_SPECULAR, mFlash);
        gl.glMaterialfv(GL10.GL_FRONT_AND_BACK, GL10.GL_SHININESS, mShiny);
        gl.glMaterialfv(GL10.GL_FRONT_AND_BACK, GL10.GL_DIFFUSE, mDiffuse);
        gl.glMaterialfv(GL10.GL_FRONT_AND_BACK, GL10.GL_AMBIENT, mAmbient);

        gl.glColor4f(1.0f, 0, 1.0f, 1.0f);
        gl.glTranslatef(0.0f, 0.0f, 12.5f);

        mBox.draw(gl);
    }


    @Override
    public void init(GL10 gl) {
    }
}
