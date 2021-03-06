/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btGeneric6DofConstraint extends btTypedConstraint {
	private long swigCPtr;
	
	protected btGeneric6DofConstraint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.btGeneric6DofConstraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btGeneric6DofConstraint(long cPtr, boolean cMemoryOwn) {
		this("btGeneric6DofConstraint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(gdxBulletJNI.btGeneric6DofConstraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btGeneric6DofConstraint obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btGeneric6DofConstraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setUseSolveConstraintObsolete(boolean value) {
    gdxBulletJNI.btGeneric6DofConstraint_useSolveConstraintObsolete_set(swigCPtr, this, value);
  }

  public boolean getUseSolveConstraintObsolete() {
    return gdxBulletJNI.btGeneric6DofConstraint_useSolveConstraintObsolete_get(swigCPtr, this);
  }

  public btGeneric6DofConstraint(btRigidBody rbA, btRigidBody rbB, Matrix4 frameInA, Matrix4 frameInB, boolean useLinearReferenceFrameA) {
    this(gdxBulletJNI.new_btGeneric6DofConstraint__SWIG_0(btRigidBody.getCPtr(rbA), rbA, btRigidBody.getCPtr(rbB), rbB, frameInA, frameInB, useLinearReferenceFrameA), true);
  }

  public btGeneric6DofConstraint(btRigidBody rbB, Matrix4 frameInB, boolean useLinearReferenceFrameB) {
    this(gdxBulletJNI.new_btGeneric6DofConstraint__SWIG_1(btRigidBody.getCPtr(rbB), rbB, frameInB, useLinearReferenceFrameB), true);
  }

  public void calculateTransforms(Matrix4 transA, Matrix4 transB) {
    gdxBulletJNI.btGeneric6DofConstraint_calculateTransforms__SWIG_0(swigCPtr, this, transA, transB);
  }

  public void calculateTransforms() {
    gdxBulletJNI.btGeneric6DofConstraint_calculateTransforms__SWIG_1(swigCPtr, this);
  }

  public Matrix4 getCalculatedTransformA() {
	return gdxBulletJNI.btGeneric6DofConstraint_getCalculatedTransformA(swigCPtr, this);
}

  public Matrix4 getCalculatedTransformB() {
	return gdxBulletJNI.btGeneric6DofConstraint_getCalculatedTransformB(swigCPtr, this);
}

  public Matrix4 getFrameOffsetA() {
	return gdxBulletJNI.btGeneric6DofConstraint_getFrameOffsetA__SWIG_0(swigCPtr, this);
}

  public Matrix4 getFrameOffsetB() {
	return gdxBulletJNI.btGeneric6DofConstraint_getFrameOffsetB__SWIG_0(swigCPtr, this);
}

  public void getInfo1NonVirtual(SWIGTYPE_p_btTypedConstraint__btConstraintInfo1 info) {
    gdxBulletJNI.btGeneric6DofConstraint_getInfo1NonVirtual(swigCPtr, this, SWIGTYPE_p_btTypedConstraint__btConstraintInfo1.getCPtr(info));
  }

  public void getInfo2NonVirtual(btConstraintInfo2 info, Matrix4 transA, Matrix4 transB, Vector3 linVelA, Vector3 linVelB, Vector3 angVelA, Vector3 angVelB) {
    gdxBulletJNI.btGeneric6DofConstraint_getInfo2NonVirtual(swigCPtr, this, btConstraintInfo2.getCPtr(info), info, transA, transB, linVelA, linVelB, angVelA, angVelB);
  }

  public void updateRHS(float timeStep) {
    gdxBulletJNI.btGeneric6DofConstraint_updateRHS(swigCPtr, this, timeStep);
  }

  public Vector3 getAxis(int axis_index) {
	return gdxBulletJNI.btGeneric6DofConstraint_getAxis(swigCPtr, this, axis_index);
}

  public float getAngle(int axis_index) {
    return gdxBulletJNI.btGeneric6DofConstraint_getAngle(swigCPtr, this, axis_index);
  }

  public float getRelativePivotPosition(int axis_index) {
    return gdxBulletJNI.btGeneric6DofConstraint_getRelativePivotPosition(swigCPtr, this, axis_index);
  }

  public void setFrames(Matrix4 frameA, Matrix4 frameB) {
    gdxBulletJNI.btGeneric6DofConstraint_setFrames(swigCPtr, this, frameA, frameB);
  }

  public boolean testAngularLimitMotor(int axis_index) {
    return gdxBulletJNI.btGeneric6DofConstraint_testAngularLimitMotor(swigCPtr, this, axis_index);
  }

  public void setLinearLowerLimit(Vector3 linearLower) {
    gdxBulletJNI.btGeneric6DofConstraint_setLinearLowerLimit(swigCPtr, this, linearLower);
  }

  public void getLinearLowerLimit(Vector3 linearLower) {
    gdxBulletJNI.btGeneric6DofConstraint_getLinearLowerLimit(swigCPtr, this, linearLower);
  }

  public void setLinearUpperLimit(Vector3 linearUpper) {
    gdxBulletJNI.btGeneric6DofConstraint_setLinearUpperLimit(swigCPtr, this, linearUpper);
  }

  public void getLinearUpperLimit(Vector3 linearUpper) {
    gdxBulletJNI.btGeneric6DofConstraint_getLinearUpperLimit(swigCPtr, this, linearUpper);
  }

  public void setAngularLowerLimit(Vector3 angularLower) {
    gdxBulletJNI.btGeneric6DofConstraint_setAngularLowerLimit(swigCPtr, this, angularLower);
  }

  public void getAngularLowerLimit(Vector3 angularLower) {
    gdxBulletJNI.btGeneric6DofConstraint_getAngularLowerLimit(swigCPtr, this, angularLower);
  }

  public void setAngularUpperLimit(Vector3 angularUpper) {
    gdxBulletJNI.btGeneric6DofConstraint_setAngularUpperLimit(swigCPtr, this, angularUpper);
  }

  public void getAngularUpperLimit(Vector3 angularUpper) {
    gdxBulletJNI.btGeneric6DofConstraint_getAngularUpperLimit(swigCPtr, this, angularUpper);
  }

  public btRotationalLimitMotor getRotationalLimitMotor(int index) {
    long cPtr = gdxBulletJNI.btGeneric6DofConstraint_getRotationalLimitMotor(swigCPtr, this, index);
    return (cPtr == 0) ? null : new btRotationalLimitMotor(cPtr, false);
  }

  public btTranslationalLimitMotor getTranslationalLimitMotor() {
    long cPtr = gdxBulletJNI.btGeneric6DofConstraint_getTranslationalLimitMotor(swigCPtr, this);
    return (cPtr == 0) ? null : new btTranslationalLimitMotor(cPtr, false);
  }

  public void setLimit(int axis, float lo, float hi) {
    gdxBulletJNI.btGeneric6DofConstraint_setLimit(swigCPtr, this, axis, lo, hi);
  }

  public boolean isLimited(int limitIndex) {
    return gdxBulletJNI.btGeneric6DofConstraint_isLimited(swigCPtr, this, limitIndex);
  }

  public void calcAnchorPos() {
    gdxBulletJNI.btGeneric6DofConstraint_calcAnchorPos(swigCPtr, this);
  }

  public int get_limit_motor_info2(btRotationalLimitMotor limot, Matrix4 transA, Matrix4 transB, Vector3 linVelA, Vector3 linVelB, Vector3 angVelA, Vector3 angVelB, btConstraintInfo2 info, int row, Vector3 ax1, int rotational, int rotAllowed) {
    return gdxBulletJNI.btGeneric6DofConstraint_get_limit_motor_info2__SWIG_0(swigCPtr, this, btRotationalLimitMotor.getCPtr(limot), limot, transA, transB, linVelA, linVelB, angVelA, angVelB, btConstraintInfo2.getCPtr(info), info, row, ax1, rotational, rotAllowed);
  }

  public int get_limit_motor_info2(btRotationalLimitMotor limot, Matrix4 transA, Matrix4 transB, Vector3 linVelA, Vector3 linVelB, Vector3 angVelA, Vector3 angVelB, btConstraintInfo2 info, int row, Vector3 ax1, int rotational) {
    return gdxBulletJNI.btGeneric6DofConstraint_get_limit_motor_info2__SWIG_1(swigCPtr, this, btRotationalLimitMotor.getCPtr(limot), limot, transA, transB, linVelA, linVelB, angVelA, angVelB, btConstraintInfo2.getCPtr(info), info, row, ax1, rotational);
  }

  public boolean getUseFrameOffset() {
    return gdxBulletJNI.btGeneric6DofConstraint_getUseFrameOffset(swigCPtr, this);
  }

  public void setUseFrameOffset(boolean frameOffsetOnOff) {
    gdxBulletJNI.btGeneric6DofConstraint_setUseFrameOffset(swigCPtr, this, frameOffsetOnOff);
  }

  public void setParam(int num, float value, int axis) {
    gdxBulletJNI.btGeneric6DofConstraint_setParam__SWIG_0(swigCPtr, this, num, value, axis);
  }

  public void setParam(int num, float value) {
    gdxBulletJNI.btGeneric6DofConstraint_setParam__SWIG_1(swigCPtr, this, num, value);
  }

  public float getParam(int num, int axis) {
    return gdxBulletJNI.btGeneric6DofConstraint_getParam__SWIG_0(swigCPtr, this, num, axis);
  }

  public float getParam(int num) {
    return gdxBulletJNI.btGeneric6DofConstraint_getParam__SWIG_1(swigCPtr, this, num);
  }

  public void setAxis(Vector3 axis1, Vector3 axis2) {
    gdxBulletJNI.btGeneric6DofConstraint_setAxis(swigCPtr, this, axis1, axis2);
  }

}
