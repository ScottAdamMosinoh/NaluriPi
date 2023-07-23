// Generated by data binding compiler. Do not edit!
package com.example.naluripi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.naluripi.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPiValueBinding extends ViewDataBinding {
  @NonNull
  public final Button btnCalculate;

  @NonNull
  public final ConstraintLayout clRoot;

  @NonNull
  public final EditText etName;

  @NonNull
  public final EditText etRadius;

  @NonNull
  public final LinearLayout llBottomFields;

  @NonNull
  public final RecyclerView rvCircumference;

  @NonNull
  public final TextView tvPiLabel;

  @NonNull
  public final TextView tvPiValue;

  @NonNull
  public final TextView tvSunCircumference;

  @NonNull
  public final TextView tvSunCircumferenceLabel;

  @NonNull
  public final TextView tvTitle;

  protected ActivityPiValueBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnCalculate, ConstraintLayout clRoot, EditText etName, EditText etRadius,
      LinearLayout llBottomFields, RecyclerView rvCircumference, TextView tvPiLabel,
      TextView tvPiValue, TextView tvSunCircumference, TextView tvSunCircumferenceLabel,
      TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCalculate = btnCalculate;
    this.clRoot = clRoot;
    this.etName = etName;
    this.etRadius = etRadius;
    this.llBottomFields = llBottomFields;
    this.rvCircumference = rvCircumference;
    this.tvPiLabel = tvPiLabel;
    this.tvPiValue = tvPiValue;
    this.tvSunCircumference = tvSunCircumference;
    this.tvSunCircumferenceLabel = tvSunCircumferenceLabel;
    this.tvTitle = tvTitle;
  }

  @NonNull
  public static ActivityPiValueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_pi_value, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPiValueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPiValueBinding>inflateInternal(inflater, R.layout.activity_pi_value, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPiValueBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_pi_value, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPiValueBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPiValueBinding>inflateInternal(inflater, R.layout.activity_pi_value, null, false, component);
  }

  public static ActivityPiValueBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityPiValueBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPiValueBinding)bind(component, view, R.layout.activity_pi_value);
  }
}
